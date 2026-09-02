package practice.PrepInsta;

import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "aaaaabbbccccccccdaaa";
        
         String res = "";

        int cnt = 1;

        for(int i = 1 ; i < str.length(); i++){
           
            if(str.charAt(i) == str.charAt(i - 1)){
                cnt++;
            }else{
                res = res + str.charAt(i - 1);

                if(cnt > 1){
                    res = res + cnt;
                }
                cnt = 1;
            }
            

        }

        res = res + str.charAt(str.length() -1 );

        if(cnt > 1) res += cnt;

        System.out.println(res);
        
    }
}
