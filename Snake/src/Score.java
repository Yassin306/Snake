/**
 * 
 */

/**
 * @author 
 *
 */
public class Score {
	private String userName;
	private long duration;
	private int userScore;
	/**
	 * sets the duration and the userScore to 0 as they represent the start of the game
	 * sets the userName with the an user name
	 */
	public Score() {
		duration = 0;
		userScore = 0;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @return the duration
	 */
	public long getDuration() {
		return duration;
	}
	/**
	 * @return the userScore
	 */
	public int getUserScore() {
		return userScore;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(long duration) {
		this.duration = duration;
	}
	/**
	 * @param userScore the userScore to set
	 */
	public void setUserScore(int userScore) {
		this.userScore = userScore;
	}
	/**
	 * add score to the userScore already saved
	 */
	public void addScore(int score) {
		this.userScore += score;
	}
	/**
	 * adds duration to the game duration already saved
	 */
	public void addDuration(int duration) {
		this.duration += duration;
	}

}
