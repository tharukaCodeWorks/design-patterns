import Behaviours.Quack.Squeack;
import Ducks.Duck;
import Ducks.MallarDuck;
import Ducks.RubberDuck;

public class Main{
    public static void main(final String[] args) {
        Duck d1 = new RubberDuck();
        d1.setQuackBehavior(new Squeack());
        d1.performQuack();
    }
}