// дан массив чисел, нужно сформировать новую выборку
// только из четных чисел

import java.util.Random;

public class  prog1 {
    public static void main(String[] args) {
        Random randomGen = new Random();
        int[] array = new int[10];
        int[] resultArray = new int[10];
        int count = 0; 

        for (int i = 0; i < array.length; i++) {
            array[i] = randomGen.nextInt(1, 100);
            if(array[i] % 2 == 0) {
                resultArray[count] = array[i];
                System.out.println(resultArray[count]);
                count ++;            
            }
        // System.out.println(resultArray);
    }    
}
}
/* 
package lect1;
import java.util.List;

public class program {

    public static void main(String[] args)   {
        
        int size = 10;
        Integer[] ra = RandomArray(size, 1, 100);

        java.util.ArrayList<Integer> myList = new java.util.ArrayList<Integer>();
        
        for(int i=0; i<size; ++i){
            if(ra[i]%2==0)
                myList.add(ra[i]);
        }
        String.join(", ", ra);
        System.out.println(ra.toString());
        System.out.println(myList.toString());

    }


    public static Integer[] RandomArray(int size, int min, int max) {
        Integer[] result = new Integer[size];
        for(int i=0; i < size; ++i)
            result[i] = new java.util.Random().nextInt(min, max);
        return result;
    }
}
*/