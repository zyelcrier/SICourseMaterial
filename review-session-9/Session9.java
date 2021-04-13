import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Session9{
    
    public static void main(String[] args){
         System.out.println("Welcome to more practice with arrays");
        String scentence = "the,best,words,are,separated,by,commas";
        // to get the individual words use the .split() method with a delimeter inside
        String[] words = scentence.split(",");
        
        //To print the first word of scentence
        System.out.println(words[0]);
        
        //TODO #1 - print the fourth word of the scentence
        
        //TODO #2 - get the longest word in scentences
        
        int numOfWordChunks = countWordChunks("fourWordLines.txt");
        String[] wordChunckS = getWordChuncks("fourWordLines.txt",numOfWordChunks);
        
        //TODO #3 - get the first element in wordChunckS save it to a variable {firstWordChunk} and print it
        
        //TODO #4 - now get all the words from firstWordChunk using the .split() method
        
        //TODO #5 - create a method called {getAllWords} that will get all the words from wordChunckS
        // at the end you should have a array called {allWords} with elements that are individual words
        
        //TODO #6 - now create a method that gets a random word from allWords call the function {getWord}
        // Think about the parameter the function will take
        
        //TODO #7 - now create a method that gets a random word from allWords that starts with a specific letter call the function 
        //{getWordWithLetter} 
        
        //TODO #8 - call the getWord function to get a word then  loop over the wordChunckS array until you get the wordChunk 
        //that contains that word and store the string in a variable called {wordChunkFromRandom}
        
        
        //TODO #9 - get the longest word from the previous  todo and build an Array of String with words of the same length from allWords list
        
        //TODO #10 - create a function that gets a random wordChunk from wordChunckS
        
        
        /*
         * lets work with numbers
         * 
         */
        int[] nums = {7,8,4,2,1,4,21,27,3,4,7,3,8,4,9,12,15};
        
        //TODO #11 - create a function that counts how many odd numbers that are in a list
        
        //TODO #12- create a function that counts how many elements it has that are venely divisible by some number
        //int numOfEDiv3 = getNumOfEvenDivElms(nums,3);
        
        //TODO #13 - create a function that check if a certain element is in the list
        // This function will return true if the elment is in the list else it will return false
        
        //boolean is8InNums = checkIfNumsInList(nums,8);
        
        
        //TODO #14 - create a function that returns all odd values in a list 
        // it takes a list and returns a sub-list of the odd values
            
        
     
    }//End of main
    
    /*
     * Create your methods here
     */
    
    
    
    //Do Not Change Methods Here
    public static String[] getWordChuncks(String filename, int lengthOfFile) {
        String[] resultArray = new String[lengthOfFile];
        int index = 0;
        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                resultArray[index] = line;
                index++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return resultArray;
    }
    
    public static int countWordChunks(String filename) {
        int count = 0;

        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                count = count + 1;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return count;
    }

}//End of Class