import java.util.Scanner;

public class PrintArray{

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the number of items: ");
            int numItems = in.nextInt();
            int[] items = new int[numItems];
            System.out.print("Enter the value of all items (separated by space): ");
            for (int i = 0; i < items.length; i++) {
                items[i] = in.nextInt();
            }
            System.out.print("The values are: [");
            for (int i = 0; i < items.length; i++) {
                System.out.print(items[i]);
                if (i != items.length-1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println("]");
    }
}