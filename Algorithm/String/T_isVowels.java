class Solution{
   public boolean isVowels(char ch){
      return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
   }

   public int countVowel(String str){
      int _count = 0;
      for (int i = 0 ; i < str.length() ; i++){
         if (this.isVowels(str.charAt(i))){
            _count++;
         }
      }
      return _count;
   }
}
