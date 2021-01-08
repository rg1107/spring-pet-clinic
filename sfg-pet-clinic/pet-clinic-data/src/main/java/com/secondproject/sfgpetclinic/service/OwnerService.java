package com.secondproject.sfgpetclinic.service;

import com.secondproject.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
	
	Owner findbylastName(String lastName);
}
