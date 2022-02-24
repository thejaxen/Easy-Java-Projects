import java.util.Scanner;

public class GitHub6 {
    public static void main(String[] args) {
        Scanner N = new Scanner(System.in);
        int ctr = N.nextInt();
        int evc = 0;
        int odc = 0;
        int pc = 0;
        int nc = 0;

        for (int i = 0; i < ctr; i++) {
            int input = N.nextInt();
            if (input % 2 == 0) {
                evc++;
            } else {
                odc++;
            }
            if (input > 0) {
                pc++;
            }
            if (input < 0) {
                nc++;

            }

        }
        System.out.println(evc);
        System.out.println(odc);
        System.out.println(pc);
        System.out.println(nc);
    }
}
