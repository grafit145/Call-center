package ru.netology;

import java.util.concurrent.*;

public class Ats extends Thread {
    private BlockingQueue<String> callsQueue = new LinkedBlockingQueue<>();
    public final int QUANTITY = 10;
    public final int INTERVAL = 3000;

    public BlockingQueue<String> getCallsQueue() {

        return callsQueue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i < QUANTITY; i++) {
                System.out.println("Входящий звонок " + i);
                getCallsQueue().put("Входящий звонок " + i);
                Thread.sleep(INTERVAL);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}