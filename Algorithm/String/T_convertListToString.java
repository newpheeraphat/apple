public String stringSplosion(String str){
      List<String> list = new ArrayList<String>();
      String result = "";
      String strLast = "";
      for (int i = 0 ; i < str.length() ; i++){
         result = result + str.charAt(i);
         list.add(result);
      }
      for (String ch : list){
         strLast = strLast + ch;
      }
      return strLast;
   }
