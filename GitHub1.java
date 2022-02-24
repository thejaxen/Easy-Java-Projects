import java.util.Scanner;

public class GitHub1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberofelements = sc.nextInt();
        int array[] = new int[numberofelements];
        int array1[] = new int[numberofelements];
        double magnitude1 = 0;
        double magnitude2 = 0;
        double m1 = 0;
        double m2 = 0;
        double dotproduct = 0;
        double cosinearray = 0;
        // for magnitude 1
        for (int x = 0; x < array.length; x++) {
            array[x] = sc.nextInt();
            magnitude1 += Math.pow(array[x], 2);
        }
        m1 = Math.sqrt(magnitude1);
        // for magnitude 2
        for (int x = 0; x < array1.length; x++) {
            array1[x] = sc.nextInt();
            magnitude2 += Math.pow(array1[x], 2);
        }
        m2 = Math.sqrt(magnitude2);
        for (int x = 0; x < numberofelements; x++) {
            dotproduct += array[x] * array1[x];
        }
        cosinearray = (dotproduct) / (m1 * m2);

        System.out.printf("%.2f", cosinearray);
    }
}
