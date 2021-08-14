public class Averages {
	public static int[] getSliceOfArray(int[] arr, int start, int end){
		int[] slice = new int[end - start];
		for (int i = 0 ; i < slice.length ; i++){
			slice[i] = arr[start + i];
		}
		return slice;
	}
	
  public static int trimmedAverages(int[] arr) {
		Arrays.sort(arr);
		int[] slice = getSliceOfArray(arr, 1, arr.length - 1);
		float _sum = 0;
		float _avg = 0;
		for (Integer element : slice){
			_sum += element;
		}
		_avg = _sum / slice.length;
		return Math.round(_avg);
  }
