import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {35,6,8,4},
                {53,6,9},
                {2,90,},
                {99}
        };
        int smallestNumber = Integer.MIN_VALUE;
        int target = 9;
        int[] ans = LinearSearch(arr,target);//format to return value in row and column{row, col}

        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString( maximum(arr,smallestNumber)));

    }


    static int[] LinearSearch(int[][] arr, int target) {

        for(int row=0; row<arr.length; row++ ) {
            for(int col = 0; col < arr[row].length; col++){
                if( arr[row][col] == target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }

    static int[] maximum(int[][] arr, int smallestNumber) {
        int max = smallestNumber;
        int rowIndex= -1;
        int colIndex= -1;
        for( int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++){
                if( arr[row][col] > max) {
                    max = arr[row][col];
                    rowIndex = row;
                    colIndex = col;

                }



            }
        }
        return new int[] {rowIndex,colIndex};
    }


}
