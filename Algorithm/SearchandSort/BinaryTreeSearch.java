public class Challenge {
	public static int binarySearch(int[] arr, int l, int r, int target){
		if (r >= l){
			int mid = l + (r - l) / 2;
			
			if (arr[mid] == target){
				return mid;
			}
			
		
			if (arr[mid] > target){
				return binarySearch(arr, l, mid - 1, target);
			} 
			return binarySearch(arr, mid + 1, r, target);
		}
		return -1;
	}
	
  public static int search(int arr[], int item) {
		int result = binarySearch(arr, 0, arr.length - 1, item);
		if (result == -1){
			return result;
		}
		return result;
	}
}
