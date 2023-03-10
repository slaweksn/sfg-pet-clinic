package guru.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.sfgpetclinic.model.PetType;

@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
