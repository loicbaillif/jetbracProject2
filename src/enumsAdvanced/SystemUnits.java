package enumsAdvanced;

/* ****** EXERCISE : System of Units ******
 * 
 * You are given an enum SystemUnits with three constants. 
 * Each constant stores a string field with its quantity name:
 * 
 * Declare the instance method getQuantityName that returns 
 * the quantity name of the constant.
 */

enum SystemUnits {
	
	M("length"), 
	KG("mass"), 
	S("time");
	
	public final String quantityName;
	
	SystemUnits(String quantityName) {
		this.quantityName = quantityName;
	}
	
	public String getQuantityName() {
		return this.quantityName;
	}
	
	public static void main(String[] args) {
		SystemUnits kgUnit = SystemUnits.KG;
		SystemUnits mUnit = SystemUnits.M;
		SystemUnits sUnit = SystemUnits.S;
		
		System.out.println(kgUnit.getQuantityName());
		System.out.println(mUnit.getQuantityName());
		System.out.println(sUnit.getQuantityName());
	}

	
}
