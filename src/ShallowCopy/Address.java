package ShallowCopy;

public class Address implements Cloneable{
    private final String name;

    public Address(String name) {
        this.name = name;
    }

    @Override
    public Address clone(){
        try{
            return (Address) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public String getName() {
        return name;
    }
}
