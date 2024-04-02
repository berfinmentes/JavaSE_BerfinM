package week04.abstraction.abstract_example;

public class Goblin extends Enemy {

    public Goblin() {
        this.health = 50;
        this.damage = 10;

    }

    @Override
    public void attack() {

        System.out.println("Goblin attacks with "+ damage + "damage");
    }
}
