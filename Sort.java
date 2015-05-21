package sort;

import java.util.Comparator;


abstract public class Sort<T extends Comparable<? super T>> {
    public abstract void sort(T[] a);

    public abstract void sort(T[] a, Comparator<T> c);

    public abstract void sort(T[] a, int lo, int hi);

    public abstract void sort(T[] a, int lo, int hi, Comparator<T> c);
    
    protected boolean checkBounds(Object[] a, int i, int j) {
        int n = a.length;
        return 0 <= i && i < n && 0 <= j && j < n;
    }

    protected boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    protected boolean less(Comparator<T> c, T v, T w) {
        return c.compare(v, w) < 0;
    }

    protected void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    protected void show(T[] a) {
        for (T x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
