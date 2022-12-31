package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetColtroller {

	@GetMapping(path = { "vets", "vets/index" })
	public String listVets() {

		return "vets/index";
	}
}
