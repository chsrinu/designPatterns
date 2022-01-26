# designPatterns

my understanding of design patterns <br/>

Singleton design pattern: At any point of time you need to ensure only one instance of an object exists. Have shown the basic implementation and multithreaded implementation.<br/>
  Important terms that I have encountered while learning the singleton design pattern:<br/>
    * Eager initialization<br/>
    * Lazy/on-demand initialization<br/>
    * Synchronized block<br/>
    * Double checked locking<br/>
    * Static inner class or Initialization-on-demand holder idiom or Bill pugh singleton implementation<br/>

   Static inner class gets loaded only when the class is accessed which is why static inner class implementation for singleton works in multithreaded environment.<br/>
 
