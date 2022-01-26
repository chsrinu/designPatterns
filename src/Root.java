import singleton.fails.multithread.SingletonPatternRunner;

public class Root {
    public static void main(String[] args){
        SingletonPatternRunner singletonRunner = new SingletonPatternRunner();
        singletonRunner.runSingleton();
        /* output for above call
        * Creating new instance Thread-2
          1 (expected 1)
          Creating new instance Thread-0
          1 (expected 2)
          Creating new instance Thread-4
          1 (expected 3)
          Creating new instance Thread-3
          1 (expected 4)
          Creating new instance Thread-1
          1 (expected 5)
        * */

        singleton.pass.multithread.SingletonPatternRunner r2 = new singleton.pass.multithread.SingletonPatternRunner();
        r2.runSingleton();

        /*
        * output for above call
        * 1
        * 2
        * 3
        * 4
        * 5
        * */
    }
}
