package into_java_basics;


class Intro {
    int myField; // A field or variable within the class

    // Constructor method
    public Intro(int value) {
        myField = value;
    }

    // A method within the class
    public void myMethod() {
        System.out.println("This is a method in MyClass");
    }
}

public class main{
    public static void main(String[] args) {
        // Declare an object of the MyClass class
        Intro myObject = new Intro(42); // Creating an instance of MyClass

        // Access fields and methods of the object
        System.out.println("Field value: " + myObject.myField);
        myObject.myMethod();
    }
}
