#Symptoms of poor software design

**Rigidity:** The tendency for software to be difficult to change, even in simple ways. [The design is hard to change]

**Fragility:** Program breaks in many places when single change is made. [The design is easy to break]

**Immobility:** It is hard to extract parts of the system that can be reused in other systems. [The design is hard to reuse]

**Software viscosity:** [Easier to hack than normal flow]

**Environment viscosity:** Slow and inefficient development environment. [Very long compile times]

**Needless complexity:** Elements not currently useful in the design. [over design]

**Needless repetition:** System has lots of repeated code elements.

**Opacity:** A module difficult to understand.


# SOLID Design Principles in Java with Example

**S = Single Responsibility Principle (SRP):** The single responsibility principle states that every java class must perform a single functionality.

**O = Open - Close Principle (OCP):** The open-close principle states that according to new requirements the module should be open for extension but close for modification.

**L = Liskov Substitution Principle (LSP):** It applies to inheritance in such a way that derived classes must be completely substitutable for their base classes. 

**I = Interface Segregation Principle (ISP):** The interface segregation principle states that larger interfaces split into smaller ones.

**D = Dependency Inversion Principle (DIP):** The dependency inversion principle states that we must use abstraction (abstraction classes and interfaces) instead of concrete implementations. High-Level module should not depend on low-level module but both should depend on the abstraction. 
