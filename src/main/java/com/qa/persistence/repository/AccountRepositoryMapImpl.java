package com.qa.persistence.repository;

import java.util.HashMap;

import com.google.gson.Gson;
import com.qa.persistence.domain.Account;

public class AccountRepositoryMapImpl {

	HashMap<Integer, Account> file = new HashMap<>();

	private int count = 0;

	public void addAccount(Account person) {
		file.put(count, person);
		count++;
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

	public int firstNameCounter(String name) {
		int counter = 0;
		for (int i = 1; i <= file.size(); i++) {
			if (file.get(i).getFirstName().equals(name)) {
				counter++;
			}
		}
		return counter;

	}

}
