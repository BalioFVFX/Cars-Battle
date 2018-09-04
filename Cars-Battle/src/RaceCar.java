public class RaceCar extends Vehicle implements Raceable{

    @Override
    public void dodge() {
        System.out.println("Race car dodged the Monster car attack!");
    }

    public void setCurrentSpeed(int currentSpeed) {
        super.setCurrentSpeed(currentSpeed);
        System.out.println("Race car is driving with " + currentSpeed + " km/h");
    }

    public RaceCar(int maxSpeed, int health, String name) {
        super(maxSpeed, health, name);
    }
}
