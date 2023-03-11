package HomeTask10;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apricot", "pear", "grapes");
        long countA = fruits.stream()
                .filter(fruit -> fruit.startsWith("a"))
                .count();
        System.out.println("кількість фруктів, ім'я яких починається на a:" + countA);
        fruits.stream()
                .filter(fruit -> fruit.length() > 4)
                .forEach(System.out::println);
        int sum = fruits.stream()
                .limit(3)
                .mapToInt(String::length)
                .sum();
        System.out.println("сума літер перших 3 фруктів " + sum);
    }
}
