package com.secondproject.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.secondproject.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
