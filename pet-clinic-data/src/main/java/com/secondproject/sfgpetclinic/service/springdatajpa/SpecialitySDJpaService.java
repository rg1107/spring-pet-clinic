package com.secondproject.sfgpetclinic.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.secondproject.sfgpetclinic.model.Speciality;
import com.secondproject.sfgpetclinic.repositories.SpecialtyRepository;
import com.secondproject.sfgpetclinic.service.SpecialtyService;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialtyService {
	
	private final SpecialtyRepository specialtyRepository;
	
	public SpecialitySDJpaService(SpecialtyRepository specialtyRepository) {
		this.specialtyRepository = specialtyRepository;
	}

	@Override
	public Set<Speciality> findAll() {
		// TODO Auto-generated method stub
		Set<Speciality> specialties = new HashSet<>();
		specialtyRepository.findAll().forEach(specialties::add);
		return specialties;
	}

	@Override
	public Speciality findById(Long id) {
		// TODO Auto-generated method stub
		return specialtyRepository.findById(id).orElse(null);
	}

	@Override
	public Speciality save(Speciality object) {
		// TODO Auto-generated method stub
		return specialtyRepository.save(object);
	}

	@Override
	public void delete(Speciality object) {
		// TODO Auto-generated method stub
		specialtyRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		specialtyRepository.deleteById(id);
	}

}
