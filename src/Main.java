import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int a = x / 100000;

        int b = x / 10000;
        b = b % 10;
        int c = x / 1000;
        c = c % 10;

        int sum1 = a + b +c;

        int d = x / 100;
        d = d % 10;
        int e = x / 10;
        e = e % 10;
        int f = x % 10;

        int sum2 = d + e + f;

        if (sum1 == sum2){
           System.out.println("YES");
        }else {
           System.out.println("NO");
        }

    }
}