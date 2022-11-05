package com.github.daniza1103.labs;

/**
 * Лабораторная работа 3. Использование коллекций.
 * Задание: не используя вспомогательных объектов, переставить отрицательные элементы данного
 * списка в конец, а положительные – в начало этого списка.
 */

public class Task3 {
    public void Task() {
        System.out.println("\n Лабораторная работа 3. \n");
        int[] x ={-7,4,1,-5,0,11,-4,6,2,-3};
        int i;
        for (i=0; i<10; i++) System.out.print(x[i]+" ");
        System.out.println();
        bSort(x);
        for (i=0; i<10; i++) System.out.print(x[i]+" ");
        System.out.println();
    }

    private void bSort(int[] arr) {
        int i, c, n = arr.length, tmp;
        do {
            c = 0;
            for (i = 0; i < n - 1; i++)
                if (arr[i] < 0 && arr[i + 1] >= 0) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    c++;
                }
        } while (c != 0);
    }
}
