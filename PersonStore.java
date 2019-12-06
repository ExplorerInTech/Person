package gov.mi.lansing.hub;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonStore {
	
	private static PersonStore INSTANCE = new PersonStore();
	
	private Map<String,Person> persons = new HashMap<>();
	
	private PersonStore() {
		persons.put("1", new Person("a"));
		persons.put("2", new Person("b"));
		persons.put("3", new Person("c"));
	}
	
	public static PersonStore getPersonStore() {
		return INSTANCE;
	}
	
	public Collection<Person> viewAllPersons() {
		return persons.values();
	}
	
	public Person takePerson(String PersonId) {
		return persons.remove(PersonId);
	}
	
	public void depositPerson(Person newPerson) {
		persons.put("5", newPerson);
	}
	
	public void updatePerson(String PersonId, Person updatedPerson) {
		persons.put(PersonId, updatedPerson);
	}
	

}
