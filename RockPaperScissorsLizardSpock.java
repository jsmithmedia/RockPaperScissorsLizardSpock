
import java.util.Scanner;

public class RockPaperScissorsLizardSpock {

	public static void main(String[] args) {
		
		//First, all variables are declared and then some are set to default values to be used or updated in later code.
		String startGameRaw, startGame, startGameTwo, playGame, stopGame, userChoice, userInputRaw, computerChoiceFirstLetterRaw,
				userInputSubstring, computerChoice, winLossTie, rock, paper, scissors, lizard, spock, verb, computerChoiceFirstLetter;
		userChoice  = "";
		winLossTie = "";
		rock = "rock";
		paper = "paper";
		scissors = "scissors";
		lizard = "lizard";
		spock = "spock";
		verb = "";
		int userInput, userScore, computerScore;
		userInput = 0;
		
		System.out.print("Would you like to play Rock Paper Scissors Lizard Spock? (y/n): ");
		
		Scanner keyboard = new Scanner(System.in);
		
		startGameRaw = keyboard.next();
		playGame = "Y";
		stopGame = "N";
		startGame = startGameRaw.substring(0,1);
		System.out.println();
		
		//This is the first chance for the user to start the game.
		if (startGame.equalsIgnoreCase(playGame))
		{
		
		}
		else if (startGame.equalsIgnoreCase(stopGame))
		{
			System.out.print("Goodbye.");
			System.exit(0);
		}
		else
		{
			System.out.println("The input you entered is invalid.");
			System.out.println();
		
		//This is the second chance for the user to start the game.
			System.out.print("Would you like to play Rock Paper Scissors Lizard Spock? (y/n)");
			
			startGameRaw = keyboard.next();
			startGameTwo = startGameRaw.substring(0,1);
			System.out.println();
			
			if (startGameTwo.equalsIgnoreCase(playGame))
			{
			
			}
			else if (startGameTwo.equalsIgnoreCase(stopGame))
			{
				System.out.print("Goodbye!");
				System.exit(0);
			}
			else
			{
				System.out.println("You entered too many invalid inputs.");
				System.out.print("Goodbye!");
				System.exit(0);
			}
			
		}
		
		//This is where the user's choice will be read in and stored for the game.
		//This will be repeated in the beginning of every round.
		System.out.println("Round 1");
		System.out.println("Which gesture would you like to choose . . .");
		System.out.println("	1) rock");
		System.out.println("	2) paper");
		System.out.println("	3) scissors");
		System.out.println("	4) lizard");
		System.out.println("	5) spock");
		System.out.print("Please enter your choice (1-5): ");
		
		userInputRaw = keyboard.next();
		userInputSubstring = userInputRaw.substring(0,1);
		
		if (userInputSubstring.equals("1"))
		{
			userInput = 1;
		}
		else if (userInputSubstring.equals("2"))
		{
			userInput = 2;
		}
		else if (userInputSubstring.equals("3"))
		{
			userInput = 3;
		}
		else if (userInputSubstring.equals("4"))
		{
			userInput = 4;
		}
		else if (userInputSubstring.equals("5"))
		{
			userInput = 5;
		}
		
		//This checks the validity of the user's input and if invalid, prompts for more input.
		if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5)
		{
			
		}
		else
		{
			System.out.println();
			System.out.println("The input you entered is invalid.");
			System.out.println();
			System.out.println("Which gesture would you like to choose . . .");
			System.out.println("	1) rock");
			System.out.println("	2) paper");
			System.out.println("	3) scissors");
			System.out.println("	4) lizard");
			System.out.println("	5) spock");
			System.out.print("Please enter your choice (1-5): ");
			
			userInputRaw = keyboard.next();
			userInputSubstring = userInputRaw.substring(0,1);
			
			if (userInputSubstring.equals("1"))
			{
				userInput = 1;
			}
			else if (userInputSubstring.equals("2"))
			{
				userInput = 2;
			}
			else if (userInputSubstring.equals("3"))
			{
				userInput = 3;
			}
			else if (userInputSubstring.equals("4"))
			{
				userInput = 4;
			}
			else if (userInputSubstring.equals("5"))
			{
				userInput = 5;
			}
			
			//This checks the validity of the user's input a second time.
			if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5)
			{
				
			}
			else
			{
				System.out.println("You entered too many invalid inputs.");
				System.out.print("Goodbye!");
				System.exit(0);	
			}
		}
		
		//This assigns the user's input to a value for the game.
		if (userInput == 1)
		{
			userChoice = "rock";
		}
		else if (userInput == 2)
		{
			userChoice = "paper";
		}
		else if (userInput == 3)
		{
			userChoice = "scissors";
		}
		else if (userInput == 4)
		{
			userChoice = "lizard";
		}
		else if (userInput == 5)
		{
			userChoice = "spock";
		}
		
		//This code below pulls in the computer's choice.
		computerChoice = RockPaperScissorsLizardSpockComputerPlayer.getChoice();
		System.out.println();
		System.out.println("The computer player chooses " + computerChoice + ".");
		
		//Initial score:
		computerScore = 0;
		userScore = 0;
		
		//The following code compares the choices made in Round 1 to determine a winner.
		if (userChoice.equals(rock) && computerChoice.equals(rock))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(paper) && computerChoice.equals(paper))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(scissors) && computerChoice.equals(scissors))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(lizard) && computerChoice.equals(lizard))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(spock) && computerChoice.equals(spock))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else
		{
			
		//If there is no tie, then the following code compares to decide the victor.
			if (userChoice.equals(rock) && computerChoice.equals(scissors))
			{
				winLossTie = "win";
				System.out.println("Rock crushes scissors.");
			}
			else if (userChoice.equals(rock) && computerChoice.equals(lizard))
			{
				winLossTie = "win";
				System.out.println("Rock crushes lizard.");
			}
			else if (userChoice.equals(paper) && computerChoice.equals(rock))
			{
				winLossTie = "win";
				System.out.println("Paper covers rock.");
			}
			else if (userChoice.equals(paper) && computerChoice.equals(spock))
			{
				winLossTie = "win";
				System.out.println("Paper disproves spock.");
			}
			else if (userChoice.equals(scissors) && computerChoice.equals(lizard))
			{
				winLossTie = "win";
				System.out.println("Scissors decapitates lizard.");
			}
			else if (userChoice.equals(scissors) && computerChoice.equals(paper))
			{
				winLossTie = "win";
				System.out.println("Scissors cuts paper.");
			}
			else if (userChoice.equals(lizard) && computerChoice.equals(paper))
			{
				winLossTie = "win";
				System.out.println("Lizard eats paper.");
			}
			else if (userChoice.equals(lizard) && computerChoice.equals(spock))
			{
				winLossTie = "win";
				System.out.println("Lizard poisons spock.");
			}
			else if (userChoice.equals(spock) && computerChoice.equals(scissors))
			{
				winLossTie = "win";
				System.out.println("Spock smashes scissors.");
			}
			else if (userChoice.equals(spock) && computerChoice.equals(rock))
			{
				winLossTie = "win";
				System.out.println("Spock vaporizes rock.");
			}
			else
			{
				winLossTie = "loss";
			}
		}
		
		//This, in the event of a computer victory, determines the verb to be used in the output phrase.
		if (computerChoice.equals(rock) && userChoice.equals(scissors))
		{
			verb = "crushes";
		}
		else if (computerChoice.equals(rock) && userChoice.equals(lizard))
		{
			verb = "crushes";
		}
		else if (computerChoice.equals(paper) && userChoice.equals(spock))
		{
			verb = "disproves";
		}
		else if (computerChoice.equals(paper) && userChoice.equals(rock))
		{
			verb = "covers";
		}
		else if (computerChoice.equals(scissors) && userChoice.equals(paper))
		{
			verb = "cuts";
		}
		else if (computerChoice.equals(scissors) && userChoice.equals(lizard))
		{
			verb = "decapitates";
		}
		else if (computerChoice.equals(lizard) && userChoice.equals(paper))
		{
			verb = "eats";
		}
		else if (computerChoice.equals(lizard) && userChoice.equals(spock))
		{
			verb = "poisons";
		}
		else if (computerChoice.equals(spock) && userChoice.equals(scissors))
		{
			verb = "smashes";
		}
		else if (computerChoice.equals(spock) && userChoice.equals(rock))
		{
			verb = "vaporizes";
		}
		
		//This capitalizes the computer's choice and prints the statement telling what happened.
		computerChoiceFirstLetterRaw = computerChoice.substring(0,1);
		computerChoiceFirstLetter = computerChoiceFirstLetterRaw.toUpperCase();
		computerChoice = computerChoice.substring(1);
		
		if (winLossTie.equals("loss"))
		{
			System.out.println(computerChoiceFirstLetter + computerChoice + " " + verb + " " + userChoice + ".");
		}
		
		
		if (winLossTie.equals("win"))
		{
			userScore = 1 ;
			System.out.println("Congratulations! You win a point.");
		}
		else if (winLossTie.equals("loss"))
		{
			computerScore = 1;
			System.out.println("You lost against the computer player.");
		}
		
		System.out.println();
		
		
		//Round 2
		//First, the code to determine the user choice.
		System.out.println("Round 2");
		System.out.println("Which gesture would you like to choose . . .");
		System.out.println("	1) rock");
		System.out.println("	2) paper");
		System.out.println("	3) scissors");
		System.out.println("	4) lizard");
		System.out.println("	5) spock");
		System.out.print("Please enter your choice (1-5): ");
		
		userInputRaw = keyboard.next();
		userInputSubstring = userInputRaw.substring(0,1);
		
		
		if (userInputSubstring.equals("1"))
		{
			userInput = 1;
		}
		else if (userInputSubstring.equals("2"))
		{
			userInput = 2;
		}
		else if (userInputSubstring.equals("3"))
		{
			userInput = 3;
		}
		else if (userInputSubstring.equals("4"))
		{
			userInput = 4;
		}
		else if (userInputSubstring.equals("5"))
		{
			userInput = 5;
		}
		
		//This checks to make sure that the user's input is valid.
		if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5)
		{
			
		}
		else
		{
			System.out.println();
			System.out.println("The input you entered is invalid.");
			System.out.println();
			System.out.println("Which gesture would you like to choose . . .");
			System.out.println("	1) rock");
			System.out.println("	2) paper");
			System.out.println("	3) scissors");
			System.out.println("	4) lizard");
			System.out.println("	5) spock");
			System.out.print("Please enter your choice (1-5): ");
			
			userInputRaw = keyboard.next();
			userInputSubstring = userInputRaw.substring(0,1);
			
			if (userInputSubstring.equals("1"))
			{
				userInput = 1;
			}
			else if (userInputSubstring.equals("2"))
			{
				userInput = 2;
			}
			else if (userInputSubstring.equals("3"))
			{
				userInput = 3;
			}
			else if (userInputSubstring.equals("4"))
			{
				userInput = 4;
			}
			else if (userInputSubstring.equals("5"))
			{
				userInput = 5;
			}
			
			if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5)
			{
				
			}
			else
			{
				System.out.println("You entered too many invalid inputs.");
				System.out.print("Goodbye!");
				System.exit(0);	
			}
		}
		
		if (userInput == 1)
		{
			userChoice = "rock";
		}
		else if (userInput == 2)
		{
			userChoice = "paper";
		}
		else if (userInput == 3)
		{
			userChoice = "scissors";
		}
		else if (userInput == 4)
		{
			userChoice = "lizard";
		}
		else if (userInput == 5)
		{
			userChoice = "spock";
		}
		
		//This code below pulls in the computer's choice.
		computerChoice = RockPaperScissorsLizardSpockComputerPlayer.getChoice();
		System.out.println();
		System.out.println("The computer player chooses " + computerChoice + ".");
		
		//Then the code to determine the winner of Round 2.
		if (userChoice.equals(rock) && computerChoice.equals(rock))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(paper) && computerChoice.equals(paper))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(scissors) && computerChoice.equals(scissors))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(lizard) && computerChoice.equals(lizard))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(spock) && computerChoice.equals(spock))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else
		{
		
		//If there is no tie, then the following code compares to decide the victor.
			if (userChoice.equals(rock) && computerChoice.equals(scissors))
			{
				winLossTie = "win";
				System.out.println("Rock crushes scissors.");
			}
			else if (userChoice.equals(rock) && computerChoice.equals(lizard))
			{
				winLossTie = "win";
				System.out.println("Rock crushes lizard.");
			}
			else if (userChoice.equals(paper) && computerChoice.equals(rock))
			{
				winLossTie = "win";
				System.out.println("Paper covers rock.");
			}
			else if (userChoice.equals(paper) && computerChoice.equals(spock))
			{
				winLossTie = "win";
				System.out.println("Paper disproves spock.");
			}
			else if (userChoice.equals(scissors) && computerChoice.equals(lizard))
			{
				winLossTie = "win";
				System.out.println("Scissors decapitates lizard.");
			}
			else if (userChoice.equals(scissors) && computerChoice.equals(paper))
			{
				winLossTie = "win";
				System.out.println("Scissors cuts paper.");
			}
			else if (userChoice.equals(lizard) && computerChoice.equals(paper))
			{
				winLossTie = "win";
				System.out.println("Lizard eats paper.");
			}
			else if (userChoice.equals(lizard) && computerChoice.equals(spock))
			{
				winLossTie = "win";
				System.out.println("Lizard poisons spock.");
			}
			else if (userChoice.equals(spock) && computerChoice.equals(scissors))
			{
				winLossTie = "win";
				System.out.println("Spock smashes scissors.");
			}
			else if (userChoice.equals(spock) && computerChoice.equals(rock))
			{
				winLossTie = "win";
				System.out.println("Spock vaporizes rock.");
			}
			else
			{
				winLossTie = "loss";
			}
		}
		
		if (computerChoice.equals(rock) && userChoice.equals(scissors))
		{
			verb = "crushes";
		}
		else if (computerChoice.equals(rock) && userChoice.equals(lizard))
		{
			verb = "crushes";
		}
		else if (computerChoice.equals(paper) && userChoice.equals(spock))
		{
			verb = "disproves";
		}
		else if (computerChoice.equals(paper) && userChoice.equals(rock))
		{
			verb = "covers";
		}
		else if (computerChoice.equals(scissors) && userChoice.equals(paper))
		{
			verb = "cuts";
		}
		else if (computerChoice.equals(scissors) && userChoice.equals(lizard))
		{
			verb = "decapitates";
		}
		else if (computerChoice.equals(lizard) && userChoice.equals(paper))
		{
			verb = "eats";
		}
		else if (computerChoice.equals(lizard) && userChoice.equals(spock))
		{
			verb = "poisons";
		}
		else if (computerChoice.equals(spock) && userChoice.equals(scissors))
		{
			verb = "smashes";
		}
		else if (computerChoice.equals(spock) && userChoice.equals(rock))
		{
			verb = "vaporizes";
		}
		
		//This capitalizes the computer's choice and then,
		//prints the statement telling the player what happened. i.e.: "Lizard eats paper."
		computerChoiceFirstLetterRaw = computerChoice.substring(0,1);
		computerChoiceFirstLetter = computerChoiceFirstLetterRaw.toUpperCase();
		computerChoice = computerChoice.substring(1);
		
		if (winLossTie.equals("loss"))
		{
			System.out.println(computerChoiceFirstLetter + computerChoice + " " + verb + " " + userChoice + ".");
		}
		
		if (winLossTie.equals("win"))
		{
			userScore = userScore + 1 ;
			System.out.println("Congratulations! You win a point.");
		}
		else if (winLossTie.equals("loss"))
		{
			computerScore = computerScore + 1;
			System.out.println("You lost against the computer player.");
		}
		
		System.out.println();
		
		
		//Round 3
		//Again, the code to determine the user choice.
		System.out.println("Round 3");
		System.out.println("Which gesture would you like to choose . . .");
		System.out.println("	1) rock");
		System.out.println("	2) paper");
		System.out.println("	3) scissors");
		System.out.println("	4) lizard");
		System.out.println("	5) spock");
		System.out.print("Please enter your choice (1-5): ");
		
		userInputRaw = keyboard.next();
		userInputSubstring = userInputRaw.substring(0,1);
		
		if (userInputSubstring.equals("1"))
		{
			userInput = 1;
		}
		else if (userInputSubstring.equals("2"))
		{
			userInput = 2;
		}
		else if (userInputSubstring.equals("3"))
		{
			userInput = 3;
		}
		else if (userInputSubstring.equals("4"))
		{
			userInput = 4;
		}
		else if (userInputSubstring.equals("5"))
		{
			userInput = 5;
		}
		
		//Validity check on the user's input.
		if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5)
		{
			
		}
		else
		{
			System.out.println();
			System.out.println("The input you entered is invalid.");
			System.out.println();
			System.out.println("Which gesture would you like to choose . . .");
			System.out.println("	1) rock");
			System.out.println("	2) paper");
			System.out.println("	3) scissors");
			System.out.println("	4) lizard");
			System.out.println("	5) spock");
			System.out.print("Please enter your choice (1-5): ");
			
			userInputRaw = keyboard.next();
			userInputSubstring = userInputRaw.substring(0,1);
			
			if (userInputSubstring.equals("1"))
			{
				userInput = 1;
			}
			else if (userInputSubstring.equals("2"))
			{
				userInput = 2;
			}
			else if (userInputSubstring.equals("3"))
			{
				userInput = 3;
			}
			else if (userInputSubstring.equals("4"))
			{
				userInput = 4;
			}
			else if (userInputSubstring.equals("5"))
			{
				userInput = 5;
			}
			
			if (userInput == 1 || userInput == 2 || userInput == 3 || userInput == 4 || userInput == 5)
			{
				
			}
			else
			{
				System.out.println("You entered too many invalid inputs.");
				System.out.print("Goodbye!");
				System.exit(0);	
			}
		}
		
		if (userInput == 1)
		{
			userChoice = "rock";
		}
		else if (userInput == 2)
		{
			userChoice = "paper";
		}
		else if (userInput == 3)
		{
			userChoice = "scissors";
		}
		else if (userInput == 4)
		{
			userChoice = "lizard";
		}
		else if (userInput == 5)
		{
			userChoice = "spock";
		}
		
		//This code below pulls in the computer's choice.
		computerChoice = RockPaperScissorsLizardSpockComputerPlayer.getChoice();
		System.out.println();
		System.out.println("The computer player chooses " + computerChoice + ".");
		
		//Now the code to determine the winner of Round 3.
		if (userChoice.equals(rock) && computerChoice.equals(rock))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(paper) && computerChoice.equals(paper))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(scissors) && computerChoice.equals(scissors))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(lizard) && computerChoice.equals(lizard))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else if (userChoice.equals(spock) && computerChoice.equals(spock))
		{
			winLossTie = "tie";
			System.out.println("You tied with the computer.");
			System.out.println("No points awarded.");
		}
		else
		{
		
		//If there is no tie, then the following code compares to decide the victor.
			if (userChoice.equals(rock) && computerChoice.equals(scissors))
			{
				winLossTie = "win";
				System.out.println("Rock crushes scissors.");
			}
			else if (userChoice.equals(rock) && computerChoice.equals(lizard))
			{
				winLossTie = "win";
				System.out.println("Rock crushes lizard.");
			}
			else if (userChoice.equals(paper) && computerChoice.equals(rock))
			{
				winLossTie = "win";
				System.out.println("Paper covers rock.");
			}
			else if (userChoice.equals(paper) && computerChoice.equals(spock))
			{
				winLossTie = "win";
				System.out.println("Paper disproves spock.");
			}
			else if (userChoice.equals(scissors) && computerChoice.equals(lizard))
			{
				winLossTie = "win";
				System.out.println("Scissors decapitates lizard.");
			}
			else if (userChoice.equals(scissors) && computerChoice.equals(paper))
			{
				winLossTie = "win";
				System.out.println("Scissors cuts paper.");
			}
			else if (userChoice.equals(lizard) && computerChoice.equals(paper))
			{
				winLossTie = "win";
				System.out.println("Lizard eats paper.");
			}
			else if (userChoice.equals(lizard) && computerChoice.equals(spock))
			{
				winLossTie = "win";
				System.out.println("Lizard poisons spock.");
			}
			else if (userChoice.equals(spock) && computerChoice.equals(scissors))
			{
				winLossTie = "win";
				System.out.println("Spock smashes scissors.");
			}
			else if (userChoice.equals(spock) && computerChoice.equals(rock))
			{
				winLossTie = "win";
				System.out.println("Spock vaporizes rock.");
			}
			else
			{
				winLossTie = "loss";
			}
		}
		
		if (computerChoice.equals(rock) && userChoice.equals(scissors))
		{
			verb = "crushes";
		}
		else if (computerChoice.equals(rock) && userChoice.equals(lizard))
		{
			verb = "crushes";
		}
		else if (computerChoice.equals(paper) && userChoice.equals(spock))
		{
			verb = "disproves";
		}
		else if (computerChoice.equals(paper) && userChoice.equals(rock))
		{
			verb = "covers";
		}
		else if (computerChoice.equals(scissors) && userChoice.equals(paper))
		{
			verb = "cuts";
		}
		else if (computerChoice.equals(scissors) && userChoice.equals(lizard))
		{
			verb = "decapitates";
		}
		else if (computerChoice.equals(lizard) && userChoice.equals(paper))
		{
			verb = "eats";
		}
		else if (computerChoice.equals(lizard) && userChoice.equals(spock))
		{
			verb = "poisons";
		}
		else if (computerChoice.equals(spock) && userChoice.equals(scissors))
		{
			verb = "smashes";
		}
		else if (computerChoice.equals(spock) && userChoice.equals(rock))
		{
			verb = "vaporizes";
		}
		
		//This capitalizes the computer's choice.
		computerChoiceFirstLetterRaw = computerChoice.substring(0,1);
		computerChoiceFirstLetter = computerChoiceFirstLetterRaw.toUpperCase();
		computerChoice = computerChoice.substring(1);
		
		if (winLossTie.equals("loss"))
		{
			System.out.println(computerChoiceFirstLetter + computerChoice + " " + verb + " " + userChoice + ".");
		}
		
		
		if (winLossTie.equals("win"))
		{
			userScore = userScore + 1 ;
			System.out.println("Congratulations! You win a point.");
		}
		else if (winLossTie.equals("loss"))
		{
			computerScore = computerScore + 1;
			System.out.println("You lost against the computer player.");
		}
		
		System.out.println();
		
		
		//The three rounds are over. The following code will tell the user the results of the entire game.
		System.out.println("Game Over");
		System.out.println("Your final score is " + userScore + ".");
		System.out.println("The computer player's final score is " + computerScore + ".");
		
		if (userScore == 0 && computerScore == 0)
		{
			System.out.println("Stalemate, there is no winner.");
		}
		else
		{
			if (userScore > computerScore)
			{
				System.out.println("Congratulations! You won against the computer player.");
			}
			else
			{
				System.out.println("You lost against the computer player.");
			}
		}
		
		System.out.print("Goodbye!");
		System.exit(0);
		
	}
	
}