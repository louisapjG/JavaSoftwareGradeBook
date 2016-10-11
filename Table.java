/*Louis Gobin
03/10/2016
Class Student an object composed of Name - ID# - Quizz(obj) - HomeWork(obj) - Exam(obj) - Stat(obj) - Comments - Bonus Points. 
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class Table extends frame 3
{
	JButton[][] Tab;
	int StudentNbr=0;
	int Quizz=1,HW=1,Exam=1,Lab=1;
	int Stat=1;


	public void StrucAdd (JFrame f)
	{
		super.StrucAdd(f);
		
		Tab=JButton [8][35];
	}

	public void AddTest(JButton[][] Tab)
	{
		
	}

	public void AddStat(JButton[][] Tab)
	{
		JButton[][] temp =new JButton[Tab.length+1][Tab[0].length];
        	for(int x=0;x<Tab.length;x++)
        	{
       			for(int y=0;y<Tab[0].length;y++)
        		{
        			temp[x][y]=Tab[x][y];
        		}
        	}
		//CREATE NEW TABLE WITH BLANK COLUMN AT SPOT 6
        	Tab = new JButton[Tab.length+1][Tab[0].length];
        	for(int x=0;x<Tab.length;x++)
        	{
        		for(int y=0;y<Tab[0].length;y++)
        		{
				if(x<6)
				{
        				Tab[x][y]=temp[x][y];
				}
				else
				{
					Tab[x+1][y]=temp[x][y];
				}
        		}
        	}
	}

	public void AddStudent(JButton[][] Tab)
	{
		if(Tab[0].length<=StudentNbr)
		{
			JButton[][] temp =new JButton[Tab.length][(Tab[0].length*1.1)];
			for(int x=0;x<Tab.length;x++)
			{
				for(int y=0;y<Tab[0].length;y++)
				{
					temp[x][y]=Tab[x][y];
				}
			}

			Tab = new JButton[Tab.length][(Tab[0].length*1.1)];
			for(int x=0;x<Tab.length;x++)
                        {
                                for(int y=0;y<Tab[0].length;y++)
                                {
                                        Tab[x][y]=temp[x][y];
                                }
                        }
		}
	}
}
