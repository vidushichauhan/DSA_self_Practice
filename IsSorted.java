import java.util.Scanner;
import java.util.ArrayList;

public class IsSorted {
    static int[] array ={1,2,3,4};
    public static void main(String[] args) {
        Boolean flag = true;
        for(int i=1;i<array.length;i++){
            if(array[i]<array[i-1]){
                System.out.println("array is not sorted");
                flag = false;
                break;
            }


        }
        if(flag == true)
        { System.out.println("array is sorted");}
    }
}
