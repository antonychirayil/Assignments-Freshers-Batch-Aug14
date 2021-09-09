package Assignment5;



public class Assign5_3 {

	    public static  <T> T[] swap(T[] array, int left, int right){
	        T temp = array[right];
	        array[right] = array[left];
	        array[left] = temp;
			return array;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums = new Integer[]{5, 12, 3, 7, 2};
	       for(int i:swap(nums, 0, 1)) {
	    	   System.out.println(i);
	       }

	}

	}


