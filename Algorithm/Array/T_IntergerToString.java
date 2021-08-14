public String formatPhonenumber(int[] arr){
      String[] strArray = new String[arr.length];
      int _pos = 0;
      for (int i = 0 ; i < arr.length ; i++){
         strArray[_pos] = String.valueOf(arr[i]);
         _pos++;
      }
      String phoneNumber = "".join("", strArray);
      return phoneNumber;
   }
