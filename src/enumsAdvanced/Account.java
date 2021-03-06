package enumsAdvanced;


/* ****** EXERCISE : Balance Management ******
 * 
 * You are given the enum Operation and the class Account. 
 * Their implementations are shown below.
 * 
 * 
 * Your task is to implement the method changeBalance to control balances. 
 * It has the following declaration:
 * 		public static boolean changeBalance(
 * 				Account account, Operation operation, Long sum)
 * 
 * - If the given operation is DEPOSIT the method adds 
 * the sum to the account's balance.
 * 
 * - If the operation is WITHDRAW the method subtracts the given sum from the 
 * account's balance. If the given sum is greater than the balance, the method 
 * shouldn't change it. Instead, the method must output the string "Not enough 
 * money to withdraw." (without quotes, don't forget the full point).
 * 
 * - In any case, the method returns a boolean value ? true if the balance has 
 * changed, false if it hasn't.
 * 
 * 
 */

import java.util.Scanner;

public class Account {

    /**
     * The method change the balance of the given account according to an operation.
     * @param account
     * @param operation
     * @return true if the balance has changed, otherwise - false.
     */
    public static boolean changeBalance(Account2 account, Operation operation, Long sum) {
        // write your implementation here
    	if (operation == Operation.DEPOSIT) {
    		account.setBalance(account.getBalance() + sum);
    		return true;
    	} else if (operation == Operation.WITHDRAW) {
    		if (account.getBalance() < sum) {
    			System.out.println("Not enough money to withdraw.");
    			return false;
    		} else {
    			account.setBalance(account.getBalance() - sum);
    			return true;
    		}
    	} else {
    		return false;
    	}
    }

    /* Do not change code below */
    enum Operation {
        /**
         * deposit (add) an amount into an Account
         */
        DEPOSIT,
        /**
         * withdraw (subtract) an amount from an Account
         */
        WITHDRAW
    }

    static class Account2 {

        private String code;
        private Long balance;

        public String getCode() {
            return code;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long balance) {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split("\\s+");

        Account2 account = new Account2();
        account.setBalance(Long.parseLong(parts[0]));

        Operation operation = Operation.valueOf(parts[1]);

        Long sum = Long.parseLong(parts[2]);

        if (changeBalance(account, operation, sum)) {
            System.out.println(account.getBalance());
        }
    }
}
