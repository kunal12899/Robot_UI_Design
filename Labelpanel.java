import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Labelpanel extends JPanel
{

JLabel speedmsg=null;
JLabel speedmsg1=null;
JLabel speedmsg2=null;
JLabel speedmsg3=null;
JLabel speedmsg4=null;
JLabel speedmsg5=null;
JLabel speedmsg6=null;
JLabel speedmsg7=null;
JLabel speedmsg8=null;
JLabel speedmsg9=null;
JLabel speedmsg10=null;
JLabel speedmsg11=null;
JLabel speedmsg12=null;
JLabel speedmsg13=null;
JLabel speedmsg14=null;
JLabel speedmsg15=null;
/*PANEL DEFIEND FOR INSTURCTION MANUAL*/

	public Labelpanel()
	{
		/*DEFINING LABEL FOR INSTRUCTION FOR KEYBOARD ACTION , ACTION CORESSPONDING TO EACH KEY*/	
		setLayout(null);
		repaint();
		
		speedmsg= new JLabel();
		speedmsg.setText("Left Key");
		speedmsg.setBounds(10,15,80,20);
	    add(speedmsg);

	    speedmsg1= new JLabel();
		speedmsg1.setText("Move Back");
		speedmsg1.setBounds(100,15,80,20);
	    add(speedmsg1);
	    
	    speedmsg2= new JLabel();
		speedmsg2.setText("Right Key");
		speedmsg2.setBounds(10,35,80,20);
	    add(speedmsg2);
	    
	    speedmsg3= new JLabel();
		speedmsg3.setText("Forward");
		speedmsg3.setBounds(100,35,80,20);
	    add(speedmsg3);
	    
	    speedmsg= new JLabel();
		speedmsg.setText("Up Key");
		speedmsg.setBounds(10,55,80,20);
	    add(speedmsg);

	    speedmsg1= new JLabel();
		speedmsg1.setText("Rotate_left");
		speedmsg1.setBounds(100,55,80,20);
	    add(speedmsg1);
	    
	    speedmsg2= new JLabel();
		speedmsg2.setText("Down Key");
		speedmsg2.setBounds(10,75,80,20);
	    add(speedmsg2);
	    
	    speedmsg3= new JLabel();
		speedmsg3.setText("Rotate_Right");
		speedmsg3.setBounds(100,75,80,20);
	    add(speedmsg3); 
	    
	    
	    speedmsg3= new JLabel();
		speedmsg3.setText("Key R");
		speedmsg3.setBounds(200,15,80,20);
	    add(speedmsg3);
	    
	    speedmsg= new JLabel();
		speedmsg.setText("Hand Up");
		speedmsg.setBounds(280,15,80,20);
	    add(speedmsg);

	    speedmsg1= new JLabel();
		speedmsg1.setText("Key Y");
		speedmsg1.setBounds(200,35,80,20);
	    add(speedmsg1);
	    
	    speedmsg2= new JLabel();
		speedmsg2.setText("Hand down");
		speedmsg2.setBounds(280,35,80,20);
	    add(speedmsg2);
	    
	    speedmsg3= new JLabel();
		speedmsg3.setText("Key C");
		speedmsg3.setBounds(200,55,80,20);
	    add(speedmsg3);
	    
	    speedmsg= new JLabel();
		speedmsg.setText("Claw Close");
		speedmsg.setBounds(280,55,80,20);
	    add(speedmsg);

	    speedmsg1= new JLabel();
		speedmsg1.setText("Key X");
		speedmsg1.setBounds(200,75,80,20);
	    add(speedmsg1);
	    
	    speedmsg2= new JLabel();
		speedmsg2.setText("Claw Open");
		speedmsg2.setBounds(280,75,80,20);
	    add(speedmsg2);
	    		
	}
	
	/*PAINT METHOD*/
	 @Override
		public void paintComponent(Graphics g) 
	    {
			super.paintComponent(g);
			g.setColor(Color.BLACK);
		    g.drawLine(185,15,185,99);
			
		}
	 /*THE END THANKS FOR READING*/
}
