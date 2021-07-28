import java.util.Scanner;

public class Program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,8,9,12,46,76,82,15,20,30};
        int n = a.length;
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            for(int j = 0; j < n; j++)
            {
                if(a[j]%i == 0)
                {
                    count++;
                }
            }
            System.out.print(i +":"+ count + "   ");
            count = 0;
        }
        sc.close();
    }
}
