package com.seeyou.api;

import org.dom4j.rule.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String hello(@RequestParam(name = "name", required = false, defaultValue = "hello") String name, Model model){
		model.addAttribute("name",name);
		return "hello";
	}
}
