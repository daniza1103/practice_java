package com.github.daniza1103;

import com.github.daniza1103.labs.Task1;
import com.github.daniza1103.labs.Task2;
import com.github.daniza1103.labs.Task3;
import com.github.daniza1103.labs.Task4;

import java.util.Scanner;

/**
 * Лабораторные работы по дисциплине: "Программирвоание на Java".
 * @author daniza1103
 */

public class Main {
    public static void main(String[] args) {
        int num = getTaskNumber();
        Task1 obj1 = new Task1();
        Task2 obj2 = new Task2();
        Task3 obj3 = new Task3();
        Task4 obj4 = new Task4();

        switch (num) {
            case 1 -> obj1.Task();
            case 2 -> obj2.Task();
            case 3 -> obj3.Task();
            case 4 -> obj4.Task();
        }
    }

    public static int getTaskNumber() {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println(" Введите номер лабораторной работы: ");
        do {
            n = scanner.nextInt();
        } while ((n > 4) || (n < 1));
        return n;
    }
}