import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author 
 *
 */
class SnakeTest {
	Snake snake56;
	Snake snake1;
	Snake snake2;
	Snake snake3;
	Snake snake4;
	Snake snake5;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		snake56 = new Snake(5, 6);
		


	}

	/**
	 * Test method for {@link Snake#Snake(int, int)}.
	 * Black case test: pairwise testing
	 * Testing Snake constructor testing case
	 */
	@Test
	void testSnake() {
		snake1 = new Snake(-1, 1);
		snake2 = new Snake(1, -1);
		snake3 = new Snake(-1, -1);
		snake4 = new Snake(1, 1);
		snake5 = new Snake(0, 0);
		
		assertTrue(snake1.getX() == 0 && snake1.getY() == 0);
		assertTrue(snake2.getX() == 0 && snake2.getY() == 0);
		assertTrue(snake3.getX() == 0 && snake3.getY() == 0);
		assertTrue(snake4.getX() == 1 && snake4.getY() == 1);
		assertTrue(snake5.getX() == 0 && snake5.getY() == 0);

	}

	/**
	 * Test method for {@link Snake#getX()}.
	 * Black case test
	 * Testing getX testing case
	 */
	@Test
	void testGetX() {
		assertTrue(snake56.getX() == 5);
	}

	/**
	 * Test method for {@link Snake#getY()}.
	 * Black case test
	 * Testing getY testing case
	 */
	@Test
	void testGetY() {
		assertTrue(snake56.getY() == 6);
	}

	/**
	 * Test method for {@link Snake#setPos(int, int)}.
	 * Black case test: pairwise testing
	 * Testing setPos testing case
	 */
	@Test
	void testSetPos() {
		snake1 = new Snake(5, 5);//Initialization
		snake2 = new Snake(5, 5);
		snake3 = new Snake(5, 5);
		snake4 = new Snake(5, 5);
		snake5 = new Snake(5, 5);
		
		snake1.setPos(-1, 1);//pairs
		snake2.setPos(1, -1);
		snake3.setPos(-1, -1);
		snake4.setPos(1, 1);
		snake5.setPos(0, 0);
		
		assertTrue(snake1.getX() == 0 && snake1.getY() == 0);
		assertTrue(snake2.getX() == 0 && snake2.getY() == 0);
		assertTrue(snake3.getX() == 0 && snake3.getY() == 0);
		assertTrue(snake4.getX() == 1 && snake4.getY() == 1);
		assertTrue(snake5.getX() == 0 && snake5.getY() == 0);
	}

}
