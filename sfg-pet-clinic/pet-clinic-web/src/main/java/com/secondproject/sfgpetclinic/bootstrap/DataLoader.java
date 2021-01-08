package com.secondproject.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.secondproject.sfgpetclinic.model.Owner;
import com.secondproject.sfgpetclinic.model.Vet;
import com.secondproject.sfgpetclinic.service.OwnerService;
import com.secondproject.sfgpetclinic.service.VetService;
import com.secondproject.sfgpetclinic.service.map.OwnerServiceMap;
import com.secondproject.sfgpetclinic.service.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Owner owner1 = new Owner();
		owner1.setFirstName("Rahul");
		owner1.setLastName("Gite");
		
		ownerService.save(owner1);
		
		Owner owner2 = new Owner();
		owner2.setFirstName("Aishwarya");
		owner2.setLastName("Gite");
		
		ownerService.save(owner2);
		
		System.out.println("Loaded Owners...");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Nimish");
		vet1.setLastName("Gite");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Sushma");
		vet2.setLastName("Gite");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets...");
		
	}

}
