
public class bus {

    public static void main(String[] args) {
        conductor c = new conductor();
        Memory m = new Memory();
        c.collect(m);
        Ticket t = c.price();
        t.display();
    }

}

class Memory {

}

class Ticket {

    void display() {
        System.out.println("Ticket is displayed");
    }
}

class conductor {

    void collect(Memory a) {
        System.out.println("memory collected by passenger");
    }

    Ticket price() {
        Ticket t = new Ticket();
        System.out.println("Ticket ");
        return t;
    }
}
