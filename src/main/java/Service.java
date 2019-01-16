import java.util.HashMap;

import com.google.gson.Gson;

public class Service {

	HashMap<Integer, Account> file = new HashMap<>();

	public void addAccount(Integer key, Account person) {
		file.put(key, person);
	}

	public Account retrievePerson(Integer key) {
		return file.get(key);

	}

	public HashMap<Integer, Account> retrieveAll() {
		for (int i = 0; i <= file.size(); i++) {
			System.out.println(file.get(i));
		}
		return file;

	}

	public void deletePerson(Integer key) {
		file.remove(key);
	}
	
	public String jsonString(Integer key) {
		return new Gson().toJson(retrievePerson(key));
	}

}
