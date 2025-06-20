package String;

public class ReverseString {

    public static void main(String[] args){

        System.out.print("Reverse String\n");
        String str = "Singh";


        for(int i = str.length()-1; i >= 0; i--){
            System.out.print( " "+ (str.charAt(i)));
        }
    }
}
