import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Lab0331 {


    public static void main(String[] args) {

        // An ARRAY is a way to store lots of values all accessible from a single variable.
        // The values stored in the array are called ELEMENTS.
        // To access (store or retrieve) a value from the array, use an INDEX.
        //
        //   0    1    2       <-- These are the indexes and they always start at zero.
        // ----------------
        // | 11 | 33 | 22 |    <-- These are the elements, all must be the same data type.
        // ----------------
        
        // We must CREATE an array before we can use it.
        // Let's create an array to store 3 integers.
        int[] numbers = new int[3];

        // Creating an array just reserves memory, we still have to INITIALIZE the array.
        numbers[0] = 11;
        numbers[1] = 33;
        numbers[2] = 22;

        // Now we have a single variable named {numbers} has 3 values.

        // Let's output the array
        System.out.println("\nCan't output the elements of an array this way: " + numbers);

        System.out.println("\nHere are the elements in the {numbers} array:");
        System.out.println("\t Index \t Element");
        for (int index = 0; index < numbers.length; index = index + 1) {  // first index ALWAYS 0
            int element = numbers[index];
            System.out.printf("\t (%d) \t %d\n", index, element);
        }

        System.out.println("\nFancy way to output an array: " + Arrays.toString(numbers));


        // The data in 'courses.txt' has the format
        // ART 1090|Art Appreciation|Explorations|Creative Expression & Engagement|3
        // course,  title,           stage,       area,    and the course's credit hours.


        // Create an array, store the first 5 areas from 'courses.txt', and then output the array.
        String[] areas = new String[5];
        try (Scanner sc = new Scanner(new File("courses.txt"))) {
            for (int index = 0; index < 5; index = index + 1) {
                String line = sc.nextLine();
                String[] parts = line.split("\\|");
                areas[index] = parts[3];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("\nThe areas of the first 5 courses:");
        for (int i = 0; i < 5; i = i + 1) {  // indexes ALWAYS start at 0
            System.out.printf("\t %d \t %s\n", i, areas[i]);
        }



        // TODO: #11 (15 points) - Create an array to store the first 5 titles from 'courses.txt'
        // and then output the array in reverse order.
        String[] titles = new String[5];
        try (Scanner sc = new Scanner(new File("courses.txt"))) {
            for (int index = 0; index < 5; index = index + 1) {
                String line = sc.nextLine();
                String[] parts = line.split("\\|");
                titles[index] = parts[1];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        System.out.println("\nThe titles of the first 5 courses in reverse:");
        for (int i = titles.length-1; i >= 0; i = i - 1) {  // indexes ALWAYS start at 0
            System.out.printf("\t %d \t %s\n", i, titles[i]);
        }



        

        // TODO: #12 (15 points) - Now we have two arrays of length 5, one array holds the areas and
        // the other array holds the titles.  Output a table of this data using the format
        // {index} {tab} {title} {tab} {area}
         // 0  Suvery of British Literature II   Creative Expression & Engamgement
         // 1  Animal and Human Relations   Engaging the Mission
         // 2 
        //  0    titles[0]   
        //                                areas[0]
         System.out.println("\nThe titles of the first 5 courses in reverse:");
        for(int i=0; i<titles.length;i++){
            System.out.printf("\t %d \t %s\t %s\n", i, titles[i],areas[i]);
        }

        // TODO: #21 (35 points) - The user wants to build a {numHours} schedule.  Create a
        // user-defined function that sequentially selects courses from the input file
        // until {numHours} unique courses (no repeat Courses)
        // (with at most 6 courses and no more than 21 hours) are
        // selected.  This function outputs the titles of the schedule in reverse order and also returns the
        // number of titles that were output.
         int numTitles = buildSchedule("courses.txt");
         int numtTitles2 = buildSchedule("courses.txt");
        //array if you havent set an element equal to something its going to be null
        
        

        // TODO: #22 (35 points) - Create a user-defined function that stores in an array, the first
        // {maxNumTitles} course titles that are shorter than {numChars} characters.  The only
        // parameters to this function are the (String) filename, the {maxNumTitles}, and
        // {numChars}. After creating this array, your function should return the (up to)
        // {numTitles} titles.

        

    }

    // WRITE YOUR FUNCTION DEFINITIONS HERE!
    static int buildSchedule(String filename){
        ArrayList<String> courseTitle = new ArrayList<>();
        int totalHours = 0;
        
        try (Scanner sc = new Scanner(new File(filename))) {
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                String[] parts = line.split("\\|");
                int hours = Integer.parparts[4];
                if(courseTitle.size()<6 && totalHours<21){
                    courseTitle[numCourses] = parts[1];
                    numCourses++;
                    totalHours = totalHours + hours;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int i=courseTitle.size()-1; i<=0;i-- ){
             System.out.printf("\t %d \t %s\n", i, courseTitle.get(i));
        }
        
       return courseTitle.size(); 
    }
}