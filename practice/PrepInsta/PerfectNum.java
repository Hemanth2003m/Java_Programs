package practice.PrepInsta;
public class PerfectNum {
    public static void main(String[] args) {

        int n = 6;
    
        int sum = 1;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {

                sum += i;

                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        System.out.println(sum == n ? 1 : 0);
    }
}
