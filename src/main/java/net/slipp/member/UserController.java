package net.slipp.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user/create")
	public String memberInput(User user) {
		userRepository.save(user);
		return "redirect:/user/list";
	}
	
	@GetMapping("/user/list")
	public String memberList(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "list";
	}
}