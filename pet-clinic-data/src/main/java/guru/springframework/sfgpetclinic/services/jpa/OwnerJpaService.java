package guru.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.services.OwnerService;

@Service
@Profile("jpa")
public class OwnerJpaService implements OwnerService {

	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;

	public OwnerJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		super();
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findAll() {
		
		Set<Owner> owners = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner entity) {
		
		return ownerRepository.save(entity);
	}

	@Override
	public void delete(Owner entity) {
		
		ownerRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		
		ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		
		return ownerRepository.findByLastName(lastName);
	}
}
