package com.secondproject.sfgpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.secondproject.sfgpetclinic.model.Owner;
import com.secondproject.sfgpetclinic.service.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService{

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return super.save(object.getId(),object);
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findbylastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}
