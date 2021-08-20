public static String[] capMe(String[] s) {
			List<String> lst = new ArrayList<String>();
      for (int i = 0 ; i < s.length ; i++){
				 s[i] = s[i].toLowerCase();
         lst.add(Character.toUpperCase(s[i].charAt(0)) + s[i].substring(1));
      }
      String[] result = new String[s.length];
      int _pos = 0;
      for (String element : lst){
         result[_pos] = element;
         _pos++;
      }
      return result;
	}
