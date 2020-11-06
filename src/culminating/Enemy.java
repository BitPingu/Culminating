package culminating;

import java.util.Random;

public class Enemy extends Character {

    //Constructor
    public Enemy(String name, int level) {
        super(name, level);
        super.distributeStats();
    }

    //Accessors

    //Mutators

    /*************************
     * Method Name: fight
     * Method Description: Invoked when player initiates an enemy
     **************************/
    public boolean fight(Character entity) throws InterruptedException {

        Random random = new Random();

        int prompt, diceRoll, damage;

        prompt = random.nextInt(2);

        switch (prompt) {
            case 1:
                diceRoll = random.nextInt(6) + 1;
                damage = 0;
                for (int i=0; i<diceRoll; i++) {
                    if (entity.health == 0) {
                        break;
                    }
                    entity.health--;
                    damage++;
                }
                System.out.println("\n" + name + " deals " + damage + " damage!");
                Thread.sleep(1000);
                break;

            case 2:
                System.out.println("\n" + name + " uses a special!");
                Thread.sleep(1000);
                break;

        }

        return entity.health == 0;

    }



}
