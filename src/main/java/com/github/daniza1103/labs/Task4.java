package com.github.daniza1103.labs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * Лабораторная работа 4. Разработка визуальных интерфейсов.
 * Задание: задать движение по экрану строк (одна за другой) из массива строк. Направление движения
 * по апплету и значение каждой строки выбирается случайным образом.
 */

public class Task4 {
    public void Task() {
        System.out.println("\n Лабораторная работа 4. \n");
        final ArrayList<String> strings = new ArrayList<>();
        strings.add("String 1");
        strings.add("String 2");
        strings.add("String 3");
        strings.add("String 4");
        strings.add("String 5");
        strings.add("String 6");

        final JFrame frame = new JFrame("Task4");
        frame.setPreferredSize(new Dimension(800, 500));
        frame.setVisible(true);
        frame.setLayout(null);

        final JLabel lbl = new JLabel();
        lbl.setLocation(-1, 0);
        lbl.setSize(300, 20);
        frame.add(lbl);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();

        Timer timer = new Timer(50, new ActionListener() {
            int speedX, speedY;
            final Random rnd = new Random();

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Point loc = lbl.getLocation();

                if (loc.x > frame.getWidth() || loc.y > frame.getHeight() || loc.x < 0 || loc.y < 0) {
                    lbl.setLocation(frame.getWidth() / 2, frame.getHeight() / 2);
                    speedX = -5 + rnd.nextInt(10);
                    speedY = -5 + rnd.nextInt(10);
                    lbl.setText(strings.get(rnd.nextInt(strings.size() - 1)));
                } else {
                    lbl.setLocation(loc.x + speedX, loc.y + speedY);
                }
            }
        });
        timer.start();
    }
}
