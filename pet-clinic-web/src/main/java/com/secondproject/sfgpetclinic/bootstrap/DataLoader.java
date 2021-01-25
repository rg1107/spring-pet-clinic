package com.secondproject.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.secondproject.sfgpetclinic.model.Owner;
import com.secondproject.sfgpetclinic.model.Pet;
import com.secondproject.sfgpetclinic.model.PetType;
import com.secondproject.sfgpetclinic.model.Speciality;
import com.secondproject.sfgpetclinic.model.Vet;
import com.secondproject.sfgpetclinic.model.Visit;
import com.secondproject.sfgpetclinic.service.OwnerService;
import com.secondproject.sfgpetclinic.service.PetTypeService;
import com.secondproject.sfgpetclinic.service.SpecialtyService;
import com.secondproject.sfgpetclinic.service.VetService;
import com.secondproject.sfgpetclinic.service.VisitService;
import com.secondproject.sfgpetclinic.service.map.OwnerMapService;
import com.secondproject.sfgpetclinic.service.map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialtyService specialtyService;
	private final VisitService visitService;
	
	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialtyService specialtyService, VisitService visitService) {
		
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialtyService = specialtyService;
		this.visitService = visitService;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		int count = petTypeService.findAll().size();
		
		if(count == 0) {
			loadData();
		}
		
		
	}


	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		System.out.println("Loaded PetType...");
		
		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		Speciality savedRadiology = specialtyService.save(radiology);
		
		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		Speciality savedSurgery = specialtyService.save(surgery);
		
		Speciality dentistry = new Speciality();
		dentistry.setDescription("Dentistry");
		Speciality savedDentistry = specialtyService.save(dentistry);
		
		System.out.println("Loaded Specialties");
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Rahul");
		owner1.setLastName("Gite");
		owner1.setAddress("P-10/5");
		owner1.setCity("Ballari");
		owner1.setTelephone("1223124334");
		
		Pet rahulPet = new Pet();
		rahulPet.setPetType(savedDogPetType);
		rahulPet.setOwner(owner1);
		rahulPet.setBirthDate(LocalDate.now());
		rahulPet.setName("Rosco");
		owner1.getPets().add(rahulPet);
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Aishwarya");
		owner2.setLastName("Gite");
		owner2.setAddress("A-3/3");
		owner2.setCity("Hospet");
		owner2.setTelephone("232352454");
		
		Pet tuktukPet = new Pet();
		tuktukPet.setPetType(savedCatPetType);
		tuktukPet.setOwner(owner2);
		tuktukPet.setBirthDate(LocalDate.now());
		tuktukPet.setName("Scylla");
		owner2.getPets().add(tuktukPet);
		
		
		ownerService.save(owner2);
		
		Visit catVisit = new Visit();
		catVisit.setPet(tuktukPet);
		catVisit.setDate(LocalDate.now());
		catVisit.setDescription("Sneezy Kitty");
		
		visitService.save(catVisit);
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Nimish");
		vet1.setLastName("Gite");
		vet1.getSpecialities().add(savedRadiology);
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Sushma");
		vet2.setLastName("Gite");
		vet2.getSpecialities().add(savedSurgery);
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
	}

}
