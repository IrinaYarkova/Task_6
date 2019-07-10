package com.company;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите X: ");
        int x = in.nextInt();
        System.out.print("Введите Y: ");
        int y = in.nextInt();
        System.out.print("Введите Z: ");
        int z = in.nextInt();
        int average = (x+y+z)/3;
        System.out.printf("Среднее арифметическое для %d, %d и %d = %d \n", x, y, z, average);
        if(average > 3)
        {
            System.out.print("Программа выполнена корректно");
        }
        in.close();
    }
}