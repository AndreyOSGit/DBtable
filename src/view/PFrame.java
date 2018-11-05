package view;

import java.awt.Panel;

import javax.swing.JFrame;

public class PFrame extends JFrame {

	public PFrame() {
		
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	setTitle("Paint");
	
	setBounds(0, 10, 800, 600);

	add( new PPanel() );
	// рискуем не найти элемент , если не добавим их до того как отобразим фрейм
	setVisible(true);
	}
	
}
