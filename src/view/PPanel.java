package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import blogic.Person;
import blogic.PersonDM;

public class PPanel extends JPanel
{
	
//	public JButton CreateButton;
//	public JButton ReadButton;
//	public JButton UpdateButton;
//	public JButton DeleteButton;
//
//	public JTextField fildeID;
//	public JTextField fildeFirstName;
//	public JTextField fildeLastName;
//	public JTextField fildeAge;
//
//	JRadioButton radioMySQL ;
//	JRadioButton radioH2 ;
//	JRadioButton radioJSON ;
//	JRadioButton radioXML ;
//	JRadioButton radioYAML ;
//	JRadioButton radioCSV ;
	
	public JTable DataTable;
	
	public JTable getDataTable() {
		return DataTable;
	}

	PersonDM PDM; 
	
	public PPanel() 
	{	
		
		
//		setLayout(null);	
//
//		setBackground(Color.RED);
//		setBounds(620, 10, 150, 400 );
//
//		 CreateButton = new JButton("create");
//		 ReadButton = new JButton("read");
//		 UpdateButton = new JButton("update");
//		 DeleteButton = new JButton("delete");
//		 DataTable = new JTable( ); //new Object{"ID","First Name","Last Name","Age"}  
//		 
//		 radioMySQL = new JRadioButton("MySQL");
//		 radioH2 = new JRadioButton("H2");
//		 radioJSON = new JRadioButton("JSON");
//		 radioXML = new JRadioButton("XML");
//		 radioYAML = new JRadioButton("YAML");
//		 radioCSV = new JRadioButton("CSV");
//		
//		 fildeID = new JTextField("");
//		 fildeFirstName = new JTextField("");
//		 fildeLastName = new JTextField("");
//		 fildeAge = new JTextField("");
//		
//		PDM = new PersonDM(this);
//		
//		
//		CreateButton.setBounds(630, 50, 120, 30);
//		ReadButton.setBounds(630, 80, 120, 30);
//		UpdateButton.setBounds(630, 110, 120, 30);
//		DeleteButton.setBounds(630, 140, 120, 30);
//		
//		radioH2.setBounds(630, 170, 90, 30);
//		radioJSON.setBounds(630, 200, 90, 30);
//		radioCSV.setBounds(630, 230, 90, 30);
//		radioMySQL.setBounds(630, 260, 90, 30);
//		radioXML.setBounds(630, 290, 90, 30);
//		radioYAML.setBounds(630, 320, 90, 30);
//		
//		Object[] columns = {"ID","Firs Name", "Last Name", "Age"};
//		DefaultTableModel model = new DefaultTableModel();
//		model.setColumnIdentifiers(columns);
//		DataTable.setModel(model);
////		DataTable.setBackground(Color.BLACK);
//		DataTable.setBounds(2,2,500,0);
////		DataTable.setTableHeader(new JTableHeader().set);
//		
//		fildeID.setBounds(520, 50, 120, 30);
//		fildeFirstName.setBounds(520, 80, 120, 30);
//		fildeLastName.setBounds(520, 110, 120, 30);
//		fildeAge.setBounds(520, 140, 120, 30);
//		
//		CreateButton.setName("create");
//		ReadButton.setName("read");
//		UpdateButton.setName("update");
//		DeleteButton.setName("delete");
//		
//		fildeID.setName("id");
//		fildeFirstName.setName("name");
//		fildeLastName.setName("lastname");
//		fildeAge.setName("age");
//		
//		CreateButton.setActionCommand( "create");
//		ReadButton.setActionCommand("read");
//		UpdateButton.setActionCommand("update");
//		DeleteButton.setActionCommand("delete");
////		DataTable.setActionCommand("change");
//		
//		
//		CreateButton.addActionListener(PDM.getaCreate());
//		ReadButton.addActionListener(PDM.getaRead());
//		UpdateButton.addActionListener(PDM.getaUpdate());
//		DeleteButton.addActionListener(PDM.getaDelete());
////		DataTable.addActionListener
//		
//		add(CreateButton);
//		add(ReadButton);
//		add(UpdateButton);
//		add(DeleteButton);
//		add(fildeID);
//		add(fildeFirstName);
//		add(fildeLastName);
//		add(fildeAge);
//		add(DataTable);
//		
//		add(radioH2);
//		add(radioMySQL);
//		add(radioCSV);
//		add(radioJSON);
//		add(radioYAML);
//		add(radioXML);
//		
//	}
//
//	public JTextField getFildeID() {
//		
//		return fildeID;
//	}
//
//	public void setFildeID(JTextField fildeID) {
//		this.fildeID = fildeID;
//	}
//
//	public JTextField getFildeFirstName() {
//		return fildeFirstName;
//	}
//
//	public void setFildeFirstName(JTextField fildeFirstName) {
//		this.fildeFirstName = fildeFirstName;
//	}
//
//	public JTextField getFildeLastName() {
//		return fildeLastName;
//	}
//
//	public void setFildeLastName(JTextField fildeLastName) {
//		this.fildeLastName = fildeLastName;
//	}
//
//	public JTextField getFildeAge() {
//		return fildeAge;
//	}
//
//	public void setFildeAge(JTextField fildeAge) {
//		this.fildeAge = fildeAge;
//	}
//	
//
//

	
}

