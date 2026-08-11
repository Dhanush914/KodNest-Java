
class Student {

    int roll;
    String name;
    double height;

    void run() {
        System.out.println("Running ");
    }

    void sleeping() {
        System.out.println("Sleeping");
    }
}

class object {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 2;
        s1.name = "rahul";
        s1.height = 5.5;

        System.out.println("Roll no  : " + s1.roll);
        System.out.println("Name of Student : " + s1.name);
        System.out.println("Height of Student : " + s1.height);

        s1.run();
        s1.sleeping();
    }
}
