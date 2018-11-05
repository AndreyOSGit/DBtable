package blogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.ActivationSystem;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import dal.iPersonDao;
import view.PPanel;

public class PersonDM extends AbstractTableModel {

	
	private ArrayList<Person> pp;
	
	iPersonDao dao;
	
	public PPanel panelBD;
	
	public ActionCreate aCreate = new ActionCreate();
	public ActionRead aRead = new ActionRead();
	public ActionDelete aDelete = new ActionDelete();
	public ActionUpdate aUpdate = new ActionUpdate();
	
//	public static getPresonDM getInstance() 
//	{
//		if (instance == null)
//		{
//			instance = new PCommand();
//		}
//		
//		return instance;
//	}
	
	public PersonDM() {
		pp = new ArrayList<Person>();

//		aCreate = new ActionCreate();
//		aRead = new ActionRead();
//		aDelete = new ActionDelete();
//		aUpdate = new ActionUpdate();
	}

	public ActionCreate getaCreate() {
		return aCreate;
	}

	public void setaCreate(ActionCreate aCreate) {
		this.aCreate = aCreate;
	}

	public ActionRead getaRead() {
		return aRead;
	}

	public void setaRead(ActionRead aRead) {
		this.aRead = aRead;
	}

	public ActionDelete getaDelete() {
		return aDelete;
	}

	public void setaDelete(ActionDelete aDelete) {
		this.aDelete = aDelete;
	}

	public ActionUpdate getaUpdate() {
		return aUpdate;
	}

	public void setaUpdate(ActionUpdate aUpdate) {
		this.aUpdate = aUpdate;
	}

	
	
	public PersonDM(PPanel pPanel) {
		// TODO Auto-generated constructor stub
	}

	public String getColumnName(int index) {
		
		String colName = "";
		return colName;
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getValueAt(int row, int cal) {
		// TODO Auto-generated method stub
		return null;
	}
	
	class ActionCreate implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("create");
			System.out.println(	panelBD.getFildeID() );
			
		}
		
	}
	class ActionUpdate implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("update");
			
			//read  
		}
		
	}
	class ActionRead implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(	panelBD.getFildeID() );
			System.out.println("read");	
		}
		
		
	}
	class ActionDelete implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("delete");
			 
			
		}
		
	}
	
	private Person getPersonaFromUI(PPanel panelBD)
	{
		
		
		Person p = new Person(
				Integer.parseInt(  panelBD.getFildeID().getText() ),
				panelBD.fildeFirstName.getText(), 
				panelBD.fildeLastName.getText(), 
				Integer.parseInt( panelBD.fildeAge.getText() )
				);
		System.out.println(
				Integer.parseInt(  panelBD.fildeID.getText() ) +
				panelBD.fildeFirstName.getText() +
				panelBD.fildeLastName.getText() +
				Integer.parseInt( panelBD.fildeAge.getText() )
				);
		return p;
		
	}
	//вложенных класса имплиментирующих action listners - слушатели дл€ кнопок CRUD
	//¬ычитывает из полей данные - потом отправл€ет данные на запрос из базы
	
}
