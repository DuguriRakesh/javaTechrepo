class Student {
    String name;

    public void displayName() {
        System.out.println("Rakesh");
    }
}

class ExtendedStudent extends Student {
    public void display() {
        System.out.println("My name is: " + name);
    }
}

public class Rakesh {
    public static void main(String[] args) {
        ExtendedStudent student = new ExtendedStudent();
        student.name = "Rakesh";
        student.display();
    }
}