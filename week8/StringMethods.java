import java.util.*;
import java.util.Random;
public class StringMethods {
  public static Random rand = new Random();
  public static String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
  public static void main(String[] args){

    String let1 = getLetter();
    String let2 = getLetter();
    String let3 = getLetter();
    String let4 = getLetter();
    System.out.println(let1+let2+let3+let4);
    
    //TODO #1 -  use the getLetter  function to construct a 4 letter word
  }// end of main

  //Create Funtion/Methods here

  public static String getLetter(){
    return  letters[rand.nextInt(letters.length)];
  }
  
}//end of class
