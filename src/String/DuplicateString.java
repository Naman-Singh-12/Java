package String;

import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

    public static void main(String[] args){

        System.out.print("Duplicate char in string");
        String str = "aaA bccc ddee";
        byNaiveApproach (str.toLowerCase());
        byCollection(str.toLowerCase());

    }

    private static void byCollection(String str) {
        Map<Character, Integer> map = new HashMap<>();

       for(char i : str.toCharArray()){
           if(i != ' ')
           map.put(i, map.getOrDefault(i,0)+1);
       }

       System.out.print("\n "+map);
    }

    private static void byNaiveApproach (String str) {
        StringBuilder already = new StringBuilder();
        for(int i = 0; i<str.length();i++){
            if(already.toString().contains(String.valueOf(str.charAt(i))) || str.charAt(i) == ' '){
                continue;
            }else{
                already = already.append(str.charAt(i));
            }
            int count = 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }

            System.out.print("\n "+str.charAt(i)+" : "+count);
        }
    }
}
