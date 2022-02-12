import creational.CreationalPatternRunner;

public class Root {
    public static void main(String[] args){
        CreationalPatternRunner runner = new CreationalPatternRunner();
        runner.runSingleton();

        runner.runBuilder();

        runner.runFactory();

        runner.runAbstractFactory();
    }
}
