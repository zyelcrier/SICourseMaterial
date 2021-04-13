import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Arrays;

public class Food{
    static int FOOD_ITEMS = getFileLength();
    
    public static void main(String[] args){
        String[] foodArray = foodArrayMaker(FOOD_ITEMS);
        //System.out.println(foodArray[0]);
        printArray(foodArray);
        double avgRating = getAvgRating(foodArray);
        System.out.printf("The average rating of all food items is %.2f\n",avgRating);
        
        //TODO Create a function that only prints food items that are above or equal to the average
        
    }
    public static double getAvgRating(String[] array){
        int total = 0;
        for(int i=0; i<array.length;i++){
            String element = array[i];
            String[] parts = element.split(",");
            int rating = Integer.parseInt(parts[1]);
            total = total+rating;
        }
        return (double) total/array.length;
    }
    
    public static void printArray(String[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
    //arrayName[index]
    public static String[] foodArrayMaker(int items){
       String[] result = new String[items];
       int index = 0;
        try(Scanner sc = new Scanner(new File("test1.txt")) ){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                result[index] = line;
                index++;   
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
       return result;
    }
    
    
    static int getFileLength(){
        int count = 0;
        try(Scanner sc = new Scanner(new File("test1.txt"))){
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                count = count +1;
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return count;
    }
}