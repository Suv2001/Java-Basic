import java.util.*;
class Name {
    

    void check(String []name) {
        for (int i = 0; i < name.length - 1; i++) {
            for (int j = 0; j < name.length - 1; j++) {
                if (name[j].compareTo(name[j + 1]) > 0) {
                    String temp = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp;
                }
            }
        }
        
    }

    void display(String [] name,int num) {
        System.out.println("Sorted names:");
        for (int i = 0; i < num; i++) {
            
            System.out.println(name[i]);
        }
    }
}

public class Day14 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of inputs: ");
        int num = obj.nextInt();
        String[] name = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter name: ");
            name[i] = obj.next();
        }
        Name n = new Name();
       
        n.check(name);
        n.display(name, num);
    }
}