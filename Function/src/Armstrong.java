import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int num = sc.nextInt();
       // System.out.println(isArmstrong(num));


        // find all the 3 digit armstrong between 1000 to 1000
        for(int i =100; i < 1000; i++){
            if(isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

    }
// ckeck 3 digit armstrong number
    static boolean  isArmstrong(int num){
        int original = num;
        int sum =0;

        while(num>0){
            int rem = num % 10;
            num = num / 10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
