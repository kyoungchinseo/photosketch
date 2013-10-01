package org.nhnnext.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
	@RequestMapping("/board/formphoto")
	public String loadForm() {
		return "form";
	}
	@RequestMapping(value = "/board/upload", method=RequestMethod.POST)
	public String submitForm(String select, String comment) {
		System.out.println(comment);
		System.out.println(select);
		return "redirect:/board/formphoto";
	}
}
