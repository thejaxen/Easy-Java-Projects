public class Dumptruck extends Vehicle {
    private double loadCapacity;

    public Dumptruck(int numberOfWheels, String color, int weight, double loadCapacity) {
        super(numberOfWheels, color, weight);
        this.loadCapacity = loadCapacity;
        //TODO Auto-generated constructor stub
    }
    public double getLoadCapacity() {
        return loadCapacity;
    }
    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public String getInfo() {
        return super.getInfo() + "," + loadCapacity;
    }
}
