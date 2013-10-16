package org.nhnnext.web;

import org.h2.engine.Comment;
import org.nhnnext.repository.BoardRepository;
import org.nhnnext.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommentController {
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private BoardRepository boardRepository;
	
	@RequestMapping("/board/reply/{id}")
	public String reply(@PathVariable Long id, Model model) {
		PhotoBoard savedBoard = boardRepository.findOne(id);
		model.addAttribute("board",savedBoard);
		return "reply";
	}
	
	@RequestMapping(value="/board/replyform/{id}", method=RequestMethod.POST)
	public String createReply(@PathVariable Long id, String comment) {
		PhotoBoard board  = boardRepository.findOne(id);
		PhotoComment cmt = new PhotoComment(board,comment);
		commentRepository.save(cmt);
		//return "reply";
		return "redirect:/board/reply/" + id;
	}
}
