/**
 * DURING THIS REVIEW LAB WE WILL GO OVER 
 * INTRODUCTION TO CONDITIONALS FOR LABS NEXT WEEK 
 * HOW TO WRITE AND USE CONDITIONALS
 * TO PROBLEM SOLVE  
 * 
 */
public class ConditionalIntro{
  public static void main(String[] args){
    /* Lets start with comparators: All comparators return a boolean value either true or false
    *  < greater than
    *  > less than 
    *  == equal to (this only works for numbers)
    *  FOR STRING COMPARISONS YOU HAVE TO USE  somString.equals("Compare String")
    */
    // Number comparison  Examples
    System.out.println("Number Comparison Examples \n");
      System.out.println("1<6: "+(1>6));
      System.out.println("1<6: "+(1<6));
      System.out.println("2==4: "+(2==4));
      System.out.println("4==4: "+(4==4));

    //TODO -pick any two numbers and compare one greater to the other with the out come being true

    //TODO -pick any two numbers and compare one less than the other with the out come being false

    //TODO -pick any two numbers and compare one equal to the other with the out come being true

    // String comparison Examples
    System.out.println("\nString Comparison Examples \n");
      String hello = "hello";
      System.out.println("Is hello the same as bye: " + hello.equals("bye"));
      System.out.println("Is hello the same as hello: " + hello.equals("hello"));

    //TODO -create a string call it str assign it to any string value you want use the .equals method 
    //and compare you string  to where it ouputs false then compare it to where is output false


    /* USING IF STATEMENTS
    *  Use an if-statement when you must make a choice in your code.
    */
    System.out.println("\nIf Statement Examples \n");
    boolean sushi = true;
    if(sushi==false){
      System.out.println("Boo you dont like sudhi");
    }
    else{
      System.out.println("YAY you have good taste we should go out some time for dinner!");
    }

    //lets do another one using String 
    String iceCream = "vanilla";
    if(iceCream.equals("vanilla")){
      System.out.println("Perfect we have some left for you!");
    }
    else if(iceCream.equals("chocolate")){
      System.out.println("Your plum out of luck");
    }

    //TODO - assign a value to firstName
    String firstName = "";
    int numChars = firstName.length();

    //TODO - if numChars is greater than 4  print firstName  if its less than 4 print {****} use the length of firstName numChars in your if statement
  }
}