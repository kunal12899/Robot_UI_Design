import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

/*PANEL FOR DECALRING BUTTONS TO CONTROL ALL THE ROBOT FUNCTIONS*/
public class RoboButton extends JPanel
{
	/*DECLARATION OF BUTTONS AND OTHER COMPONENTS*/
    public JButton Forward = null;
	public JButton Backward = null;
	public JButton Left = null;
	public JButton Right = null;
	public JButton stop =null;
	public JButton up=null;
	public JButton down=null;
	public JButton open=null;
	public JButton close=null;
	public JButton tempe=null;
	
	
	public JSlider speed=null;
	public Image image;
	public int R_medium=1;
	public int R_high=3;
	public int R_slow=-1;
		
    public JLabel arm=null;
    public JLabel cla=null;
    public JLabel spe=null;
    public JLabel tempe1=null;
    
    
    public JSeparator s=null;
    GridBagConstraints gbc = new GridBagConstraints();
    
    public RoboButton()
   {
    setLayout(null);
    
    /*BUTTON FOR FORWARD */
    ImageIcon forr = new ImageIcon("forward.png");    
    Forward= new JButton("",forr);
    Forward.setBounds(150,70, 60, 40);
    add(Forward);
    Forward.setName("Forward");
    Forward.setFocusable(false);
    
    /*BUTTON FOR BACKWARD */
    ImageIcon back = new ImageIcon("back.png"); 	
    Backward= new JButton("",back);
    Backward.setBounds(10, 70, 60, 40);
    add(Backward);
    Backward.setName("Backward");
    Backward.setFocusable(false);
    
    /*BUTTON FOR LEFT ROTATION */
    ImageIcon left = new ImageIcon("left.png"); 
    Left= new JButton("",left);
    Left.setBounds(80,20,60,40);
    add(Left);
    Left.setName("Left");
    Left.setFocusable(false);
    
    
    /*BUTTON FOR RIGHT ROTATION */
    ImageIcon rig = new ImageIcon("right.png"); 
    Right= new JButton("",rig);
    Right.setBounds(80,120,60,40);
    add(Right);
    Right.setName("Right");
    Right.setFocusable(false);
    
    
    /*BUTTON FOR STOP  */
    ImageIcon stoo = new ImageIcon("stop1.png"); 
    stop= new JButton("",stoo);
    stop.setBounds(80, 70, 60, 40);
    add(stop);
    stop.setName("stop");
    stop.setFocusable(false);

    
   
    /*LABEL FOR ARM MOVEMENT */ 
    arm= new JLabel();
    arm.setText("Arm Movement");
    arm.setBounds(290,5, 100, 20);
    add(arm);
    
    /*BUTTON FOR ARM UP */
    ImageIcon u = new ImageIcon("up.png"); 
    up= new JButton("",u);
    up.setBounds(240,30, 60, 40);
    add(up);
    up.setName("up");
    up.setFocusable(false);
    
    /*BUTTON FOR ARM DOWN */
    ImageIcon d = new ImageIcon("down.png");
    down= new JButton("",d);
    down.setBounds(310, 30, 60, 40);
    add(down);
    down.setName("down");
    down.setFocusable(false);
    
    /*LABEL FOR CLAW POSITON */
    cla= new JLabel();
    cla.setText("Claw Position");
    cla.setBounds(290,85, 100, 20);
    add(cla);
    
    /*BUTTON FOR OPEN CLAW */
    ImageIcon o = new ImageIcon("open.png");
    open= new JButton("",o);
    open.setBackground(Color.white);
    open.setBounds(240, 120, 60, 40);
    add(open);
    open.setName("open");
    open.setFocusable(false);
    
    /*BUTTON FOR CLOSE CLAW */
    ImageIcon o1 = new ImageIcon("closed.png");
    close= new JButton("",o1);
    close.setBounds(310, 120, 60, 40);
    add(close);
    close.setName("close");
    close.setFocusable(false);   
    
    /*LABEL FOR ROBO SPEED */
    spe= new JLabel();
    spe.setText("Robo Speed");
    spe.setBounds(10,240,100,30);
    add(spe);
    
    /*BUTTON FOR GETTING TEMPRATURE */
    ImageIcon t = new ImageIcon("temp.png");
    tempe= new JButton("",t);
    tempe.setBounds(240, 200, 120, 30);
    add(tempe);
    tempe.setName("tempe");
    tempe.setFocusable(false); 
    
    /*LABEL FOR TEMPERATURE */
    tempe1= new JLabel();
    tempe1.setText("Current Temp");
    tempe1.setBounds(240,250,200,30);
    add(tempe1);
    
    
  //Create the slider
    speed = new JSlider(javax.swing.SwingConstants.VERTICAL, R_slow, R_high, R_medium);
    speed.setName("speed");
    speed.setPaintLabels(true);
    speed.setAutoscrolls(true);
    speed.setMajorTickSpacing(2);
    speed.setPaintTicks(true);
    speed.setBounds(100,180,100,150);
    
  //Create the label table
    Hashtable labelTable = new Hashtable();
    labelTable.put( new Integer( R_slow), new JLabel("Slow") );
    labelTable.put( new Integer( R_medium ), new JLabel("Medium") );
    labelTable.put( new Integer( R_high ), new JLabel("Fast") );
    speed.setLabelTable( labelTable );
    speed.setPaintLabels(true);    
    add(speed);
    speed.setFocusable(false);
                               
   } 
    
    
    public void temp()
    {
    	Double j3 = Math.random() + 50;	
    	tempe1.setText("Current Temp is:   " +String.format("%.2f", j3));
    	repaint();
    }
	
    /*THE END THANKS FOR READING*/
}
