import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int reversed = 0;

        while( number != 0) {
            int digit = number % 10 ;
            reversed = reversed * 10 + digit;
            number/= 10;
        }
        System.out.println("Reversed number is : " +reversed);







    }
}

//import java.util.Scanner;
//
//public class ReverseNumber {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input from user
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        int reversed = 0;
//
//        // Reversing the number
//        while (number != 0) {
//            int digit = number % 10;         // Get the last digit
//            reversed = reversed * 10 + digit; // Append digit
//            number /= 10;                    // Remove the last digit
//        }
//
//        // Output the reversed number
//        System.out.println("Reversed number: " + reversed);
//    }
//}
