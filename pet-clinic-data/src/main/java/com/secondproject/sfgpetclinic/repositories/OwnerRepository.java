package com.secondproject.sfgpetclinic.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.secondproject.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
	
	Owner findByLastName(String lastName);
	
	List<Owner> findAllByLastNameLike(String lastName);
}
