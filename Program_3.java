import java.util.Scanner;
public class Program_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int a = sc.nextInt();
        series(a);
        sc.close();
    }

    public static void series(int a) {
        if(a % 2 == 0){
            a--;
        }
        int count = 1;
        for (int i = 0; i < a; i++) {
            System.out.println(count);
            count = count + 2;
        }
    }
}
