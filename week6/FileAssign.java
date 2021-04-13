import java.util.*;
import java.io.*;

public class FileAssign{
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("\nWelcome to the Word Processor, v1");
		// creating scanner asking for file name 
	    Scanner sc = new Scanner(System.in);
	    System.out.println("What file name to use? ");
		String outFileName = sc.nextLine();
        
		// opening print writer 
    PrintWriter pw = new PrintWriter(outFileName);
		System.out.println(outFileName);
	
		System.out.println("Type anything you want, press <ENTER> at the end of a line.");
		System.out.println("Finish by entering STOP on a line by itself");	
        System.out.print("==> ");
		String userLineInput = sc.nextLine();
		pw.println(userLineInput);
        
	  pw.close();
	}
}
