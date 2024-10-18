package game;
import java.util.Random;

public class ElementalClash {
	private Player player1;
	private Player player2;
	private int numRounds;
	private int ties;
	private static final Random RAND= new Random(2024);
	
	public void ElementalClash(String name1, String name2, int numRounds) {
		this.player1=new Player(name1);
		this.player2=new Player(name2);
		this.numRounds=numRounds;
	}
	private String getRandomChoice() {
		int character= RAND.nextInt(5);
		if (character==0) {
			return "Fire";
		}else if (character==1) {
			return "Water";
		}else if (character==2) {
			return "Earth";
		}else if (character==3) {
			return "Air";
		}else  {
			return "Lightning";
			
		}
	}
	private String determineWinner(String choice1, String choice2) {	
	if (choice1==choice2) {
		return"tie";
	}
	if (choice1=="Fire") {
		if (choice2== "Air") {
			player1.wonRound();
			return player1.getName();
		}else if (choice2== "Lightning") {
			player1.wonRound();
			return player1.getName();
		}else {
			player2.wonRound();
			return player2.getName();
		}
	}else if (choice1=="Water") {
		if (choice2== "Fire") {
			player1.wonRound();
			return player1.getName();
		}else if (choice2== "Lightning") {
			player1.wonRound();
			return player1.getName();
		}else {
			player2.wonRound();
			return player2.getName();
		}
	}else if (choice1=="Earth") {
		if (choice2== "Fire") {
			player1.wonRound();
			return player1.getName();
		}else if (choice2== "Water") {
			player1.wonRound();
			return player1.getName();
		}else {
			player2.wonRound();
			return player2.getName();
		}
	}else if (choice1=="Air") {
		if (choice2== "Earth") {
			player1.wonRound();
			return player1.getName();
		}else if (choice2== "Water") {
			player1.wonRound();
			return player1.getName();
		}else {
			player2.wonRound();
			return player2.getName();
		}
	}else if (choice1=="Lightning") {
		if (choice2== "Air") {
			player1.wonRound();
			return player1.getName();
		}else if (choice2== "Earth") {
			player1.wonRound();
			return player1.getName();
		}else {
			player2.wonRound();
			return player2.getName();
		}
	}
	}
	public void printWinner() {
		if (player1.getRoundsWon()> player2.getRoundsWon()) {
			System.out.print("player1 won:" + player1.getRoundsWon()+" games player2 won :" + player2.getRoundsWon());
		}else if (player1.getRoundsWon()< player2.getRoundsWon()) {
			System.out.print("player2 won:" + player2.getRoundsWon()+" games player1 won :" + player1.getRoundsWon());
		}else {
			System.out.print("The game is tied");
		}
		
		if ((numRounds - player1.getRoundsWon() + player2.getRoundsWon()) ==0 ) {
			System.out.println( "There is no tie.");
		
		} else{
			System.out.print( "There are " + (numRounds - player1.getRoundsWon() - player2.getRoundsWon()) + "tie.");
		}
		
	
		
	}
	public void runGame() {
		for (int round= 0; round<numRounds; round++) {
			System.out.println("Rounds"+ round);
			String player1Choice=getRandomChoice();
			String player2Choice=getRandomChoice();
			System.out.println(player1.getName()+"chose"+player1Choice);
			System.out.println(player1.getName()+"chose"+player1Choice);
			
			String winner=determineWinner(player1Choice, player2Choice);
			if (winner!= "tie") {
				System.out.println("It is a tie.");
			}else {
				System.out.println("Winner is: "+ winner);
			}
		}
		}
	private Player player1;
	private Player player2;
	private int numRounds;
	private int scoreDif;

	if (player1.getRoundsWon()-player2.getRoundsWon()==getscoreDif) {
		System.out.println(player1.getName()+" is the overall winner!");
		
	}else if (player2.getRoundsWon()-player1.getRoundsWon()==getscoreDif) {
		System.out.println(player2.getName()+" is the overall winner!");
	}
	public void runInLabGame() {
		
		if ((player1.getRoundsWon()+player2.getRoundsWon())<numRounds) {
			System.out.println(player1.getName() +"score is:" +player1.getRoundsWon());
			System.out.println(player2.getName() +"score is:" +player2.getRoundsWon());
			System.out.println("The difference is: " +scoreDif);
		}
			
			
		}
		
	}
}


	

	

	
	
	
	
	
	
	
	
	