/*
Louis Gobin
10/02/2016
Organize the middle (table) panel in the frame
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class frame3 extends frame2
{
	int StudentNumber=25;
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
		//Add The buttons at the top of middle panel
		JButton[] headers;
		String[] headersName={"Student Name","ID#","Quizz","HomeWork","Exams","Average","Comments","Bonus points"};
		headers=new JButton[headersName.length];
		GridBagConstraints c= new GridBagConstraints();

		middlePanel.setLayout(new GridBagLayout());
		for(int count=0;count<headersName.length;count++)
                {
                        headers[count]=new JButton(headersName[count]);
			c.fill= GridBagConstraints.HORIZONTAL;
			//c.ipadx=0;
			//c.ipady=0;
			if(count==7)
			{
				c.weightx=0.5;
			}
			else
			{
				c.weightx=0.2;
			}
			//c.anchor=GridBagConstraints.PAGE_START;
			c.gridx=count;
			c.gridy=0;
			middlePanel.add(headers[count],c);
                }

		//Add the board itself
		//List<JTextField> textF= new ArrayList<JTextField>();
		//List<ArrayList<ArrayList>> ListTextF = new ArrayList<JTextField>();
		for (int Row =0; Row<StudentNumber;Row++)
		{
			for (int Col =0; Col<9; Col++)
			{
				JTextField Temp = new JTextField(13);
				c.fill=GridBagConstraints.VERTICAL;
				c.gridx=Col;
				c.gridy=Row;
				c.ipadx=0;
				c.ipady=0;
				c.weightx=0.2;
				if(Col==7)
				{
					c.weightx=0.5;
				}
				middlePanel.add(Temp,c);
			}
		}
		
	}
}
