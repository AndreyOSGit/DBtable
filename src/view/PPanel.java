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

import blogic.Person;
import blogic.PersonDM;

public class PPanel extends JPanel
{
	
	JButton CreateButton;
	JButton ReadButton;
	JButton UpdateButton;
	JButton DeleteButton;

	public JTextField fildeID;
	public JTextField fildeFirstName;
	public JTextField fildeLastName;
	public JTextField fildeAge;
	
	PersonDM PDM; 
	
	public PPanel() 
	{	
		PDM = new PersonDM(this);
		
		
		setLayout(null);	

		setBackground(Color.RED);
		setBounds(620, 10, 150, 400 );

		JButton CreateButton = new JButton("create");
		JButton ReadButton = new JButton("read");
		JButton UpdateButton = new JButton("update");
		JButton DeleteButton = new JButton("delete");
		JTable DataTable = new JTable();  
		
		JRadioButton radioMySQL = new JRadioButton("MySQL");
		JRadioButton radioH2 = new JRadioButton("H2");
		JRadioButton radioJSON = new JRadioButton("JSON");
		JRadioButton radioXML = new JRadioButton("XML");
		JRadioButton radioYAML = new JRadioButton("YAML");
		JRadioButton radioCSV = new JRadioButton("CSV");
		
		JTextField fildeID = new JTextField();
		JTextField fildeFirstName = new JTextField();
		JTextField fildeLastName = new JTextField();
		JTextField fildeAge = new JTextField();
		
		
		CreateButton.setBounds(630, 50, 120, 30);
		ReadButton.setBounds(630, 80, 120, 30);
		UpdateButton.setBounds(630, 110, 120, 30);
		DeleteButton.setBounds(630, 140, 120, 30);
		
		DataTable.setBounds(2,2,500,600);
		fildeID.setBounds(520, 50, 120, 30);
		fildeFirstName.setBounds(520, 80, 120, 30);
		fildeLastName.setBounds(520, 110, 120, 30);
		fildeAge.setBounds(520, 140, 120, 30);
		
		CreateButton.setName("create");
		ReadButton.setName("read");
		UpdateButton.setName("update");
		DeleteButton.setName("delete");
		
		fildeID.setName("id");
		fildeFirstName.setName("name");
		fildeLastName.setName("lastname");
		fildeAge.setName("age");
		
		
		CreateButton.setActionCommand( "create");
		ReadButton.setActionCommand("read");
		UpdateButton.setActionCommand("update");
		DeleteButton.setActionCommand("delete");
		
		
		CreateButton.addActionListener(PDM.getaCreate());
		ReadButton.addActionListener(PDM.getaRead());
		UpdateButton.addActionListener(PDM.getaUpdate());
		DeleteButton.addActionListener(PDM.getaDelete());
		
//		DeleteButton.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				// разобрать как  
//				
//			}
//		});
		
		add(CreateButton);
		add(ReadButton);
		add(UpdateButton);
		add(DeleteButton);
		add(fildeID);
		add(fildeFirstName);
		add(fildeLastName);
		add(fildeAge);
		add(DataTable);
		
		add(radioH2);
		add(radioMySQL);
		add(radioCSV);
		add(radioJSON);
		add(radioYAML);
		add(radioXML);
	}

	public JTextField getFildeID() {
		return fildeID;
	}

	public void setFildeID(JTextField fildeID) {
		this.fildeID = fildeID;
	}

	public JTextField getFildeFirstName() {
		return fildeFirstName;
	}

	public void setFildeFirstName(JTextField fildeFirstName) {
		this.fildeFirstName = fildeFirstName;
	}

	public JTextField getFildeLastName() {
		return fildeLastName;
	}

	public void setFildeLastName(JTextField fildeLastName) {
		this.fildeLastName = fildeLastName;
	}

	public JTextField getFildeAge() {
		return fildeAge;
	}

	public void setFildeAge(JTextField fildeAge) {
		this.fildeAge = fildeAge;
	}
	



	
}

