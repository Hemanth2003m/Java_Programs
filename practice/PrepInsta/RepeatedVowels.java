package practice.PrepInsta;

import java.util.HashMap;

public class RepeatedVowels {
    public static void main(String[] args) {
        String str = "abeeeeabutiedcia";
        String vowels = "aeiou";
        HashMap<Character, Integer> map  =  new HashMap<>();

        for(char i : str.toCharArray()){
            if(vowels.contains(String.valueOf(i))){
                map.put(i,map.getOrDefault(i, 0) +1);
            }
        }
        char vowel = ' ';
        int maxCount = 0;
        for(char ch : map.keySet()){
           if(map.get(ch) > maxCount){
            maxCount = map.get(ch);
            vowel = ch;
           }
        }
        System.out.println(vowel);
    }
}
