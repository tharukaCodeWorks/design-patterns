package Behaviours.Quack;

import Behaviours.Interface.QuackBehavior;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
    
}