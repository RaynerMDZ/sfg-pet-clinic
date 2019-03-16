package com.raynermdz.sfgpetclinic.repositories;

import com.raynermdz.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
}
