import java.util.Scanner;

public class GitHub4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOftakens = sc.nextInt();
        int[] numbers = new int[numberOftakens];
        int ftotal = 0;
        int stotal = 0;
        for (int p = 0; p < numberOftakens; p++) {
            numbers[p] = sc.nextInt();
        }
        if (numberOftakens % 2 == 0) {
            for (int k = 0; k <= numberOftakens / 2 - 1; k++) {
                ftotal += numbers[k];
            }
            for (int l = numberOftakens / 2; l < numberOftakens; l++) {
                stotal += numbers[l];
            }
        } else {
            for (int x = 0; x <= numberOftakens / 2 - 1; x++) {
                ftotal += numbers[x];
            }
            for (int y = numberOftakens / 2 + 1; y < numberOftakens; y++) {
                stotal += numbers[y];
            }
        }

        if (ftotal == stotal) {
            System.out.println("The array is balanced");
        }
        if (ftotal != stotal) {
            System.out.println("The array is imbalaced");
        }
    }
}
