package Array;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] arg){
        System.out.println("Remove duplicate from Sorted Array");

        int[] arr = {5,2,7,9,9,3,5,0,6,11,1,3};
        //removeDuplicateByNative(arr);
        removeDuplicateByCollection(arr);
    }

    private static void removeDuplicateByCollection(int[] arr) {
       int[] arr2 = Arrays.stream(arr)     // convert int[] to IntStream
               .distinct()      // remove duplicates
               .sorted()        // (optional)
               .toArray();      // back to int[]

        for(int i : arr2){
            System.out.print(" "+i);
        }

    }

    private static void removeDuplicateByNative(int[] arr) {

    }
}
