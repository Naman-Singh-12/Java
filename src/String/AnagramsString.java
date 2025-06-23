package String;

import kotlin.Pair;

import java.util.Arrays;
import java.util.List;

public class AnagramsString {

    public static void main(String[] args){
        System.out.print("Anagrams String");

        List<Pair<String, String>> testCases = Arrays.asList(
                new Pair("listen", "silent"),          // Should be Anagram ✅
                new Pair("hello", "helloo"),           // Not Anagram ❌ (different lengths)
                new Pair("hello", "helol"),            // Should be Anagram ✅
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

            nativeAnagramCheck(test.getFirst(), test.getSecond());

        }

    }

    public static void nativeAnagramCheck(String str1, String str2){

    }
}
