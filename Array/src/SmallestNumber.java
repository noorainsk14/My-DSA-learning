public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6,8,9,4,59};
        int smallestNumber = Integer.MAX_VALUE;
        System.out.println(linearSearch(arr, smallestNumber));
    }

    static int linearSearch(int[] arr, int smallestNumber ) {

        int ans = smallestNumber;
        for (int i = 0; i < arr.length; i++) {
            if(ans>arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }

}
