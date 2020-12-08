public class JavaQuestions {

//    What is the difference between a .java and .class file?
    //java file contains your Java source code while a . class file contains the Java bytecode produced by the Java compiler. It is your . class files that run on the JVM to execute a Java application.

//    Why are we using an IDE (IntelliJ) instead of a simple text editor for writing Java code?
    //compile code with JVM


//    What is the difference between a JRE and a JDK?
    //The JRE is the Java Runtime Environment. It is a package of everything necessary to run a compiled Java program, including the Java Virtual Machine (JVM), the Java Class Library, the java command, and other infrastructure. However, it cannot be used to create new programs.
    //
    //The JDK is the Java Development Kit, the full-featured SDK for Java. It has everything the JRE has, but also the compiler (javac) and tools (like javadoc and jdb). It is capable of creating and compiling programs.



//    Are we currently learning about JavaSE, JavaEE, JavaME, or JavaFX?
    //JavaSE


//    What are some key differences between JavaScript and Java?
    //Frontend vs Backend, Interpreted vs. Compiled,  scripting vs. programming language

//    Describe in some detail the process by which a Java program is able to run on an operating system.
    


//    Why is Java touted as a “write once, run anywhere” language?

    //Because the code runs on the cross-platform Java virtual machine, developers can write a Java program on a Windows laptop, then run it on a Linux or Solaris server without recompiling the code for the new platform


//    What is the difference between static and instance methods/variables?
    //instance methods require an obj of its class to be created To invoke an instance method, we have to create an Object of the class in within which it defined.
    //Static methods are the methods in Java that can be called without creating an object of class. They are referenced by the class name itself or reference to the Object of that class.

//    What is an instance and what is instantiation?
    //Instantiate in Java means to call a constructor of a Class which creates an an instance or object, of the type of that Class


//    What is an object in Java?
    //instance of a class..?

//    What is a class in Java?
    //blueprint for an obj

//    What is the difference between a class and an object?
    //A class is a blueprint from which you can create the instance, i.e., objects. An object is the instance of the class

//    What is a constructor?
    //A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.

//    What are some additional uses of the ‘final’ keyword?
    //equiv to const, prevents reassignment

//    What are some uses of the ‘this’ keyword?
    //The this keyword provides us a way to refer to the current instance. You can think of this as saying "this object". You can only use the this keyword inside of an instance method, as it is an error to do so elsewhere.

//    What are visibility modifiers?
    //allow for encapsulation
    //The public keyword means that the field is accessible from everywhere
    //When a field is defined as private, it is only accessible within the class that defines it.

//    Why use private visibility?
    //for encapsulation and to prevent reassignment!
}
