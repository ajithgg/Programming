import java.util.HashSet;
import java.util.Set;

public class RangeCovered {

    public static void main(String[] args) {

        int[][] ranges = {{1, 2}, {3, 4}, {5, 6}};
        int left = 2;
        int right = 5;

        int[][] ranges2 = {{1, 10}, {10, 20}};
        int left2 = 21;
        int right2 = 21;

        boolean status = isCovered2(ranges2, left2, right2);
        System.out.println(status);


    }

    public static boolean isCovered2(int[][] ranges, int left, int right) {

        Set hset = new HashSet();
        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                hset.add(i);
            }
        }
        System.out.println(hset);
        for (int i = left; i <= right; ++i) {
            if (!hset.contains(i)) {
                return false;
                //break;
            }
        }

        return true;
    }

    public static boolean isCovered(int[][] ranges, int left, int right) {
        for (int i = left; i < right; ++i) {
            boolean seen = false;
            for (int[] range : ranges) {
                if (i >= range[0] && i <= range[1]) {
                    seen = true;
                    break;
                }
                if (!seen)
                    return false;
            }
        }
        return true;
    }


}
