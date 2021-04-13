import java.util.*;
public class Example {
  public static void main (String [] args){
    // for( int i=0; i<5;i++){
      // System.out.println(i);
      // System.out.println("hi");
    // }
    Scanner sc = new Scanner(System.in);
    int counter = 0;
    int ct =0;
    for(int i=1; i<=5;i++){
      System.out.printf("Enter num %d: ",i);
      int t = sc.nextInt();
      counter = counter + t;
    }
    System.out.println("Counter: "+ counter);

  }
}
