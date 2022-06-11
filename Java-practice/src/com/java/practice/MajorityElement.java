public class MajorityElement {

    public static void main(String[] args) {

        int a[] = {3, 2, 3};
        System.out.println(majorElement(a));

    }

    private static int majorElement(int[] a) {
        int majorElement = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (count == 0) {
                majorElement = a[i];
            }

            if (majorElement == a[i]) {
                count++;
            } else {
                count--;
            }
        }
     return majorElement;
    }
}
