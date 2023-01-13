package guru.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.services.PetTypeService;

public class PetTypeJpaService implements PetTypeService {

	private final PetTypeRepository petTypeRepository;

	public PetTypeJpaService(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {

		Set<PetType> petTypes = new HashSet<>();
		this.petTypeRepository.findAll().forEach(petTypes::add);

		return petTypes;
	}

	@Override
	public PetType findById(Long id) {

		return this.petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType entity) {

		return this.petTypeRepository.save(entity);
	}

	@Override
	public void delete(PetType entity) {

		this.petTypeRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {

		this.petTypeRepository.deleteById(id);
	}

}
