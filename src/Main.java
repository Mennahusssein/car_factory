public class Main {
    public static void main(String[] args) {

        Car car = CarFactory.createCar("hybrid");

        car.start();       
        car.accelerate();  
        car.accelerate();  
        car.accelerate();  
        car.brake();       
        car.stop();

        System.out.println("---- Replace Engine ----");

        CarFactory.replaceEngine(car, "gas");

        car.start();
        car.accelerate();
        car.stop();
    }
}