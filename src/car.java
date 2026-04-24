class Car {
    private Engine engine;
    private int speed = 0;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        speed = 0;
        engine.setSpeed(speed);
        System.out.println("Car started");
    }

    public void stop() {
        speed = 0;
        engine.setSpeed(speed);
        System.out.println("Car stopped");
    }

    public void accelerate() {
        if (speed < 200) {
            speed += 20;
            if (speed > 200) speed = 200;
            engine.setSpeed(speed);
            System.out.println("Speed = " + speed);
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= 20;
            if (speed < 0) speed = 0;
            engine.setSpeed(speed);
            System.out.println("Speed = " + speed);
        }
    }
}
