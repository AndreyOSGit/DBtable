package dal;

import java.util.ArrayList;

import blogic.Person;

public interface iPersonDao {
	
	 void create(Person p) throws Exception;
	
	 ArrayList<Person> read() throws Exception;
	
	 void update(Person p) throws Exception;
	
	 void delete(Person p) throws Exception;

}
