package com.secondproject.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.secondproject.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
