import java.util.Scanner;
import java.util.ArrayList;

public class ReversingArrays {
    static int[] array ={9,4,2,8,3,3,0,7,8,5};
    public static void main(String[] args) {
        Integer l = array.length-1;
        for(int i=0;i<array.length/2;i++){
            Integer temp=array[i];
            array[i]=array[l];
            array[l]=temp;
            l--;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
