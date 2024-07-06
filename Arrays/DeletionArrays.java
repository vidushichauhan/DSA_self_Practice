import java.util.Scanner;
import java.util.ArrayList;

public class DeletionArrays {
    static ArrayList<Integer> array = new ArrayList<>();

    static {
        // Initializing the ArrayList
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to delete:");
        Integer number = sc.nextInt();
        Integer index = null;

        // Find the index of the number to delete
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).equals(number)) {
                index = i;
                break;
            }
        }

        if (index == null) {
            System.out.println("No number found");
        } else {
            array.remove((int) index); // Casting to int because remove(Object) and remove(int) are different
            System.out.println("Updated Array: " + array);
        }

        sc.close();
    }
}
