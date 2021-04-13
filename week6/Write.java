import java.util.*;
import java.io.*; // additional import needed for file operations

public class Write{
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
        pw.println("THIS MARKS THE FIRST LINE IN MY FILE %s"+ outFileName); 
        
        //System.out.println("How many lines do you want to enter?");
        //cat
        System.out.print("Type anything, then press <ENTER>:\n");
        String userLineOfInput = "";
        do{
            System.out.print("==> ");
            userLineOfInput = keyb.nextLine();
            if(userLineOfInput.equals("STOP")){
                break;
            }
            pw.println(userLineOfInput);
        }while (!userLineOfInput.equals("STOP"));
        // MUST CLOSE THE FILE BEFORE ENDING THE PROGRAM
        pw.close(); // remember to do this
        
        System.out.println("\nThat's all");
        keyb.close();
    }
}