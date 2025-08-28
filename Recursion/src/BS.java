public class BS {

    public static void main(String[] args) {
        int[] arr = {2,4,5,7,9,12,14,15,18,35};
        System.out.println(search(arr, 12, 0, arr.length-1));
    }

    static int search( int[] arr , int target, int s , int e){

        if( s >  e){
            return -1;

        }

        int m = s + (e -s) / 2;

        if( arr[m] == target ) { 
            return m;
        }

        if( target < arr[m]){
            return search(arr, target , s, m-1 );
        }
            return search(arr, target , m+1, e);

    }
}
