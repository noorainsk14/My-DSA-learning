public class SplitArray {
    public static void main(String[] args) {

    }

    public static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;

        for(int i=0; i<nums.length; i++){
            start = Math.max(start, nums[i]);// largest single element
            end += nums[i];
        }

        //binary Search

        while(start<end){
            //try for the midle as potential ans
            int mid = start + (end -start)/2;

            //calculate how many pies=ces you divide this with max sum
            int sum = 0 ;
            int pieces = 1;

            for(int num : nums) {
                if (sum + num > mid){
                    //you cannot add this subarray make new one
                    // say you add this num in this new subarray, then sum = num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid+1;
            }else {
                end = mid;
            }
        }

        return end; //here start=end
    }

}
