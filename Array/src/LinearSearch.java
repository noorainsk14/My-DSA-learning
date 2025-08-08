public class LinearSearch {
    public static void main(String[] args) {
        //Linear search
        int[] arr = {21,24,19,56,74,3,6,98,11,};
        int target = 56;
        int ans = linearSearch2(arr,target);
        System.out.println(ans);

    }
    //search the target and return true or false
    static boolean linearSearch3(int[] arr, int target){
        if (arr == null) {
            return false;
        }

        //for loop for search
        for(int element : arr){
            if(element == target){
                return true;
            }
        }

        //this statement will execute if the none of the above return statement is execute
        //hence the target not found
        return false;
    }

    //search the target and return the element
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        //for loop for search
        for(int element : arr){
            if(element == target){
                return element;
            }
        }

        //this statement will execute if the none of the above return statement is execute
        //hence the target not found
        return Integer.MAX_VALUE;
    }

    //search in the array return the index of the element found
    //otherwise item not found return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        //for loop for search
        for (int index=0; index<arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        //this statement will execute if the none of the above return statement is execute
        //hence the target not found
        return -1;
    }
}
