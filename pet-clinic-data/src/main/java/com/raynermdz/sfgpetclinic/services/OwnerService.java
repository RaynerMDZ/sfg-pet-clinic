package com.raynermdz.sfgpetclinic.services;

import com.raynermdz.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

  Owner findByLastName(String lastName);
}
