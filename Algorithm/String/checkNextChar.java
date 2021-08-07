public boolean mixStart(String str){
      if (str.length() <= 2){ return false; }
      for (int i = 0 ; i < str.length() ; i++ ){
         if(str.charAt(i) == 'i' && str.charAt(i + 1) == 'x'){
            return true;
         }
      }
      return false;
   }
