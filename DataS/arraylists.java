import java.util.*;
import java.util.Random;

public class arraylists {
  public static void main(String[] args){
    ArrayList<Integer> nums = new ArrayList<>();
    Random r = new Random();

    while(nums.size()!=8){
      int e  = r.nextInt(100);
       nums.add(e);

    }


    for(int num : nums){
      System.out.printf("\n%d",num);

    }

    



  }
}
