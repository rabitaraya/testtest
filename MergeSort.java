package sort;

import java.util.Comparator;

public final class MergeSort<T extends Comparable<? super T>> extends Sort<T> {
    private int counter;

    @Override
    public void sort(T[] a) {
        counter = 0;

        sort(a, 0, a.length - 1);
    }

    @Override
    public void sort(T[] a, Comparator<T> c) {
        counter = 0;

        sort(a, 0, a.length - 1, c);
    }

    @Override
    public void sort(T[] a, int lo, int hi) {
        if (lo >= hi) {
            ++counter;
            return;
        }
        int mid = (lo + hi) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        T[] aux = merge(a, lo, mid, hi);
        for (int i = lo; i <= hi; ++i) {
            a[i] = aux[i - lo];
        }
    }

    @Override
    public void sort(T[] a, int lo, int hi, Comparator<T> c) {
        if (lo >= hi) {
            ++counter;
            return;
        }
        int mid = (lo + hi) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        T[] aux = merge(a, lo, mid, hi, c);
        for (int i = lo; i <= hi; ++i) {
            a[i] = aux[i - lo];
        }
    }

    private T[] merge(T[] a, int lo, int mid, int hi) {
        @SuppressWarnings("unchecked")
        T[] aux = (T[]) new Comparable[hi - lo + 1];
        int i = lo;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= hi) {
            ++counter;

            if (less(a[i], a[j])) {
                aux[k++] = a[i++];
            } else {
                aux[k++] = a[j++];
            }
        }
        while (i <= mid) {
            ++counter;

            aux[k++] = a[i++];
        }
        while (j <= hi) {
            ++counter;

            aux[k++] = a[j++];
        }
        return aux;
    }

    private T[] merge(T[] a, int lo, int mid, int hi, Comparator<T> c) {
        @SuppressWarnings("unchecked")
        T[] aux = (T[]) new Comparable[hi - lo + 1];
        int i = lo;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= hi) {
            ++counter;

            if (less(c, a[i], a[j])) {
                aux[k++] = a[i++];
            } else {
                aux[k++] = a[j++];
            }
        }
        while (i <= mid) {
            ++counter;

            aux[k++] = a[i++];
        }
        while (j <= hi) {
            ++counter;

            aux[k++] = a[j++];
        }
        return aux;
    }

    public int getCounter() {
        return counter;
    }
}

