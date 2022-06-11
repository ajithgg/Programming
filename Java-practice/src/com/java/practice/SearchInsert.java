public class SearchInsert {

    public static void main(String[] args) {

        int[] a={1,3,5,6};
        int s=searchInsert(a,2);

        System.out.println(s);

    }

    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n-1, mid = ( start + end ) / 2;
        while(start <= end) {
            if(target == nums[mid]) {
                return mid;
            }
            else if(target < nums[mid]) {
                end  = end - 1;
            }
            else {
                start = start + 1;
            }
            mid = (start + end) / 2;

            //String.valueOf()
        }
        return start;
    }
}
