public class Shape{
    public String color;

    public Shape(String color){
        this.color=color;
    }

public String toString(){
    return color;
}
public double getArea(){
    System.out.print("Shape is unknown");
    return 0;
}
}