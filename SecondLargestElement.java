import java.util.Scanner;
import java.util.ArrayList;

public class SecondLargestElement {
    static int[] array ={9,4,2,8,3,3,0,7,8,5};
    public static void main(String[] args) {
        Integer max1 = Integer.MIN_VALUE;
        Integer max2 = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max1){
                max2 = max1;
                max1 =array[i];
            }
            else{
                if(array[i]>max2){
                    max2=array[i];
                }
            }

        }
        System.out.println("the maximum element is: "+max2);
    }
}
