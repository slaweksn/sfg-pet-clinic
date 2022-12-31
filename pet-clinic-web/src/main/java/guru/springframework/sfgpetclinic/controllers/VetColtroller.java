package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.sfgpetclinic.services.VetService;

@Controller
public class VetColtroller {

	private final VetService vetService;
	
	public VetColtroller(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@GetMapping(path = { "vets", "vets/index" })
	public String listVets(Model model) {
		
		model.addAttribute("vets", vetService.findAll());
		
		return "vets/index";
	}
}
