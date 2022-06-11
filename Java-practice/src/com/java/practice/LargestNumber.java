import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    public static void main(String[] args) {

        int[] arry = {3, 30, 34, 9};
        String s = largestNum(arry);
        System.out.println(s);

    }

    private static String largestNum(int[] num) {
        int n = num.length;
        String[] s = new String[n];
        for (int i = 0; i < n; i++)
            s[i] = String.valueOf(num[i]);

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(str);
        }

        return sb.toString();
    }
}
