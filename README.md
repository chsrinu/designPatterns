# designPatterns 

<h2>Creational design patterns</h2>
  <h3>Singleton design pattern</h3>
    <div>
        At any point of time you need to ensure only one instance of an object exists. Have shown the basic implementation
        and multithreaded implementation. Important terms that I have encountered while learning the creational.singleton design pattern
        <ul>
            <li>Eager initialization</li>
            <li>Lazy/on-demand initialization</li>
            <li>Synchronized block</li>
            <li>Double checked locking</li>
            <li>Static inner class or Initialization-on-demand holder idiom or Bill pugh creational.singleton implementation</li>
        </ul> 
       Static inner class gets loaded only when the class is accessed which is why static inner class implementation for
       creational. Singleton works in multithreaded environment.
  </div>
<h3>Builder design pattern</h3>
    <div>
        Important terms that I have come across.
        <ul>
            <li>Immutable objects.</li>
            <li>Monstrous constructors.</li>
            <li>Constructor methods explosion.</li>
            <li>Telescoping constructor problem.</li>   
        </ul>
        You have to achieve immutability while solving the Monstrous constuctors or constructor methods explosion or 
        Telescopic constructor problem. A Builder pattern helps in achieving this by pulling the object construction 
        code out the Object class. 
        <p><i>Since I have explicitly stated all the problems which will raise without a builder design pattern so didn't 
        write classes to showcase the same in code.</i></p>
    </div>
<h3>Factory design pattern</h3>
    <div>
        Important terms that I have come across while learning this pattern
        <ul>
            <li> Helps in creating a <b>Family</b> of related products</li>
            <li> Text book definition: Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer                    instantiation to subclasses.</li>
            <li> Loose coupling</li>
            <li> Code for the interface not for implementation</li>
            <li> Achieves abstraction between client and concrete classes through factory class</li>
        </ul>
        Always give interface types to client(this is what is code for interface means), so that we you need to add or remove a particular class if there is an interface
        the client will never know about the concrete classes.
    </div>
 <h3>Abstract Factory design pattern</h3>
    <div>
        Important terms that I have come across while learning this pattern
        <ul>
          <li> Helps in creating <b>Families</b> of related products</li> 
          <li> Text book definition: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.</li>
          <li> Loose coupling</li>
        </ul>
        Use this pattern when similar kind of factories needs to created or if the contracts or interfaces belong the same root. In my example I have shown
        <OL>
          <li>MAMMALS IS-A ANIMAL  (ANIMAL ABSTRACT FACTORY)</li>
          <li>REPTILES IS-A ANIMAL (ANIMAL ABSTRACT FACTORY)</li>
          <li>HUMAN IS-A MAMMAL (MAMMAL FACTORY)</li>
          <li>COW IS-A MAMMAL (MAMMAL FACTORY)</li>
          <li>SNAKE IS-A REPTILE (REPTILE FACTORY)</li>
          <li>CROCODILE IS-A REPTILE (REPTILE FACTORY)</li>
          </ol>
        Since both the categories(REPTILES and MAMMALS) belong to the same root(ANIMAL) I have to use Abstract factory. This pattern can be learned easily through implementation (by practice).
    </div>

