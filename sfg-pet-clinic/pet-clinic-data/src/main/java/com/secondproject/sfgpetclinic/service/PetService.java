package com.secondproject.sfgpetclinic.service;

import java.util.Set;

import com.secondproject.sfgpetclinic.model.Pet;

public interface PetService {
	
	Pet findbyId(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
