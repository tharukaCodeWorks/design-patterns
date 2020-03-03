package Ducks;

import Behaviours.Interface.FlyBehavior;
import Behaviours.Interface.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("Fly");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior behavior){
        this.flyBehavior = behavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

}