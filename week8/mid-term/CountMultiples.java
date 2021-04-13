import java.util.*;

public class CountMultiples {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("This is the CountMultiples problem.\n");

        System.out.print("What number to count multiples of? ");
        int factor = sc.nextInt();

        // add statements in the appropriate places
        // below to count how many randomly generated
        // values are evenly divisible by factor
        // and display how many when the loop finishes
        int count = 0;
        int valuesToGenerate = 100;
        for (int i = 0; i < valuesToGenerate; i++) {
            int randomValue = rand.nextInt(1000);
            if (randomValue % factor == 0) {
                count = count + 1;
            }
        }
        System.out.println(count + " of the " + valuesToGenerate + " values were divisible by " + factor);
    }
}
