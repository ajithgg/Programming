public class MaxSortedArray {

    public static void main(String[] args) {

        int a[] = {3, 0, 1, 2, 5, 4, 8, 6, 7};

        maxChunk(a);

    }

    private static void maxChunk(int[] a) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(a[i], max);

            if (i == max) {
                count++;
            }

        }

        System.out.println(count);
    }
}
