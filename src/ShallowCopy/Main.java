package ShallowCopy;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Beijing");

        Person person = new Person(address);

        Person person2 = person.clone();

        System.out.println(person2 == person);  // false
        System.out.println(person.getAddress() == person2.getAddress());  // true
        System.out.println(person.getAddress().getName()); // Beijing
    }
}
