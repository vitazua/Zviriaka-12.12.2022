package HomeWork7;

public class Main {

    public static void main(String[] args) {
        Logger logger = new Logger(Logger.LogLevel.DEBUG);
        logger.log("Starting the program");

        Person vitalii = new Person("Vitalii");
        Person vika = new Person("Vika");

        vitalii.sayHello();
        vika.sayHello();

        try {
            vitalii.introduce(null);
        } catch (MyException e) {
            logger.log(e.getMessage());
        }

        try {
            vitalii.introduce(vika);
        } catch (MyException e) {
            logger.log(e.getMessage());
        }
    }
}