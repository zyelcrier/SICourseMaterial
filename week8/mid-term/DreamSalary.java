import java.util.*;

public class DreamSalary {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This is the Dream Salary problem.\n");

        System.out.print("What's your desired annual salary? ");
        double annualSalary = sc.nextDouble();

        // calculate the equivalent monthly salary
        double monthly = annualSalary / 12;
        
        // and output the result formatted as currency
        System.out.printf("That's $%,.2f\n", monthly);
    }
}
