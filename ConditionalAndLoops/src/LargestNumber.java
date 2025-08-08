import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a number :");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a number :");
        int c = sc.nextInt();
        sc.nextLine();
//
//        int max = a;
//
//        if(b > max) {
//
//            max = b;
//        }
//        if(c > max){
//            max = c;
//        }
//
//        System.out.println(max);

        int max = Math.max(c, Math.max(a,b));

        System.out.println("Larget number is: " + max);


        /*
        OUTPUT:

        Enter a number :
        45
        Enter a number :
        56
        Enter a number :
        67
        Larget number is: 67
         */

    }
}
