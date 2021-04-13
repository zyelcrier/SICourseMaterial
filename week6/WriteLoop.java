import java.util.*;
import java.io.*; // additional import needed for file operations

public class WriteLoop {
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
        
        System.out.print("How many lines do you want to enter?");
        int lines = keyb.nextInt();
        for(int i=1;i<=lines;i++){
            String userLineOfInput;
            if(i==1){
             System.out.print("Type a line then press <Enter> when your done:");
             userLineOfInput = keyb.nextLine();
            }else{
             System.out.printf("\nLine %d ==>",i);
             userLineOfInput = keyb.nextLine();
            }
            // writing user input:
            pw.println(userLineOfInput);
        }
        // MUST CLOSE THE FILE BEFORE ENDING THE PROGRAM
        pw.close(); // remember to do this
        
        System.out.println("\nThat's all");
        keyb.close();
    }
}