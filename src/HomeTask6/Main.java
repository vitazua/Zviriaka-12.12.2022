package HomeTask6;

public class Main {
    public static void main(String[] args) {
        Person person_1 = new Person("Will", "Smith", "New York", "2936729462846");
        Person person_2 = new Person("Jackie", "Chan", "Shanghai", "12312412412");
        Person person_3 = new Person("Sherlock ", "Holmes ", "London", "37742123513");
        System.out.println(person_1.call());
        System.out.println(person_2.call());
        System.out.println(person_3.call());
        System.out.println(person_1.call(person_1));
        System.out.println(person_1.call(person_3));
        Position position_1 = new Position("Vitalii", "Zviriaka", "Kiev", "380984566528", "manager");
        Position position_2 = new Position("Sherlock", "Holmes", "Kiev", "380984566528", "QA");
        System.out.println(position_1.call(person_1));
        System.out.println(position_1.call(position_2));
    }
}
