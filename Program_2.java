import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int a = sc.nextInt();
        series(a);
        sc.close();
    }

    public static void series(int a) {
        int count = 1;
        for (int i = 0; i < a; i++) {
            System.out.println(count);
            count = count + 2;
        }
    }
}
