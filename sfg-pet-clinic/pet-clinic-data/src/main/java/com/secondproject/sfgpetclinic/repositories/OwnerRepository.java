package com.secondproject.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.secondproject.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
