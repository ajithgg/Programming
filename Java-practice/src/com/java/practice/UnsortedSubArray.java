import java.util.Arrays;

public class UnsortedSubArray {

    public static void main(String[] args) {

        int[] a = {1,3,2,2,2};
        int i = findSubArray2(a);
        System.out.println(i);

    }

    private static int findSubArray2(int[] a) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, n = a.length-1;

        for (int i = 0; i < n; i++) {
            if (a[i] > a[i + 1]) {
                min = i;
                break;
            }
        }

        for (int j = n; j > 0; j--) {
            if (a[j] < a[j - 1]) {
                max = j;
                break;
            }
        }

        if(min==Integer.MAX_VALUE && max == Integer.MIN_VALUE) return 0;

        return (max-min)+1;
    }

    private static int findSubArray(int[] a) {
        int[] s = new int[a.length];
        s = Arrays.copyOf(a, a.length);
        Arrays.sort(s);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(s));

        int start = 0;
        int end = a.length - 1;

        for (; start < a.length; start++) {
            if (a[start] != s[start]) break;
        }

        for (; end >= 0; end--) {
            if (a[end] != s[end]) break;
        }


        return end - start + 1;
    }
}
