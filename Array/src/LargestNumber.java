public class LargestNumber {


    public static void main(String[] args) {

        int[] arr = {2,5,3,6,8,9,4,59};
        int largestNumber = Integer.MIN_VALUE;
        System.out.println(linearSearch(arr, largestNumber));
    }

    static int linearSearch(int[]arr, int largestNumber ){
        int ans = largestNumber;
            for (int i = 0; i < arr.length; i++){
                if( arr[i] > ans) {
                    ans = arr[i];
        }

    }
        return ans;
    }
}
