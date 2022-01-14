package iteratingOverArrays;

import java.util.Scanner;

public class IndividualTaxes {

	public static void main(String[] args) {
		/* ****** EXERCISE : Individual Taxes ******
		 * 
		 * In some country, there are N companies, and the law of that country 
		 * says that the taxes of each company are individual and appointed by 
		 * the president. The president wants to know which company pays the 
		 * most taxes. But sadly, none of the president's proxies know math 
		 * very well, so this work is transferred to you. Can you solve this 
		 * problem? 
		 * 
		 *  --> Input format:
		 * 		1) The first line of the input contains N which is the number  
		 * 		of companies in the country. 
		 * 		2) The second line contains the yearly incomes of each company. 
		 * 		All numbers are non-negative integers. 
		 * 		3) The third line contains individual taxes for each company 
		 * 		in percent of the company's income. All numbers are integers 
		 * 		from 0 to 100 inclusive. 
		 * 
		 * --> Output format: 
		 * 		You should output the number of the company that pays the most 
		 * 		taxes. Keep in mind that the enumeration of the companies 
		 * 		starts with number 1. If there are several companies with the 
		 * 		same payment sizes, output the number of the company with the 
		 * lowest number. 
		 */
			
		Scanner scanner = new Scanner(System.in);
		int numberComp = scanner.nextInt();
		int[] compIncomes = new int[numberComp];
		int paidTaxes = 0; // in cents, to avoid using a type "double".
		int maxTaxes = 0; // Same here, in cents instead of dollars.
		int winner = 1;
		for (int i = 0; i < numberComp; i++) {
			compIncomes[i] = scanner.nextInt();
		}
		for (int j = 0; j < numberComp; j++) {
			paidTaxes = scanner.nextInt() * compIncomes[j];
			if (paidTaxes > maxTaxes) {
				winner = j + 1; // We have a winner!
				maxTaxes = paidTaxes;
			}
		}
		System.out.format("%d%n", winner);
		
		scanner.close();
		
		System.out.println("****** END OF PROGRAM ******");
	}

}
