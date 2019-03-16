package com.raynermdz.sfgpetclinic.repositories;

import com.raynermdz.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VetRepository extends CrudRepository<Vet, Long> {
}
