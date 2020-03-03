package Ducks;

import Behaviours.Fly.FlyWithWings;
import Behaviours.Quack.Squeack;

public class RedHeadDuck extends Duck{

    public RedHeadDuck(){
        quackBehavior = new Squeack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck");
    }
    
}