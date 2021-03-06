package MinMax;

import java.util.Arrays;

public class minmaxfinder {
	 public int[] FindMinMax(int[] a) {
	        if (a.length == 0)
	            throw new ArrayStoreException("Array size is zero");

	        int[] result = new int[10];
	        Arrays.sort(a);
	        result[0] = a[0];                     
	        result[1] = a[a.length - 1];

	        if (result[0] == result[1])
	            throw new ArrayStoreException("All elements are same.");

	        return result;
	    }

}
