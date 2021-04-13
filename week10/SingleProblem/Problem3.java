/*
 * Write a function countLinesInFile that
 * will return the number of lines in a file
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Problem3 {
    
    /* do not modify the main function */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Supply the name of a text file");
            System.exit(0);
        }
        String filename = args[0];
        int numLines = countLinesInFile(filename);
        System.out.printf("There are %d lines in the file '%s'\n",
                          numLines,filename);
    } /* main ends here */
    
    static int countLinesInFile(String filename){
        int count = 0;
        try (Scanner sc = new Scanner(new File(filename))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                count = count + 1;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return count;
    }
}