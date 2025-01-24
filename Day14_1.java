import java.util.Arrays;
import java.util.Scanner;

class Motorvhical {
    String modelName;
    int modelNumber;
    float modelPrice;

    Motorvhical(String modelName, int modelNumber, float modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice;
    }

    void display() {
        System.out.println("Model name: " + modelName);
        System.out.println("Model number: " + modelNumber);
        System.out.println("Price: " + modelPrice);
    }
}

class CarName extends Motorvhical {
    float discountRate;
    float discountPrice = 0;
    float discount = 0;

    CarName(String a, int b, float c, float d) {
        super(a, b, c);
        discountRate = d;
    }

    void Discount() {
        discount = modelPrice * (discountRate / 100);
        discountPrice = modelPrice - discount;
    }

    void Display() {
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Discounted Price: " + discountPrice);
    }
}

public class Day14_1 {
    public static void main(String[] args) {
        CarName obj = new CarName("BMW", 240, 9245782, 12);
        obj.display();
        obj.Discount();
        obj.Display();
    }
}