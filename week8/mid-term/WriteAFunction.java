import java.util.Scanner;

public class WriteAFunction {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This is the WriteAFunction problem.\n");

        System.out.print("What number to divide into? ");
        int div_into = sc.nextInt();

        System.out.print("What number to divide by? ");
        int div_by = sc.nextInt();

        displayIntegerQuotientAndRemainder(div_into,div_by);

    }

    // define a function below that will execute
    // when the call statement in main runs
    public static void displayIntegerQuotientAndRemainder(int div_into, int div_by) {
        System.out.println("Quotient is " + div_into / div_by + " and Remainder is " + div_into % div_by);
    }

}