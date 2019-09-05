package A1;
import java.io.*;
interface PlayWith{                                              //Question#6
    public void PlayWithAnimals();
}

interface Tricks{
    public void PlayDead();
    public void ChaseBall();
}

abstract public class Animals {

     public void sleep(){
         System.out.println("Animal is sleeping");
     }
     public void walk(){
         System.out.println("Animal is walking");
     }
     abstract void EatFood();
}

class Pet extends Animals implements PlayWith,Tricks
{
    public void PlayWithAnimals()
    {
        System.out.println("Playing with Pets");
    }
    public void EatFood(){
        System.out.println("Pet is being fed");
    }
    public void ChaseBall()
    {
        System.out.println("Pet is chasing the ball");
    }
    public void PlayDead()
    {
        System.out.println("The pet is playing dead");
    }
}

class Wild extends Animals
{
    void EatFood(){
        System.out.println("Wild animal is hunting for food");
    }
}

class Main4
{
    public static void main(String[] args)
    {
        Wild A= new Wild();
        A.EatFood();
    }
}
