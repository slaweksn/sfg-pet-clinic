package guru.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.repositories.SpecialityRepository;
import guru.springframework.sfgpetclinic.repositories.VetRepository;
import guru.springframework.sfgpetclinic.services.VetService;

@Service
@Profile("jpa")
public class VetJpaService implements VetService {

	private final VetRepository vetRepository;
	private final SpecialityRepository specialityRepository;
	
	public VetJpaService(VetRepository vetRepository, SpecialityRepository specialityRepository) {
		super();
		this.vetRepository = vetRepository;
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Set<Vet> findAll() {
		
		Set<Vet> vets = new HashSet<>();
		this.vetRepository.findAll().forEach(vets::add);
		
		return vets;
	}

	@Override
	public Vet findById(Long id) {
		
		return this.vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet entity) {
		
		return this.vetRepository.save(entity);
	}

	@Override
	public void delete(Vet entity) {
		
		this.vetRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		
		this.vetRepository.deleteById(id);
	}

}
