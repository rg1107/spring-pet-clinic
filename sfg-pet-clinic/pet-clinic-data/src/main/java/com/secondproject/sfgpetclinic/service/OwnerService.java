package com.secondproject.sfgpetclinic.service;

import java.util.Set;

import com.secondproject.sfgpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findbyId(Long id);
	Owner findbylastName(String lastName);
	Owner save(Owner owner);
	Set<Owner> findAll();

}
