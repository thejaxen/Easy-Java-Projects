import java.util.Scanner;

public class mert_duyar23 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int objects = sc.nextInt();

        int[] list = new int[10];

        for (int x = 0; x < objects; x++) {

            int temp = sc.nextInt();

            list[temp]++;
        }

        for (int x = 0; x < 10; x++) {

            if (list[x] != 0)

                System.out.printf("Value %d, frequency %d\n", x, list[x]);
        }

    }
}
