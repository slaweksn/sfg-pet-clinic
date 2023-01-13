package guru.springframework.sfgpetclinic.services.jpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitRepository;
import guru.springframework.sfgpetclinic.services.VisitService;

@Service
@Profile("jpa")
public class VisitJpaService implements VisitService {

	private final VisitRepository visitRepository;

	public VisitJpaService(VisitRepository visitRepository) {
		super();
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll() {

		Set<Visit> visits = new HashSet<>();
		this.visitRepository.findAll().forEach(visits::add);

		return visits;
	}

	@Override
	public Visit findById(Long id) {

		return this.visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit entity) {

		return this.visitRepository.save(entity);
	}

	@Override
	public void delete(Visit entity) {

		this.visitRepository.delete(entity);
	}

	@Override
	public void deleteById(Long id) {

		this.visitRepository.deleteById(id);
	}

}
