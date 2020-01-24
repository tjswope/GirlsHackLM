// Class: GraphicsPanel
// Written by: Mr. Swope
// Date: 10/28/15
// Description: This class is the main class for this project.  It extends the Jpanel class and will be drawn on
// 				on the JPanel in the GraphicsMain class.  Your project should have at least one character that moves
//				with the arrow keys and one character that moves with the clock.  Finally, you should detect if the
//				two items intersect and have something happen if they do intersect.
//
// Since you will modify this class you should add comments that describe when and how you modified the class.  

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;


public class GraphicsPanel extends JPanel implements KeyListener{

	private BackGround background;
	private Timer t;							 // The timer is used to move objects at a consistent time interval.
	private Character b;						 // A jeep
	

	public GraphicsPanel(){

		b = new Boy(50, 120);
		
		background = new BackGround();

		setPreferredSize(new Dimension(950,343));    // Set these dimensions to the width 
													 // of your background picture.   

		t = new Timer(5, new ClockListener(this));   // t is a timer.  This object will call the ClockListener's
													 // action performed method every 5 milliseconds once the 
													 // timer is started. You can change how frequently this
													 // method is called by changing the first parameter.
		t.start();
		this.setFocusable(true);					 // for keylistener
		this.addKeyListener(this);
	}

	// method: paintComponent
	// description: This method will paint the items onto the graphics panel.  This method is called when the panel is
	//   			first rendered.  It can also be called by this.repaint()
	// parameters: Graphics g - This object is used to draw your images onto the graphics panel.
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		background.draw(this, g);
//		if(jeep.collision(rock)){	// This code will detect if the pirate and parrot have
//									// collided.  Make something happen if they do intersect.
//		}

		b.draw(g2, this);
		//rock.draw(g2, this);
	}

	// method:clock
	// description: This method is called by the clocklistener every 5 milliseconds.  You should update the coordinates
	//				of one of your characters in this method so that it moves as time changes.  After you update the
	//				coordinates you should repaint the panel.
	public void clock(){
		//background.move();
		b.move();
		
		this.repaint();
	}

	// method: keyPressed()
	// description: This method is called when a key is pressed. You can determine which key is pressed using the 
	//				KeyEvent object and .  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
	//				the left key was pressed.
	// parameters: KeyEvent e
	@Override
	public synchronized void keyPressed(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			b.walkRight();
		else if(e.getKeyCode() == KeyEvent.VK_LEFT)
			b.walkLeft();
		else if(e.getKeyCode() == KeyEvent.VK_UP)
			b.moveUp();
		else if(e.getKeyCode() == KeyEvent.VK_DOWN)
			b.moveDown();
		else if(e.getKeyCode() == KeyEvent.VK_SPACE)
			b.run();
		else if(e.getKeyCode() == KeyEvent.VK_J)
			b.jump();
		else if(e.getKeyCode() == KeyEvent.VK_D)
			b.die();
	}


	@Override
	public synchronized void keyTyped(KeyEvent e) {


	}



	@Override
	public synchronized void keyReleased(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT)
			b.idle();
		else if(e.getKeyCode() ==  KeyEvent.VK_UP || e.getKeyCode() ==  KeyEvent.VK_DOWN)
			b.stop_Vertical();
		else if(e.getKeyCode() ==  KeyEvent.VK_SPACE)
			b.slowDown();

	}

}
