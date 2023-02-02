package Hometask5;

import java.util.Arrays;

public class AverageCounter {

    public static void main(String[] args) {
        int [] mas = new int[10];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random()*10)+1;
        }
        System.out.println(Arrays.toString(mas));
        double average = 0;
        for (int i = 0; i < mas.length; i++) {
            average += mas[i];
        }
        average /= 10;
        {
                    System.out.println(" Середнє арифметичне " + average);
                }
            }
        }

