import java.util.Scanner;
public class Sum {
    public int addition(int num1, int num2) {
        int sum = num1 +num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int firstNum = sc.nextInt();

        System.out.println("Enter Second Number");
        int secondNum = sc.nextInt();

        Sum s = new Sum();
        int result = s.addition(firstNum, secondNum);

        System.out.println("The sum is :" + result);
         sc.close();
    }
}
