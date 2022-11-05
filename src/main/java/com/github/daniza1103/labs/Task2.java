package com.github.daniza1103.labs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Лабораторная работа 2. Обработка строк. Использование регулярных выражений в Java-приложения.
 * Задание: написать регулярное выражение, определяющее является ли заданная строка правильным MAC-адресом:
 * пример правильных выражений: aE:dC:cA:56:76:54; пример неправильных выражений: 01:23:45:67:89:Az.
 */

public class Task2 {
    public void Task() {
        System.out.println("\n Лабораторная работа 2. \n");
        Scanner scanner = new Scanner(System.in);
        Pattern pattern = Pattern.compile("([0-9a-f]{2}:){5}[0-9a-f]{2}", Pattern.CASE_INSENSITIVE);
        while (true) {
            System.out.print("MAC: ");
            String test = scanner.nextLine();
            if (test.isEmpty())
                break;
            Matcher matcher = pattern.matcher(test);
            System.out.println((matcher.matches()) ? "Ok" : "Fail");
        }
        scanner.close();
    }
}
