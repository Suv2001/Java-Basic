//volume of theree different shapes using parameterized constructor

class Shapes{
    int x,y,z;
     Shapes(int x,int y,int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    void cube()
    {
        System.out.println("Volumne of cube is "+ x*x*x);
    }
    void cylender()
    {
        System.out.println("Volumne of cube is "+ 3.14*x*x+y);
    }
    void cuboid()
    {
        System.out.println("Volumne of cube is "+ x*y*z);
    }
}
public class Q11 {
    public static void main(String[] args) {
        Shapes obj = new Shapes(3,5,4);
        obj. cube();
        obj.cylender();
        obj. cuboid();
    }
}


