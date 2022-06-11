import java.util.Arrays;

public class TwoPointer {

    public static void main(String[] args) {

        int[] arry={-3,2,3,3,6,8,15};
        int[] a=twoPointers(arry,6);
        System.out.println(Arrays.toString(a));

    }

    private static int[] twoPointers(int[] a, int k) {
        int start = 0;
        int end = a.length - 1;
        int res[] = new int[2];

        while (start < end) {
            int sum = a[start] + a[end];

            if (sum == k) {
                res[0] = a[start];
                res[1] = a[end];
                break;
            } else if (sum < k) {
                start++;

            } else {
                end--;

            }
        }

        return res;
    }
}
