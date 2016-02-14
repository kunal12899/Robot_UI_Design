import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*PANEL FOR DEFINATION OF ROBOT MOTION AND DRAWING ROBOT COMPONENT YES IT WAS TOUGH TO WRITE :) */
public class Robopanel extends JPanel {
	
	/*DECLARATION OF VARIABLE ,LABEL,THREAD(MOST IMPORTANT)*/
	public int dx=3;
	public int dy=3;
	public int speed=0;
	public int x = 20;
	public int y = 20;
	public int x1 = 50;
	public int x2 = 70;
	public int y1 = 40;
	public int y2 = 40;
	public int x3 = 30;
	public int y3 = 30;
	public int i = 0;
	public boolean f1 = false;
	public boolean b1 = false;
	public boolean r1 = false;
	public boolean l1 = false;
	public JLabel msg=null;
	public JLabel msg1=null;
	private Thread f;

	/*CONSTRUCTER */
	public Robopanel() {
		// tm.start();
		move();
		Dimension size = getPreferredSize();
		size.width = 400;
		size.height = 350;
		setPreferredSize(size);
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Robot Motion"));
		
		msg= new JLabel();		
		msg.setBounds(10,370,150,30);
	    add(msg);
	    
	    msg1=new JLabel();
	    msg1.setBounds(130,370,150,30);
	    add(msg1);
	}

	public void move() {              /*COMMON METHOD FOR BOUNDARY CHECK IN PANEL*/
		if (x3 < 0) {
		//	dx = 0;
			x3 = 5;
		}

		if (x3 > 350) {
		//	dx = -2;
			x3 = 345;
		}

		if (y3 < 0) {
			dy = 0;
			y3 = 3;
		}

		if (y3 > 300) {
			dy = 0;
			y3 = 295;
		}

		repaint();
	}
	
	public void forward()          /*METHOD FOR MOVE FORWARD*/
	{
		move();
		dx=5;

		x3 = x3 + ((int) (((dx+speed) * Math.cos(Math.toRadians(i)))));
		y3 = y3 + ((int) ((dx+speed) * (Math.sin(Math.toRadians(i)))));

		x1 = (x3 + 10) + ((int) ((10 + dx+speed) * (Math.cos(Math.toRadians(i)))));
		x2 = x1 + ((int) (((10 + dx+speed) * Math.cos(Math.toRadians(i)))));

		y1 = (y3 + 10) + ((int) (((10 + dx+speed) * Math.sin(Math.toRadians(i)))));
		y2 = y1 + ((int) (((10 + dx+speed) * Math.sin(Math.toRadians(i)))));

		msg.setText("Current X:  "+x3);
		msg1.setText("Current Y:  "+y3);
	}

	public void backward() {         /*METHOD FOR MOVE BACKWARD*/
		move();
		// i=i-180;

		x3 = x3 - ((int) (((dx+speed) * Math.cos(Math.toRadians(i)))));
		y3 = y3 - ((int) ((dy+speed) * (Math.sin(Math.toRadians(i)))));

		x1 = (x3 + 10) + ((int) ((15) * (Math.cos(Math.toRadians(i)))));
		x2 = x1 + ((int) (((15) * Math.cos(Math.toRadians(i)))));

		y1 = (y3 + 10) + ((int) (((15) * Math.sin(Math.toRadians(i)))));
		y2 = y1 + ((int) (((15) * Math.sin(Math.toRadians(i)))));
		
		msg.setText("Current X:  " +x3);
		msg1.setText("Current Y:  "+y3);

	}

	public void left() {                         /*METHOD FOR LEFT ROTATION*/
		move();
		
		i = i + 5;

		//x3 = x3 + ((int) (((dx) * Math.cos(Math.toRadians(i)))));
		//y3 = y3 + ((int) ((dy) * (Math.sin(Math.toRadians(i)))));

		x1 = (x3 + 10) + ((int) ((10 + dx) * (Math.cos(Math.toRadians(i)))));
		x2 = (x1) + ((int) (((20 + dx) * Math.cos(Math.toRadians(i)))));

		y1 = (y3 + 10) + ((int) (((10 + dx) * Math.sin(Math.toRadians(i)))));
		y2 = y1 + ((int) (((10 + dx) * Math.sin(Math.toRadians(i)))));
		

	}

