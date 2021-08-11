public class Program {
  public static String longBurp(int n) {
		String repeated = "";
		for (int i = 0 ; i < n ; i++){
			repeated += "r";
		}
		return "Bu" + repeated + "p";
  }
}
