import java.util.ArrayList;
import java.util.LinkedList;

public class Ranking {
	private LinkedList<Integer> score = new LinkedList<Integer>();
	private LinkedList<Long> duration = new LinkedList<Long>();
	private LinkedList<String> Name = new LinkedList<String>();
	
	public Ranking(Game game) {
		if (game.getDuration() != 0) {
			score.addFirst(game.getScore());
			duration.addFirst(game.getDuration());
			Name.addFirst(game.getName());
		}
		
	}
	
	public void Write(Game game) {
		if (game.getDuration() != 0) {
			score.addFirst(game.getScore());
			duration.addFirst(game.getDuration());
			Name.addFirst(game.getName());
		}
	}
	
	public void Read() {
		if (score.isEmpty()) {
			System.out.println("No hi ha cap registrat");
		} else {
			for (int i = 0; i < score.size(); i++) {
				System.out.println(score.get(i) + "    " + Name.get(i) + "    "  + duration.get(i));
			}
		}
	}
	
	/**
	 * @return the score based on index
	 */
	public int getScore(int i) {
		return score.get(i);
	}

	/**
	 * @return the duration based on index
	 */
	public long getDuration(int i) {
		return duration.get(i);
	}

	/**
	 * @return the name based on index
	 */
	public String getName(int i) {
		return Name.get(i);
	}

	
}
