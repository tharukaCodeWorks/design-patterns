package Behaviours.Quack;

import Behaviours.Interface.QuackBehavior;

public class Squeack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Squeack");
    }
    
}