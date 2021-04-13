import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class pwExample {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("This is the WriteValuesToFile problem.\n");

        System.out.print("What filename to use? ");
        String outFileName = sc.nextLine();

        // add statements in the appropriate places
        // below to output the randomly generated
        // values to the file named by the user
        
        
    try(PrintWriter pw = new PrintWriter(outFileName);){
        //write 3 lines to first file
        writeToFile(pw);
        writeToFile(pw);
        writeToFile(pw);

        pw.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
        //create a new file
        System.out.print("What filename to use must be different? ");
        String outFileName2 = sc.nextLine();
    try( PrintWriter pw2 = new PrintWriter(outFileName2);){
       // PrintWriter pw2 = new PrintWriter(outFileName2);

        //write 3 lines to first file
        writeToFile(pw2);
        writeToFile(pw2);
        writeToFile(pw2);

        pw2.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }

    }
    
    public static void writeToFile(PrintWriter pw){
        System.out.print("Write a line: ");
        String line = sc.nextLine();
        pw.println(line);
    }
}
