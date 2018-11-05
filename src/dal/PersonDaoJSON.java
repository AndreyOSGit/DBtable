package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import blogic.Person;

public class PersonDaoJSON implements iPersonDao {

	private ArrayList<Person> pp;
	
	
	@Override
	public void create(Person p) throws Exception {
	
		Class.forName("org.h2.Driver");
		
		Connection conH2 = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
	
		Statement st = conH2.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM PERSON");
		

			st.executeUpdate(
					"INSERT INTO PERSON VALUES( "
					+ String.valueOf(p.id) + ", " 
					+ "' " +String.valueOf(p.firstName) + "', " 
					+ "' " +String.valueOf(p.lastName) + "', " 
					+ String.valueOf(p.age) + " );"
					
					);
		 
		
	}

	@Override
	public ArrayList<Person> read() throws Exception {

		pp = new ArrayList<>();
		
		Class.forName("org.h2.Driver");
		
		Connection conH2 = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
	
		Statement st = conH2.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM PERSON");

		
		while (rs.next())
		{
			pp.add( new Person
				  ( 
				  rs.getInt("ID"),
				  rs.getString(2),
				  rs.getString("lastName"),
				  rs.getInt("AGE")
				  )
				);
		  
		}
		
		return pp;
	}

	@Override
	public void update(Person p) throws Exception {
		
	Class.forName("org.h2.Driver");
		
		Connection conH2 = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
	
		Statement st = conH2.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM PERSON");
		

			st.executeUpdate(
					"INSERT INTO PERSON VALUES( "
					+ String.valueOf(p.id) + ", " 
					+ "' " +String.valueOf(p.firstName) + "', " 
					+ "' " +String.valueOf(p.lastName) + "', " 
					+ String.valueOf(p.age) + " );"
					
					);
		  
		}


	@Override
	public void delete(Person p) throws Exception {

		Class.forName("org.h2.Driver");
		
		Connection conH2 = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
	
		Statement st = conH2.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT * FROM PERSON");
		
			st.execute(
					"DELETE FROM PERSON WHERE ID= "
					+ String.valueOf(p.id) + " AND " 
					+ "firstName= '" +String.valueOf(p.firstName) + "' AND " 
					+ "lastName= '" +String.valueOf(p.lastName) + "' AND " 
					+ "age= " +String.valueOf(p.age) + ";"
					);
		
	}

}
