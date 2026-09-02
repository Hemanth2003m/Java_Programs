package practice;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class MissingNumbers {

	
	static void missing(int[] arr1, int[] arr2) {
		
		Map<Integer, Integer> map= new HashMap<>();
		for(int i : arr1) {
			if(map.containsKey(i)) {
				map.put(i, map.getOrDefault(i,  0) + 1);
			}else {
				map.put(i,1);
			}
		}
		Map<Integer, Integer> map1= new HashMap<>();
		for(int i : arr2) {
			if(map1.containsKey(i)) {
				map1.put(i, map1.getOrDefault(i,  0) + 1);
			}else {
				map1.put(i,1);
			}
		}
		for (int key : map1.keySet()) {
            if ( map.get(key) < map1.get(key)) {
                System.out.println(key);
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {3, 5, 2, 4};
		int[] arr2 = {4, 5,4, 5};
		
		missing(arr1, arr2);

	}

}
