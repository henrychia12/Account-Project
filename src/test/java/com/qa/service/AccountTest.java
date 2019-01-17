//package com.qa.service;
//
//import java.util.HashMap;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import com.qa.business.service.AccountServiceImpl;
//import com.qa.persistence.domain.Account;
//
//
//public class AccountTest {
//
//	public Account personOne;
//	public Account personTwo;
//	public Account personThree;
//	public Account personFour;
//	public AccountServiceImpl service;
//	public HashMap file;
//
//	@Before
//	public void setup() {
//		personOne = new Account("Sarah", "Todd", 435122);
//		personTwo = new Account("Carlton", "Smith", 535322);
//		personThree = new Account("Carlton", "Edward", 563722);
//		personFour = new Account("Carlton", "Peters", 123322);
//		service = new AccountServiceImpl();
//		file = new HashMap<>();
//	}
//
//	@Test
//	public void addAccount() {
//		service.addAccount(1, personOne);
//		Assert.assertEquals("Sarah", personOne.getFirstName());
//	}
//
//	@Test
//	public void retrieveAccount() {
//		service.retrievePerson(1);
//		Assert.assertEquals("Sarah", personOne.getFirstName());
//	}
//
//	@Test
//	public void deleteAccount() {
//		service.addAccount(1, personOne);
//		service.deletePerson(1);
//		Assert.assertEquals(0, file.size());
//	}
//
//	@Test
//	public void jsonTest() {
//		service.addAccount(1, personOne);
//		Assert.assertEquals("{\"firstName\":\"Sarah\",\"lastName\":\"Todd\",\"accountNumber\":435122}", service.jsonString(1));
//		}
//	
//	@Test
//	public void firstNameCounterTest() {
//		service.addAccount(1, personTwo);
//		service.addAccount(2, personThree);
//		service.addAccount(3, personFour);
//		Assert.assertEquals(3, service.firstNameCounter("Carlton"));
//	}
//}
