package Ttutorial;

public abstract class Vehicle {
    private double maxSpeed;
    protected double currentSpeed;

    protected Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public abstract void accelerate();
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void pedalToTheMetal(){
        while (currentSpeed<maxSpeed){
            accelerate();
        }
    }
}
