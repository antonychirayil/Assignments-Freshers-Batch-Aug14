package MinMax;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class minmaxfinderq2Test {
	minmaxfinderq2 m;
	
	 @AfterAll
		static void afterAllinit() {
			System.out.println("Check Done See Test Results");
		}

	@BeforeEach
	void init() {
		 m = new minmaxfinderq2();
	}
	
	 @Test
	    public void testMinMax2() {
	        
	        int[] arr = {123,34,565,87,435};
	        SingleObject sobj1 = m.FindMinMax2(arr);
	        SingleObject sobj2 = m.FindMinMax2(arr);
	        Assert.assertEquals(sobj1.max,sobj2.max);
	    }
	    @Test
	    public void test1Array() {
	        int[] a1 = {2,2,2,2};
	     
	        assertThrows(ArrayStoreException.class, ()->m.FindMinMax2(a1),"ARRAYSTOREEXCEPTION");

	    }
}
