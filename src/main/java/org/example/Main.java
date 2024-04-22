package org.example;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws AWTException {
            Test2();
    }
    public static int wievielmal = 0;
    public static void Test2() throws AWTException {
        boolean debug = true;
        Robot robot = new Robot();

        Date firstTime = new Date(2023, 12, 25);

        long delay =
                /*(1000*60*10) //10 Minuten
                +(1000*7) //7 Sekunden */
                30_000 //30 Sekunden
        ;

        Random random = new Random();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                sleep(500+random.nextInt(1000));

                robot.keyPress(KeyEvent.VK_W);
                sleep(1000+random.nextInt(1000));
                robot.keyRelease(KeyEvent.VK_W);

                sleep(500+random.nextInt(1000));

                robot.keyPress(KeyEvent.VK_S);
                sleep(1000+random.nextInt(1000));
                robot.keyRelease(KeyEvent.VK_S);
                wievielmal ++;
                if (debug) {
                    System.out.println("Wurde gemacht " + wievielmal);
                }
            }
        }, delay, delay);
    }

    private static void sleep(long l) {
        try {
            Thread.sleep(l);
        } catch (InterruptedException e) {
        }
        System.out.println("SLEEP: "+l);
    }
}