
import java.util.Date;

public class Transaction {

	/* The amount of this transaction. */
	private double amount;
	
	/* The time and date of the transaction. */
	private Date timeStamp;
	
	/* A memo for this transaction. */
	private String memo;
	
	/* The account in which the transaction was performed. */
	private Account inAccount;
}
