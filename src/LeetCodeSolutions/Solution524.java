package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution524 {
    public static String findLongestWord(String s, List<String> dictionary) {
        String longestWord = "";
        for(String word : dictionary)
        {
            int i=0,j=0;
            while(i<word.length() && j<s.length())
            {
                if(word.charAt(i) == s.charAt(j))
                {
                    i++;
                }
                j++;
            }
            if(i == word.length()) {
                if (longestWord.length() < word.length() ||(longestWord.length() == word.length() && word.compareTo(longestWord) < 0)) {
                    longestWord = word;
                }
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String s = "abpcplea";
        List<String> dictionary = new ArrayList<>(Arrays.asList("ale","apple","monkey","plea"));
        System.out.println(findLongestWord(s,dictionary));
    }
}
