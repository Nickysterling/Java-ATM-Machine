
import java.util.ArrayList;

public class Account {

	/* The name of the account. */
	private String name;
	
	/* The account ID number. */
	private String uuid;
	
	/* The user object that owns this account. */
	private User holder;
	
	/* The list of transactions for this account. */
	private ArrayList<Transaction> transactions;
	
	/**
	 * Create a new account.
	 * @param name    The name of the account
	 * @param holder  The user object that holds this account
	 * @param theBank The bank that issues the account
	 */
	public Account(String name, User holder, Bank theBank) {
		
		/* Set the account name and holder. */
		this.name = name;
		this.holder = holder;
		
		/* Get new account UUID. */
		this.uuid = theBank.getNewAccountUUID();
		
		/* Initialize transactions. */
		this.transactions = new ArrayList<Transaction>();
		
		/* Add account to holder and bank lists. */
		holder.addAccount(this);
		theBank.addAccount(this);
		
	}
}
