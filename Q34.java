public class Q34 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
    
}

abstract  class A{
    abstract void display();
    

}
class B extends A
{
    void display()
    {
        System.out.println("From class B");
    }
     
}
