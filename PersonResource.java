package gov.mi.lansing.hub;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

	@GET
	public Collection<Person> listPersons() {
		return PersonStore.getPersonStore().viewAllPersons();
	}
	
	@Path("/{id}")
	@DELETE
	public Person takePerson(@PathParam("id") String PersonId) {
		return PersonStore.getPersonStore().takePerson(PersonId);
	}
	
	@POST
	public void depositPerson(Person newPerson) {
		PersonStore.getPersonStore().depositPerson(newPerson);
	}
	
	@Path("/{id}")
	@PUT
	public void updatePerson(@PathParam("id") String PersonId, Person Person) {
		PersonStore.getPersonStore().updatePerson(PersonId, Person);
	}
}
