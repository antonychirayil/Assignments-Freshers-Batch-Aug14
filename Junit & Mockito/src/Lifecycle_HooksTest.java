package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Lifecycle_HooksTest {

	@Test
	void test() {
		Lifecycle_Hooks lifecyclehooks = new Lifecycle_Hooks();
		assertEquals(2, lifecyclehooks.add(1, 1),"should Add two numbers");
	}

}
