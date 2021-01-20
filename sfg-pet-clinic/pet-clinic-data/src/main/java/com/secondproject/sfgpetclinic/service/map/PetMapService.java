package com.secondproject.sfgpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.secondproject.sfgpetclinic.model.Owner;
import com.secondproject.sfgpetclinic.model.Pet;
import com.secondproject.sfgpetclinic.service.CrudService;
import com.secondproject.sfgpetclinic.service.PetService;

@Service
public class PetMapService extends AbstractMapService<Pet,Long> implements PetService {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}
	
	@Override
	public void delete(Pet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
