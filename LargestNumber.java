import java.util.Scanner;
import java.util.ArrayList;

public class LargestNumber {
 static int[] array ={9,4,2,8,3,3,0,7,8,5};
    public static void main(String[] args) {
        Integer max = Integer.MIN_VALUE;
       for(int i=0;i<array.length;i++){
          if(array[i]>max){
              max =array[i];
          }
       }
       System.out.println("the maximum element is: "+max);
    }
}
