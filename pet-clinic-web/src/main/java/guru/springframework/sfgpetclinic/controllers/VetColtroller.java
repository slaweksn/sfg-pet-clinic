package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.VetService;

@Controller
@RequestMapping(path = { "vets", "vets/" })
public class VetColtroller {

	private final VetService vetService;

	public VetColtroller(VetService vetService) {
		super();
		this.vetService = vetService;
	}

	@GetMapping(path = { "", "index", "index/" })
	public String listVets(Model model) {

		model.addAttribute("vets", vetService.findAll());

		return "vets/index";
	}
}
