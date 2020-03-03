package Behaviours.Quack;
import Behaviours.Interface.QuackBehavior;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
       System.out.println("Muted Quack");
    }
    
}