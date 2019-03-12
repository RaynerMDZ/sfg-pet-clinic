package com.raynermdz.sfgpetclinic.services.map;

import com.raynermdz.sfgpetclinic.model.Owner;
import com.raynermdz.sfgpetclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceMapImpl extends AbstractMapService<Owner, Long> implements OwnerService {

  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Owner obj) {
    super.delete(obj);
  }

  @Override
  public Owner save(Owner obj) {
    return super.save(obj.getId(), obj);
  }

  @Override
  public Owner findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Owner findByLastName(String lastName) {
    return null;
  }
}
