import java.util.*;
import java.io.*; // additional import needed for file operations

public class FileWriter {
    /*
     * A function that performs file operations needs additional information
     * about what to do when the file operation fails for some reason.
     * 
     * One way is to add a "throws clause" to the function header
     * as shown below. Note that the throws clause goes between
     * the parameter list and the open brace.
     */ 
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\nThis program demonstrates the use of the PrintWriter class\n");
        
        Scanner keyb = new Scanner(System.in);
        System.out.print("Enter a filename to use: ");
        String outFileName = keyb.nextLine();
        
        /*
         * open a file for output (saving) by creating a
         * PrintWriter object, as shown below. Note that the
         * filename is used to create the PrintWriter object.
         */
        PrintWriter pw = new PrintWriter(outFileName);
        
        /*
         * The PrintWriter object has the same methods
         * as System.out, so those can be used to save
         * things to the file, as shown below.
         */
        
        // writing literal information:
        pw.println("This saves to the file"); 
        
        // int a = 5;
        // int b = 7;
        // int sum = a + b;
        //writing a mix of literals and variables:
        // pw.println("the sum of " + a + " + " + b + " is " + sum);
        // 
        // double x = 2349.309834;
        //writing formated output:
        // pw.printf("the value of x is %,.2f\n",x);
        System.out.println("How many lines do you want?");
        int line = keyb.nextInt();
        
        System.out.println("\nType anything, then press <ENTER>:");
        for(int i = 0; i<line;i++){
            System.out.print("==> ");
            String userLineOfInput = keyb.nextLine();
            // writing user input:
            pw.println(userLineOfInput);
        }
        // MUST CLOSE THE FILE BEFORE ENDING THE PROGRAM
        pw.close(); // remember to do this
        
        System.out.println("\nThat's all");
        keyb.close();
    }
}