package com.secondproject.sfgpetclinic.service.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.secondproject.sfgpetclinic.model.Vet;
import com.secondproject.sfgpetclinic.repositories.SpecialtyRepository;
import com.secondproject.sfgpetclinic.repositories.VetRepository;
import com.secondproject.sfgpetclinic.service.VetService;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService{
	
	private final VetRepository vetRepository;
	
	public VetSDJpaService(VetRepository vetRepository) {
		this.vetRepository = vetRepository;
	}

	@Override
	public Set<Vet> findAll() {
		// TODO Auto-generated method stub
		Set<Vet> vets = new HashSet<>();
		vetRepository.findAll().forEach(vets::add);
		return vets;
	}

	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return vetRepository.findById(id).orElse(null);
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return vetRepository.save(object);
	}

	@Override
	public void delete(Vet object) {
		// TODO Auto-generated method stub
		vetRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		vetRepository.deleteById(id);
	}

}