	public void Right() {                      /*METHOD FOR RIGHT ROTATION */
		move();
		
		i = i - 5;

		//x3 = x3 + ((int) (((dx) * Math.cos(Math.toRadians(i)))));
		//y3 = y3 + ((int) ((dy) * (Math.sin(Math.toRadians(i)))));

		x1 = (x3 + 10) + ((int) ((10 + dx) * (Math.cos(Math.toRadians(i)))));
		x2 = (x1) + ((int) (((20 + dx) * Math.cos(Math.toRadians(i)))));

		y1 = (y3 + 10) + ((int) (((10 + dx) * Math.sin(Math.toRadians(i)))));
		y2 = y1 + ((int) (((10 + dx) * Math.sin(Math.toRadians(i)))));
	}

	public void stop() {                  /*STOP METHOD*/
		dx = 0;
		dy = 0;

	}

	public void mspeed() {                       /*MEDIUM SPEED USING KEYBOARD SHIFT KEY*/
		dx = 10;
		move();

	}

	public void forward1()                          /*THIS METHOD CALL WHEN BUTTON IS PRESSED I,E ROBOT SHOULD MOVE TILL IT NOT
	                                                     INSTRUCTION TO STOP*/
	{
		b1=false;
		f = new Thread()
		{
			@Override
			public void run()
			{
				try 
				{
					while(f1)
					{	 
						forward();
						Thread.sleep(100);
					}

				} 
				catch (InterruptedException ex) 
				{
				}    	    	
			}
		};
		if(f1 != true) {
			f1 = true;
			f.start();
		}
	}

	public void backward1() {                           /*THIS METHOD CALL WHEN BUTTON IS PRESSED I,E ROBOT SHOULD MOVE TILL IT NOT
                                                               INSTRUCTION TO STOP*/
		f1 = false;
		Thread b = new Thread() {
			@Override
			public void run() {
				try {
					while (b1) {
						backward();
						Thread.sleep(100);
					}

				} catch (InterruptedException ex) {
				}
			}
		};
		if(b1 != true) {
			b1 = true;
			b.start();
		}
	}

	public void left1() {                       /*THIS METHOD CALL WHEN BUTTON IS PRESSED I,E ROBOT SHOULD MOVE TILL IT NOT
                                                    INSTRUCTION TO STOP*/
		
		r1 = false;
		Thread l = new Thread() {
			@Override
			public void run() {
				try {
					while (l1) {
						left();
						Thread.sleep(500);
					}

				} catch (InterruptedException ex) {
				}
			}
		};
		if(l1 != true) {
			l1 = true;
			l.start();
		}
	}

	public void right1()                              /*THIS METHOD CALL WHEN BUTTON IS PRESSED I,E ROBOT SHOULD MOVE TILL IT NOT
                                                                    INSTRUCTION TO STOP*/
	{
		l1 = false;
		Thread r = new Thread() {
			@Override
			public void run() {
				try {
					while (r1) {
						Right();
						Thread.sleep(500);
					}

				} catch (InterruptedException ex) {
				}
			}
		};
		if(r1 != true) {
			r1 = true;
			r.start();
		}
	}

	public void stop1() {                    /*THIS METHOD CALL WHEN BUTTON IS PRESSED I,E ROBOT SHOULD MOVE TILL IT NOT
                                             INSTRUCTION TO STOP*/
		stop();
		l1 = false;
		r1 = false;
		f1 = false;
		b1 = false;

	}

	@Override
	public void paintComponent(Graphics g) {                     /*METHOD TO DRAW COMPONENT*/
		super.paintComponent(g);
		g.setColor(Color.blue);
		g.fillOval(x3, y3, 20, 20);
		g.setColor(Color.black);
		g.drawLine(x1, y1, x2, y2);

	}
	/*THE END THANKS FOR READING*/
}
