import java.util.*;
class Employee{
    String name ;
    String address ;
    int age  ;
    String gender  ;
    Employee(String name, String address, int age, String gender)
    {
        this . name = name;
        this . address = address;
        this . age = age;
        this . gender = gender;
    }
    void display()
    {
        System.out.println("Employee name : "+name+"\naddress : "+address+"\ngender : "+gender);
    }
}

class fullTimeEmployee extends Employee
{
    float salary ;
    String designation;
    fullTimeEmployee(String name, String address, int age, String gender,float salary,String designation){
        super(name, address, age, gender);
        this . salary = salary;
        this . designation = designation;
    }
    void Display()
    {
        display();
        System.out.println("\nsalary : "+salary+"\ndesignation : "+designation);
    }
}

class pertimeEmployee extends Employee
{
    int workhours ;
    float ratePerHours;
    pertimeEmployee (String name, String address, int age, String gender,int workhours,float ratePerHours) {
        super(name, address, age, gender);
        this . workhours = workhours;
        this . ratePerHours = ratePerHours;
    }
    void display1()
    {
        display();
        System.out.println("\nworkhours : "+workhours+"\nratePerHours : "+ratePerHours);
    }
}

public class Day15 {
    public static void main(String[] args) {
        Scanner suv = new Scanner(System.in);
        int a=1;
        Employee e = new Employee("Chayan", "Birati",20,  "Male");

        fullTimeEmployee f = new fullTimeEmployee("Chayan", "Birati",20,  "Male", 10000, "Manager");

        pertimeEmployee p = new pertimeEmployee("Chayan", "Birati",20,  "Male", 8, 2500);


        System.out.println("Enter your choice of employee");
        do
        { 
            System.out.println("\n1. fullTimeEmployee\n2. pertimeEmployee\n0. for exit\n");
            int select = suv .nextInt(); ;
            if(select == 1)
            {
                f.Display();
            }
             if(select == 2)
            {
                p.display1();
            }
            if(select == 0)
            {
                break;
            }
        }
        while(a==1);
    }  
}
