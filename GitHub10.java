import java.util.Scanner;
public class GitHub10 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double FirstEdge = sc.nextDouble();
        double SecondEdge = sc.nextDouble();

        double Hypotenuse = (FirstEdge*FirstEdge) + (SecondEdge*SecondEdge);
        double RealHypotenuse = Math.pow(Hypotenuse,0.5);
        System.out.println(RealHypotenuse);
        
    }
}
