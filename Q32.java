interface A {
    void display();
}

interface B {
    void show();
}
class D{
    void produuct()
    {
        System.out.println(3*6);
    }
}

class C extends D implements A, B {
    public void display() {
        System.out.println("Method of interface A");
    }

    public void show() {
        System.out.println("Method of interface B");
    }
    void sum() {
        System.out.println(1+3);
    }
}

public class Q32 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
        obj.sum();
        obj.produuct();
    }
}
