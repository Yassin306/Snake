import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.KeyEvent;


/**
 * 
 */

/**
 * @author 
 *
 */
public class Controller extends JFrame implements KeyListener {
	public enum Direction{
		UP,DOWN,LEFT,RIGHT
	}
	private Direction direction;
	private JButton bAceptar;
	
	/**
	 * 
	 */
	
	
	public Controller() {
		  direction = Direction.UP;
		  add(getbAceptar());
		  //inicializador();
	}
	
	 /**private void inicializador() {
		 
		  setLayout(null);
		  setTitle("Prueba con Teclas");
		  setVisible(true);
		  setSize(300, 300);
		  setLocationRelativeTo(null);
		  setDefaultCloseOperation(EXIT_ON_CLOSE);
		 
		 }
		 */

	/**
	 * @return the direction
	 */
	public Direction getDirection() {
		return direction;
	}
	
	/**
	 * @return the pressed button
	 */
	private JButton getbAceptar() {
		 bAceptar = new JButton();
		 bAceptar.addKeyListener(this);
		 return bAceptar;
	}
	
	/**
	 * Override the keyPressed function from KeyListener class
	 * set the direction depending on the pressed key.
	 */
	@Override
	public void keyPressed(KeyEvent key_press) {
		
		int key = key_press.getKeyCode();
		
		if ((key == KeyEvent.VK_UP) && (direction != Direction.DOWN)) {
			direction = Direction.UP;
		}
		
		if ((key == KeyEvent.VK_DOWN) && (direction != Direction.UP)) {
			direction = Direction.DOWN;
		}
		
		if ((key == KeyEvent.VK_LEFT) && (direction != Direction.RIGHT)) {
			direction = Direction.LEFT;
		}
		
		if ((key == KeyEvent.VK_RIGHT) && (direction != Direction.LEFT)) {
			direction = Direction.RIGHT;
		}	
		
	}

	/**
	 * default keyReleased function from KeyListener class
	 */
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * default keyTyped function from KeyListener class
	 */
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
