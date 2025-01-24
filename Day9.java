//Simple inheritance
import java.util.Scanner;

class Area{
    int a,b;
    Area(int a,int b)
    {
       
        this. a = a;
        this. b = b;

    }

    void area()
    {
        System.out.println("Area of the room is " + (a*b) + "Unit^2" );
    }
}
class Volume extends Area{
    int c;
    Volume(int a, int b, int c)
    {
        super( a,  b);
        {
            this.c = c;
        }
    }
    void volume()
    {
        System.out.println("Volume of the room is "+ (a*b*c) + "unit^3");
    }
}

public class Day9 {
    public static void main(String[] args) {
        Volume obj = new Volume(12,15,20);
        obj.area();
        obj.volume();
    }
}
