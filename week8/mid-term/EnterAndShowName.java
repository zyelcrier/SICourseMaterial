import java.util.Scanner;

public class EnterAndShowName {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name then last name: ");
        String firstname = sc.next();
        String lastname = sc.next();
        
        System.out.println(lastname + "," + firstname);
    }
}