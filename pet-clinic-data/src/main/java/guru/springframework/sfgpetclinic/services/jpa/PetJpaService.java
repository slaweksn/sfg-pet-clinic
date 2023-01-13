package guru.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.services.PetService;

@Service
@Profile("jpa")
public class PetJpaService implements PetService {

	private final PetRepository petRepository;

	public PetJpaService(PetRepository petRepository) {
		super();
		this.petRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll() {
		Set<Pet> pets = new HashSet<>();
		this.petRepository.findAll().forEach(pets::add);

		return pets;
	}

	@Override
	public Pet findById(Long id) {

		return this.petRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet entity) {

		return this.petRepository.save(entity);
	}

	@Override
	public void delete(Pet entity) {

		this.petRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {

		this.petRepository.deleteById(id);
	}

	@Override
	public Pet findByName(String name) {

		return this.petRepository.findByName(name).orElse(null);
	}

}
