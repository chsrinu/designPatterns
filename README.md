# designPatterns 

###Creational design patterns
  ###Singleton design pattern: 
    At any point of time you need to ensure only one instance of an object exists. Have shown the basic implementation 
    and multithreaded implementation. Important terms that I have encountered while learning the creational.singleton 
    design pattern:
        * Eager initialization
        * Lazy/on-demand initialization
        * Synchronized block
        * Double checked locking
        * Static inner class or Initialization-on-demand holder idiom or Bill pugh creational.singleton implementation
  
    Static inner class gets loaded only when the class is accessed which is why static inner class implementation for
    creational.singleton works in multithreaded environment.
  ###Builder design pattern: 
    Important terms that I have come across 
        * Immutable objects.
        * Monstrous constructors.
        * Constructor methods explosion.
        * Telescoping constructor problem
    You have to achieve immutability while solving the Monstrous constuctors or constructor methods explosion or 
    Telescopic constructor problem. A Builder pattern helps in achieving this by pulling the object construction 
    code out the Object class. 
    
    Since I have explicitly stated all the problems which will raise without a builder design pattern so didn't 
    write classes to showcase the same in code. 


