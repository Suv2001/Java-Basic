// Writ e a java programe to implement the conceft of multi threading

class A extends Thread{
    public void run()
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("From thread A: " + i);
        }
    }
}
class B extends Thread {
    public void run()
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("From thread B: " + i);
        }
    }
}
class C extends Thread {
    public void run()
    {
        for(int i=0; i<3; i++)
        {
            System.out.println("From thread C: " + i);
        }
    }
}
public class Day17 {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        B b = new B();
        b.start();
        C c = new C();
        c.start();
    }
}
