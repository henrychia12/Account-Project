import com.google.gson.Gson;

public abstract class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account personOne = new Account("John", "Smith", 436432);
		Account personTwo = new Account("Sarah", "Graham", 443123);
		Service service = new Service();

		
		service.addAccount(1, personOne);
		service.addAccount(2, personTwo);
		System.out.println(service.retrievePerson(1));
		System.out.println(service.retrievePerson(2));
		
		service.retrieveAll();
		
		System.out.println(service.jsonString(2));
//		System.out.println(new Gson().toJson(service.retrievePerson(1)));
		

	}

}
