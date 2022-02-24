import java.util.Scanner;

public class GitHub3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberofelements = sc.nextInt();
        int array[] = new int[numberofelements];
        for (int x = 0; x < array.length; x++) {
            array[x] = sc.nextInt();
        }
        printUniqnumbers(array);
    }

    public static void printUniqnumbers(int arr[]) {
        int n = arr.length;
        for (int x = 0; x < n; x++) {
            int j;
            for (j = 0; j < x; j++)
                if (arr[x] == arr[j])
                    break;

            if (x == j)
                System.out.println(arr[x]);

        }
    }
}
