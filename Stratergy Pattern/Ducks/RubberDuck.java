package Ducks;

import Behaviours.Fly.FlyNoWay;
import Behaviours.Quack.MuteQuack;

public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
    
}