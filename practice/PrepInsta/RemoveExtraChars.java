package practice.PrepInsta;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveExtraChars {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         String str = sc.next();

        //abbbccdeab
        String res = "";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) +1);

            if(map.get(ch) <= 2){
                res += ch;
            }
        }
        System.out.println(res);

      


    }

}
