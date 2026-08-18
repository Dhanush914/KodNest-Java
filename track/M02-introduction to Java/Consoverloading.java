
public class Student {

    String name;
    int age;
    double height;

    Student() {
        name = "Unknown";
        age = 0;
        height = 0.0;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 0.0;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    void display() {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("height: " + height);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Raja", 19);
        Student s3 = new Student("Meena", 21, 5.4);

        s1.display();
        s2.display();
        s3.display();
    }
}
