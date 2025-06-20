package Array;

public class ArrayIsSorted {

    public static void main(String[] args){

        System.out.print("Sorting Array");
        int[] arr = {5,2,7,4,9,1,6,4};
        sortTheArray(arr);
    }

    private static void sortTheArray(int[] arr) {
        System.out.println(" ");
        for(int i = 0; i < arr.length ; i++){
            for(int j = i+1; j<arr.length ; j++){
                if(arr[i] > arr[j]){
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j] ;
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}
