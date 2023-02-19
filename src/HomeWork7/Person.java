package HomeWork7;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    public void introduce(Person otherPerson) throws MyException {
        if (otherPerson == null) {
            throw new MyException("Other person cannot be null");
        }
        System.out.println("Hi " + otherPerson.name + ", my name is " + name);
    }
}