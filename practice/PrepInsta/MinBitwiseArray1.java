package practice.PrepInsta;

import java.util.Arrays;

public class MinBitwiseArray1 {
    public static void main(String[] args) {
        int[] nums = {11,13,31};
        int[] res = new int[nums.length] ;
        int k = 0;
        for(int i : nums){
            res[k]=-1;
            for(int j = 1 ; j <= i ; j++){
                if((j | (j-1)) == i) {
                    res[k] = j - 1;
                    break;
                }
            }k++;
          
        }
        System.out.println(Arrays.toString(res));
    }
}

// int[] res = new int[nums.size()];

//         for(int i  = 0 ; i< nums.size(); i++){

//             int num = nums.get(i);

//             if(num == 2){
//                 res[i] = -1;
//                 continue;
//             }

//             int bit = 1;
//             while((num & bit) != 0){
//                 bit <<= 1;
//             }
//             res[i] = num - (bit >> 1);

//         }
//         return res;
