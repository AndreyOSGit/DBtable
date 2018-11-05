package dal;

import java.util.ArrayList;

import blogic.Person;

public class PersonDaoMock implements iPersonDao {

	private ArrayList<Person> pp;
	
	public PersonDaoMock() {
		
		pp = new ArrayList<>();
		pp.add(new Person(1, "Tacha", "Hanan", 43));
		
	}

	@Override
	public void create(Person p) {
		
	}

	@Override
	public ArrayList<Person> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Person p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Person p) {
		// TODO Auto-generated method stub
		
	}
	
}
