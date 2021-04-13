import java.util.Random;

public class Lab0224 {

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
        {"THEO", "2001", "Explorations", "Faith", "3"},
    };

    public static int NUM_COURSES = courses.length;

    public static void main(String[] args) {

        System.out.println("\n\n==========  Hello, Lab0224!  ==========\n");

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


        // TODO: #11 - Write a loop to output the courses at the 1st through 9th
        // courses.  Precede the course info with the line number.  For example, the
        // fifth line of output should be
        //    (5)  HIST 1400
        System.out.println("\nThe first 9 courses are:");
        for(int i=1; i<=9;i++){
            System.out.printf("\n(%d)  %s  %s",i,getSubject(i),getNumber(i));
        }

        // TODO: #12 - How many courses are in the Foundations stage?
        int count = 0;
        for(int i=1; i<=NUM_COURSES;i++){
            if((getStage(i)).equals("Foundations")){
               count++;
               //count = count +1;
            }
        }
        System.out.printf("\nThere are %d courses in Foundations stage",count);

        
        // TODO: #13 - What is the total credit hours of all Explorations courses
        // that are also Creative?
        int totalCredit = 0;
        for(int i=1; i<=NUM_COURSES;i++){
            if((getStage(i)).equals("Explorations") && (getArea(i)).equals("Creative")){
               totalCredit = totalCredit + getHours(i);
            }
        }
        System.out.printf("\nThe total credit hours of all exploration courses that are creative: %d",totalCredit);


        // TODO: #14 - Output the Creative courses that are different than ART and different than
        // ENGL courses.
        System.out.println("\nCreative courses that are not ART, ENGL:");
        for(int i=1; i<=NUM_COURSES;i++){
            // System.out.printf("\n!(getSubject(i)).equals(\"ART\"): %s (getSubject(i)).equals(\"ENGL\"): %s (getStage(i)).equals(\"Creative\"): %s",
            // !((getSubject(i)).equals("ART")), !((getSubject(i)).equals("ENGL")), ((getArea(i)).equals("Creative"))) ;
            if(!((getSubject(i)).equals("ART")) && !((getSubject(i)).equals("ENGL")) && ((getArea(i)).equals("Creative"))){
               System.out.printf("(%d)  %s  %s",i,getSubject(i),getNumber(i));
            }
        }

        // TODO: #16 - Output the total hours of Creative courses that are different than ART and
        // different than ENGL courses.
        totalCredit = 0;
        for(int i=1; i<=NUM_COURSES;i++){
            if(!(getSubject(i)).equals("ART") && !(getSubject(i)).equals("ENGL") && (getArea(i)).equals("Creative")){
               totalCredit = totalCredit + getHours(i);
            }
        }
        System.out.printf("\nThe total credit hours of all creative courses that are not art and english: %d",totalCredit);


        // TODO: #16 - Randomly select 111 courses and output "XCOR 1000 found at
        // iteration {iteration}" if your program randomly finds an XCOR 1000 course.
        // For example, if XCOR 1000 is found at the 11th iteration of the loop, then
        // your program should output "XCOR 1000 found at iteration 11".
        System.out.println("\nWhat iteration(s) was XCOR 1000 found:");
        Random rand = new Random();
        for(int i=1;i<=111; i++){
            int cn = rand.nextInt(NUM_COURSES);
            if((getSubject(cn)).equals("XCOR") && (getNumber(cn)).equals("1000")){
                System.out.printf("\n%s %s found at %d itteration of the loop", getSubject(cn), getNumber(cn),i);
            }
        }
        

        // TODO: Bonus #21 (+3) - Programmatically, how many hours in Foundations,
        // in Explorations, and in Engagements?
        int foundationHours = 0;
        int explorationHours = 0;
        int engagementHours = 0;
        for(int i=1;i<NUM_COURSES; i++){
            String curStage = getStage(i);
            if(curStage.equals("Foundations")){
                foundationHours = foundationHours + getHours(i);
            }
            if(curStage.equals("Explorations")){
                explorationHours = explorationHours + getHours(i);
            }
            if(curStage.equals("Engagements")){
                engagementHours = engagementHours + getHours(i);
            }
        }
        System.out.printf("\nFoundations Hours: %d\nExploration Hours:%d\nEngagement Hours:%d\n",foundationHours,explorationHours,engagementHours);


        // TODO: Bonus #22 (+3) - Programmatically, are there more hours in Foundations,
        // in Explorations, or in Engagements?
        if(foundationHours>explorationHours && foundationHours>engagementHours){
            System.out.println("The total Foundations course hours is greater than Exploration and Engaement");
        }
        if(engagementHours>foundationHours && engagementHours>explorationHours){
            System.out.println("The total Engagemant course hours is greater than Exploration and Foundations");
        }
        if(explorationHours>engagementHours && explorationHours>foundationHours){
            System.out.println("The total Exploration course hours is greater than Engagement and Foundations");
        }
    
 
        // TODO: ZLAB #1 (+5) - Randomly select 11 courses and output "XCOR 1012 was found"
        // if your program randomly finds the XCOR 1012 course.  If XCOR 1012 is
        // found more than once, only output "XCOR 1012 was found" once.  If XCOR 1012 was not found
        // then output "XCOR 1012 was NOT found in 11 random courses".
        count = 0;
        for(int i=1;i<=11; i++){
         int cn = rand.nextInt(NUM_COURSES);
         if((getSubject(cn)).equals("XCOR") && (getNumber(cn)).equals("1012")){
            count++;
         }
        }
        
        if(count == 0){
            System.out.println("XCOR 1012 was NOT found in 11 random courses");
        }else{
            System.out.println("XCOR 1012 was found");
        }
        
        

        // TODO: ZLAB #2 (+5) - Randomly select 22 courses and output "Found both XCOR
        // 3010 and XCOR 3020" if both courses are randomly found.  Otherwise output
        // "Both XCOR 3010 and XCOR 3020 were NOT found".  At most, your code should display one
        // line of output. 
        int countX1= 0;
        int countX2 = 0;
        for(int i=1;i<=22; i++){
         int cn = rand.nextInt(NUM_COURSES);
         if((getSubject(cn)).equals("XCOR") && (getNumber(cn)).equals("3010")){
            countX1++;
         }
         if((getSubject(cn)).equals("XCOR") && (getNumber(cn)).equals("3020")){
            countX2++;
         }
        }
        
        if(countX1 == 0 && countX2 == 0){
            System.out.println("Both XCOR 3010 and XCOR 3020 were NOT found");
        }else if(countX1>0 && countX2>0){
            System.out.println("Found both XCOR 3010 and XCOR 3020");
        }
        
        
        
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