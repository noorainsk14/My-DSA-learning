import java.util.Scanner;

public class FunctionOverloading {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int num = 10;
       String name = "Raj";

        Demo(num);
        Demo(name);

    }

    static void Demo(String name) {

        System.out.println(name);
    }

    static void Demo(int num){
        System.out.println(num);
    }
}
