/*
 * Call and print the value returned from a function you write that
 * accepts an integer for how many values the function reads from
 * the user. The function returns the sum of all values entered.
 */
import java.util.*;

public class Problem1 {
    static Scanner keyb = new Scanner(System.in);
    
    public static void main(String[] args){
       int nums = 6;
        int sum = sumOfValues(nums);
        System.out.printf("Sum of random %d numbers is %d",nums,sum);
    }
    static int sumOfValues(int nums){
        int sum = 0;
        for(int i=0;i<nums;i++){
            System.out.print("\n Enter a number: ");
            int numT = Integer.parseInt(keyb.nextLine());
            sum = sum +numT;
        }
        return sum;
    }
}

