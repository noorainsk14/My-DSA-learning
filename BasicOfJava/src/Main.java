import java.util.Scanner;

// Taking input using Scanner Class
// Scanner is class which takes input with new keyword.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking input as integer
        System.out.println("Please enter roll number:");
        int rollno = input.nextInt();
        System.out.println("Your Roll NO : " + rollno);

        input.nextLine();

        //taking input as integer
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("Your name is :" + name);

        //nextFloat(), nextChar() is use to take input

        //Litral and identifier

        int a = 10;
        // here a is identifier and 10 is called literal
        // object = literal
        // variable = identifier

        //Data Types

        // *Primitive Dta types

        int number = 78;
        char var = 'v';
        float decimalNumber = 6.9f;
        double largeDecimalNumber = 7684387568.9787345;
        long largeIntegerValue = 4893658437298573568L;
        boolean check = true;

    }
}