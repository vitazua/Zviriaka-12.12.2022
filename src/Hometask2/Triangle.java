package Hometask2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть першу сторону: ");
        double a = in.nextDouble();
        System.out.println("Введіть другу сторону: ");
        double b = in.nextDouble();
        System.out.println("Введіть третю сторону: ");
        double c = in.nextDouble();
        double volume = a*b*c;
        double length = 4*a+4*b+4*c;
        System.out.println("Об'єм паралелепіпеда = " + volume + " Length = " + length);
    }
}
