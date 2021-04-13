import java.util.Random;

public class RollTwoDice {
    public static void main(String[] args) {
        
        Random rand = new Random();
        int roll1 = rand.nextInt(6);
        int roll2 = rand.nextInt(6);
        
        if (roll1 == roll2) {
            System.out.println("Double " + roll1 + "!");
        } else {
            System.out.println("You rolled " + roll1 + " and " + roll2 + ", that's " + (roll1 + roll2) + ".");
        }
    }
}