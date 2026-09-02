package practice.PrepInsta;

import java.util.ArrayList;

public class PrintLeaders {
     public static void main(String[] args){

        int[] arr = {16, 19, 4, 3, 8, 3};
        ArrayList<Integer> list = new ArrayList<>();
        int size = arr.length;

        int maxNum = 0;

        for(int i = size -1 ; i>= 0 ; i--){
            if(arr[i] > maxNum){
                list.add(arr[i]);
                maxNum = arr[i];
            }
        }
        System.out.println(list.toString());




    }
    
}
