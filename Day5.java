//Q8. Write a java programe to find the volume of three different grometric shapes 
//    cube, cylender, cuboid with the help of parmeterized constructor .

import java. lang.Math;

class Volume{
    int x,y,z;
    Volume(int a,int b,int c)
    {
        x=a;
        y=b;
        z=c;
    }
    void cube()
    { 
        System.out.println("Volume of the Cube is "+ Math.pow(x,3));
    }
    void cylender()
    {
        System.out.println("Volume of the Cylender is "+ (3.14*x*x*y));
    }
    void cuboid()
    {
        System.out.println("Volume of the Cuboid is "+ (x*y*z));
    }
}
public class Day5 {
    public static void main(String[] args) {
        Volume obj =new Volume(5,6,9);
        obj.cube();
        obj.cylender();
        obj.cuboid();
    }
    
}
