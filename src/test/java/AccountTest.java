import java.util.HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	public Account personOne;
	public Account personTwo;
	public Service service;
	public HashMap file;

	@Before
	public void setup() {
		personOne = new Account("Sarah", "Todd", 435122);
		personTwo = new Account("John", "Smith", 535322);
		service = new Service();
		file = new HashMap<>();
	}

	@Test
	public void addAccount() {
		service.addAccount(1, personOne);
		Assert.assertEquals("Sarah", personOne.getFirstName());
	}

	@Test
	public void retrieveAccount() {
		service.retrievePerson(1);
		Assert.assertEquals("Sarah", personOne.getFirstName());
	}

	@Test
	public void deleteAccount() {
		service.addAccount(1, personOne);
		service.deletePerson(1);
		Assert.assertEquals(0, file.size());
	}

	@Test
	public void jsonTest() {
		service.addAccount(1, personOne);
		Assert.assertEquals("{\"firstName\":\"Sarah\",\"lastName\":\"Todd\",\"accountNumber\":435122}", service.jsonString(1));
		}

}
