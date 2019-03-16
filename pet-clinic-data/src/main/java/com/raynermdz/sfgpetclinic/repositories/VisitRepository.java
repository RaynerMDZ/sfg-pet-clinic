package com.raynermdz.sfgpetclinic.repositories;

import com.raynermdz.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
