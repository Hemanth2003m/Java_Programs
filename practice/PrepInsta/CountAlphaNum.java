package practice.PrepInsta;

public class CountAlphaNum {
    public static void main(String[] args) {
        String str = "Hello World!123";
        int cnt = 0;
        for(char i : str.toCharArray()){
            if((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z')){
                cnt++;
            }
            if(i >= '0' &&   i <= '9') cnt++;
        }
        System.out.println(cnt);
    }
}
