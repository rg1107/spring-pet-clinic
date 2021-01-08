package com.secondproject.sfgpetclinic.service.map;

import java.util.Set;

import com.secondproject.sfgpetclinic.model.Pet;
import com.secondproject.sfgpetclinic.model.Vet;
import com.secondproject.sfgpetclinic.service.VetService;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService{
	
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(),object);
	}
	
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
