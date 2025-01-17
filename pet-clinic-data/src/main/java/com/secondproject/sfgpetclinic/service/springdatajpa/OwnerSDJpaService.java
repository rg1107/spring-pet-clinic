package com.secondproject.sfgpetclinic.service.springdatajpa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.secondproject.sfgpetclinic.model.Owner;
import com.secondproject.sfgpetclinic.repositories.OwnerRepository;
import com.secondproject.sfgpetclinic.repositories.PetRepository;
import com.secondproject.sfgpetclinic.repositories.PetTypeRepository;
import com.secondproject.sfgpetclinic.service.OwnerService;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;
	
	public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findAll() {
		
		Set<Owner> owners  = new HashSet<>();
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		return ownerRepository.findById(id).orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		
		ownerRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		
		ownerRepository.deleteById(id);
	}

	@Override
	public Owner findbylastName(String lastName) {
		
		return ownerRepository.findByLastName(lastName);
	}
	
	@Override
    public List<Owner> findAllByLastNameLike(String lastName) {
        return ownerRepository.findAllByLastNameLike(lastName);
    }

	
	

}
