package Hometask2;

import java.util.Scanner;

public class Parallelepiped {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть катет ");
        double a = in.nextDouble();
        System.out.println("Введіть катет ");
        double b = in.nextDouble();
        double S = (a*b)*1/2;
        System.out.println( S + " площа");
    }
}
