package guru.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialityRepository;
import guru.springframework.sfgpetclinic.services.SpecialityService;

@Service
@Profile("jpa")
public class SpecialityJpaService implements SpecialityService {

	private final SpecialityRepository specialityRepository;

	public SpecialityJpaService(SpecialityRepository specialityRepository) {
		super();
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Set<Speciality> findAll() {

		Set<Speciality> specialities = new HashSet<>();
		this.specialityRepository.findAll().forEach(specialities::add);

		return specialities;
	}

	@Override
	public Speciality findById(Long id) {

		return this.specialityRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality entity) {

		return this.specialityRepository.save(entity);
	}

	@Override
	public void delete(Speciality entity) {

		this.specialityRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {

		this.specialityRepository.deleteById(id);
	}

}
