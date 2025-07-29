package Array;

public class MoveZeroAtEnd {

    public static void main(String[] args){
        int[][] testInputs = {
                {},                             // Empty array
                {0},                            // Single zero
                {5},                            // Single non-zero
                {1, 2, 0},                      // Zero at the end
                {0, 1, 0, 2, 0, 3},             // Multiple zeros
                {5, 6, 7},                      // No zeros
                {0, 0, 0},                      // All zeros
                {1, 0, 2},                      // Zero at second last position
                {0, 5, 6, 0},                   // Zero at start and end
                {0, 1, 0, 2, 3, 0, 4, 0, 5, 0, 6} // Longer mixed array
        };

        for(int[] i : testInputs){
            moveZeroAtEnd(i);
        }
    }

    private static void moveZeroAtEnd(int[] arr) {
        int pos = 0;
        for (int i = 0; i< arr.length; i++){
            if(arr[i] != 0){
                arr[pos] = arr[i];
                pos++;
            }
        }
        while(pos < arr.length){
            arr[pos] = 0;
            pos++;
        }
        for (int i = 0; i< arr.length; i++){
           System.out.print(" "+arr[i]);
        }
        System.out.println(" ");
    }
}
