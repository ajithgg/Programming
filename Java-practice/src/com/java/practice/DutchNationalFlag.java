import java.util.Arrays;

public class DutchNationalFlag {

    public static void main(String[] args) {

        int[] a={1,0,2,1,1,2,1};
        sortElements(a);

    }


    private static void sortElements(int[] a) {

        int low=0;
        int high=a.length-1;
        int mid=0;
        int temp;
        for (int i = 0; i < a.length; i++) {
            if (a[mid] == 0) {
                temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
            }
        }


        System.out.println(Arrays.toString(a));
    }

}
