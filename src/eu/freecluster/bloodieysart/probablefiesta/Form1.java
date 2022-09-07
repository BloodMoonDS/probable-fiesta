package eu.freecluster.bloodieysart.probablefiesta;

import javax.swing.JFrame;
import javax.swing.JLabel;
import org.lwjgl.*;
public class Form1 {
	JFrame frame = new JFrame("Form1");
	public void create(int SizeX,int SizeY, String title ) {
	
	frame.setSize(SizeX,SizeY);
	frame.setTitle(title);
	}
	
	public void show() {
		frame.setVisible(true);
		
	}
	
	public void execute() {
		JLabel MainTitle = new JLabel("Douh!");
		frame.add(MainTitle);
		
	}
}
