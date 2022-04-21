public class Rectangle extends Shape{
    public int length;
    public int width;
    public Rectangle(String color, int width, int length) {
        super(color);
        this.color = color;
        this.width = width;
        this.length = length;
        //TODO Auto-generated constructor stub
    }
    public String toString(){
        return length + " " + width + " " + color;
    }
    public double getArea(){
        return length*width;
    }
}
