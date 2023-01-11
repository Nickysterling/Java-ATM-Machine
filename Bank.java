
import java.util.ArrayList;
import java.util.Random;

public class Bank {
	
	private String name;
	
	private ArrayList<User> users;
	
	private ArrayList<Account> accounts;

	/**
	 * Generate a new universally unique ID for a user.
	 * @return the uuid
	 */
	public String getNewUserUUID() {
		
		String uuid;
		
		Random rng = new Random();
		int length = 6;
		boolean nonUnique = false;
		
		/* Continue looping until a unique uuid is generated */
		do {
			/* Generate a number in the form of a string */
			uuid = "";
			for(int i = 0; i < length; i++) {
				uuid += ((Integer)rng.nextInt(10)).toString();
			}
		} while(nonUnique);
			
		
		return uuid;
	}

	public String getNewAccountUUID() {
		
	}

	/**
	 * Add an account.
	 * @param anAcct The account to add
	 */
	public void addAccount(Account anAcct) {
		this.accounts.add(anAcct);
	}
	
}
