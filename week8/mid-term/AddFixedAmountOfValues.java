import java.util.*;

public class AddFixedAmountOfValues {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This is the AddFixedAmountOfValues problem.\n");

        System.out.print("How many values are you adding up? ");
        int numberOfValues = sc.nextInt();

        // add statements so the user can enter the number
        // of values entered, add them all up, and display
        // the total after all the values have been entered
        int sum = 0;
        for (int i = 1; i <= numberOfValues; i = i + 1) {
            System.out.printf("Enter #%d: ", i);
            sum = sum + sc.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
