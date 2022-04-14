public class Driver {
    public static void main(String[]args){
        Employee emp1 = new Employee("Ahmet","KadıKöy","Iphone","3131", 19.21);
        Volunteer vol1 = new Volunteer("Ayhan","Kayseri","Samsung");

        System.out.println(emp1.toString());
        System.out.println(emp1.pay());
        System.out.println(vol1.toString());
        System.out.println(vol1.pay());
    }
}
