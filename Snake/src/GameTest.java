import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sun.glass.events.KeyEvent;

/**
 * 
 */

/**
 * @author 
 *
 */
class GameTest {
	Game game;
	
	public class MockBoard extends Board {
		public MockBoard(int rowSize, int colSize) {
			super(rowSize, colSize);
		}
		@Override
		public void repaint() {
			
		}
	}
	
	MockBoard mock;

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
	 * Test if method ends
	 */
	@Test
	void testStart() {
		game = new Game(10,10);
		String input = "Marc";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		game.start();
		assertTrue(true);
	}

	/**
	 * Test method for {@link Game#play(Board.Direction)}.
	 */
	@Test
	void testPlay() {
		String input;
		game = new Game(20, 20);
		game.setBoard(mock);
		//no loops
		game = new Game(20, 20);
		mock = new MockBoard(20, 20);
		mock.setHead((int) (20/2), (int) (20/2));
		mock.setCells(mock.getHead().getX(), mock.getHead().getY() - 1, Cell.CellType.WALL);
		game.setBoard(mock);
		input = "Marc";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		game.play(Board.Direction.UP);
		assertEquals(0, game.getScore());
		//1 loops
		game = new Game(20, 20);
		mock = new MockBoard(20, 20);
		mock.setHead((int) (20/2), (int) (20/2));
		mock.setCells(mock.getHead().getX(), mock.getHead().getY() - 2, Cell.CellType.WALL);
		game.setBoard(mock);
		input = "Marc";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		game.play(Board.Direction.UP);
		assertEquals(10, game.getScore());
		//2 loops
		game = new Game(20, 20);
		mock = new MockBoard(20, 20);
		mock.setHead((int) (20/2), (int) (20/2));
		mock.setCells(mock.getHead().getX(), mock.getHead().getY() - 3, Cell.CellType.WALL);
		game.setBoard(mock);
		input = "Marc";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		game.play(Board.Direction.UP);
		assertEquals(20, game.getScore());
		//5 loops
		game = new Game(20, 20);
		mock = new MockBoard(20, 20);
		mock.setHead((int) (20/2), (int) (20/2));
		mock.setCells(mock.getHead().getX(), mock.getHead().getY() - 6, Cell.CellType.WALL);
		game.setBoard(mock);
		input = "Marc";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		game.play(Board.Direction.UP);
		assertEquals(50, game.getScore());
		
	}

	/**
	 * Test method for {@link Game#addScore(Cell.CellType)}.
	 * White case
	 */
	@Test
	void testAddScore() {
		game = new Game(20, 20);
		game.addScore(Cell.CellType.EMPTY);
		assertEquals(10, game.getScore());
		game = new Game(20, 20);
		game.addScore(Cell.CellType.SMALL_ITEM);
		assertEquals(30, game.getScore());
		game = new Game(20, 20);
		game.addScore(Cell.CellType.MED_ITEM);
		assertEquals(50, game.getScore());
		game = new Game(20, 20);
		game.addScore(Cell.CellType.BIG_ITEM);
		assertEquals(100, game.getScore());
		game = new Game(20, 20);
		game.addScore(Cell.CellType.SNAKE);
		assertEquals(0, game.getScore());
		game = new Game(20, 20);
		game.addScore(Cell.CellType.WALL);
		assertEquals(0, game.getScore());
	}

	/**
	 * Test method for {@link Game#NewObjective()}.
	 */
	@Test
	void testNewObjective() {
		game = new Game(20,20);
		mock = new MockBoard(20,20);
		mock.setHead((int) (20/2), (int) (20/2));
		game.setBoard(mock);
		game.NewObjective();
		boolean obj = false;
		for(int i = 0; i < 20; i++) {
			for(int j = 0; j < 20; j++) {
				if (mock.getCell(i, j) == Cell.CellType.BIG_ITEM 
						|| mock.getCell(i,j) == Cell.CellType.MED_ITEM
						|| mock.getCell(i, j) == Cell.CellType.SMALL_ITEM) {
					obj = true;
				}
			}
		}
		assertTrue(obj);
	}

	/**
	 * Test method for {@link Game#randomItem()}.
	 */
	@Test
	void testRandomItem() {
		game = new Game(20, 20);
		mock = new MockBoard(20,20);
		Cell.CellType a;
		a = game.randomItem();
		assertTrue(mock.isItem(a));
		a = game.randomItem();
		assertTrue(mock.isItem(a));
		a = game.randomItem();
		assertTrue(mock.isItem(a));
	}

	/**
	 * Test method for {@link Game#GameOver()}.
	 */
	@Test
	void testGameOver() {
		game = new Game(20, 20);
		String input = "Marc";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		game.GameOver();
		assertEquals("Marc", game.getName());
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
