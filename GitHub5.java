import java.util.Scanner;

public class GitHub5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int v = scan.nextInt();
        int[] arr = new int[v];

        for (int i = 0; i < arr.length; i++)
            arr[i] = scan.nextInt();

        int sOFl = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            sOFl += arr[i];
        }
        int sOFr = 0;

        for (int i = arr.length - 1; i > arr.length / 2; i--) {
            sOFr += arr[i];
        }

        if (sOFl == sOFr) {
            System.out.println("The array is balanced");
        } else {
            System.out.println("The array is imbalanced");
        }
    }
}