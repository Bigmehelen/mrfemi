import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConsoleBasedAtm{
	ConsoleBasedAtm myConsoleBasedAtm = new ConsoleBasedAtm();

	@Test
	public void testTestConsoleBasedAtm(){
		myConsoleBasedAtm.createAccount("Helen" , "0.0");
	}

	@Test
	public void testTestConsoleBasedAtmCanDepositAmount(){
		myConsoleBasedAtm.createAccount("Helen", "0.0");
		myConsoleBasedAtm.depositAmount(50000.0);
		String expected = "50000.0";
		assertEquals(expected ,myConsoleBasedAtm.getBalance());
	}

	@Test
	public void testThatTestConsoleBasedAtmCanWithdraw(){
		myConsoleBasedAtm.createAccount("Helen" , "50000.0");
		myConsoleBasedAtm.withdrawAmount(15000.0);
		String expected = "35000.0";
		assertEquals( expected, myConsoleBasedAtm.getBalance());
	}

}