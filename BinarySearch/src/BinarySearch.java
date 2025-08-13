public class BinarySearch {
    public static void main(String[] args) {


        int[] arr = {2,3,5,7,12,14,15,18,22,25,33,56};
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;


        while (start <= end) {
            //find the middle element
            int mid = start + (end - start)/2;


            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
