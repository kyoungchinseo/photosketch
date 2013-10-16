package org.nhnnext.web;

import org.nhnnext.repository.BoardRepository;
import org.nhnnext.support.FileUploader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FormController {
	@Autowired
    private BoardRepository boardRepository;
	
	@RequestMapping("/board/formphoto")
	public String loadForm() {
		return "form";
	}
	@RequestMapping(value = "/board/upload", method=RequestMethod.POST)
	public String submitForm(PhotoBoard board, MultipartFile file) {
		System.out.println(board);
		String fileName = FileUploader.upload(file);
		board.setFileName(fileName);
		PhotoBoard savedBoard = boardRepository.save(board); // insert data
		return "redirect:/board/" + savedBoard.getId();
	}
	
	@RequestMapping("/board/{id}")
	public String show(@PathVariable Long id, Model model) {
		PhotoBoard savedBoard = boardRepository.findOne(id);
		System.out.println(savedBoard);
		model.addAttribute("board",savedBoard);
		return "show";
	}
	
	@RequestMapping("/board/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		PhotoBoard savedBoard = boardRepository.findOne(id);
		model.addAttribute("board",savedBoard);
		return "edit";
	}
		
	@RequestMapping("/board/editUpload/{id}")
	public String edit(@PathVariable Long id, PhotoBoard board, MultipartFile file, Model model) {
		String fileName = FileUploader.upload(file);
		board.setFileName(fileName);
		board.setId(id);  // id 값이 없으면 자동 증가하지만 id값을 지정하면 그 id로 저장된다.  
		PhotoBoard savedBoard = boardRepository.save(board);
		System.out.println(savedBoard);
		model.addAttribute("board",savedBoard);
		return "show";
	}
	
	@RequestMapping("/board/delete/{id}")
	public String delete(@PathVariable Long id) {
		boardRepository.delete(id);
		return "index";
	}
	
	@RequestMapping("/board/list")
	public String showList(Model model) {
		Iterable<PhotoBoard> savedBoard = boardRepository.findAll();
		System.out.println(savedBoard.toString());
		model.addAttribute("list",savedBoard);
		return "list";
	}
}
