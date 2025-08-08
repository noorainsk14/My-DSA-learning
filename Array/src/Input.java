import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        //Input in Array
        System.out.println("Enter 5 Numbers");
        for( int i = 0; i < arr.length; i++ ){
            arr[i] = sc.nextInt();
        }


        // Output in arr
        System.out.println("You entered");
        for (int num : arr) {      //for every element in the array print the element
            System.out.println(num);    //here num represent element of the array
        }
    }
}
