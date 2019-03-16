package com.raynermdz.sfgpetclinic.services.map;

import com.raynermdz.sfgpetclinic.model.Speciality;
import com.raynermdz.sfgpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialityServiceMapImpl extends AbstractMapService<Speciality, Long> implements SpecialityService {

  @Override
  public Set<Speciality> findAll() {
    return super.findAll();
  }

  @Override
  public Speciality findById(Long id) {
    return super.findById(id);
  }

  @Override
  public Speciality save(Speciality obj) {
    return super.save(obj);
  }

  @Override
  public void delete(Speciality obj) {
    super.delete(obj);
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }
}
