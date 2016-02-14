import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * 
 * THIS IS MAIN PROGRAME WHICH INCLUDE ALL THE PANEL 
 * IT ALSO HAVE ALL THE EVENT ACTION ON MOUSE KEYBOARD
 * WRITTEN BY KUNAL KRISHNA KXK155230
 * 
 */
public class MainFrame extends JFrame implements KeyListener,MouseListener,ChangeListener
{
	/* 
	 * DECLARATION OF PANEL OBJECT SO THAT IT COTENT CAN BE USE
	 */
	Robopanel r = null;
	clawframe c =null;
	RoboButton b=null;
	ImagePanel i =null;
	Handpanel h= null;
	Labelpanel k=null;
	public float scale;
	public int motion;
	public JLabel speedmsg=null;
	public JLabel speedmsg1=null;
	public JLabel speedmsg2=null;
	public JLabel speedmsg3=null;
	
	
	public MainFrame()
	{
		initUI(); 		   		/*CALLING METHOD TO INITIALIZE FRAME OBJECTS*/
	}

	private void initUI() 
	{  
		Container content = getContentPane();
		content.setLayout(null);

		/* FIRST PANEL FOR ROBOT MOTION WHICH HAS ROBOT MOTION FUNCTIONALITY*/
		r=new Robopanel();
		r.setBounds(0, 0, 400, 400);
		r.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Robot Motion"));
		content.add(r);


		/*CAMERA PANEL USE FOR IMAGE ZOOM IN AND ZOOM OUT*/
		i=new ImagePanel();		   
		i.setBounds(400, 0, 395, 320);
		content.add(i);
		i.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Camera"));

		/* THIRD PANEL FOR CLAW MOVEMENT*/
		c=new clawframe();
		c.setBounds(200,400,200,150);
		content.add(c);		   
		c.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Claw movement"));   

		/*FOURTH PANEL FOR HAND MOVEMENT*/
		h=new Handpanel();
		h.setBounds(0,400,200,150);
		h.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Arm motion")); 
		content.add(h);

		/*FIFTH BUTTON PANEL WHICH HAS ALL THE BUTTON RELATED TO ACTION ON THE ROBOT*/
		b=new RoboButton();
		b.setBounds(400,330,395,335);
		content.add(b);
		b.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Robot Control"));

		/*SIX PANEL FOR INSTRUCTION TO HOW TO MOVE ROBOT USING KEYBOARD */
		k=new Labelpanel();
		k.setBounds(0,550,400,115);
		content.add(k);
		k.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createEtchedBorder(), "Instruction"));

	
		addKeyListener(this);    /* ADDING KEY LISTENER TO FRAME*/

		b.Forward.addMouseListener(this);                /*ADDING MOUSE LISTENER TO ALL THE COMPONENT OF DIFFERENT PANEL*/
		b.Backward.addMouseListener(this);
		b.Left.addMouseListener(this);
		b.Right.addMouseListener(this);
		b.stop.addMouseListener(this);
		b.up.addMouseListener(this);
		b.down.addMouseListener(this);
		b.open.addMouseListener(this);
		b.close.addMouseListener(this);
		b.speed.addChangeListener(this);
		b.tempe.addMouseListener(this);
		i.spinner.addChangeListener(this);



		/*SETTING THE BASIC FUNCTION FOR FRAME*/
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);        
		setSize(800, 700);
		setResizable(false);        
		setTitle("Moving Robot");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	/*ACTION DEFINED ON THE BASIC OF KEYBOARD BUTTON*/
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		int key = arg0.getKeyCode();
		if (key == KeyEvent.VK_LEFT) 
		{
			r.backward();
		}

		if (key == KeyEvent.VK_RIGHT) 
		{
			r.forward();
		}

		if (key == KeyEvent.VK_UP) 
		{
			r.Right();	            
		}

		if (key == KeyEvent.VK_DOWN) 
		{
			r.left();

		}
		if (key == KeyEvent.VK_C) 
		{

			c.close();
		}
		if (key == KeyEvent.VK_X) 
		{

			c.open();
		}
		if (key == KeyEvent.VK_R) 
		{

			h.rotate();
		}
		if (key == KeyEvent.VK_Y) 
		{

			h.brotate();
		}
		if (key == KeyEvent.VK_BACK_SPACE) 
		{

			r.mspeed();
		}	        		
	}

	@Override
	public void keyReleased(KeyEvent arg0) 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}


	/*ACTION DEFINED ON THE BASIS OF MOUSE CLICK */
	
	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		// TODO Auto-generated method stub
		JComponent source = (JComponent)arg0.getSource();				
		String s = source.getName();
		//    System.out.println(s);

		switch (s) 
		{  
		case "Forward":
			r.forward1();
			break;
		case "Backward":
			r.backward1();
			break;
		case "Left":
			r.right1();			
			break;
		case "Right":
			r.left1();
			break;
		case "stop":
			r.stop1();
			break;	
		case "up":
			h.rotate();
			break;
		case "down":
			h.brotate();
			break;
		case "open":
			c.open();
			break;
		case "close":
			c.close();
			break;
		case "tempe":
			b.temp();
			break;				
		default:
			break;
		}			
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


	/*MAIN METHOD OFFCOURSE THIS IS MOST IMPORTANT :) */
	public static void main(String[] args) 
	{

		EventQueue.invokeLater(new Runnable() 
		{
			@Override
			public void run() {

				MainFrame ex = new MainFrame();
				ex.setVisible(true);
			}
		}
				);

	}

	/*METHOD FOR CHANGELISTENER */
	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		JComponent source = (JComponent)arg0.getSource();				
		String s = source.getName();

		switch (s)                      /*ACTION BASED ON WHETHER IT IS SLIDER OR SPINNER*/
		{

		case "spin":
			float scale = ((Double)i.spinner.getValue()).floatValue();
			i.setScale(scale);
			break;
		case "speed":
			motion=b.speed.getValue();
			
			r.speed=motion;
			break;

		}}	
	/*THE END THANKS FOR READING*/
}
