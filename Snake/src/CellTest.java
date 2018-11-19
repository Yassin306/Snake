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
class CellTest {
	Cell empty;
	Cell small;
	Cell big;
	Cell med;
	Cell snake;
	Cell wall;


	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		empty = new Cell(Cell.CellType.EMPTY);
		small = new Cell(Cell.CellType.SMALL_ITEM);
		big = new Cell(Cell.CellType.BIG_ITEM);
		med = new Cell(Cell.CellType.MED_ITEM);
		snake = new Cell(Cell.CellType.SNAKE);
		wall = new Cell(Cell.CellType.WALL);
	}

	/**
	 * Test method for {@link Cell#Cell(Cell.CellType)}.
	 */
	@Test
	void testCell() {
		assertEquals(Cell.CellType.EMPTY, empty.getCellType());
		assertTrue(10 == empty.getScore());
		assertEquals(Cell.CellType.SMALL_ITEM, small.getCellType());
		assertTrue(30 == small.getScore());
		assertEquals(Cell.CellType.BIG_ITEM, big.getCellType());
		assertTrue(100 == big.getScore());
		assertEquals(Cell.CellType.MED_ITEM, med.getCellType());
		assertTrue(50 == med.getScore());
		assertEquals(Cell.CellType.SNAKE, snake.getCellType());
		assertTrue(0 == snake.getScore());
	}

	/**
	 * Test method for {@link Cell#setCellType(Cell.CellType)}.
	 */
	@Test
	void testSetCellType() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Cell#setScore(int)}.
	 */
	@Test
	void testSetScore() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Cell#getScore()}.
	 */
	@Test
	void testGetScore() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Cell#getCellType()}.
	 */
	@Test
	void testGetCellType() {
		fail("Not yet implemented");
	}

}
