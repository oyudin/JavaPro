package homeWork6.car;

public class Car {
    public void start(boolean start) {
        if (start) {
            this.startElectricity();
            this.startCommand();
            this.startFuelSystem();
        } else System.out.println("Start the car");
    }

    private boolean startElectricity() {
        return true;
    }

    private boolean startCommand() {
        return true;
    }

    private boolean startFuelSystem() {
        return true;
    }
}