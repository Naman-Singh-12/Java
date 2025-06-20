package Array;

public class FindMinAndMaxElementInArray {

    public static void main(String[] args) {

        System.out.printf("Hello Min and Max element!\n");

        int[] arr = {5,6,3,8,3,11,14};
        findMinMaxElement(arr);
    }

    private static void findMinMaxElement(int[] arr) {

        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d ", arr[i]);

            if(arr[i] < min){
                min = arr[i];
            }else if(arr[i] > max){
                max = arr[i];
            }

        }
        System.out.println("\nmin = " + min);
        System.out.println("max = " + max);
    }


}
