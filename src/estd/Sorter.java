package estd;

import java.util.Arrays;

public class Sorter {
    public void sort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int cur = a[i];
            int j = i - 1;
            while ((j >= 0) && (a[j] > cur)) {
                a[j + 1] = a[j--];
            }
            a[j + 1] = cur;
        }
        System.out.println(Arrays.toString(a));
    }
}
