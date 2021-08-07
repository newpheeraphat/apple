public Map<Character, Integer> nTwice(String str){
      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      int[] freq = new int[str.length()];
      int i, j;

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
      return map;
   }
