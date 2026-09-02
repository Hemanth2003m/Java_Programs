package practice.PrepInsta;

public class OrderBinary {
    public static void main(String[] args) {
        String str = "1C1B0A1";
        int res = str.charAt(0) - '0';

        for(int i = 1 ; i< str.length(); i += 2 ){
            int next = str.charAt(i + 1) - '0';
            if(str.charAt(i) == 'A'){
                res = res & next;
            }else if(str.charAt(i) == 'B'){
                res = res | next;
            }else if(str.charAt(i) == 'C'){
                res = res ^ next;
            }
        }
        System.out.println(res);
    }
}
