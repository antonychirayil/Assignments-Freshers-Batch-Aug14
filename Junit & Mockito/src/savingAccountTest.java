package src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class savingAccountTest {
	
	savingAccount acc;
	@BeforeEach
	void init() {
	acc = new savingAccount();
	}
	
	@Test
	void test() {
		//assertThrows(ArithmeticException.class, () -> lifecyclehooks.divide(1, 0), "throws if it is divided by zero");
		assertThrows(RuntimeException.class, ()->acc.withdraw(5300));		
	}
	
	@Test
	void test1() {
		//assertThrows(ArithmeticException.class, () -> lifecyclehooks.divide(1, 0), "throws if it is divided by zero");
		assertThrows(IllegalBankTransactionException.class, ()->acc.withdraw(-500));		
	}
	
	@Test
	void test2() {
		//assertThrows(ArithmeticException.class, () -> lifecyclehooks.divide(1, 0), "throws if it is divided by zero");
		assertThrows(InsufficientBalanceException.class, ()->acc.withdraw(500),"THis Should show error and you get the correct "
				+ "output after passing the the input");		
	}
	
	@Test
	void test3() {
		//assertThrows(ArithmeticException.class, () -> lifecyclehooks.divide(1, 0), "throws if it is divided by zero");
		assertThrows(InsufficientBalanceException.class, ()->acc.withdraw(5600),"The min balance is kept 5000 so this condition will give no error");		
	}

}


