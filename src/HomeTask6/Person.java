package HomeTask6;

public class Person implements Callable{
    private String firstname;
    private String lastname;
    private String city;
    private String phone;

    public Person(String firstname, String lastname, String city, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.phone = phone;
    }

    public String getFirstname(){ return firstname ;}
    public String getLastname(){ return lastname ;}
    public String getCity(){ return city ;}
    public String getPhone(){ return phone ;}
    public String call () {
        return "Зателефонувати громадянину " + firstname + " "  + lastname + " з міста " + city + " можна за номером "  + phone;
    }



    public String call (Person person) {
        if (this == person) {
            return "Неможливо телефонувати самому собі";
        }
        return "Громадянин " + firstname + " "  + lastname + " телефонує громадянину " + person.firstname + " "  + person.lastname + " на номер "  + person.phone;
    }
}

