package practice;

import java.util.*;
public class GroupAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        scanner.nextLine();
        String[] word = new String[n];
        for(int i=0; i<n ;i++){
            word[i] = scanner.next();
            
        }
        
            Map<String, List<String>> map = new HashMap();
        for(String i : word){
            
            
            char[] ch = i.toCharArray();
            Arrays.sort(ch);
            String str =  new String(ch);
            
            map.putIfAbsent(str, new ArrayList<>());
            map.get(str).add(i);
            
        }
        for(List<String> grp: map.values()){
            
            System.out.println(grp);
            
        }
        
        
       
    }
}
