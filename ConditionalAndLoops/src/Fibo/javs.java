package Fibo;

import java.util.Scanner;

public class javs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <=n) {
            int temp = b;
            b = b+a; //b=1
            a = temp; //temp =
            count ++;

        }

        System.out.println(b);
    }
}
