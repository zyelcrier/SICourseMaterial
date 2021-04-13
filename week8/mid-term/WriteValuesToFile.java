import java.util.Random;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class WriteValuesToFile {

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("This is the WriteValuesToFile problem.\n");

        System.out.print("What filename to use? ");
        String outFileName = sc.nextLine();

        // add statements in the appropriate places
        // below to output the randomly generated
        // values to the file named by the user

        try (PrintWriter pw = new PrintWriter(outFileName)) {
            int valuesToGenerate = 100;
            for (int i = 0; i < valuesToGenerate; i++) {
                int randomValue = rand.nextInt();
                pw.println(randomValue);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
