package Ass1;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new LoudQuack();
        flyBehavior = new UpsideDownFlying();
    }
    public void display() {
        System.out.println("Mallard duck");
    }
}
