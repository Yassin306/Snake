import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author 
 *
 */
class RankingTest {
	
	public class MockGame extends Game {
		public MockGame() {
			super(20, 20);
		}
		@Override
		public int getScore() {
			return 5000;
		}
		@Override
		public long getDuration() {
			return 400;
		}
		@Override
		public String getName() {
			return "mock";
		}

	}
	MockGame mock;
	Ranking rank;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		mock = new MockGame();
		rank = new Ranking(mock);
	}

	/**
	 * Test method for {@link Ranking#Ranking(Game)}.
	 */
	@Test
	void testRanking() {
		assertEquals(5000, rank.getScore(0));
		assertEquals(400, rank.getDuration(0));
		assertEquals("mock", rank.getName(0));
		
	}

	/**
	 * Test method for {@link Ranking#Write(Game)}.
	 */
	@Test
	void testWrite() {
		rank.Write(mock);
		assertEquals(5000, rank.getScore(0));
		assertEquals(400, rank.getDuration(0));
		assertEquals("mock", rank.getName(0));
		assertEquals(5000, rank.getScore(1));
		assertEquals(400, rank.getDuration(1));
		assertEquals("mock", rank.getName(1));		
	}


}
