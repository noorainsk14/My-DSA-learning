import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j-1]> arr[j]){
                    swap(arr, j, j-1);
                }
            }
        }
    }

    public static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max index in the remaining array and swap with the correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex( arr, 0, last);
            swap(arr, maxIndex, last );
        }
    }

    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i < end; i++) {
            if(arr[max] < arr[i]){
                    max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }


    public static void bubble(int[] arr){
        boolean swapped;
        //Run loop for n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each swap max will come at the last index respective
            for(int j = 1; j < arr.length-i; j++){
                //swap if the item will smaller than the previous item
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;

                }
            }
            if(!swapped){
                break;
            }
        }
        
    }

}
