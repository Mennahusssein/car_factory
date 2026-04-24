class CarFactory {

    public static Car createCar(String type) {
        return new Car(createEngine(type));
    }

    public static Engine createEngine(String type) {
        switch (type.toLowerCase()) {
            case "gas":
                return new GasolineEngine();
            case "electric":
                return new ElectronicEngine();
            case "hybrid":
                return new MixedHybridEngine();
            default:
                throw new IllegalArgumentException("Unknown engine type");
        }
    }

    public static void replaceEngine(Car car, String type) {
        car.setEngine(createEngine(type));
    }
}