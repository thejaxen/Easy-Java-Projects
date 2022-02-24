import java.util.Scanner;

public class GitHub8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array = sc.nextLine();
        String[] list = new String[array.length()];

        for (int x = 0; x < array.length(); x++) {

            if ((array.charAt(x) >= 65 && array.charAt(x) <= 90) || array.charAt(x) == 32) {
                System.out.print(array.charAt(x));
            }
        }
    }
}
