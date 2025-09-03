import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {7,9,5,4,6,2,1};
        mergeSort(arr, 0, arr.length-1);
       printArray(arr);
    }

    static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    };



    static void mergeSort(int[] arr, int s, int e){
        if(s>=e){
            return;
        }

        int mid = s + (e -s) / 2;

        mergeSort(arr, s, mid);//left part
        mergeSort(arr, mid+1, e);//right
        merge(arr, s, mid, e);

    }

    static void merge(int[] arr, int s, int mid, int e){
        //make tem arr
        int[] temp = new int[e-s+1];
        int i = s;//iterator for left
        int j = mid+1;//iterator for right
        int k = 0;//iterator for temp arr

        while (i <= mid && j <= e){
            if (arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //left part
        while (i <=mid){
            temp[k++]=arr[i++];
        }

        //right part
        while (j <= e){
            temp[k++] = arr[j++];
        }

        //copy temp to original arr
        for(k=0, i=s; k< temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }
}
