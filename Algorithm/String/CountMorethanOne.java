public int countXX(String str){
      int _count = 0 ;
      for (int i = 0; i < str.length()-1 ; i++){
         if (str.substring(i, i + 2).equals("xx")){
            _count++;
         }
      }
      return _count;
   }
