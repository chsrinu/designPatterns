package singleton.pass.multithread;

public class PrinterClient implements Runnable {

    @Override
    public void run() {
        Printer p = Printer.getPrinter();
        p.print();
    }
}
