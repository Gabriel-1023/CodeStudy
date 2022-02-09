package InterfaceTest;

public class Main {
    public static void main(String[] args) {

        /*使用Cat类实现Feline(猫科动物)接口，cat1只能使用猫科动物中定义和继承的方法：吃、跑、爬树
        也不能使用Cat自带的非实现方法 喵（不能卖萌）
         */
        Feline cat1 = new Cat(); //Feline(猫科动物)
        cat1.run();
        cat1.eat();
        cat1.climeTrees();
        //cat1.eatMilk(); //报错
        //cat1.miao(); //报错

        /*使用Cat类实现Mammal(哺乳动物)接口，cat1只能使用猫科动物中定义和继承的方法：吃、跑、吃奶
        也不能使用Cat自带的非实现方法 喵（不能卖萌）
         */
        Mammal cat2 = new Cat();
        cat2.run();
        cat2.eat();
        //cat2.climeTrees(); //报错
        cat2.eatMilk();
        // cat2.miao(); //报错

        //Cat cat使用自己的类实现实例，没有多态关系，所有方法可用
        Cat cat = new Cat();
        cat.miao();
        cat.eat();

    }
}
