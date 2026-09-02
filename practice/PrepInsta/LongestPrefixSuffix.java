package practice.PrepInsta;

import java.util.HashMap;

/**
 * MaxDiff
 */
public class LongestPrefixSuffix {

    public static void main(String[] args) {
         String str = "ababab";
        int res = 999;

        for (int i = 1; i < str.length(); i++) {

            String prefix = str.substring(0, i);
            String suffix = str.substring(str.length() - i);

            if (prefix.equals(suffix)) {
                res = Math.min(res,prefix.length());
            }
        }

        System.out.println(res);

        
    }
}