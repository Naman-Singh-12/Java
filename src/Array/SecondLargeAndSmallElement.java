package Array;

public class SecondLargeAndSmallElement {

    public static void main(String[] args) {

        int[] arr = {4, 8, 5, 6, 10, 15};
        findSecondLargestAndSmallestElement(arr);
    }

    public static void findSecondLargestAndSmallestElement(int[] arr){

        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
                if(arr[i] > arr[j])
                {
                   arr[i] = arr[j]+arr[i];
                   arr[j]= arr[i] - arr[j];
                   arr[i] = arr[i] - arr[j];
                }
            }
        }
        for( int in : arr){
            System.out.print(" "+in);
        }
        System.out.println("\nSecond Largest Element is : "+arr[arr.length-2]);
        System.out.println("Second Smallest Element is : "+arr[1]);


    }
}
