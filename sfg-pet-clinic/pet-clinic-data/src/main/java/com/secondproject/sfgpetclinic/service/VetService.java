package com.secondproject.sfgpetclinic.service;

import java.util.Set;

import com.secondproject.sfgpetclinic.model.Vet;


public interface VetService {
	
	Vet findbyId(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();

}
