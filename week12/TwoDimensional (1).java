import java.util.*;

public class TwoDimensional{
    static  Scanner keyb = new Scanner(System.in);
    public static void main(String[] args){
      // Array of size 3x3 to hold integers.
      //Constructed a two dimensional array with values
      int[][] values = new int[3][2];
        
      //To populate the two dimensional array it is the same as an array
      //dataType[Position1Index][Position2Index] = someValueOfdataType
      /*
       *      0     1.  
       * 0 [0][0] [0][1]
       * 1 [1][0] [1][1]
       * 2 [2][0] [2][1]
       */
      //for data entry we have a couple of strategies
      // we could go location by location ie...
      values[0][0] = 45;
      values[0][1] = 65;
      values[1][0] = 20;
      values[1][1] = 30;
      values[2][0] = 5;
      values[2][1] = 15;
        
      //We can also loop through to populate the 2 dimensional array
      for(int row = 0; row < values.length; row++){
          for(int col = 0; col < values[row].length; col++){
              System.out.printf("\nThe curent value in values at [%d][%d]: %d Would you like to change it?(Y)es (N)o"
                                ,row,col,values[row][col]);
             //TODO #1 get the user choice. If the user says yes 
             //get the new value from the users  and set it as the value for the current location
             
          }
      }
      System.out.println(); 
      // To print we must utilize the nested loop again
      // Nested loops to print the array in tabular form.
      for (int row = 0; row < values.length; row++)
      {
         for (int col = 0; col < values[row].length; col++)
         {
            System.out.printf("[%d][%d]: %d\t",row,col,values[row][col]);
         }

         System.out.println();    // Print new line.
      }
        
        
      //Houses in the suburbs
      //TODO - make an array of  6 elements unique street names
      
      //TODO - Create a 2 dimensional Array which has 6 streets  
      //on each street there are 5 houses. Think ho many rows how many collumns?
      //the datatype will be booleans to tell us if someone is living in a house or not. 
      //true if someone is there false if not.
        
        
      //TODO1 - Lets go through and populate the array and ask  
      //for each house if it is vacant or has residence
      //if it has residence put true in the current location else put false
        
      
      //TODO - Go through the 2 dimmensinal array and print all values like a table like lines 40-48
      
      
      //TODO - Go through the 2 dimmensinal array and print only the houses 
      //that have residents
      //print int the following 
      //format: there are tennants on {streetName} at house {houseNumber}
        
      //TODO - loop through the 2D boolean array calculate the max distance between two houses
      // and print their location
      
        
      //TODO - Have the user enter in the street where they live.
      //make sure its a contained in the streets array from todo 1
      //create a variable to store the street number
        
      //TODO - utilize the street number variable and find out 
      //where there closest neighbor is
      
      
      //TODO - create another 2 dimensional array of the same size but for datatype boolean. Loop through the boolean 2d array
      // every time the value is true ask the user if the household that lives there has a pet
      // if yes mark the location true else mark false
        
      //TODO - loop through the residincy array print out all households that have residence
      //check if that house has pets and print a message if they do
      //format: there are tennants on {streetName} at house {houseNumber}
      // if pets add: and they have pets!
        
    }//End of Class
    
}//End of main