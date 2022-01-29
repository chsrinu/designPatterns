package creational.singleton.pass.multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class Printer {
    private Printer(){}
    private volatile AtomicInteger printerVariable = new AtomicInteger(1);
    private static class PrinterHolder{
        static final Printer instance = new Printer();
    }

    public static Printer getPrinter(){
        return PrinterHolder.instance;
    }

    public synchronized void print(){
        System.out.println(printerVariable);
        printerVariable.set(printerVariable.incrementAndGet());
    }
}
