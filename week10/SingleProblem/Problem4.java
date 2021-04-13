/*
 * This is a two-part problem:
 * (a) Write a function countChars that accepts a string and
 * a character and returns the number of times the character
 * occurs in the string. Examples of calls to this function are:
 *     int countOf_Ms = countChars("mammal",'m');
 *     int countOf_Rs = countChars("corroborator",'r');
 *
 * (b) Use the countChars function from part (a) to write a
 * function findHighestEs that accepts a String[] and returns the
 * highest number of the letter 'e' in any single word.
 * An example of a call to this function is:
 *     String[] terms = {"spaghetti" , "beekeeper" , "almond" , "beets"};
 *     int highestEs = findHighestEs(terms);
 *     System.out.printf("Most 'e's in one word is %d\n",highestEs);
 */

public class Problem4 {
    
  /* do not modify the main function */
  public static void main(String[] args) {
      // call statements for part (a)
      int countOf_Ms = countChars("mammal",'m');
      int countOf_Rs = countChars("corroborator",'r');
      System.out.println("countOf_Ms: " + countOf_Ms);
      System.out.println("countOf_Rs: " + countOf_Rs);
      
      // call statements for part (b)
      String[] terms = {"spaghetti" , "beekeeper" , "almond" , "beets"};
      int highestEs = findHighestEs(terms);
      System.out.printf("Most 'e's in one word is %d\n",highestEs);
  } /* main ends here */
  
  static int findHighestEs(String[] terms){
      int numE = 0;
      for(int i =0; i<terms.length;i++){
          int tE = countChars(terms[i],'e');
          if(tE>numE){
              numE = tE;
          }
      }
      return numE;
      
  }
  
  static int countChars(String line,char c){
      int count = 0;
      for(int i =0 ;i<line.length();i++){
          if(line.charAt(i)==c){
              count++;
          }
      }
      return count;
  }
}
