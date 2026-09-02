package practice.PrepInsta;

public class MultiToSingDigit {
    public static void main(String[] args) {
        int num = 123;

        // n%9;
        
        while(num > 10){

        int temp = num;
         int sum = 0;
        
        while(temp != 0){
            int rem = temp %10;
                sum = sum + rem;
                temp = temp/10;
        }
        num = sum;
    }
    System.out.println(num);
    }
}
