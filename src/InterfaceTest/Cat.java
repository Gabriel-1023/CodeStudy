package InterfaceTest;

public class Cat implements Feline,Mammal {

    @Override
    public void climeTrees() {
        System.out.println("Cat climeTrees()");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat()");
    }

    @Override
    public void run() {
        System.out.println("Cat run()");
    }

    @Override
    public void eatMilk() {
        System.out.println("Cat eatMilk()");
    }

    public void miao(){
        System.out.println("miao~");
    }
}
