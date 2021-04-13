import java.util.*;
public class ListPrac {
  public static void main(String[]args){
    // String[] stringL = new String[]{"a","b","c","d"};

    // 
    // for(int i=0; i<stringL.length;i++){
      // System.out.printf("\n At Index %d Element is %s",i,stringL[i]);
    // }

    // for( String e : stringL){
        // System.out.printf("\n Element is %s",e);
    // }

     Scanner keyb = new Scanner(System.in);

    // String[] wordList = new String[4];

    // for(int w=0 ; w<wordList.length; w++ ){
      // System.out.print("\nEnter a word: ");
      // String word = keyb.next();
      // wordList[w] = word;
    // }

    //System.out.println(wordList);

    // for( String e : wordList){
      // System.out.printf("\n Element is %s",e);
    // }
 
    int[] money = new int[]{6,7,8000,6000,54,75};

    int max = 0;
    for( int i : money){
        if(i>max){
          max = i;
        }
    }
    System.out.printf("I want this much money right now $%d",max);

    System.out.print("How many elements in the list: ");
    int length = keyb.nextInt();

    int[] userList = new int[length];

    for(int i=0; i<userList.length;i++){
      System.out.print("Enter a number: ");
      int t = keyb.nextInt();
      userList[i] = t;
    }

    for( int i : userList){
      System.out.printf("\n Element is %d",i);   
    }
    
    if()

  }
}
