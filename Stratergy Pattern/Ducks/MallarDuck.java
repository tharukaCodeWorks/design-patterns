package Ducks;

import Behaviours.Fly.FlyWithWings;
import Behaviours.Quack.Quack;

public class MallarDuck extends Duck{

    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
       System.out.println("Mallar Duck");
    }
    
}