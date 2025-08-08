import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {



/*
        What is an Array?
        An array in Java is a container object that holds a fixed number of values of the same data type.

        Declaration
        int[] numbers;  // preferred
        int numbers[];  // also valid

        Allocation (with size)
        numbers = new int[5];  // holds 5 integers (0-based index)

        Allocation (with size)
        numbers = new int[5];  // holds 5 integers (0-based index)


        Syntax of array
        data_type[] arr = new data_type[siza];


                ⚠️ Common Mistakes
        Accessing out-of-bounds index: nums[nums.length] ❌ (last index is nums.length - 1)

        Mixing data types in one array: ❌ (Java arrays are typed)


         Declare      =>   int[] a;

         Initialize   =>   a = new int[5];

         Access       =>  `a[0]`, `a[a.length - 1]'

         Loop         =>  `for (int i = 0; i < a.length; i++)`

         Fixed size   =>   Cannot add/remove elements

         Type-safe    =>   All elements must be same type

*/


        int[] arr = new int[10];

        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

       // System.out.println(arr[0]);

        //traversing a loop

        //for each loop
//        for (int j : arr) {
//            System.out.println(j);

//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//            }


        System.out.println(Arrays.toString(arr));

        String[] names = {"Raj", "Rahul", "Asif", "Arif", "Salman"};

        System.out.print(names[4]);
        }






}