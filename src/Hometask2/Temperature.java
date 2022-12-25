package Hometask2;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть градуси в цельсіях ");
        double C = in.nextDouble();
        double F = (C * 9 / 5)  + 32;
        double K = C + 273.16;

        System.out.println( C + "C; " + F + "F; "  + K + "K;");
    }
}