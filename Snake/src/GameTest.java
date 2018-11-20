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
	 */
	@Test
	void testGame() {
		game = new Game(20,20);
		assertEquals(20, game.getRow());
		assertEquals(20, game.getCol());
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
		fail("Not yet implemented");
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
