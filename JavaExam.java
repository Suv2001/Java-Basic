public class JavaExam {
    // int a = 10;
    // static int b = 11;

    // void fun()
    // {
    //     int x =100;
    //     System.out.println(x);
    //     System.out.println(b);
    //     ++x;
    //     ++b;
    // }

    int a = 10;
    static int b =20;
    public static void main(String[] args) {
        // int c = 12;
        // System.out.println(c);
        // System.out.println(JavaExam.b);

        
        // System.out.println(obj.a); 
        
        // JavaExam obj = new JavaExam();

        // obj.fun();
        // obj.fun(); 

        // int a = 10;
        // double b = a;
        // System.out.println(a);
        // System.out.println(b);
        // double c = 10.5;
        // int d = (int)c;

        // System.out.println(c);
        // System.out.println(d);

        // int a = 10;
        // int b = 20;
        // a =a^b;
        // b = a^b; 
        // a= a^b;
        // System.out.println(a+" "+b);


        // JavaExam obj = new JavaExam();
        // JavaExam . display();
        // obj . disp();

        // A obj = new A();
        // obj . function();
        

        // B obj = new B(22,"Suvendu");

        // C obj1 = new C();
        // C obj2 = new C(obj1);

        D re = new D();
        D.display();



    }

    static void display()
    {
        System.out.println(b);
    }
    void disp()
    {
        System.out.println(a+" "+b);
    }
}

class A{
    int age ;
    String name ;
    // A()
    // {
        // int age =22;
        // String name = " Suvendu Dash Adhikary";
    //     System.out.println("My name is " + name +" and my age is "+ age);
    // }

    void function()
    {
        System.out.println("My name is " + name +" and my age is "+ age);
    }
}

class B{
    B(int x, String y)
    {
        System.out.println("My name is " + x + " and my age is "+ y);
    }
}

class C{
    int a ; int b;
    C()
    {
        a =10;
        b = 20;
        System.out.println("Sum of two number is "+(a+b));
    }

    C(C ref)
    {
        int c = ref.a;
        int d = ref.b;
        System.out.println("Product of two number is "+(c*d));
    }
}

class D{

    static void display()
    {
        System.out.println("Hello from Static methods");
    }

    D()
    {
        System.out.println("Hello from default constructor ");
    }
    {
        System.out.println("Hello from instance block");
    }
}
