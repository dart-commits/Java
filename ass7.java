class Parent{
    void display(){
        System.out.println("Parent Class Method");
    }
}
class Child extends Parent{
    void display(){
        super.display();
        System.out.println("Child Class mEthod");
    }
}
public class SuperExample{
    public static void main(String[] args){
        Child c = new Child();
        c.display();
    }
}

class Parent{
    final void display(){
        System.out.println("Final method in Parent Class");
    }
}
class Child extends Parent{
    void display();
}
public class FinalMethodExample{
    public static void main(String[] args){
        Child c = new Child();
        c.display();
    }
}
