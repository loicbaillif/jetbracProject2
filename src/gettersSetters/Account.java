package gettersSetters;

/* ****** GETTERS AND SETTERS - Exercise : Account ******
 * 
 * You are given a class named Account. It has three fields: 
 * 		a long field balance, 
 * 		a string field ownerName, 
 * 		a boolean flag locked.
 * 
 * Write getters and setters for all fields.
 */

class Account {

    private long balance;
    private String ownerName;
    private boolean locked;
    
    public long getBalance() {
    	return balance;
    }
    
    public void setBalance(long balance) {
    	this.balance = balance;
    }
    
    public String getOwnerName() {
    	return ownerName;
    }
    
    public void setOwnerName(String ownerName) {
    	if (!java.util.Objects.equals(ownerName, null)) {
    		this.ownerName = ownerName;
    	} else {
    		this.ownerName = "";
    	}
    }
    
    public boolean isLocked() {
    	return locked;
    }
    
    public void setLocked(boolean locked) {
    	this.locked = locked;
    }
}