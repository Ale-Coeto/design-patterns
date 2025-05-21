# Design Patterns

## Creational
### Singleton
Ensure a class has only one instance and provide a global point of access to it.

### Prototype
Allows copying existing objects without making your code dependent on their classes.


## Structural
Structural design patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient.

### Adapter
Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.

### Bridge
Lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.
Decouple an abstraction from its implementation so that the two can vary independently.

### Composite
Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

### Decorator
Attach additional responsibilities or behaviors to an object dynamically.

### Facade
Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

### Flyweight
Lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

### Proxy
Provides a placeholder/surrogate for another object to control access to it.
Virtual proxy: placeholder for resource-heavy objects. Real object is created only when it is needed.
Remote proxy: represents an object that is in a different address space. It is used to communicate with the remote object.
Protective proxy: controls access to the real object. It can add security, logging, or other functionality before delegating the call to the real object.
Smart proxy: adds additional functionality to the real object, such as caching or lazy loading. It can also be used to manage the lifecycle of the real object.