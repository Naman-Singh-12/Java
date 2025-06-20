package Array;

public class ReverseArray {

    public static void main(String[] args){

        System.out.println("Reverse Array");
        int[] arr = {1, 3, 7, 2, 8, 4};
        for(int i = arr.length-1; i >=0 ; i--){
            System.out.print(" "+arr[i]);
        }
    }
}
