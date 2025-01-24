//Runable  interface (Multi threading)

class A implements Runnable {
    public void run()
    {
        for (int i = 0; i <= 3; i++) 
        {
            System.out.println("From Thread A: " + i);
        }
        System.out.println("Exit from Thread A: " );
    }
}

public class Day20 {
    public static void main(String[] args) {
        A a = new A();
        Thread th = new Thread(a);
        th.start();
    }
}
