public class Car {
    String brand;
    int horsePower;
    boolean isAWD;
    float acceleration;

    Car() {
        this("Mazda",190,false,10);

    }
    public Car(String brand, int horsePower, boolean isAWD, float acceleration) {
        this.brand = brand;
        this.horsePower = horsePower;
        this.isAWD = isAWD;
        this.acceleration = acceleration;
    }

    void start() {
        System.out.println(brand + " has been started");

    }
    void setAcceleration(float acceleration){
        this.acceleration = acceleration;

    }
    float countSpeed(float time){
        return (100/acceleration)*time;
    }
}

