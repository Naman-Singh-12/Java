package String;


import java.util.Arrays;
import java.util.List;

public class AnagramsString {

    public static void main(String[] args){
        System.out.print("Anagrams String");

        boolean isCaseSensitive = true;
        boolean isSpaceCount = true;

       /* List<Pair<String, String>> testCases = Arrays.asList(
                new Pair("listen", "silent"),          // Should be Anagram ✅
                new Pair("hello", "helloo"),           // Not Anagram ❌ (different lengths)
                new Pair("Hello", "helol"),            // Should be Anagram ✅
                new Pair("aabbcc", "abcabc"),          // Should be Anagram ✅
                new Pair("helllo", "ellkho"),          // Not Anagram ❌ (different characters)
                new Pair("Listen", "Silent"),          // Case sensitive: will fail if you don’t handle case
                new Pair("Dormitory", "Dirty room"),   // Handle spaces: will fail if you don’t remove spaces
                new Pair("", ""),                      // Anagram ✅ (trivial case)
                new Pair("a", "a"),                    // Anagram ✅
                new Pair("a", "b"),                    // Not Anagram ❌ (different characters)
                new Pair("abc", "abc")                 // Anagram ✅
        );



        for (Pair<String, String> test : testCases) {
            String str1 = test.getFirst().toLowerCase();
            String str2 = test.getSecond().toLowerCase();


            checkAnagram(str1, str2);
           // nativeAnagramCheck(str1, str2);

        }*/

    }

    public static void nativeAnagramCheck(String str1, String str2){

        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if(str1.length() != str2.length()){
            System.out.print("\n"+str1+" "+str2+ " : Not Anagrams");
        }else{

            boolean isAnagrams = true;
            for(int i = 0; i<str1.length();i++) {

                int selfCount = 0;
                for (int k = 0; k < str1.length(); k++) {
                    if (str1.charAt(i) == str1.charAt(k)){
                        selfCount++;
                    }
                }

                int count = 0;
                for(int j =0; j<str2.length();j++){
                    if(str1.charAt(i) == str2.charAt(j)){
                       count++;
                    }
                }


                if(selfCount != count){
                    isAnagrams = false;
                }
            }

            if (isAnagrams) {
                System.out.print("\n"+str1+" "+str2+ " : Anagrams");

            }else{
                System.out.print("\n"+str1+" "+str2+ " : Not Anagrams");

            }
        }
    }
    public static void checkAnagram(String str1, String str2) {
        // Preprocess: remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println(str1 + " " + str2 + " : Not Anagrams");
            return;
        }

        int[] frequency = new int[256]; // ASCII characters

        // Count characters in str1
        for (char c : str1.toCharArray()) {
            frequency[c]++;
        }

        // Subtract counts using str2
        for (char c : str2.toCharArray()) {
            frequency[c]--;
        }

        // Check if all counts are zero
        for (int count : frequency) {
            if (count != 0) {
                System.out.println(str1 + " " + str2 + " : Not Anagrams");
                return;
            }
        }

        System.out.println(str1 + " " + str2 + " : Anagrams");
    }
}
