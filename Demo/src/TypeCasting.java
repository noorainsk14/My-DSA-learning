import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();

        //Type Casting
        int a = (int)(10.5);
        System.out.println(a);

        //automatic type promotion in expression

        byte num1 = 20;
        byte num2 = 40;
        byte num3 = 100;

                // 20*40=800
                // 800/100
                // but byte range is 256
                // here expression is an int type that's why byte automatically convert into int type


        int evaluate = num1*num2/num3;

        System.out.println(evaluate);


    }
}
