package guru.springframework.sfgpetclinic.controllers;

import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.OwnerService;

@Controller
@RequestMapping(path = {"owners", "owners/"})
public class OwnerController {

	private final OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}
	
	@GetMapping(path = { "index", "index/"})
	public String listOwners(Model model) {

		model.addAttribute("owners", ownerService.findAll().stream().sorted((o1,o2)->o1.getId().compareTo(o2.getId())).collect(Collectors.toList()));
		
		return "owners/index";
	}
}
