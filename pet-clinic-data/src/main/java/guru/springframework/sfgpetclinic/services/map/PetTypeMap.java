package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeSwrvice;

public class PetTypeMap extends AbstractMapService<PetType, Long> implements PetTypeSwrvice {

	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		return super.findAll();
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public PetType save(PetType entity) {
		// TODO Auto-generated method stub
		return super.save(entity);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(PetType entity) {
		// TODO Auto-generated method stub
		super.delete(entity);
	}

}