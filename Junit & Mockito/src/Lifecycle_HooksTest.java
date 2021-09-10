package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lifecycle_HooksTest {
	
	Lifecycle_Hooks lifecyclehooks;
	@BeforeEach 
	void init() {
		lifecyclehooks = new Lifecycle_Hooks();
	}

	@Test
	void testAdd() {
	
		assertEquals(2, lifecyclehooks.add(1, 1),"should Add two numbers");	
	}
	
	@Test
	void testDivide() {
		
		assertThrows(ArithmeticException.class, () -> lifecyclehooks.divide(1, 0), "throws if it is divided by zero");
		
	}
	
	@Test
	void testComputeCircleArea() {
		
		assertEquals(Math.PI, lifecyclehooks.computeCircleArea(1),"should get the cirecle area");
	}

}

