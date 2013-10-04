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
		System.out.println(board.getTitle());
		System.out.println(board.getComment());
		String fileName = FileUploader.upload(file);
		board.setFileName(fileName);
		PhotoBoard savedBoard = boardRepository.save(board); // insert data
		return "redirect:/board/" + savedBoard.getId();
	}
	
	@RequestMapping("/board/{id}")
	public String show(@PathVariable Long id, Model model) {
		PhotoBoard savedBoard = boardRepository.findOne(id);
		model.addAttribute("board",savedBoard);
		return "show";
	}
}
