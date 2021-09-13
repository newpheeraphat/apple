import java.util.*;

/**
 * InnerJ7
 */
public class InnerJ7 {

    public static void main(String[] args) {
       
        System.out.println(
            new Solution().duplicates("Hello World")
        );

    }

}

class Solution{

    public int duplicates(String str){
      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      int[] freq = new int[str.length()];
      int i, j;
        
      int _sum = 0;
      char string[] = str.toCharArray();

      for(i = 0; i <str.length(); i++) {  
         freq[i] = 1;  
         for(j = i+1; j <str.length(); j++) {  
            if(string[i] == string[j]) {  
               freq[i]++;  
               string[j] = '0';  
            }  
         }  
        }  

      for (i = 0 ; i < freq.length ; i++){
         map.put(string[i], freq[i]);
      }
      
      ArrayList<Integer> lst = new ArrayList<Integer>();
      for (Integer ele : map.values()){
          if (ele > 1){
            lst.add(ele);
          }
      }
      for (Integer ele : lst){
        _sum += (ele - 1);
      }
      return _sum;
    }

}
