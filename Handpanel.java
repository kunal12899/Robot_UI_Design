import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/*PANEL FOR HAND MOVEMENT THAT IS UP AND DOWN DOING ROTATION*/
public class Handpanel extends JPanel
{

	/*DECLARATION OF VARIABLE*/
	public int x1=40;
	public int x2=100;
	public int y1=80;
	public int y2=80;
	public int i=360;
	
	public Handpanel()
	{
		repaint();
	}
	  public void rotate()          /*METHOD FOR UPWARD MOVEMENT*/
	    {
	    	if(i== 270)
	    	{
	   		brotate();
	   		repaint();
	    	}
	    	else
	    	{
	    	repaint();
	    	x2 = x1+((int)(((50)*Math.cos(Math.toRadians(i)))));
	        y2 = y1+((int)(((50)*Math.sin(Math.toRadians(i)))));
	    	i=i-5;
	    	}
	    }
	    
	    public void brotate()                                       /*METHOD FOR DOWNWARD MOVEMENT*/
	    {                                                       
	    	
	    	if(i==360)
	    	{ 
	    	rotate();
	    	repaint();
	    	}    	
	    	else
	    	{
			i=i+5;		
			x2 = x1+((int)(((60)*Math.cos(Math.toRadians(i)))));
	    	y2 = y1+((int)(((60)*Math.sin(Math.toRadians(i)))));
	    	repaint();
	    	}
		
	    	
	    	
	    }
	    
		 @Override
		    public void paintComponent(Graphics g)
		    {
		        super.paintComponent(g);
		        g.setColor(Color.blue);
		        g.drawLine(x1,y1,x2,y2);		        
		    
		    }
	
		 /*THE END THANKS FOR READING*/
}
