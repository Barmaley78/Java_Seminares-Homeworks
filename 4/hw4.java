// Реализовать алгоритм пирамидальной сортировки (HeapSort)

import java.io.IOException;
import java.util.Random;
import java.util.logging.*;
public class hw4 {
    private static Random rnd = new Random();
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(hw4.class.getName());
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int[] array = new int[100];
        fillArray(array, 0, 100);
        printArrayInt(array);
        // int[] newArr = listSort(array);
        System.out.printf("\n Отсортированный массив: \n");
        // printArrayInt(newArr);
    }

    // public static int[] listSort(int [] arr){
    //     for(int k = 0; k < arr.length-1; k++) {
            
    //         for (int i = 0; i < arr.length - k-1; i++){
    //             if (arr[i] > arr[i+1]) {
    //                 int temp = arr[i];
    //                 arr[i] = arr[i+1];
    //                 arr[i+1] = temp;
    //             }
    //         }
    //     }
    //     return arr;
    // }

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