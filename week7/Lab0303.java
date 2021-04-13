import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class Lab0303 {

    static Random rand = new Random();

    public static final String[][] courses = new String[][]{
        {"ENGL", "2080", "Explorations", "Creative", "3"},
        {"XCOR", "3010", "Engagements", "Mission", "3"},
        {"STAT", "2010", "Foundations", "Quantitative", "3"},
        {"PHIL", "1040", "Explorations", "Life", "3"},
        {"HIST", "1400", "Explorations", "Past", "3"},
        {"PSCI", "3360", "Explorations", "Behavior", "3"},
        {"THEO", "2002", "Explorations", "Faith", "3"},
        {"AADS", "3025", "Explorations", "Heritage", "3"},
        {"WMST", "2125", "Explorations", "Creative", "3"},
        {"MATH", "1070", "Foundations", "Quantitative", "4"},
        {"XCOR", "1012", "Foundations", "New Orleans", "3"},
        {"CHEM", "1005", "Explorations", "Science", "3"},
        {"HIST", "1041H", "Explorations", "Past", "3"},
        {"XCOR", "1011", "Foundations", "Xavier", "3"},
        {"ART", "1090", "Explorations", "Creative", "3"},
        {"XCOR", "1000", "Foundations", "College", "1"},
        {"CRWT", "1050", "Explorations", "Creative", "3"},
        {"XCOR", "3020", "Engagements", "Global", "3"},
        {"MATH", "1030", "Foundations", "Quantitative", "4"},
        {"ENGL", "3666", "Explorations", "Creative", "3"},
        {"THEO", "2001", "Explorations", "Faith", "3"}
    };

    public static int NUM_COURSES = courses.length;

    public static void main(String[] args) {

        System.out.println("\n\n==========  Hello, Lab0303!  ==========\n");

        // For this lab, assume every course has a subject, a course number, a stage,
        // an area, and credit hours.  All these values are Strings except credit
        // hours is an integer.
        //

        System.out.printf("\nWe have exactly %d courses.\n", NUM_COURSES);

        // Here's how to get the 5th course in the list
        String crseSubject = getSubject(5);  // "HIST"
        String crseNumber = getNumber(5);  // "1400"
        String crseStage = getStage(5);
        String crseArea = getArea(5);
        int crseHours = getHours(5);
        System.out.println("\nThe fifth course:");
        System.out.println("\tSubject is " + crseSubject);
        System.out.print("\tNumber is " + crseNumber + "\n");
        System.out.printf("\tStage is %s\n", crseStage);
        System.out.printf("\tArea is %s\n", crseArea);
        System.out.printf("\tHours are %d\n", crseHours);


        // TODO: #11 (5 points) - Write a for-loop to output the 11th through 19th courses. Precede
        // the course info with the line number.  
        System.out.println("\nThe 11..19 for-loop courses are:");
        for( int i =11; i<=19;i++){
            System.out.printf("\n(%d) %s %s %s %s %d",i, getSubject(i), getNumber(i), getStage(i), getArea(i), getHours(i));
        }


        // TODO: #12 (5 points) - Write a while-loop to output the 11th through 19th courses.
        // Precede the course info with the line number. 
        System.out.println("\nThe 11..19 while-loop courses are:");
        int it = 11;
        while(it<=19){
            System.out.printf("\n(%d) %s %s %s %s %d",it, getSubject(it), getNumber(it), getStage(it), getArea(it), getHours(it));
            it++;
        }


        // TODO: #13 (5 points) - Write a for-loop to output the 19th down to the 11th courses.  Precede the course info with the line number.
        System.out.println("\nThe 19..11 for-loop courses are:");
        for(int x = 19; x>=11;x--){
            System.out.printf("\n(%d) %s %s %s %s %d",x, getSubject(x), getNumber(x), getStage(x), getArea(x), getHours(x));
        }
                   
        // TODO: #14 (5 points) - Write a while-loop to output the 19th down to the 11th courses.
        // Precede the course info with the line number. 
        System.out.println("\nThe 19..11 while-loop courses are:");
        it =19;
        while(it>=11){
            System.out.printf("\n(%d) %s %s %s %s %d",it, getSubject(it), getNumber(it), getStage(it), getArea(it), getHours(it));
            it--;
        }

        // TODO: #15 - (10 points) Using a while-loop, how many courses are in the Foundations
        // stage? 
        it = 1;
        int inF = 0;
        while(it<=NUM_COURSES){
            if((getStage(it)).equals("Foundations")){
                inF++;
            }
            it++;
        }
        System.out.printf("\n\nThe number of courses in foundations stage is %d",inF);

        
        // TODO: #16  (15 points) - Using a while-loop, what is the total credit hours of all
        // Explorations courses that are also Creative? 
        it = 1;
        int totalHours = 0;
        while(it<=NUM_COURSES){
            if((getStage(it)).equals("Explorations")&& (getArea(it)).equals("Creative")){
                totalHours += getHours(it); // totalhours = totalhours + getHours(it)
            }
            it++;
        } 
        System.out.printf("\n\nThe number of credit hours in Exploration stage that is also creative is %d", totalHours);     


        // TODO: #17 (15 points) - Using a while-loop, output the Creative courses that are
        // different than ART and different than ENGL courses.  
        it = 1;
        while(it<=NUM_COURSES){
             if(!(getSubject(it)).equals("ENGL") && !(getSubject(it)).equals("ART") && (getArea(it)).equals("Creative")){
                System.out.printf("\n(%d) %s %s %s %s %d",it, getSubject(it), getNumber(it), getStage(it), getArea(it), getHours(it));
            }
            it++;
        } 


        // TODO: #18 (15 points) - Using a while-loop, output the total hours of Creative courses
        // that are different than ART and different than ENGL courses. 
        it = 1;
        totalHours = 0;
        while(it<=NUM_COURSES){
             if(!(getSubject(it)).equals("ENGL") && !(getSubject(it)).equals("ART") && (getArea(it)).equals("Creative")){
                totalHours +=  getHours(it);
            }
            it++;
        } 
        System.out.printf("\n\nThe number of credit hours for courses that are not ART and not English that are also creative is %d", totalHours);     

        // TODO: #19 (25 points) - Using a while-loop, randomly select 111 courses and output "XCOR
        // 1000 found at iteration {iteration}" if your program randomly finds an XCOR 1000 course.
        // For example, if XCOR 1000 is found at the 11th iteration of the loop, then your program
        // should output "XCOR 1000 found at iteration 11". 
        Random rand = new Random();
        System.out.println("\nWhat iteration(s) were XCOR 1000 found:");
        it = 0;
        while(it<=111){
            int c =  rand. nextInt(NUM_COURSES)+1;
             if((getSubject(c)).equals("XCOR") && (getNumber(c)).equals("1000")){
                    System.out.printf("\nXCOR 1000 found at %d",it);
             }
             it++;
        }
        

        // TODO: Bonus #21 (+3) - Programmatically, select random courses and output them until the
        // sum of the courses is at least 12, a full-time schedule.  Output the total hours in the
        // schedule once the >= 12 hours in courses are selected.
        System.out.println("\nWhat is your full-time schedule:");
        int sumC =0;
        while(!(sumC>=12)){ //sumC<12
            int c =  rand. nextInt(NUM_COURSES)+1;
            System.out.printf("\n%s %s %s %s %d", getSubject(c), getNumber(c), getStage(c), getArea(c), getHours(c));
            sumC+= getHours(c);
        }



        // To determine if a String is a sequence of characters within another String (a substring),
        // use str1.contains("another string").
        String school = "Xavier University of Louisiana";
        if (school.contains("si") && school.contains("y of L")) {
            System.out.println("\n'si' and 'y of L' are substrings in '" + school + "'");
        }

        
        // TODO: Bonus #22 (+3) - Programmatically, randomly select courses until 3 XCOR courses are
        // selected.  Every time you find an XCOR course, output it.  Note that some of the selected
        // XCOR courses may be duplicates.
        int xcF = 0;
        while(xcF!=3){
            int c =  rand. nextInt(NUM_COURSES)+1;
            if( (getSubject(c).equals("XCOR"))){
                System.out.printf("\n%s %s %s %s %d", getSubject(c), getNumber(c), getStage(c), getArea(c), getHours(c));
                xcF++;
            }
        }
        
 
        // TODO: ZLAB #1 (+5) - Randomly select courses until your program finds both an XCOR 3010
        // course and an XCOR 3020 course, IN THAT ORDER.  Output the iteration when XCOR 3010 was
        // selected and the iteration when XCOR 3020 was selected.
        int it1 = 0;
        boolean found1 = false;
        while(!found1){
            int c =  rand. nextInt(NUM_COURSES)+1;
            if( (getSubject(c).equals("XCOR")) && (getNumber(c)).equals("3010")){
                found1 = true;
            }
            it1++;
        }
        int  it2 = it1;
        found1 = false;
        while(!found1){
            int c =  rand. nextInt(NUM_COURSES)+1;
            if( (getSubject(c).equals("XCOR")) && (getNumber(c)).equals("3020")){
                found1 = true;
            }
            it2++;
        }
        System.out.printf("\nXCOR 3010 was found at iteration %d and XCOR 3020 was found at iteration %d\n",it1,it2);
        

        // TODO: ZLAB #2 (+5) - Programmatically, randomly select 3 courses.  Those are the courses
        // that make up a student's schedule.  Because these courses are randomly selected, it's
        // possible to have duplicates.  Regardless, the student decides to take one other course.
        // Randomly select this 4th course but this time, no duplicate course can be selected.
        // Output the 4 courses.
        
        int c1 = rand. nextInt(NUM_COURSES)+1;;
        String n1 = getNumber(c1);
        System.out.printf("\n %s %s %s %s %d", getSubject(c1), getNumber(c1), getStage(c1), getArea(c1), getHours(c1));

        int c2 = rand. nextInt(NUM_COURSES)+1;
        String n2 = getNumber(c2);
        System.out.printf("\n %s %s %s %s %d", getSubject(c2), getNumber(c2), getStage(c2), getArea(c2), getHours(c2));
        
        int c3 = rand. nextInt(NUM_COURSES)+1;
        String n3 = getNumber(c3);
        System.out.printf("\n %s %s %s %s %d", getSubject(c3), getNumber(c3), getStage(c3), getArea(c3), getHours(c3));
       
        //This works assuming all courses have unique numbers
        int c4 = rand. nextInt(NUM_COURSES)+1;
        while(getNumber(c4).equals(n1) || getNumber(c4).equals(n2)  || getNumber(c4).equals(n3)){
            c4 = rand. nextInt(NUM_COURSES)+1;
        }
        System.out.printf("\n %s %s %s %s %d", getSubject(c4), getNumber(c4), getStage(c4), getArea(c4), getHours(c4));

        
    }


    // ------------------  Don't edit anything below this line  ------------------//
    // ------------------  Don't edit anything below this line  ------------------//
    // ------------------  Don't edit anything below this line  ------------------//
    

    public static String getSubject(int row) {
        row = row - 1;
        if (row >= 0 && row < NUM_COURSES)
            return courses[row][0];
        return "";
    }

    public static String getNumber(int row) {
        row = row - 1;
        if (row >= 0 && row < NUM_COURSES)
            return courses[row][1];
        return "";
    }

    public static String getStage(int row) {
        row = row - 1;
        if (row >= 0 && row < NUM_COURSES)
            return courses[row][2];
        return "";
    }

    public static String getArea(int row) {
        row = row - 1;
        if (row >= 0 && row < NUM_COURSES)
            return courses[row][3];
        return "";
    }

    public static int getHours(int row) {
        row = row - 1;
        if (row >= 0 && row < NUM_COURSES)
            return Integer.parseInt(courses[row][4]);
        return -1;
    }

}