import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number in a:");
        int a = sc.nextInt();
        System.out.println("a: " + a);

        System.out.println("Enter a number in b:");
        int b = sc.nextInt();
        System.out.println("b: " + b);

        int[] swapped = swap(a, b);

        System.out.println("After swapping:");
        System.out.println("a: " + swapped[0]);
        System.out.println("b: " + swapped[1]);

        System.out.println(a);
        System.out.println(b);

        sc.close(); // Good practice to close the scanner
    }

    static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}
