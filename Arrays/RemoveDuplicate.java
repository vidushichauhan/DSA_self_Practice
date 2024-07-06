import java.util.Scanner;
import java.util.ArrayList;

public class RemoveDuplicate {
    static int[] array ={10,10,10,20,20,20,20,30,30};
    public static void main(String[] args) {
        Integer res = 1;
       for(int i=0;i<array.length;i++){
           if(array[i]!=array[res-1]){
               array[res]=array[i];
               res++;
           }
       }
        for(int i=0;i<res;i++){
            System.out.println(array[i]);
        }
    }
}
