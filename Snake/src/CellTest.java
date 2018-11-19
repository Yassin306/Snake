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
	 * Black case test: equivalence partitioning
	 * Testing Constructor test case
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
	 * Black case test: equivalence partitioning
	 * Testing setCellType test case
	 */
	@Test
	void testSetCellType() {
		empty.setCellType(Cell.CellType.SMALL_ITEM);
		assertEquals(Cell.CellType.SMALL_ITEM, empty.getCellType());
		assertTrue(30 == empty.getScore());
		empty.setCellType(Cell.CellType.BIG_ITEM);
		assertEquals(Cell.CellType.BIG_ITEM, empty.getCellType());
		assertTrue(100 == empty.getScore());
		empty.setCellType(Cell.CellType.MED_ITEM);
		assertEquals(Cell.CellType.MED_ITEM, empty.getCellType());
		assertTrue(50 == empty.getScore());
		empty.setCellType(Cell.CellType.SNAKE);
		assertEquals(Cell.CellType.SNAKE, empty.getCellType());
		assertTrue(0 == empty.getScore());
		wall.setCellType(Cell.CellType.EMPTY);
		assertEquals(Cell.CellType.EMPTY, wall.getCellType());
		assertTrue(10 == wall.getScore());
	}

	/**
	 * Test method for {@link Cell#setScore(int)}.
	 * Black case test: equivalence partitioning, limit and frontier values
	 * Testing setScore test case
	 */
	@Test
	void testSetScore() {
		
		empty.setScore(30);
		assertEquals(Cell.CellType.SMALL_ITEM, empty.getCellType());
		assertTrue(30 == empty.getScore());
		empty.setScore(100);
		assertEquals(Cell.CellType.BIG_ITEM, empty.getCellType());
		assertTrue(100 == empty.getScore());
		empty.setScore(50);
		assertEquals(Cell.CellType.MED_ITEM, empty.getCellType());
		assertTrue(50 == empty.getScore());
		empty.setScore(0);
		assertEquals(Cell.CellType.WALL, empty.getCellType());
		assertTrue(0 == empty.getScore());
		//testing values that should change the cell to a cell with EMPTY cellType and score=10
		int[] emptyValues = {-50, -1, 1, 9, 10, 11, 29, 31, 49, 51, 99, 101, 5, 20, 40, 80 ,150};
		for (int i = 0; i < emptyValues.length; i++) {
			empty.setScore(emptyValues[i]);
			assertEquals(Cell.CellType.EMPTY, empty.getCellType());
			assertTrue(10 == empty.getScore());
			empty.setCellType(Cell.CellType.SMALL_ITEM);
			
		}
	}

	/**
	 * Test method for {@link Cell#getScore()}.
	 * Black case test
	 * Testing getScore test case
	 */
	@Test
	void testGetScore() {
		assertTrue(10 == empty.getScore());
		assertTrue(30 == small.getScore());
		assertTrue(100 == big.getScore());
		assertTrue(50 == med.getScore());
		assertTrue(0 == snake.getScore());
		}

	/**
	 * Test method for {@link Cell#getCellType()}.
	 * Black case test
	 * Testing getCellType test case
	 */
	@Test
	void testGetCellType() {
		assertEquals(Cell.CellType.WALL, wall.getCellType());
		assertEquals(Cell.CellType.SNAKE, snake.getCellType());
		assertEquals(Cell.CellType.MED_ITEM, med.getCellType());
		assertEquals(Cell.CellType.BIG_ITEM, big.getCellType());
		assertEquals(Cell.CellType.SMALL_ITEM, small.getCellType());
		assertEquals(Cell.CellType.EMPTY, empty.getCellType());
	}

}
