package practice.PrepInsta;

public class CloserNum {
    public static void main(String[] args) {
        int n = 13;
        int m = 4;

        int lower = (n/m) * m;
        int upper = lower + m;

         int lowerDiff = Math.abs(n - lower);
        int upperDiff = Math.abs(n - upper);

        if (lowerDiff < upperDiff) {
            System.out.println(lower);
        } 
        else if (upperDiff < lowerDiff) {
            System.out.println(upper);
        } 
    }
    
}
