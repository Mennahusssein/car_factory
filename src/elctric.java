class ElectronicEngine implements Engine {
    private int speed = 0;

    @Override
    public void increase() { speed++; }

    @Override
    public void decrease() { if (speed > 0) speed--; }

    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("ElectronicEngine speed = " + speed);
    }
}