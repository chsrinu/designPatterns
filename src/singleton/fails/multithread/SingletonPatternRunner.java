package singleton.fails.multithread;

public class SingletonPatternRunner {
    public void runSingleton(){
        PrinterClient pc = new PrinterClient();
        Thread t1 = new Thread(pc);
        Thread t2 = new Thread(pc);
        Thread t3 = new Thread(pc);


        PrinterClient pc1 = new PrinterClient();
        PrinterClient pc2 = new PrinterClient();

        Thread t4 = new Thread(pc1);
        Thread t5 = new Thread(pc2);

        t1.start();//prints 1
        t2.start();//prints 1
        t3.start();//prints 1

        t4.start();//prints 1
        t5.start();//prints 1
    }
}
