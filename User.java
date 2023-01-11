
import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
	
	/* The first name of the user. */
	private String firstName;
	
	/* The last name of the user. */
	private String lastName;
	
	/* The ID number of the user. */
	private String uuid;
	
	/* The MD5 hash of the user's pin number. */	
	private byte pinHash[];
	
	/* The list of accounts for this user. */
	private ArrayList<Account> accounts;
	
	/**
	 * Create a new user.
	 * @param firstName the user's first name
	 * @param lastName  the user's last name 
	 * @param pin       the user's account pin number
	 * @param theBank   the Bank object that the user is a customer of
	 */
	public User(String firstName, String lastName, String pin, Bank theBank) {
		
		/* Set user's name. */		
		this.firstName = firstName;
		this.lastName = lastName;
		
		/* Store the pin's MD5 Hash, rather than original value, for security reasons. */
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			this.pinHash = md.digest(pin.getBytes());
		} catch (NoSuchAlgorithmException e) {
			System.err.println("Error Caught! NoSuchAlgorithmException.");
			e.printStackTrace();
			System.exit(1);
		}
		
		/* Get a new, unique universal ID for the user. */
		this.uuid = theBank.getNewUserUUID();
		
		/* Create an empty list of accounts. */
		this.accounts = new ArrayList<Account>();
		
		/* Print log message. */
		System.out.printf("New user %s, %s with ID %s successfully created.\n", lastName, 
				firstName, this.uuid);
		
	}

	/**
	 * Add an account for the user.
	 * @param anAcct The account to add
	 */
	public void addAccount(Account anAcct) {
		this.accounts.add(anAcct);
	}
	
}
