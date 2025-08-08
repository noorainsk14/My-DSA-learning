import java.util.Scanner;

public class CheckCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word : ");
        String word = sc.next();
        char ch = word.trim().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Word is in Lower case");
        }else {
            System.out.println("Word is in Upper case");
        }
    }
}
