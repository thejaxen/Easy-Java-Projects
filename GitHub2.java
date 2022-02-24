import java.util.Scanner;

public class GitHub2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int t = sc.nextInt();
        for (int x = 0; x < t; x++) {
            for (int lineindex = 0; lineindex < w; lineindex++) {
                for (int symbolindex = 0; symbolindex < w; symbolindex++) {
                    if (lineindex == symbolindex) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }

            for (int lineindex2 = (w - 2); 1 <= lineindex2; lineindex2--) {
                for (int symbolindex2 = 0; symbolindex2 < w; symbolindex2++) {
                    if (lineindex2 == symbolindex2) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }
        System.out.println("*");

    }
}
