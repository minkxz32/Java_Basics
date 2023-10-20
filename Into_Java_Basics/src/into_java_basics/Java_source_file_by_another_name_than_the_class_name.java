
package into_java_basics;

// MyMainClass.java (source file name)
public class Java_source_file_by_another_name_than_the_class_name {
    public static void main(String[] args) {
        // Your main class code here
        MyCustomClass custom = new MyCustomClass();
        custom.printMessage();
    }
}
class MyCustomClass {
    public void printMessage() {
        System.out.println("Hello from MyCustomClass!");
    }
}
