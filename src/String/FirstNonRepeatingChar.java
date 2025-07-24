package String;

import java.util.*;

public class FirstNonRepeatingChar {

    public static void main(String[] args){

        String[] inputs = {
                "leetcode",
                "loveleetcode",
                "aabb",
                "",
                "a",
                "aa",
                "ab",
                "abcabcdd",
                "a".repeat(8) + "b" + "a",
                "abcdefghijklmnopqrstuvwxyz".repeat(4),
                "a".repeat(12),
                "z".repeat(9) + "y",
                "abcdabcdz",
                "abacabad",
                "aaabcccdeeef"
        };

        for(String i : inputs) {
            System.out.println("First non repeating char in"+i+" is : " + nativeWay(i));
        }
    }

    private static String nativeWay(String str) {

        for(int i = 0; i<str.length(); i++){
            boolean isUnique = true;
            for(int j = 0; j<str.length();j++){
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                return String.valueOf(str.charAt(i));
            }

        }
        return "Nun";
    }
}
