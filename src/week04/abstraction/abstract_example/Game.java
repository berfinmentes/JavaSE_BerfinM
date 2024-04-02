package week04.abstraction.abstract_example;

public class Game {
    public static void main(String[] args) {


        Enemy goblin = new Goblin();     /*Goblin taslağından düşman üretece*/

        Enemy zombie = new Zombie();    /*Özellikler soldan davranışlar sağdan alınır*/
        goblin.attack();
        zombie.attack();

        zombie.takeDamage(20);
        zombie.takeDamage(30);
        zombie.takeDamage(60);


    }
}
