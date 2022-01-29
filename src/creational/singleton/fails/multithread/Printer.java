package creational.singleton.fails.multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class Printer {
    private Printer(){}
    private static Printer instance;
    private volatile AtomicInteger printerVariable = new AtomicInteger(1);
    public static Printer getPrinter(){
        if(instance==null) {
            System.out.println("Creating new instance "+Thread.currentThread().getName());
            instance = new Printer();
        }
        return instance;
    }

    public synchronized void print(){
        System.out.println(printerVariable);
        printerVariable.set(printerVariable.incrementAndGet());
    }
}
