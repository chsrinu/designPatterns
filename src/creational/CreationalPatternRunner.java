package creational;

import creational.abstractfactory.FactoryProducer;
import creational.abstractfactory.contracts.Animal;
import creational.abstractfactory.factories.AnimalFactory;
import creational.builder.User;
import creational.factory.Television;
import creational.factory.TvFactory;
import creational.prototype.PrototypeFactory;
import creational.prototype.Rectangle;
import creational.prototype.Shape;
import creational.singleton.fails.multithread.SingletonPatternRunner;

import java.util.ArrayList;
import java.util.List;

public class CreationalPatternRunner {

    public void runSingleton(){
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

        creational.singleton.pass.multithread.SingletonPatternRunner r2 = new creational.singleton.pass.multithread.SingletonPatternRunner();
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
    public void runBuilder(){
        //cannot instantiate the user object directly and it could be instantiated only via userBuilder.
        // User u = new User();
        User u = new User.UserBuilder("firstNameTest","lastNameTest")
                .setHouseNumber("houseNumberTest")
                .setPinNumber("pinNumberTest")
                .build();
        //there is no method that you can access to change any property of the user, so guess what??
        //yayyy!!! the object is immutable
        //u.
        System.out.println("userBuilder created: "+u);
    }

    public void runFactory(){
        //cannot be instantiated as its having protected access
        //Television tv = new SmartTv();
        System.out.println("----Factory----");
        TvFactory factory = new TvFactory();
        Television myTv = factory.getTelevision("TvWithOTTApps");
        System.out.println("TvFactory: "+myTv.toString());
    }

    public void runAbstractFactory(){
        System.out.println("----Abstract factory----");
        String animalType_1 = "COW";
        String animalType_2 = "SNAKE";
        String animalType_3 = "CROCODILE";
        String animalType_4 = "HUMAN";
        System.out.println(getAnimal(animalType_1).toString());
        System.out.println(getAnimal(animalType_2).toString());
        System.out.println(getAnimal(animalType_3).toString());
        System.out.println(getAnimal(animalType_4).toString());
    }

    private Animal getAnimal(String type){
        AnimalFactory factory = FactoryProducer.createFactory(type);
        return factory.createAnimal(type);
    }

    public void runPrototype() throws CloneNotSupportedException {
        System.out.println("----Prototype----");
        System.out.println("creating objects without knowing the concrete class using Clone");
        /*This is more or less same as factory pattern but an ideal prototype design pattern
        * would have some costly operation before creating an object which is why we copy the
        * object created once. So we can get any number newInstances with the same cost of creating
        * one object
        * */
        PrototypeFactory factory = new PrototypeFactory();
        List<Shape> shapes = new ArrayList<>();
        Shape s1 = factory.getInstance(PrototypeFactory.ShapeType.CIRCLE);
        Shape s2 = factory.getInstance(PrototypeFactory.ShapeType.RECTANGLE);
        Shape s3 = factory.getInstance(PrototypeFactory.ShapeType.SQUARE);
        shapes.add(s1);shapes.add(s2);shapes.add(s3);
        for(Shape s:shapes) s.draw();
    }
}
