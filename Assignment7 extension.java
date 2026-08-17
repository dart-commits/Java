interface P1 {
    public void display();
}

interface P2 {
    public void show();
}

class A implements P1, P2 {

    public void display() {
        System.out.println("From P1!");
    }

    public void show() {
        System.out.println("From P2!");
    }

    public static void main(String[] args) {
        A obj = new A();

        obj.display();
        obj.show();
    }
}
