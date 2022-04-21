public class Test {
    public static void main(String[]args){
        Shape obj1 = new Rectangle("Black", 20, 10);
        Shape obj2 = new Triangle("Blue", 20, 10);
        System.out.println(obj1.toString());
        System.out.println(obj1.getArea());
        System.out.println(obj2.toString());
        System.out.println(obj2.getArea());
    }
}
