package String;

import java.util.ArrayList;
import java.util.List;

public class RotationOfBothString {

    public static void main(String[] args){
        System.out.println("Both String are rotation of each other");

        List<String[]> testCases = new ArrayList<>();

        testCases.add(new String[]{"rotation", "tionrota"});
        testCases.add(new String[]{"aaaa", "aaaa"});
        testCases.add(new String[]{"abcde", "deabc"});
        testCases.add(new String[]{"waterbottle", "erbottlewat"});
        testCases.add(new String[]{"xyz", "zxy"});
        testCases.add(new String[]{"hello", "ellohh"});
        testCases.add(new String[]{"abc", "acb"});
        testCases.add(new String[]{"Singh", "Hgnis"});
        testCases.add(new String[]{"abcd", "abcde"});
        testCases.add(new String[]{"Java", "avaj"});


        for(String[] str : testCases){
            System.out.println(str[0]+" and "+str[1]+" is rotation :"+checkBothStringRotation(str[0], str[1]));
        }

    }

    private static boolean checkBothStringRotation(String s, String s1) {
        if(s.length() != s1.length())
        {
            return false;
        }else{
            return (s + s).contains(s1);
        }
    }
}
