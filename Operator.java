package ru.netology;

import java.util.concurrent.BlockingQueue;

public class Operator extends Thread {
    private final int PROCESSING = 3000;
    private Ats ats;

    public Operator(String name, Ats ats) {
        super(name);
        this.ats = ats;
    }

    @Override
    public void run() {
        while (ats.isAlive()) {
            try {
                System.out.printf("%s обрабатывает звонок %s\n",
                        Thread.currentThread().getName(), ats.getCallsQueue().poll());
                Thread.sleep(PROCESSING);
                System.out.printf("%s обработал звонок\n",
                        Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}