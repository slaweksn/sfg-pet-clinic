package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;

@Service
@Profile({"default", "map"})
public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements OwnerService {

	private final PetTypeService petTypeService;
	private final PetService petService;

	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		super();
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Set<Owner> findAll() {

		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {

		return super.findById(id);
	}

	@Override
	public Owner save(Owner entity) {
		
		if (entity != null) {

			entity.getPets().forEach(pet -> {

				if (pet.getPetType() != null) {
					if (pet.getPetType().getId() == null) {
						pet.setPetType(petTypeService.save(pet.getPetType()));
					}
				} else {
					throw new RuntimeException("Pet Type is required");
				}

				if (pet.getId() == null) {
					Pet savedPet = petService.save(pet);
					pet.setId(savedPet.getId());
				}
			});

			return super.save(entity);

		} else {
			return null;
		}
	}

	@Override
	public void delete(Owner entity) {

		super.delete(entity);
	}

	@Override
	public void deleteById(Long id) {

		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
