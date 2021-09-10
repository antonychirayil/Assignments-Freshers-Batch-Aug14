package MinMax;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class minmaxfinderTest {
	minmaxfinder m;
	
	 @AfterAll
		static void afterAllinit() {
			System.out.println("Check Done See Test Results");
		}

	@BeforeEach
	void init() {
		 m = new minmaxfinder();
	}
	
	  @Test
      public void testMinMax1() {
          int[] arr = {24,48,109,38,5,91};
          int [] arr1 = new int[10];
          arr1[0]=5;
          arr1[1]=109;
          assertArrayEquals(arr1, m.FindMinMax(arr), "Min max are");
      }
	  
	  @Test
	    public void testMinMax2() {
	        int[] arr = {100,200,10,800,300,400};
	        int [] arr1 = new int[10];
	        arr1[0]=10;
	        arr1[1]=800;
	        assertArrayEquals(arr1, m.FindMinMax(arr), "Min max are");
	    }
	  @Test
	    public void testArray() {
		  minmaxfinder m = new minmaxfinder();
	        int[] a1 = new int[0];
	        assertThrows(ArrayStoreException.class, ()->m.FindMinMax(a1),"ARRAYSTOREEXCEPTION");		
	    }
	  
	  @Test
	    public void test1Array() {
		  minmaxfinder m1 = new minmaxfinder();
	        int[] a1 = {1, 1, 1, 1, 1, 1, 1, 1, 1};
	        assertThrows(ArrayStoreException.class, ()->m1.FindMinMax(a1),"ARRAYSTOREEXCEPTION");

	    }
	 
	  
}
