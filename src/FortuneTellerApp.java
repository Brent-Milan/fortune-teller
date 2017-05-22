import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		
		/***********************
		 * PART ONE
		 ***********************/
		Scanner input = new Scanner(System.in);
	
		// User First Name Prompt
		System.out.println("To begin, I will need to know your first name: ");
		String userFirst = input.nextLine();

		// Flavor Text Response to 'User First Name Prompt'
		System.out.println("Yes, " + userFirst + "..." + userFirst.toUpperCase() + "."
				+ "\nA strong name. It speaks to your aura.");

		// User Last Name Prompt
		System.out.println("\nMay I have your last name, please?");
		String userLast = input.nextLine();

		// Flavor Text Response to 'User Last Name Prompt'
		System.out.println(userLast + "." + " That name has history. The stories I could tell...");

		// User Age Prompt
		System.out.println("\nI need your AGE. The spirits are playful today and won't tell me.");
		int userAge = input.nextInt();

		// Flavor Text Response to userAge
		System.out.println("So young. So NEW. At " + userAge + " I had barely cut my teeth.");

		// User Birth Month Prompt
		System.out.println("\nI must know the stars that call you. Riddle me this: "
				+ "\nIf the month in which you were born were a number (1-12), what would it be?");
		int userMonth = input.nextInt();

		//User color prompt + while loop stretch goal
		System.out.println(userMonth + " is an auspicious number. What (ROYGBIV) color is closest to your heart?"
				+ "\n(Type \"Help\" if you need ROYGBIV explained.)");
		
		String userColor = input.next();
				while(userColor.toLowerCase().equals("help")) {
					System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, or Violet, my dear.\nChoose one.");
					userColor = input.next();	
				}

		System.out.println("How many siblings do you have?");
		int userSiblings = input.nextInt();

		System.out.println("I think I have all the information I need, " + userFirst + ".");
		System.out.println("The spirts are talking so fast...\n ");
		
		/*****************************
		 * PART 2 START
		 *****************************/

		/****************************
		 * userAge (Even or Odd)
		 ***************************/
		String retireAge = "1000 years";
		if (userAge % 2 == 0) {
			System.out.println("You will retire soon. Your golden years are within your reach.");
			retireAge = "10 years";
		} else if (userAge % 2 == 1) {
			System.out.println("You will retire many years from now...if you live that long.");
			retireAge = "26 years";
		} else {
			retireAge = "300 years";
		}

		/********************************
		 userSiblings conditions  
		 *********************************/
		String retLocation = "Something is broken";
		if (userSiblings == 0) {
			System.out.println("You will vacation in the heart of the city..");
			retLocation = "New York";
		} else if (userSiblings == 1) {
			System.out.println("California is your true home. You will rest at the foot of the Sun.");
			retLocation = "San Diego";
		} else if (userSiblings == 2) {
			System.out.println("In the quiet of the countryside, you will find ease...");
			retLocation = "Nebraska";		
		} else if (userSiblings == 3) {
			System.out.println("Your bones will rest in the breast of a mountain...");
			retLocation = "Colorado";		
		} else {
			retLocation = "a retirement home nearby";	
		}
	

		/****************************** 
		 * ROYGBIV choice outcomes 
		 *****************************/
		String transport = "x";
		switch(userColor.toLowerCase()){
			case "red":
				transport = "red Ford Leaf";
				break;
			case "orange":
				transport = "burnt orange Vespa";
				break;
			case "yellow":
				transport = "yellow submarine"; 
				break;
			case "green":
				transport = "green lawnmower";
				break;
			case "blue":
				transport = "blue jet";
				break;
			case "indigo":
				transport = "indigo Tesla";
				break;
			case "violet":
				transport = "violet bicycle of the highest caliber";
				break;
			default:
				transport = "worn pair of sneakers";
				break;
		}

		/*********************************************
		 * Birth month range outcomes
		 *********************************************/
		double lifeSavings = 0.09;if(userMonth==1||userMonth==2||userMonth==3||userMonth==4){
			lifeSavings = 150.00;
		}else if(userMonth==5||userMonth==6||userMonth==7||userMonth==8){
			lifeSavings = 10000.00;
		}else if(userMonth==9||userMonth==10||userMonth==11||userMonth==12){
			lifeSavings = 50000.00;
		}else{
			lifeSavings = 0.00;
		}
		
		/***************************
		 * PART 3 START
		 ***************************/
		
		// Summary flavor text wind-up
		System.out.println("\nYour color and your star.....yes, I think I have it. Are you ready to hear your fortune?");
		String irrelevant = input.next();   //user input does not matter. Proceeds to final fortune regardless

		// The final fortune revealed!
		System.out.println("Whether you are prepared or not, I have determined your fate. Hear my decree:\n ");
		System.out.println(userFirst + " " + userLast + " will retire in " + retireAge + " with $" + lifeSavings
				+ " in the bank, a vacation home in " + retLocation + ", and travel by a " + transport + ".");
		
		input.close();

	}   // end of main method
	
	
}

	
	
	

