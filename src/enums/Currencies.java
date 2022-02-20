package enums;

/* ****** EXERCISE : Currencies ******
 * 
 * Declare an enum Currency.
 * 
 * It should include the following currency codes (according to ISO 4217):
 * 
 * 		USD — United States dollar
 * 		EUR — Euro
 * 		GBP — Pound sterling
 * 		RUB — Russian ruble
 * 		UAH — Ukrainian hryvnia
 * 		KZT — Kazakhstani tenge
 * 		CAD — Canadian dollar
 * 		JPY — Japanese yen
 * 		CNY — Chinese yuan
 * 
 * You must include all of the codes presented above and nothing else. 
 * The constants in the enum can be declared in any order.
 * 
 * Do not make the enum public for checking purposes.
 */

public class Currencies {

	enum Currency {
		CAD, 
		CNY, 
		EUR, 
		GBP, 
		JPY, 
		KZT, 
		RUB, 
		UAH, 
		USD
	}
	
	public static void main(String[] args) {
		for (Currency elt : Currency.values()) {
			System.out.printf("%d - %s%n", elt.ordinal(), elt);
		}
	}
}
