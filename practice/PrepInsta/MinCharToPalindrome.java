package practice.PrepInsta;

public class MinCharToPalindrome {
    public static boolean isPalindromic(int start, String str){

        int i= start; 
        int j = str.length() -1 ;
        while(i < j ){
            if(str.charAt(i) != str.charAt(j)){
               return false;
            }
                i++;
                j--;
            
        }
        
        return true;

    }
    public static void main(String[] args) {
        String str = "aacecaaa";
        StringBuffer res = new StringBuffer();
        int start = 0;
        int cnt = 0;

        while(start < str.length()){
            if(isPalindromic(start, str)){
                cnt = start - 1;
                break;
            }
            start++;
        }

        for(int i = cnt; i >=0 ; i-- ){
            res.append(str.charAt(i));
        }
        System.out.println(res);
        
    }
}
