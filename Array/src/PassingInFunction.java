public class PassingInFunction {

        //    When you pass an array to a method:
        //
        //    You are passing the reference to the array (not a copy).
        //
        //    So, if the method changes the array elements, those changes affect the original array.

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        printArray(nums);

    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
