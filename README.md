# designPatterns 

###Creational design patterns<br/>
  &nbsp;&nbsp;&nbsp;###Singleton design pattern: <br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;At any point of time you need to ensure only one instance of an object exists. Have shown the basic implementation <br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;and multithreaded implementation. Important terms that I have encountered while learning the creational.singleton <br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;design pattern:<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* Eager initialization<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* Lazy/on-demand initialization<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* Synchronized block<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* Double checked locking<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* Static inner class or Initialization-on-demand holder idiom or Bill pugh creational.singleton implementation<br/>
  
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Static inner class gets loaded only when the class is accessed which is why static inner class implementation for<br/>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;creational.singleton works in multithreaded environment.<br/>
  &nbsp;&nbsp;&nbsp;###Builder design pattern: <br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Important terms that I have come across <br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* Immutable objects.<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* Monstrous constructors.<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* Constructor methods explosion.<br/>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;* Telescoping constructor problem.<br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;You have to achieve immutability while solving the Monstrous constuctors or constructor methods explosion or <br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Telescopic constructor problem. A Builder pattern helps in achieving this by pulling the object construction <br/>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;code out the Object class. <br/>
    
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Since I have explicitly stated all the problems which will raise without a builder design pattern so didn't <br/>
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;write classes to showcase the same in code. <br/>


