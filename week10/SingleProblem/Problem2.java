/*
 * Call and print the value returned from a function you write that
 * accepts an integer argument and returns a value entered by the
 * user that is between zero and the parameter, inclusive.
 * As long as entered values are outside the range, repeat the
 * prompt and input. The function returns the first value
 * entered that's between zero and the parameter.
 */
import java.util.*;

public class Problem2 {
    static Scanner keyb = new Scanner(System.in);
    public static void main(String[] args){
        int bound = 8;
        int numB = numberBetween(bound);
        System.out.printf("the number %d was between 0 and %d\n",numB,bound);
    }
    
    static int numberBetween(int bound){
        System.out.print("\n Enter a number: ");
        int num = Integer.parseInt(keyb.nextLine());
        while(num<=0 || num>bound){
            System.out.print("Enter a number: ");
            num = Integer.parseInt(keyb.nextLine());
            
        }
        return num;
    }
}