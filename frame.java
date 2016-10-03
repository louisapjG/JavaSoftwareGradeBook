/*
Louis Gobin
10/02/2016
Definition of the structure of the window holding the GradeBook, including insertion of the two panels
*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class frame extends JFrame
{
	JPanel topPanel,middlePanel,bottomPanel;
	public static void main(String args[])
	{	
		frame thisclass = new frame();

		JFrame f= new JFrame("GradeBookGUI_V_0.2");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(700,700);
		thisclass.StrucAdd(f);
		//f.pack();
		f.setVisible(true);
	}

	public void StrucAdd (JFrame f)
	{
		f.setLayout(new BorderLayout());
		topPanel=new JPanel();
		middlePanel=new JPanel();
		bottomPanel=new JPanel();
		JScrollPane scrollPane = new JScrollPane(middlePanel);
		f.add(BorderLayout.NORTH,topPanel);
		f.add(BorderLayout.CENTER,middlePanel);
		f.add(BorderLayout.SOUTH, bottomPanel);
	}
}
