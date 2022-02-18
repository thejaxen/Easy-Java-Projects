import java.util.Scanner;

public class GitHub9{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        String lesson = sc.next();

        switch(lesson){
            case "History" :
            Scanner HS = new Scanner(System.in);
            int exam1 = HS.nextInt();
            int exam2 = HS.nextInt();
            int exam3 = HS.nextInt();
            int total = (exam1 + exam2 + exam3)/3 ;
            System.out.println(total);
            break;

            case "Math" :
            Scanner MT = new Scanner(System.in);
            int exam11 = MT.nextInt();
            int exam22 = MT.nextInt();
            int exam33 = MT.nextInt();
            int total1 = (exam11 + exam22 + exam33)/3 ;
            System.out.println(total1);
             break;

            case "Turkish" :
            Scanner TR = new Scanner(System.in);
            int exam111 = TR.nextInt();
            int exam222 = TR.nextInt();
            int exam333 = TR.nextInt();
            int total11 = (exam111 + exam222 + exam333)/3 ;
            System.out.println(total11);
            break;

            case "Physics" :
            Scanner PH = new Scanner(System.in);
            int exam1111 = PH.nextInt();
            int exam2222 = PH.nextInt();
            int exam3333 = PH.nextInt();
            int total111 = (exam1111 + exam2222 + exam3333)/3 ;
            System.out.println(total111);
            break;

            case "Chemistry" :
            Scanner CS = new Scanner(System.in);
            int exam11111 = CS.nextInt();
            int exam22222 = CS.nextInt();
            int exam33333 = CS.nextInt();
            int total1111 = (exam11111 + exam22222 + exam33333)/3 ;
            System.out.println(total1111);
            break;

            case "Music" :
            Scanner MS = new Scanner(System.in);
            int exam111111 = MS.nextInt();
            int exam222222 = MS.nextInt();
            int exam333333 = MS.nextInt();
            int total11111 = (exam111111 + exam222222 + exam333333)/3 ;
            System.out.println(total11111);
            break;
        }
    }
}