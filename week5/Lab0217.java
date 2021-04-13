import java.util.Random;

/**
 * Lab0217 is due no later than TODAY (Feb 17th) by 11:50am.
 *
 * This is a review of (nearly) everything covered this semester.
 * You should be able to finish this lab within 50 minutes.
 * 
 * Remember:  Use if-statements when you want to make a choice in code.
 */
public class Lab0217 {

    static final double TUITION = 11_532.50;
    public static void main(String[] args) {
        
        // TODO: #1 - Output a greeting so the user knows your program will randomly
        // choose XCOR courses.  Your greeting must have 3 blank lines before it and
        // 2 blank lines after it.
        System.out.print("\n\n\n This program will randomly choose xcore courses \n\n");


        // TODO: #2 - The only valid XCOR course numbers are 1000, 1011, 1012, 3010,
        // and 3020.  Roll a 5-sided die and output 1000 if the roll is a 0, 1011 if
        // the roll is a 1, 1012 if the roll is a 2, 3010 if the roll is a 3, and
        // 3020 if the roll is a 4.
        Random rand = new Random();
        System.out.print("\nWhat random XCOR course will you take?  ");
        int roll = rand.nextInt(5);

        if(roll==0){
          System.out.print("Xcore 1000");
        } else if(roll==1){
          System.out.print("Xcore 1011");
        }else if(roll==2){
          System.out.print("Xcore 1012");
        }else if(roll==3){
          System.out.print("Xcore 3010");
        }else if(roll==4){
          System.out.print("Xcore 3020");
        }


        // TODO: #3 - Roll the 5-sided die 3325 times and output the number of times
        // the value was 0 (for XCOR 1000).
        System.out.print("\nHow many of 3,325 students took XCOR 1000? ");
        int count = 0;
        for( int i=0; i<3325; i++){
          roll = rand.nextInt(5);
          if(roll==0){
            count = count +1;
          }
        }
        System.out.printf("\n\n%d students who have taken Xcore 1000.",count);
       

        // TODO: #4 - Roll the 5-sided die 3325 times and output the number of times
        // the value was for XCOR 1011 or XCOR 1012.
        System.out.print("\n\nHow many of 3,325 students took XCOR 1011 or 1012? ");
         count = 0;
        for( int i=0; i<3325; i++){
            roll = rand.nextInt(5);
            if(roll==1 || roll==2){
                count = count +1;
         }
        }
        System.out.printf("\n\n%d students who have taken Xcore 1011 and Xcore 1012",count);


        // TODO: #5 - Roll the 5-sided die 3325 times and output the number of times
        // the value was for XCOR 1011 and XCOR 1012.
        count = 0;
        int count2 =0;
        for( int i=0; i<3325; i++){
            roll = rand.nextInt(5);
            if(roll==1){
                count = count +1;
            }else if(roll==2){
                count2 = count2 +1;
            }
        }
        System.out.printf("\n\n%d students have taken Xcore 1011. %d students have taken Xcore 1012",count,count2);



        // TODO: #6 - XULA is giving away up to 1000 tuition waivers.  How?  By
        // rolling an 11-sided die and gifting tuition whenever the roll is a 10.
        // If the die is rolled 3325 times, how many tuition waivers will be gifted?
        // Also, what is the total amount of those gifted tuition waivers?
        
        System.out.print("\n\nHow many of 3,325 students took XCOR 1011 or 1012? ");
        count = 0;
        for( int i=0; i<3325; i++){
             roll = rand.nextInt(11);
            if(roll==10){
                count = count +1;
            }
        }
        System.out.printf("\n\n%d tution waivers  will be gifted to students which is in total about %,d",count,count*40000);

    }
}