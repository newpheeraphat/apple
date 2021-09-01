public class Challenge {
	public static boolean isSymmetrical(int num) {
				String reverse = String.valueOf(num);
        if (reverse.length() == 0 || reverse.length() == 1){
            return true;
        }
        if (reverse.charAt(0) == reverse.charAt(reverse.length() - 1)){
            String toString = reverse.substring(1, reverse.length() - 1);
            if (toString.equals("")){
                return true;
            } else {
                int result = Integer.parseInt(toString);
                return isSymmetrical(result);
            }

        }
        return false;
	}
}
