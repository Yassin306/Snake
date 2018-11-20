import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * 
 */

/**
 * @author 
 *
 */
class mainAppTest {
	public class MockGame extends Game {
		public MockGame() {
			super(20, 20);
		}
		@Override
		public void start() {
			//
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

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		mock = new MockGame();
		mainApp.setGame(mock);
	}

	/**
	 * Test method for {@link mainApp#main(java.lang.String[])}.
	 * White case testing: Simple Loop test
	 * @throws InterruptedException 
	 */
	@Test
	void testMain() throws InterruptedException {
	    String[] args = null;	
	    //not looping
	    String input = "3\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		mainApp.main(args);
		//1 loop
	    input = "1 3\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		mainApp.main(args);
		
		//2 loops
	    input = "2 1 3\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		mainApp.main(args);
		
		//3 loops
		input = "4 2 1 3\n";
		System.setIn(new ByteArrayInputStream(input.getBytes()));
		mainApp.main(args);
		assertTrue(true);//ha arribat al final d'execucio sense errors
	
	}
}
