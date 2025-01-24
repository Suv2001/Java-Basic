class Volume {
    int p, y, z;

    Volume(int p, int y, int z) {
        this.p = p;
        this.y = y;
        this.z = z;
    }

    void square(int a) {
        a = this.p;
        System.out.println(a*a + " area of square");
    }

    void rectangle(int a, int b) {
        a = this.p;
        b = this.y;
        System.out.println(a*b + " area of rectangle");
    }
}

public class Q12 {
    public static void main(String[] args) {
        Volume obj = new Volume(2, 3, 5);
        obj.square(obj.p);
        obj.rectangle(obj.p, obj.y);
    }
}