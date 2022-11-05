package com.github.daniza1103.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Лабораторная работа 1. Разработка консольных Java-приложений.
 * Задание: ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше средней, также их длины.
 */

public class Task1 {
    public void Task() {
        System.out.println("\n Лабораторная работа 1. \n");
        int n;
        while (true) {
            System.out.println("Введите количество строк: ");
            Scanner sc1 = new Scanner(System.in);
            try {
                n = sc1.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число!");
            }
        }
        String[] str = new String[n];
        Scanner sc2 = new Scanner(System.in);

        for (int i = 0; i < str.length; i++) {
            System.out.println("Введите строку №" + (i + 1));
            str[i] = sc2.nextLine();
        }
        float average = 0f;

        for (String item : str) {
            average += (float) item.length();
        }
        average /= str.length;

        System.out.println("Средняя длина строки = (" + average + ")");
        for (int i = 0; i < n; i++) {
            if (str[i].length() < average) {
                System.out.println("Строка меньшая чем средняя длина: ");
                System.out.println(str[i] + " ee длина = " + str[i].length());
            }
        }
    }
}