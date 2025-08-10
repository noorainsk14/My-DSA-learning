

public class SearchInRange {

    public static void main(String[] args) {


        int[] arr = {2,45,76,85,12,23,54,13};
        int target = 85;
        int start = 2;
        int end = 6;
        System.out.println(linearSearch(arr,target,start,end));
    }

    static int linearSearch(int[] arr, int target, int start, int end){
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        return  -1;
    }
}
