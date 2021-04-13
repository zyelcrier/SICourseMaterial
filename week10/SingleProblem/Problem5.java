/*
 * Write a function inputValuesToList with no parameters that
 * reads values from the user until a negative value is
 * entered. The function returns an ArrayList<Integer> with]
 * all the values the user entered except the negative one.
 * An example of a call to this function is:
 *     ArrayList<Integer> somePositiveValues = inputValuesToList();
 */
import java.util.*;
import java.util.ArrayList;

public class Problem5 {
    static Scanner keyb = new Scanner(System.in);
    /* do not modify the main function */
    public static void main(String[] args) {
        ArrayList<Integer> somePositiveValues = inputValuesToList();
        System.out.printf("You entered %d values\n",
                          somePositiveValues.size());
    } /* main ends here */
    
    static ArrayList<Integer> inputValuesToList(){
        ArrayList<Integer> posValues = new ArrayList<>();
        System.out.print("\n Enter a number: ");
        int num = Integer.parseInt(keyb.nextLine());
        while(num>0){
            posValues.add(num);
            System.out.print("Enter a number: ");
            num = Integer.parseInt(keyb.nextLine());
        }
        return posValues;
    }
}