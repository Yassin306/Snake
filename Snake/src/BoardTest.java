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
class BoardTest {
	Board board;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		board = new Board(3,3);
	}

	/**
	 * Test method for {@link Board#Board(int, int)}.
	 * Black case test
	 * Testing Constructor test case
	 */
	@Test
	void testBoard() {
		
		assertEquals(Cell.CellType.WALL,board.getCell(0, 0));
		assertEquals(Cell.CellType.WALL,board.getCell(4, 0));
		assertEquals(Cell.CellType.WALL,board.getCell(0, 4));
		assertEquals(Cell.CellType.WALL,board.getCell(4, 4));
		assertEquals(Cell.CellType.EMPTY,board.getCell(2, 2));

	}

	/**
	 * Test method for {@link Board#getRowSize()}.
	 * Black case test
	 * Testing getRowSize test case
	 */
	@Test
	void testGetRowSize() {
		assertTrue(5==board.getRowSize());
	}

	/**
	 * Test method for {@link Board#getColSize()}.
	 * Black case test
	 * Testing getColSize test case
	 */
	@Test
	void testGetColSize() {
		assertTrue(5==board.getColSize());
	}

	/**
	 * Test method for {@link Board#getCell(int, int)}.
     * Black case test
	 * Testing getColSize test case
	 */
	@Test
	void testGetCell() {
		assertEquals(Cell.CellType.WALL,board.getCell(0, 0));
		assertEquals(Cell.CellType.WALL,board.getCell(4, 0));
		assertEquals(Cell.CellType.WALL,board.getCell(0, 4));
		assertEquals(Cell.CellType.WALL,board.getCell(4, 4));
		assertEquals(Cell.CellType.EMPTY,board.getCell(2, 2));
		board.setCells(2, 2, Cell.CellType.SNAKE);
		assertEquals(Cell.CellType.SNAKE,board.getCell(2, 2));

	}

	/**
	 * Test method for {@link Board#isItem(int, int)}.
	 */
	@Test
	void testIsItem() {
		board.setCells(2, 2, Cell.CellType.EMPTY);
		assertFalse(board.isItem(2, 2));
		board.setCells(2, 2, Cell.CellType.MED_ITEM);
		assertTrue(board.isItem(2, 2));
		board.setCells(2, 2, Cell.CellType.EMPTY);
		board.setCells(2, 2, Cell.CellType.BIG_ITEM);
		assertTrue(board.isItem(2, 2));
		board.setCells(2, 2, Cell.CellType.EMPTY);
		board.setCells(2, 2, Cell.CellType.SMALL_ITEM);
		assertTrue(board.isItem(2, 2));
	}

	/**
	 * Test method for {@link Board#setHead(int, int)}.
	 */
	@Test
	void testSetHead() {
		board.setHead(2, 2);
		assertEquals(Cell.CellType.SNAKE,board.getCell(2, 2));
		assertTrue(2 == board.getHead().getX());
		assertTrue(2 == board.getHead().getY());


	}

	/**
	 * Test method for {@link Board#getHead()}.
	 */
	@Test
	void testGetHead() {
		board.setHead(2, 2);
		assertTrue(2 == board.getHead().getX());
		assertTrue(2 == board.getHead().getY());
	}

	/**
	 * Test method for {@link Board#addBody(Controller.Direction)}.
	 */
	@Test
	void testAddBody() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Board#setCells(int, int, Cell.CellType)}.
	 */
	@Test
	void testSetCells() {
		board.setCells(2, 2, Cell.CellType.WALL);
		assertEquals(Cell.CellType.WALL,board.getCell(2, 2));

	}

	/**
	 * Test method for {@link Board#move(Controller.Direction)}.
	 */
	@Test
	void testMove() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Board#update()}.
	 */
	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

}
