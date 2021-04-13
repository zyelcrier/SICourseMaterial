import java.util.*;
public class ConditionalStatements{
  public static void main(String[] args){
    Scanner keyb = new Scanner(System.in);
    //1. Ask the user to enter a password. Check if the password is "secret";. If it is, print "Welcome".
    System.out.print("Enter a password:");
    String pass = keyb.nextLine();

    if(pass.equals("secret")){
      System.out.println("Welcome");
    }

    //TODO: #1 -Make your own scanner object for the rest of the work sheet
    
    //TODO: #2 -Ask the user to enter a password. Check if the password is "secret";. If it is, print "Welcome".
    //If not, print "Access denied.";
    
    //3. Ask for the user's password. If it is "Xavier", print "Welcome!"; if not, print "Access denied".
    System.out.print("\nEnter a password:");
    pass = keyb.nextLine();

    if(pass.equals("Xavier")){
      System.out.println("Welcome!");
    }else{
      System.out.println("Access denied");
    }

    //TODO: #4 - Ask for the user's school. If it is "Xavier", print "Leave Ready!"

    //TODO: #5 - Ask for the user's school. If it is "Xavier", print "Welcome Home!"; and then "Leave Ready!" on
    //the next line.

    //TODO: #6 - Ask for the user's year of birth.  If the user is turning 21 this year,
    // print "Congratulations on turning 21 this year.  Have a beer."  

    //. Ask for an integer.  If it is even, print "even".  If odd, print "odd".


    //TODO: #7 - Ask for three integers.  Print "Even Sum:" followed by the sum of the even integers.  
    //Then print "Odd Sum:" followed by the sum of the odd integers.



    ///***NESTED CONDITIONS***///

    //8a. Ask for the user's name.  If it is George, ask "Were you named after George Boole?"  If the //user says "yes", say "Awesome!"
    System.out.print("\nEnter user name");
    String name = keyb.nextLine();

    if(name.equals("George")){
      System.out.print("\nWere you named after George Boole?");
      String yn = keyb.nextLine();
      if(yn.equals("yes")){
        System.out.println("Awseome!");
      }
    }

    //TODO: #8b - Ask for the user's name.  If it is George, ask "Were you named after George Boole?
    //If the user says "yes", say "Awesome!"  If the user says "no", ask "Do you know who he is?"  If //the user says "yes", say "Awesome!"

    //9.5c  Ask the user if they want to learn to program.  If the answer is "yes", print "Awesome!  
    //You will."  If the answer is "no", print "Sorry, you're going to learn anyway."  If the answer is 
    //anything else, print "Sorry, I can't understand that."
    System.out.print("\nDo you want to program?(yes/no) ");
    String response = keyb.nextLine();
    if(response.equals("yes")){
      System.out.println("Awesome!");
    }else if(response.equals("no")){
      System.out.println("Sorry, you're going to learn anyway.");
    }else{
      System.out.println("Sorry, I can't understand that.");
    }

    //TODO: #9.5d -Ask the user if they want to learn to program.
    //If the answer is "yes", print "Awesome!  You will."
    //If the answer is "no", print "Sorry, you're going to learn anyway."
    //If the answer is "maybe", print "You'll be saying yes by the end."
    //If the answer is anything else, print "Sorry, I can't understand that."

    ///****INEQUALITIES****///
    
    //TODO: #10 - A ticket to the Xula Opera is $5 for children under 12 and $10 for all others.  Ask for the 
    //user's age and print "Ticket Price: [price]"

    //TODO: #11 - Ask the user how many units they are taking.  If the number is more than 15, print 
    //"That's more than a full load!"

    //TODO: #13a. Ask for the scores for the home and visiting teams.  If the home team had the higher 
    //score, print "Home team won".

    //TODO: #13b -  Ask for the scores for the home and visiting teams.  Print a message corresponding to 
    //the outcome of the game: "Home team won" if the home team had the higher score, "Visiting 
    //team won" if the visiting team had the higher score, or "Tie" if the scores were the same.

    //TODO: #13c - Ask for the scores for the home and visiting teams.  Print a message corresponding to 
    //the outcome of the game: "Home team won by [margin] points" if the home team had the 
    //higher score, "Visiting team won by [margin] points" if the visiting team had the higher score, //or "Tie" if the scores were the same, where [margin] refers to the difference in points.

    //TODO: #14. Ask for the temperature.  Print clothing advice according to the following guidelines:
    //60 <= temperature < 70: "Wear long sleeves."
    //temperature < 50: "Wear a coat."
    //70 <= temperature: "Wear short sleeves."
    //50 <= temperature < 60: "Wear a sweater."

    //TODO: #15a - Ask for the user's age.  If it is at least 21, print "Have a beer."


    //TODO: #16a -The Xula Buffet costs $10 for seniors at least 65, $13 for ages 13-64, and $8 for children 
    //under 13.  Ask for the user's age and print the buffet price.

    //TODO: #16b - The Xula Buffet costs $10 for seniors at least 65, $13 for ages 13-64, and the customer's 
    //age in dollars for customers under 13.  Ask for the user's age and print the buffet price.

    //TODO: #17 -  A car can fit five people.  Ask the user for the number of people and print "Fits" if they 
    //fit in the car and "Don't fit" if they don't.



  }
}