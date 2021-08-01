import java.lang.reflect.Array;
import java.util.ArrayList;

public class BasicJava{
    public void oneTo255(){
        System.out.println("------1 To 255-------");
        for(int i = 0; i <= 255; i++ ){
            System.out.println(i);
        }
        System.out.println("------End-------");
    }

    public void oneTo255Odd(){
        System.out.println("------1 To 255 Odd-------");
        for(int i = 0; i <= 255; i++ ){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("------End-------");
    }

    public int sumTo255(){
        int sum = 0;

        System.out.println("------sum To 255 -------");
        for(int i = 0; i <= 255; i++ ){
            sum += i;
        }

        return sum;
    }

    public void arrayIterate(){
        int[] arr = {1,3,5,7,9,13};

        System.out.println("------arrayIterate -------");
        for(int i = 0; i < arr.length; i++ ){
            System.out.println(arr[i]);
        }   
        System.out.println("------End-------");
    }

    public void printMaxValue(int[] arr){
        int max = arr[0];

        System.out.println("------printMaxValue-------");
        for(int i = 0; i < arr.length; i++ ){
           if(max < arr[i]){
               max = arr[i];
           }
        }   
        System.out.println("Max number: " + max);
        System.out.println("------End-------");
        
    }

    public void oddArray(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("------oddArray-------");
        for(int i = 0; i <= 255; i++ ){
            arr.add(i);
        }   
        System.out.println(arr);
        System.out.println("------End-------");    
    }
}