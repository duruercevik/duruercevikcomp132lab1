package game;
public class Player {
	private int roundsWon;
	private String playerName;
	
	public Player(String name) {
		int roundsWon = 0;
		String playerName=player1Name;		
	}
	public void wonRound() {
		while (roundsWon < numRounds) {
			roundsWon++;
		}	
	}
	public int getRoundsWon() {
		return roundsWon;
	}
	public String getName() {
		return playerName;
	}
}