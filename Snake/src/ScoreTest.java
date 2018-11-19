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
		assertEquals("", score.getUserName());
	}

	/**
	 * Test method for {@link Score#getUserName()}.
	 * Black case testing
	 * 
	 */
	@Test
	void testGetUserName() {
		score.setUserName("user");
		assertEquals("user", score.getUserName());
		score.setUserName("user2");
		assertEquals("user2", score.getUserName());

	}

	/**
	 * Test method for {@link Score#getDuration()}.
	 * Black case testing
	 */
	@Test
	void testGetDuration() {
		score.setDuration(50);
		assertTrue((long)50 == score.getDuration());
		score.setDuration(60);
		assertTrue((long)60 == score.getDuration());
	}

	/**
	 * Test method for {@link Score#getUserScore()}.
	 * Black case testing
	 */
	@Test
	void testGetUserScore() {
		score.setUserScore(50);
		assertTrue(50 == score.getUserScore());
		score.setUserScore(60);
		assertTrue(60 == score.getUserScore());
	}

	/**
	 * Test method for {@link Score#setUserName(java.lang.String)}.
	 * Black case test: equivalence partitioning, limit and frontier values
	 */
	@Test
	void testSetUserName() {
		//valors interiors
		score.setUserName("user"); 
		assertEquals("user",score.getUserName());
		score.setUserName("1234");
		assertEquals("1234",score.getUserName());
		score.setUserName("user5");
		assertEquals("user5",score.getUserName());
		//valors exteriors
		score.setUserName("user567");		
		assertEquals("user56", score.getUserName());
		score.setUserName("1234567");
		assertEquals("123456",score.getUserName());
		score.setUserName("userrrr");
		assertEquals("userrr",score.getUserName());
		//valors limit
		score.setUserName("123456");
		assertEquals("123456", score.getUserName());
		score.setUserName("user56");
		assertEquals("user56",score.getUserName());
		//valors invalids
		score.setUserName("use-56");//frontera
		assertEquals("_",score.getUserName());
		score.setUserName("use-567");//valor exterior
		assertEquals("_", score.getUserName());
		score.setUserName("use-5");//valor interior
		assertEquals("_", score.getUserName());
		}

	/**
	 * Test method for {@link Score#setDuration(long)}.
	 * Black case testing
	 */
	@Test
	void testSetDuration() {
		score.setDuration(50);
		assertTrue((long)50 == score.getDuration());
	}

	/**
	 * Test method for {@link Score#setUserScore(int)}.
	 * Black case testing
	 */
	@Test
	void testSetUserScore() {
		score.setUserScore(50);
		assertTrue(50 == score.getUserScore());
	}

	/**
	 * Test method for {@link Score#addScore(int)}.
	 */
	@Test
	void testAddScore() {
		score.setUserScore(50);
		score.addScore(10);
		assertTrue(60 == score.getUserScore());
		
	}

	/**
	 * Test method for {@link Score#addDuration(int)}.
	 */
	@Test
	void testAddDuration() {
		score.setDuration(50);
		score.addDuration(10);
		assertTrue(60 == score.getDuration());
	}

}
