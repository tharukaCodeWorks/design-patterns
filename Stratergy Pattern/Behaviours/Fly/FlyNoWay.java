package Behaviours.Fly;
import Behaviours.Interface.FlyBehavior;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Can't Fly");
    }
    
}