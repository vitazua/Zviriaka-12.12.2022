package HomeTask6;

public class Position extends Person implements Callable {
    private String position;

    public Position(String firstName, String lastName, String city, String phoneNumber, String position) {
        super(firstName, lastName, city, phoneNumber);
        this.position = position;
    }
    public String call(Position position) {
        return "Громадянин " + this.getFirstname() + " "  + this.getLastname() + " " + this.position + " телефонує громадянину " + position.getFirstname() + " "  + position.getLastname() + " " +  position.position + " на номер "  + position.getPhone();
    }

    @Override
    public String call(Person person) {
        return "Громадянин " + this.getFirstname() + " "  + this.getLastname() + " " + position + " телефонує громадянину " + person.getFirstname() + " "  + person.getLastname() + " на номер "  + person.getPhone();
    }
}


