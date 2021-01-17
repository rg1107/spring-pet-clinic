package com.secondproject.sfgpetclinic.service.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.secondproject.sfgpetclinic.model.Pet;
import com.secondproject.sfgpetclinic.model.Speciality;
import com.secondproject.sfgpetclinic.model.Vet;
import com.secondproject.sfgpetclinic.service.SpecialtyService;
import com.secondproject.sfgpetclinic.service.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService{
	
	private final SpecialtyService specialtyService;
	
	
	public VetServiceMap(SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
	}

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
		
		if(object.getSpecialities().size() > 0) {
			object.getSpecialities().forEach(speciality -> {
				if(speciality.getId() == null) {
					Speciality savedSpecialty = specialtyService.save(speciality);
					speciality.setId(savedSpecialty.getId());
				}
			});
		}
		
		return super.save(object);
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
