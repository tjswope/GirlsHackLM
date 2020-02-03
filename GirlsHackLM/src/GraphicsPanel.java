// Class: GraphicsPanel
// Written by: Mr. Swope
// Date: 1/27/2020
// Description: This class is the main class for this project.  It extends the Jpanel class and will be drawn on
// 				on the JPanel in the GraphicsMain class.  
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

	private Timer timer;					// The timer is used to move objects at a consistent time interval.
	
	private Background background;			// The background object will display a picture in the background.
											// There are four subclasses of the the Background class that you
											// can choose from: ForestBackground, DesertBackground, 
											// GraveyardBackground or TrackBackground. You can also find
											// other pictures if you would like to.
								 
	private Sprite sprite;					// Sprite in an abstract class, which means that you can't actually
											// create a Sprite object, but you can instantiate any of the Sprite
											// subclasses, which includes AdventureBoy, AdventureGirl, Boy, Cat
											// Dinosaur, Dog, Girl, Robot and ZombieBoy and ZombieGirl. You can also
											// just declare a subclass object, like Girl g;
	
	private Item tree;						// This declares an Item object. You can make a Item display
											// pretty much any image that you would like by passing it
											// the path for the image.
	
	
	public GraphicsPanel(){
		background = new ForestBackground();	// You can set the background variable equal to an instance of any of  
												// the 4 Background subclasses.
		
		tree = new Item(350, 400, "images/forest/objects/Tree_2.png", 1);  
												// The Item constructor has 4 parameters - the x coordinate, y coordinate
												// the path for the image, and the scale. The scale is used to make the
												// image smaller, so the bigger the scale, the smaller the image will be.
								

		sprite = new Girl(50, 600);				// You can set the sprite object variable equal to an instance of any
												// of the Sprite subclasses.
		
		setPreferredSize(new Dimension(background.getWidth(),background.getHeight()));  
												// This line of code sets the dimension of the panel equal to the dimensions
												// of the background image.
		   

		timer = new Timer(5, new ClockListener(this));   // This object will call the ClockListener's
													 	 // action performed method every 5 milliseconds once the 
													 	 // timer is started. You can change how frequently this
													 	 // method is called by changing the first parameter.
		timer.start();
		this.setFocusable(true);					     // for keylistener
		this.addKeyListener(this);
	}

	// method: paintComponent
	// description: This method will paint the items onto the graphics panel.  This method is called when the panel is
	//   			first rendered.  It can also be called by this.repaint(). You'll want to draw each of your objects.
	//				This is the only place that you can draw objects.
	// parameters: Graphics g - This object is used to draw your images onto the graphics panel.
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;

		background.draw(this, g);

		tree.draw(g2, this);
		sprite.draw(g2, this);		
	}

	// method:clock
	// description: This method is called by the clocklistener every 5 milliseconds.  You should update the coordinates
	//				of one of your characters in this method so that it moves as time changes.  After you update the
	//				coordinates you should repaint the panel. 
	public void clock(){
		// You can move any of your objects by calling their move methods.
		sprite.move(this);
		
		// You can also check to see if two objects intersect like this. In this case if the sprite collides with the
		// tree, the tree will get smaller. 
		if(sprite.collision(tree)) {
			sprite.die();
		}
		
		this.repaint();
	}

	// method: keyPressed()
	// description: This method is called when a key is pressed. You can determine which key is pressed using the 
	//				KeyEvent object.  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
	//				the left key was pressed.
	// parameters: KeyEvent e
	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			sprite.walkRight();
		else if(e.getKeyCode() == KeyEvent.VK_LEFT)
			sprite.walkLeft();
		else if(e.getKeyCode() == KeyEvent.VK_UP)
			sprite.moveUp();
		else if(e.getKeyCode() == KeyEvent.VK_DOWN)
			sprite.moveDown();
		else if(e.getKeyCode() == KeyEvent.VK_SPACE)
			sprite.run();
		else if(e.getKeyCode() == KeyEvent.VK_J)
			sprite.jump();
		else if(e.getKeyCode() == KeyEvent.VK_D)
			sprite.die();
	}


	// method: keyTyped()
	// description: This method is called when a key is pressed and released. It basically combines the keyPressed and
	//              keyReleased functions.  You can determine which key is typed using the KeyEvent object.  
	//				For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if the left key was typed.
	//				You probably don't want to do much in this method, but instead want to implement the keyPresses and keyReleased methods.
	// parameters: KeyEvent e
	@Override
	public void keyTyped(KeyEvent e) {


	}

	// method: keyReleased()
	// description: This method is called when a key is released. You can determine which key is released using the 
	//				KeyEvent object.  For example if(e.getKeyCode() == KeyEvent.VK_LEFT) would test to see if
	//				the left key was pressed.
	// parameters: KeyEvent e
	@Override
	public void keyReleased(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_LEFT)
			sprite.idle();
		else if(e.getKeyCode() ==  KeyEvent.VK_UP || e.getKeyCode() ==  KeyEvent.VK_DOWN)
			sprite.stop_Vertical();
		else if(e.getKeyCode() ==  KeyEvent.VK_SPACE)
			sprite.slowDown();

	}

}
