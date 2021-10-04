package Ass1;

public abstract class Duck {
    IQuackBehavior quackBehavior;
    IFlyingBehavior flyBehavior;

    public Duck(IFlyingBehavior fb, IQuackBehavior qb) {
    }
    public Duck() {
    }
    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }


public void setFlyBehavior (IFlyingBehavior fb){
        flyBehavior = fb;
}
    public void setQuackBehavior (IQuackBehavior qb){
        quackBehavior = qb;
    }

}
