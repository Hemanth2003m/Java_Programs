package practice.PrepInsta;

public class Count2Digit {
    public static void main(String[] args) {
        int start = 10;
        int end = 54;
        int cnt = 0;
        for(int i = start ; i<= end; i++){
            if(i%10 == 2 ) cnt++;
        }
        System.out.println(cnt);
    }
}
