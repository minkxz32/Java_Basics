package into_java_basics;

public class Intance_Subject {
    // Instance Variables as subjects
    String compfund;
    String compprog;
    String understandself;
    String calculus;

    // Constructor to initialize instance variables
    public Intance_Subject(String compfund, String compprog, String understandself, String calculus) {
        this.compfund = compfund;
        this.compprog = compprog;
        this.understandself = understandself;
        this.calculus = calculus;
    }
     // Method to display information about the
    public void displaySubject() {
        System.out.println("Computing Fundamentals: " + compfund);
        System.out.println("Computer Programming: " + compprog);
        System.out.println("Understanding Self: " + understandself);
        System.out.println("Calculus: " + calculus);
    }
        public static void main(String[] args) {
            Intance_Subject subject = new Intance_Subject("ITE6101","ITE6102", "ITEGE6100","MATH6100");
            
            // Accessing and displaying instance variables
            subject.displaySubject();
        }
}
