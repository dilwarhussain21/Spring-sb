package com.add;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {
	@GetMapping("/add")
	public String add(@RequestParam String num1, @RequestParam String num2, Model model) {
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		int sum = n1 + n2;
		model.addAttribute("result", sum);
		return "result";
	}
}
