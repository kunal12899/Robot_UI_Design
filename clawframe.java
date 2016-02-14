import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/*PANEL FOR DEFINING FUNCTION FOR CLAW I,E OPEN CLAW AND CLOSE CLAW*/
public class clawframe extends JPanel
{
	
	/*DEFINING VARIBALE AND COMPONENTS*/
    public int x1=40;
    public int y1=40;
    
    public int x2=100;
    public int y2=40;
    
    public int x3=110;
    public int y3=43;
    
    public int x4=110;
    public int y4=37;
    
    public int x5=110;
    public int y5=40;
    
    public int x6=150;
    public int y6=200;
    
    public int x7=200;
    public int y7=200;
    
    public int length;
    public int i=360;
    
    /*CONSTRUCTOR TO CALL REPAINT()*/
    public clawframe()
    {
    	repaint();   	
    }
    
    /*METHOD TO OPEN THE CLAW BY CHANGING CO-ORIDINATE*/
    public void open()
    {
    	x5=120;
    	y3=20;
    	y4=60;
    	repaint();
    }
    
    /*METHOD TO CLOSE THE CLAW BY CHANGING THE CO-ORDINATE*/
    public void close()
    {
    	x5=110;
    	y3=37;
    	y4=43;
    	repaint();   	
    }
    
    /*THIS METHOD FOR ROATATION HAND UP*/
    public void rotate()
    {
    	if(i== 270)
    	{
   		brotate();
   		repaint();
    	}
    	else
    	{
    	repaint();
    	x7 = x6+((int)(((50)*Math.cos(Math.toRadians(i)))));
        y7 = y6+((int)(((50)*Math.sin(Math.toRadians(i)))));
    	i=i-5;
    	}
    }
    
    /*THIS METHOD FOR ROTATING DOWNWARD*/
    public void brotate()
    {
    	
    	if(i==360)
    	{ 
    	rotate();
    	repaint();
    	}    	
    	else
    	{
		i=i+5;		
		x7 = x6+((int) (((50)*Math.cos(Math.toRadians(i)))));
    	y7 = y6+((int) (((50)*Math.sin(Math.toRadians(i)))));
    	repaint();
    	}
	
    	
    	
    }
    
	 @Override
	    public void paintComponent(Graphics g)
	    {
	        super.paintComponent(g);
	        g.setColor(Color.blue);
	        g.drawLine(x1,y1,x2,y2);
	        g.drawLine(x2,y2,x3,y3);
	        g.drawLine(x2,y2,x4,y4);
	        g.drawLine(x2,y2,x5,y5);
	        g.drawLine(x6,y6,x7,y7);
	        
	    
	    }
	
	 /*THE END THANKS FOR READING*/
	
}
