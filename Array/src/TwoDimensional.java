import java.util.Scanner;

public class TwoDimensional {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //Syntax of Multidimensional Array
        //int[][] arr = new int [3][3];

            //         int[][] arr =  {
            //                {4,3,2},
            //                {8,6,7},
            //                {1,5,8},
            //        };

        //System.out.println(arr[1][2]);



        //Traversing on 2D Array

            //        for(int i=0; i < arr.length; i++){
            //            for( int j=0; j < arr[i].length; j++){
            //                System.out.print(arr[i][j] + " ");
            //            }
            //            System.out.println();
            //
            //        }


            //Input in 2D array

        int[][] arr = new int[3][3];

        //for loop to take input
        for(int row=0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                arr[row][col]= sc.nextInt();
            }
            System.out.println();
        }


        //for loop to show output

        for (int row=0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }



    }
}
