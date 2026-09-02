package practice.PrepInsta;

import java.util.HashMap;

public class SumofOddOccurence {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,4,4,5,5,5,5,6,7,7};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        int sum = 0;
        for(int i : map.keySet()){
            if(map.get(i) % 2 == 1){
                sum = sum + i;

            }
        }
        System.out.println(sum);
    }
}
