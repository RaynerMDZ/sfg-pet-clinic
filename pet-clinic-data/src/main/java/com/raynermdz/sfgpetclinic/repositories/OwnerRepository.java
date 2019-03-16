package com.raynermdz.sfgpetclinic.repositories;

import com.raynermdz.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long> {

  Owner findByLastName(String lastName);
}
