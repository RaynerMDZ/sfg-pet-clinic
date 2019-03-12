package com.raynermdz.sfgpetclinic.services.map;

import com.raynermdz.sfgpetclinic.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

  protected Map<Long, T> map = new HashMap<>();

  Set<T> findAll() {
    return new HashSet<>(map.values());
  }

  T findById(ID id) {
    return map.get(id);
  }

  T save(T obj) {

    if (obj != null) {
      if (obj.getId() == null) {
        obj.setId(getNextId());
      }
      map.put(obj.getId(), obj);

    } else {
      throw new RuntimeException("Object cannot be null");
    }

    map.put(obj.getId(), obj);
    return obj;
  }

  void deleteById(ID id) {
    map.remove(id);
  }

  void delete(T obj) {
//    map.entrySet().removeIf(entry -> entry.getValue().equals(obj));
    map.values().removeIf(entry -> entry.equals(obj));
  }

  // If id is 3 then it returns 4.
  private Long getNextId() {

    Long nextId = null;
    
    try {
      nextId = Collections.max(map.keySet()) + 1;
    } catch (NoSuchElementException e) {
      nextId = 1L;
    }
    return nextId;
  }
}
