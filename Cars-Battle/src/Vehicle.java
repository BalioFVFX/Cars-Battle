public abstract class Vehicle {
    private int maxSpeed;
    private int health;
    private int currentSpeed;
    public String name;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        if(currentSpeed > 10){
            currentSpeed = 10;
        }
        this.currentSpeed = currentSpeed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void decreaseHealth(int health) {
        this.health -= health;
    }

    public void increaseHealth(int health) {
        this.health += health;
    }

    public Vehicle(int maxSpeed, int health, String name) {
        this.maxSpeed = maxSpeed;
        this.health = health;
        this.name = name;
        this.currentSpeed = maxSpeed;
    }
}
