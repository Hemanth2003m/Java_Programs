package practice.PrepInsta;

public class NxtPrime {
    public static boolean isPrime(int num){
        for(int i = 2 ; i*i <= num ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr ={21, 22, 23, 17};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }

        int next = sum;

        while(!isPrime(next)){
            next++;
        }
        System.out.println(next - sum);

    }
}
