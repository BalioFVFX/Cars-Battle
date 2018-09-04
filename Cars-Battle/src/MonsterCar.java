public class MonsterCar extends Vehicle implements Monsterable{


    @Override
    public void attack(Vehicle veh) {
        veh.decreaseHealth(10);
    }

    public MonsterCar(int maxSpeed, int health, String name) {
        super(maxSpeed, health, name);
    }
}
