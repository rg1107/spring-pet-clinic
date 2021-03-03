package com.secondproject.sfgpetclinic.service;

import java.util.List;

import com.secondproject.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
	
	Owner findbylastName(String lastName);
	
	List<Owner> findAllByLastNameLike(String lastName);
}
