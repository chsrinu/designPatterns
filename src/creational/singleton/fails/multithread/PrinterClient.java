package creational.singleton.fails.multithread;

public class PrinterClient implements Runnable {

    @Override
    public void run() {
        Printer p = Printer.getPrinter();
        p.print();
    }
}
