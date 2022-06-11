import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] a = {4, 5, 2, 1, 8, 9};

        selectSort(a);

    }

    private static void selectSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length - 1; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;
                }
            }

            int temp = a[smallest];
            a[smallest] = a[i];
            a[i] = temp;

        }

        System.out.println(Arrays.toString(a));
    }
}
