import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number in variable a :");
        int a = sc.nextInt();
        System.out.println("Enter number in variable b:");
        int b = sc.nextInt();

        System.out.println("Entered value in variable a :" + a);
        System.out.println("Entered value in variable b :" + b);
        swap(a, b);

    }

    static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }

}