package com.secondproject.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.secondproject.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
