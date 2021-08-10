public int[] makeLast(int[] nums){
      int last = nums[nums.length - 1];
      int[] res = new int[nums.length * 2];
      int multi = 0;
      int _pos = 0;
      for (int i = 0 ; i < nums.length * 2 - 1 ; i++){
         res[_pos] = i * multi;
         _pos++;
      }
      res[nums.length * 2] = last;
      return res;
   }
