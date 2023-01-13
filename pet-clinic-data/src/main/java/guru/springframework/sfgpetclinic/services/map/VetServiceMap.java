package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import guru.springframework.sfgpetclinic.services.VetService;

@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
	
	private final SpecialityService specialityService;
	
	public VetServiceMap(SpecialityService specialityService) {
		super();
		this.specialityService = specialityService;
	}

	@Override
	public Set<Vet> findAll() {

		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {

		return super.findById(id);
	}

	@Override
	public Vet save(Vet entity) {
		
		if (entity.getSpecialities().size() > 0){
			entity.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = specialityService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }
		return super.save(entity);
	}

	@Override
	public void delete(Vet entity) {

		super.delete(entity);
	}

	@Override
	public void deleteById(Long id) {

		super.deleteById(id);
	}

}
