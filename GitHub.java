import java.util.Scanner;

public class mert_duyar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int array[][] = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int k = 0; k < N; k++) {
                array[i][k] = sc.nextInt();
            }
        }
        int product;
        for (int i = 0; i < N; i++) {
            product = 0;
            product = array[i][i] * array[i][N - 1 - i];
            System.out.print(product + " ");
        }
    }
}
