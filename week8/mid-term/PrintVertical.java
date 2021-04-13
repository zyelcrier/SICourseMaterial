import java.util.*;

public class PrintVertical {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This is the PrintVertical problem.\n");

        System.out.print("Enter a line: ");
        String entireLine = sc.nextLine();

        // add statements that will print
        // the contents of the entireLine variable
        // one character per line
        for (int i = 0; i < entireLine.length(); i = i + 1) {
            System.out.println(entireLine.charAt(i));
        }

    }
}
