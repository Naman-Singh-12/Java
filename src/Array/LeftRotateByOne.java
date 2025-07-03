package Array;

public class LeftRotateByOne {

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        leftRotateByOne(arr);
    }

    private static void leftRotateByOne(int[] arr) {

        int first = arr[0];
        for(int i = 0; i <arr.length-1 ;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length -1] = first;

        for(int i : arr){
            System.out.print(" "+i);
        }

    }
}
