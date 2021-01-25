package com.secondproject.sfgpetclinic.service.map;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.secondproject.sfgpetclinic.model.Owner;


class OwnerMapServiceTest {

	OwnerMapService ownerMapService;
	
	final Long ownerId = 1L;
	final String lastName = "Gite";
	
	@BeforeEach
	void setUp() throws Exception {
		
		ownerMapService = new OwnerMapService(new PetTypeMapService(),new PetMapService());
		
		ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());
	}

	@Test
	void testFindAll() {
		Set<Owner> ownerSet = ownerMapService.findAll();
		
		assertEquals(1, ownerSet.size());
	}

	@Test
	void testFindByIdLong() {
		Owner owner = ownerMapService.findById(ownerId);
		
		assertEquals(ownerId, owner.getId());
	}

	@Test
	void testSaveExistingId() {
		Long id = 2L;
		
		Owner owner2 = Owner.builder().id(id).build();
		Owner testOwner = ownerMapService.save(owner2);
		
		assertEquals(id, testOwner.getId());
	}
	
	@Test
	void saveNoId() {
		
		Owner saveOwner = ownerMapService.save(Owner.builder().build());
		
		assertNotNull(saveOwner);
		assertNotNull(saveOwner.getId());
	}

	@Test
	void testDeleteOwner() {
		
		ownerMapService.delete(ownerMapService.findById(ownerId));
		
		assertEquals(0, ownerMapService.findAll().size());
	}

	@Test
	void testDeleteByIdLong() {
		
		ownerMapService.deleteById(ownerId);
		
		assertEquals(0, ownerMapService.findAll().size());
		
	}

	@Test
	void testFindbylastName() {
		
		Owner gite = ownerMapService.findbylastName(lastName);
		
		assertNotNull(gite);
		
		assertEquals(ownerId, gite.getId());
	}
	
	@Test
	void testFindbylastNameNotFound() {
		
		Owner foo = ownerMapService.findbylastName("foo");
		
		assertNull(foo);
	}

}
