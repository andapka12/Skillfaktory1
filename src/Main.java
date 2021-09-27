public class Main {


    public static void main(String[] args) {


        Car mazda = new Car();


        mazda.start();
        mazda.setAcceleration(10);
        Car lada = new Car("Lada", 123, false, 20);
        System.out.println(mazda.countSpeed(7));
        System.out.println(lada.countSpeed(7));
    }
}


