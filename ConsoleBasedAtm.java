public class ConsoleBasedAtm{
	private String[] account = new String[2];

	public void createAccount(String name , String balance){
		account[0] = name;
		account[1] = balance;

	}
	
	public String[] getAccount(){
		return account;
	
	}

	public String getName(){
		return account[0];
	
	}

	public String getBalance(){
		return account[1];
	
	}

	public void depositAmount(double amount){
		Double doubleDeposit = Double.parseDouble(account[1]);
		doubleDeposit = doubleDeposit + amount;
		account[1] = String.valueOf(doubleDeposit);
	}
	public void withdrawAmount(double amount){
		Double doubleBalance = Double.parseDouble(account[1]);
		if (amount <= 20000){
			doubleBalance = doubleBalance - amount;
			account[1] = String.valueOf(doubleBalance);
		}
		else if(amount > 20000){
			System.out.print("Amount exceed withdraw limit");
		}
		
	}

	


}