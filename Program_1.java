import java.util.Scanner;

class Operation {
    double a, b;
    String type_of_operation;
    Scanner sc = new Scanner(System.in);

    public void get() {
        System.out.println("Enter two values: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        calc();
    }

    public void calc() {
        System.out.printf("\nChoose Operation : \tadd\tsub\tmul\tdiv\nEnter Option: ");
        type_of_operation = sc.next();

        switch (type_of_operation.toLowerCase()) {
            case "add":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case "sub":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "mul":
                System.out.println(a + " x " + b + " = " + (a * b));
                break;
            case "div":
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.printf("\n INVALID OPTION!");
                break;
        }
    }
}

public class Program_1 {
    public static void main(String[] args) {
        Operation ob = new Operation();
        ob.get();
    }
}