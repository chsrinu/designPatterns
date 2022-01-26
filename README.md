# designPatterns \n
my understanding of design patterns \n
Singleton design pattern: At any point of time you need to ensure only one instance of an object exists. Have shown the basic implementation and multithreaded implementation.
  Important terms that I have encountered while learning the singleton design pattern:
    * Eager initialization
    * Lazy/on-demand initialization
    * Synchronized block
    * Double checked locking
    * Static inner class or Initialization-on-demand holder idiom or Bill pugh singleton implementation

   Static inner class gets loaded only when the class is accessed which is why static inner class implementation for singleton works in multithreaded environment.
 
