/*
Louis Gobin
10/02/2016
Organize the top (Menu) panel in the frame
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class frame2 extends frame
{
	
	public static void main (String args[])
	{
		frame thisclass = new frame2();

		JFrame f= new JFrame("GradeBookGUI_V_0.2");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(700,700);
                thisclass.StrucAdd(f);
                //f.pack();
                f.setVisible(true);
	}

	public void StrucAdd (JFrame f)
	{
		super.StrucAdd(f);

		JButton Save=new JButton("Save");
		JButton Load=new JButton("Load");
		String[] MenuNames={"MenuItem1","MenuItem2","MenuItem3","MenuItem4","MenuItem5"};
		JComboBox Menu= new JComboBox(MenuNames);
		Menu.setSelectedIndex(0);
		Menu.setMaximumRowCount(4);
		
		
		
		topPanel.setLayout(new GridLayout(1,3));
		topPanel.add(Menu);
		topPanel.add(Save);
		topPanel.add(Load);
	}
}
