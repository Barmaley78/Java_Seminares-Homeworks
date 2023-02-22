// Реализовать алгоритм сортировки слиянием

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;

public class hw3 {
    private static Random rnd = new Random();
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(hw3.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int[] array = new int[100];
        fillArray(array, 0, 100);
        printArrayInt(array);
        mergeSort(array, array.length);
        System.out.printf("\n Отсортированный массив: \n");
        printArrayInt(array);
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) return;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) l[i] = a[i];
        for (int i = mid; i < n; i++) r[i - mid] = a[i];
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
    int i = 0, j = 0, k = 0;
    while (i < left && j < right) {
        if (l[i] <= r[j]) a[k++] = l[i++];
        else a[k++] = r[j++];
    }
    while (i < left) a[k++] = l[i++];
    while (j < right) a[k++] = r[j++];
}

    public static void printArrayInt(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.print(arr[arr.length-1]);
    }
    public static void fillArray(int[] col, int min, int max) {
        int count = col.length;
        int index = 0;
        while (index < count) {
          col[index] = rnd.nextInt(min, max);
          index = index + 1;
        }
      }
}