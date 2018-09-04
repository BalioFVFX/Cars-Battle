public class Entry {
    public static void main(String[] args) throws InterruptedException {
        RaceCar rCar = new RaceCar(10, 100, "Race car #1");
        MonsterCar mCar = new MonsterCar(10, 100, "Monster car #1");
        int distance = 100;

        while(true){

            int randAttack = (int)(Math.random() * 2);
            int randRegen = (int)(Math.random() * 3);
            int randRaceCarSpeed = (int)(Math.random() * 11);
            int randMonsterCarSpeed = (int)(Math.random() * 11);

            rCar.setCurrentSpeed(randRaceCarSpeed);
            mCar.setCurrentSpeed(randMonsterCarSpeed);

            distance -= rCar.getCurrentSpeed();

            if(randAttack == 0){
                mCar.attack(rCar);

                System.out.println("Monster attacked " + rCar.name);
                if(rCar.getHealth() <= 0){
                    System.out.println("Race car was destroyed!");
                    break;
                }
                System.out.println("Race car has " + rCar.getHealth() + " HP left");
                Thread.sleep(2000);
            }
            if(randRegen == 0){
                rCar.increaseHealth(5);
                System.out.println(rCar.name + " picked up regen item and now has " + rCar.getHealth() + " HP left");
                Thread.sleep(2000);
            }


            if(distance <= 0){
                System.out.println("Race car won the race!");
                break;
            }


            if(rCar.getCurrentSpeed() == mCar.getCurrentSpeed()){
                mCar.decreaseHealth(35);
                if(mCar.getHealth() <= 0){
                    System.out.println("Race car wins! The mosnter car was destroyed!");
                    break;
                }
                System.out.println(rCar.name + " crashed into " + mCar.name);
                System.out.println(mCar.name + " has " + mCar.getHealth() + " HP left");
            }

            System.out.println("Distance left: " + distance);
            Thread.sleep(1000);
        }
    }
}
