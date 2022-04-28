public class Car extends Vehicle {

    public Car(int numberOfWheels, String color, int weight) {
        super(numberOfWheels, color, weight);
    }

    public String getInfo(){
        return super.getInfo();
    }
}
