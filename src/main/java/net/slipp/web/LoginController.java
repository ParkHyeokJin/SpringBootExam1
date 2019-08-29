package net.slipp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@PostMapping("login")
	public String login(String email, String password) {
		System.out.println(email);
		System.out.println(password);
		
		//로그인 체크
		
		return "redirect:index";
	}
}
