class MixedHybridEngine implements Engine {

    private GasolineEngine gas = new GasolineEngine();
    private ElectronicEngine electric = new ElectronicEngine();
    private Engine active;

    @Override
    public void increase() {
        if (active != null) active.increase();
    }

    @Override
    public void decrease() {
        if (active != null) active.decrease();
    }

    @Override
    public void setSpeed(int speed) {
        if (speed < 50) {
            active = electric;
            System.out.println("Hybrid → Electric mode");
        } else {
            active = gas;
            System.out.println("Hybrid → Gas mode");
        }
        active.setSpeed(speed);
    }
}
