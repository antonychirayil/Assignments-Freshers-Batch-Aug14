package MinMax;


import java.util.Arrays;

class SingleObject{
    int min;
    int max;
    
	public SingleObject(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
  }

public class minmaxfinderq2 {

    public SingleObject FindMinMax2(int[] a)
    {
        if (a.length==0)
            throw new ArrayStoreException("Array size - zero");

        int [] result = new int[10];
        Arrays.sort(a);
        if (result[0] == result[1])
            throw new ArrayStoreException("Elements are same");
        SingleObject sobj = new SingleObject(a[0],a[a.length-1]);
        return sobj;
    }
}