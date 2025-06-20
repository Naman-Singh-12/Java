package String;

public class PalindromeString {

    public static void main(String[] args){

        String str = "Lol";
        System.out.print(" is Palindrome(CS) : "+checkPalindrome(str));;
        System.out.print("\nis Palindrome : "+checkPalindrome(str.toUpperCase()));;
    }

    private static boolean checkPalindrome(String str) {

        for(int i = 0; i < (str.length()/2); i++ ){
            if((str.charAt(i) != str.charAt(str.length()-1-i))){
                return false;
            }
        }
        return true;
    }
}
