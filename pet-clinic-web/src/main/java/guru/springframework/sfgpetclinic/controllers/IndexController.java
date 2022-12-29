package guru.springframework.sfgpetclinic.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {
	
	@GetMapping(path = {"", "/", "index"})
	public String index(Model model) {
		
		return "index";
	}
}
