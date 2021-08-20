public static double[] minMax(double[] arr) {
		double _max = Integer.MIN_VALUE;
		double _min = Integer.MAX_VALUE;
		for (int i = 0 ; i < arr.length ; i++){
			if (arr[i] > _max){
				_max = arr[i];
			}
			if (arr[i] < _min){
				_min = arr[i];
			}
		}
		double[] result = {_min, _max};
		return result;
	}
