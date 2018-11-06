package blogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.ActivationSystem;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import dal.PersonDaoH2;
import dal.iPersonDao;
import view.PPanel;

public class PersonDM extends AbstractTableModel {

	
	private ArrayList<Person> pp;
	
	iPersonDao dao;
	
	PersonDaoH2 daoh2;
	
	public PPanel panelBD;
	
	public ActionCreate aCreate;
	public ActionRead aRead;
	public ActionDelete aDelete;
	public ActionUpdate aUpdate;
	
	public PersonDM() {
		pp = new ArrayList<Person>();
	}
	public PersonDM(PPanel pPanel) {
		pp = new ArrayList<Person>();
		
		panelBD = pPanel;

	 aCreate = new ActionCreate();
	 aRead = new ActionRead();
	 aDelete = new ActionDelete();
	 aUpdate = new ActionUpdate();
	}
	
	
	//	public static getPresonDM getInstance() 
//	{
//		if (instance == null)
//		{
//			instance = new PCommand();
//		}
//		
//		return instance;
//	}
	

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
	
	public void setDataInTable(ArrayList<Person> pp) {
		
		  Object[] row = { pp.get(0).id
				  , pp.get(0).firstName
				  , pp.get(0).lastName
				  , pp.get(0).age };

		    DefaultTableModel model = (DefaultTableModel) panelBD.getDataTable().getModel();

		    model.addRow(row);
		
		
	}
	class ActionCreate implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			Person p = getPersonaFromUI(panelBD);
			try {
				daoh2.create(p);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			System.out.println("create");

			
		}
		
	}
	class ActionUpdate implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Person p = getPersonaFromUI(panelBD);
			try {
				daoh2.update(p);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			System.out.println("update");
		  
		}
		
	}
	class ActionRead implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Person p = getPersonaFromUI(panelBD);
			try {
			pp = daoh2.read();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("read");	
		}
		
		
	}
	class ActionDelete implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("delete");
			Person p = getPersonaFromUI(panelBD);
				try {
					daoh2.delete(p);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
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
				Integer.parseInt(  panelBD.fildeID.getText() )
			+ "|" +	panelBD.fildeFirstName.getText()
			+ "|" +	panelBD.fildeLastName.getText() 
			+ "|" +	Integer.parseInt( panelBD.fildeAge.getText() )
				);
		return p;
		
	}
	//вложенных класса имплиментирующих action listners - слушатели дл€ кнопок CRUD
	//¬ычитывает из полей данные - потом отправл€ет данные на запрос из базы
	
}
