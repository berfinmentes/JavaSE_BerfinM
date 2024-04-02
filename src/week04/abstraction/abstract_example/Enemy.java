package week04.abstraction.abstract_example;

public abstract class Enemy {

    int health;
    int damage;

    public abstract void attack();    /*abstract metot çünkü her düşmanın atağı farklı oabilir*/

    public void takeDamage(int damage){
        health = health - damage;
        System.out.println("Enemy is damaged : " +damage);
        System.out.println("Enemy health is : "+health);

        if(health<=0){
            System.out.println("Enemy is killed. ");
        }
    }
}
