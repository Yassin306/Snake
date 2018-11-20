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
class GameTest {
	Game game;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * Test method for {@link Game#Game(int, int)}.
	 * Black case test: equivalence partitioning, limit and frontier values
	 */
	@Test
	void testGame() {
		//valores internos
		game = new Game(20,20);
		assertEquals(20, game.getRow());
		assertEquals(20, game.getCol());
		game = new Game(25,30);
		assertEquals(25, game.getRow());
		assertEquals(30, game.getCol());
		//valores exteriores
		game = new Game(55,70);
		assertEquals(50, game.getRow());
		assertEquals(50, game.getCol());
		game = new Game(5,3);
		assertEquals(10, game.getRow());
		assertEquals(10, game.getCol());
		//valores limites
		game = new Game(50,50);
		assertEquals(50, game.getRow());
		assertEquals(50, game.getCol());
		game = new Game(10,10);
		assertEquals(10, game.getRow());
		assertEquals(10, game.getCol());
	}

	/**
	 * Test method for {@link Game#start()}.
	 */
	@Test
	void testStart() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#play(Board.Direction)}.
	 */
	@Test
	void testPlay() {
		game = new Game(20, 20);
		
	}

	/**
	 * Test method for {@link Game#addScore(Cell.CellType)}.
	 */
	@Test
	void testAddScore() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#CheckCollision(Board.Direction)}.
	 */
	@Test
	void testCheckCollision() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#CheckObjective(Board.Direction)}.
	 */
	@Test
	void testCheckObjective() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#NewObjective()}.
	 */
	@Test
	void testNewObjective() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#randomItem()}.
	 */
	@Test
	void testRandomItem() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#GameOver()}.
	 */
	@Test
	void testGameOver() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#keyPressed(java.awt.event.KeyEvent)}.
	 */
	@Test
	void testKeyPressed() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#keyReleased(java.awt.event.KeyEvent)}.
	 */
	@Test
	void testKeyReleased() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#keyTyped(java.awt.event.KeyEvent)}.
	 */
	@Test
	void testKeyTyped() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#getScore()}.
	 */
	@Test
	void testGetScore() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#getDuration()}.
	 */
	@Test
	void testGetDuration() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Game#getName()}.
	 */
	@Test
	void testGetName() {
		fail("Not yet implemented");
	}

}
