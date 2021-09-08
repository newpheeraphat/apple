public class Challenge {
	public static int[][] squarePatch(int n) {
				int[][] arr = new int[n][n];
        for (int[] row : arr){
            Arrays.fill(row, 3);
        }
        return arr;
	}
}
