package GarbageCollection;

public class ReferenceCountingGC {

    public Object instance;

    public ReferenceCountingGC(String name){}

    public static void main(String[] args){
        ReferenceCountingGC a = new ReferenceCountingGC("obj A");
        ReferenceCountingGC b = new ReferenceCountingGC("obj B");

        a.instance = b;
        b.instance = a;

        a = null;
        b = null;


    }
}

