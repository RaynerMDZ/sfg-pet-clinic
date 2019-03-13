package com.raynermdz.sfgpetclinic.services.map;

import com.raynermdz.sfgpetclinic.model.PetType;
import com.raynermdz.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceImpl extends AbstractMapService<PetType, Long> implements PetTypeService {

  @Override
  public Set<PetType> findAll() {
    return super.findAll();
  }

  @Override
  public PetType findById(Long id) {
    return super.findById(id);
  }

  @Override
  public PetType save(PetType obj) {
    return super.save(obj);
  }

  @Override
  public void delete(PetType obj) {
    super.delete(obj);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
