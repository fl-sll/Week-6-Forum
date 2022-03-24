import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int NUM_ITEMS;
        int[] items;
        
        System.out.print("Enter the number of items: ");
        NUM_ITEMS = in.nextInt();
        
        if (NUM_ITEMS < 0){
            System.out.println("Number must be more than 0.");
            return;
        }

        System.out.print("Enter the value of all items (separated by space): ");

        items = new int[NUM_ITEMS];

        for (int i = 0; i < items.length; ++i){
            items[i] = in.nextInt();
        }

        System.out.println("The values are: " + Arrays.toString(items));
    }
}
