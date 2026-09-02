package practice.PrepInsta;

public class KDigitNum {
    public static void main(String[] args) {
        int[] arr = {10,22,3,4,1,6,7,8,5,33,4,99,100};
        int K = 2;
        int cnt = 0;
        int upper =(int) Math.pow(10, K);
        int lower =(int) Math.pow(10, K - 1);
        for(int i : arr){
            if(upper > i && i >= lower) cnt++;
        }
        System.out.println(cnt);
    }
}
