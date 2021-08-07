public class CountXX {
   public int countXX(String str){
      if (str == ""){
         return 0;
      }
      if (str.charAt(0) == 'x'){
         return 1 + countXX((str.substring(1)));
      }
      return countXX(str.substring(1));
   }
}
