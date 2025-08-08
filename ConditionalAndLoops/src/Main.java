import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Syntax of iF else statement

        if(condition) {
              body
         }
         else {

               body
         }

        Syntax of multiple if else if Statement


        if (condition) {
            body
         }
         else if (condition) {
            body
         }
         else {
            body
         }



         */


//        int age;
//        System.out.println("Enter your age");
//        age = sc.nextInt();
//
//        if (age>18) {
//            System.out.println("You are Adult");
//        }
//        else if (age>14 && age <18) {
//            System.out.println("You are a teen");
//        }else {
//            System.out.println("You are a child");
//        }

        /*
        Output

        PS D:\JAVA\ConditionalAndLoops\src> javac Main.java
        PS D:\JAVA\ConditionalAndLoops\src> java Main
        Enter your age
        15
        You are a teen
        PS D:\JAVA\ConditionalAndLoops\src> java Main
        Enter your age
        21
        You are Adult
        PS D:\JAVA\ConditionalAndLoops\src> java Main
        Enter your age
        8
        You are a child
         */

        /*
        Do while Loop

        do {
        body
        }while(condition)
         */


        int a =1;

        do {
            System.out.println("Hello");
            a++;
        }while (a<=5);
    }
}