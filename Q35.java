class A extends Thread {
    public void run()
    {
        System.out.println("From class A");
    }
}
class B extends Thread
{
    public void run()
    {
        System.out.println("From class B");
    }
}
class C extends Thread{
    public void run()
    {
        System.out.println("From class C");
    }
}


public class Q35 {
    public static  void main(String[] args) {
        A a= new A();
        a.setPriority(Thread.MIN_PRIORITY);
        a.start();
        B b= new B();
        b.setPriority(Thread.MAX_PRIORITY);
        b.start();
        C c= new C();
        c.setPriority(Thread.NORM_PRIORITY);
        c.start();
int p =0;
         p = a.getPriority();
        System.out.println(p);
        p = b.getPriority();
        System.out.println(p);
         p = c.getPriority();
        System.out.println(p);
    }
}
