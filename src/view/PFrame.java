package view;

import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JTable;

public class PFrame extends JFrame {

	public PFrame() {
		
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	setTitle("BD Person");
	
	setBounds(0, 10, 800, 600);

//	add( new PPanel() );
	add(new JTable());
	// рискуем не найти элемент , если не добавим их до того как отобразим фрейм
	setVisible(true);
	}
	
}
