public class Triangle extends Shape{
    public int base;
    public int height;
    public Triangle(String color, int base, int height) {
        super(color);
        this.color = color;
        this.base = base;
        this.height = height;
        //TODO Auto-generated constructor stub
    }
    public String toString(){
        return base+ " " + +height + " " + color;
    }
    public double getArea(){
        return 0.5*base*height;
    }
}
