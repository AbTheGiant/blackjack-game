package core;
import java.io.File;
import java.util.Scanner;


public class BlackJackGame {

	
	public static final int BLACKJACK = 21;
	private static final Scanner input = new Scanner(System.in);
	private Deck deck;
	private Hand player;
	private Hand dealer;

	private String mode = "C"; 
	private Scanner fsc; 

	
	public BlackJackGame() throws Exception {
		deck = new Deck();
		player = new Hand();
		dealer = new Hand();

		
		deck.shuffle();

	}

	
	public Card getCard() throws Exception {
		Card card = null;

		if (mode.equals("C"))
			card = deck.deal();

		else {
			String holder = "";

			try {
				holder = fsc.next();
				card = new Card(holder);
			}
			catch (Exception ex) {
				System.out.println("Bad card in file: " + holder);
				throw new Exception("Bad card in file: " + holder);
			}
		}

		return card;
	}
	
	public String getResponse() throws Exception {
		String response = "";

		if (mode.equals("C")) {

			response = input.nextLine().toUpperCase();

			while (!(response.equals("H") || response.equals("S"))) {
				System.out.print("You must enter H or S: ");
				response = input.nextLine().toUpperCase();

			}
		}

		else {

			try {
				response = fsc.next().toUpperCase();

				if (!(response.equals("H") || response.equals("S"))) {
					throw new Exception("H OR S  expected in file: " + response);
				}
			}
			catch (Exception ex) {
				throw new Exception("INVALID  H OR S command in file: " + response);
			}

		}

		return response;
	}

	public Scores checkScore(Hand player, Hand dealer) {
		int playerScore = player.getScore();
		int dealerScore = dealer.getScore();

		
		if (playerScore == dealerScore) {
			if (playerScore == BLACKJACK && dealerScore == BLACKJACK) {
				return Scores.BlackjackTieGame;
			}

			else {
				return Scores.TieGame;
			}
		}

		
		else if (dealerScore == BLACKJACK) {
			return Scores.DealerBlackjack;
		}

	
		else if (playerScore == BLACKJACK) {
			return Scores.PlayerBlackjack;
		}

		
		else if (dealerScore > BLACKJACK) {
			return Scores.DealerBusts;
		}

	
		else if (playerScore > BLACKJACK) {
			return Scores.PlayerBusts;
		}

		else if (playerScore > dealerScore) {
			return Scores.PlayerWins;
		}

		else {
			return Scores.DealerWins;
		}

	}


	public void run(String[] args) throws Exception {

		
		String inputFile;

		
		do {
			System.out.print("Please Enter C Console Input or F  for File Input ");
			mode = input.nextLine().toUpperCase();
		} while (!(mode.equals("C") || mode.equals("F")));

		
		if (mode.equals("F")) {

			
			if (args.length > 0) {
				inputFile = args[0];
			}

			else {
				System.out.print("Enter File name: ");
				inputFile = input.nextLine();
			}

			
			try {
				fsc = new Scanner(new File(inputFile));
			}

			catch (Exception ex) {
				System.out.println("Cannot Find File " + inputFile);
				return;
			}
		}

		play();

	}

	public void play() throws Exception {

		
		int playerScore = 0;
		int dealerScore = 0;

		// give two card to each player
		Card card = null;
		for (int i = 0; i < 2; i++) {
			card = getCard();
			player.addCard(card);
		}

		for (int i = 0; i < 2; i++) {
			card = getCard();
			dealer.addCard(card);
		}

		
		System.out.println("PlayerCards: " + player);
		System.out.println("PlayerScore: " + player.getScore());

		
		System.out.println("Dealer Card: " + dealer.getUpCard());

		
		Scores score = checkScore(player, dealer);

		
		if (score == Scores.BlackjackTieGame) {

			System.out.println("Tie Game The  dealer and player both a black jack!");
			System.out.println("Game Over!");
		}

		else if (score == Scores.DealerBlackjack) {

			System.out.println("Dealer has a black jack!");
			System.out.println("Game Over!");
		}

		else if (score == Scores.PlayerBlackjack) {

			System.out.println("Player has a black jack!");
			System.out.println("Game Over!");

		}

		
		else {
			
			System.out.print("Player (H)it or (S)tand: ");
			String response = getResponse();

			if (mode.equals("F"))
				System.out.println(response);

			boolean busted = false;
			while (!busted && response.equalsIgnoreCase("H")) {
				player.addCard(getCard());
				playerScore = player.getScore();
				System.out.print("Players Cards: "); // print players cards
				System.out.println(player);
				System.out.println("Player's score: " + player.getScore());

				
				if (playerScore > BLACKJACK) {
					System.out.println("PLAYER YOU HAVE BUSTED, YOU LOSE :(");
					busted = true;
				} else {
					System.out.print("Player (H)it or (S)tand: ");
					response = getResponse();
					if (mode.equals("F"))
						System.out.println(response);
				}
			}
			if (!busted) {
				System.out.print("Players Final Cards: "); 
				System.out.println(player);
				playerScore = player.getScore();
				System.out.println("Player's final score: " + playerScore);
				dealerScore = dealer.getScore();
				System.out.print("Dealer Score: " + dealerScore + "\n");
				while (dealer.dealerCanDraw()) {
					System.out.println("Dealer takes a card");
					dealer.addCard(getCard());
				}
				dealerScore = dealer.getScore();
				System.out.print("Final Dealer Score: " + dealerScore + "\n");

				
				System.out.print("Dealers hand: ");
				System.out.println(dealer);

				// dealer busts
				if (dealerScore > BLACKJACK) {
					System.out.println("DEALER YOU HAVE BUSTED ! Player Wins :)");
				}

				else {
					score = checkScore(player, dealer);

					printWinner(score);

				} 
			}
		}
	}

	
	public void printWinner(Scores score) {


		if (score == Scores.BlackjackTieGame) {
			System.out.println("Blackjack Tie Game");

		}

		else if (score == Scores.TieGame) {
			System.out.println("Tie Game");

		}

		else if (score == Scores.PlayerBlackjack) {
			System.out.println("You got a Blackjack! You Win");
		}

		else if (score == Scores.DealerBlackjack) {
			System.out.println("Dealer got a blackjack, You Loose, Dealer wins");
		}

		else if (score == Scores.PlayerWins) {
			System.out.print("You Win" + "\n");
		}

		else if (score == Scores.DealerWins) {
			System.out.print("You Lost, Dealer wins" + "\n");
		}

	}

}
