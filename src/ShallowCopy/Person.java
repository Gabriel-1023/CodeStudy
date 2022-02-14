package ShallowCopy;

public class Person implements Cloneable{
    private Address address;

    @Override
    public Person clone(){
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

    public Person(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}



