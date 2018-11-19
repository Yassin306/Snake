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
class ScoreTest {
	Score score;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		score = new Score();
	}

	/**
	 * Test method for {@link Score#Score()}.
	 * Black case testing
	 * 
	 */
	@Test
	void testScore() {
		assertTrue(0 == score.getDuration());
		assertTrue(0 == score.getUserScore());
		assertTrue("" == score.getUserName());
	}

	/**
	 * Test method for {@link Score#getUserName()}.
	 */
	@Test
	void testGetUserName() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Score#getDuration()}.
	 */
	@Test
	void testGetDuration() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Score#getUserScore()}.
	 */
	@Test
	void testGetUserScore() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Score#setUserName(java.lang.String)}.
	 */
	@Test
	void testSetUserName() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Score#setDuration(long)}.
	 */
	@Test
	void testSetDuration() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Score#setUserScore(int)}.
	 */
	@Test
	void testSetUserScore() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Score#addScore(int)}.
	 */
	@Test
	void testAddScore() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link Score#addDuration(int)}.
	 */
	@Test
	void testAddDuration() {
		fail("Not yet implemented");
	}

}
