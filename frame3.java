/*
Louis Gobin
10/02/2016
Organize the middle (table) panel in the frame
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class frame3 extends frame2
{
	public static void main (String args[])
        {
                frame thisclass = new frame3();

                JFrame f= new JFrame("GradeBookGUI_V_0.2");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setSize(700,700);
                thisclass.StrucAdd(f);
                f.setVisible(true);
        }

	public void StrucAdd (JFrame f)
	{
		super.StrucAdd(f);

		JButton[] headers;
		String[] headersName={"Student Name","ID#","Quizz","HomeWork","Exams","Average","Comments","Bonus points"};
		headers=new JButton[headersName.length];
		GridBagConstraints c= new GridBagConstraints();

		middlePanel.setLayout(new GridBagLayout());
		for(int count=0;count<headersName.length;count++)
                {
                        headers[count]=new JButton(headersName[count]);
			c.fill= GridBagConstraints.VERTICAL;
			//c.ipadx=0;
			//c.ipady=0;
			c.weightx=0.2;
			//c.anchor=GridBagConstraints.PAGE_START;
			c.gridx=count;
			c.gridy=0;
			middlePanel.add(headers[count],c);
                }
	}
}
