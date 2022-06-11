import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static void main(String[] args) {

        int[] a1={4,9,5};
        int[] a2={9,4,9,8,4};
        Set<Integer> s=intersectArray(a1,a2);
        System.out.println(s);
    }

    private static Set<Integer> intersectArray(int[] a1,int[] a2)
    {
        Set<Integer> s=new HashSet<>();
        Arrays.sort(a1);
        Arrays.sort(a2);

        int count=a1.length<a2.length?a1.length:a2.length;

        for(int i=0,j=0;i<count;i++,j++) {
            if (a1[i] == a2[i]) {
                s.add(a1[i]);
            }
        }
        return s;
    }
}
