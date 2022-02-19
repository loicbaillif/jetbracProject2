package objects;

/* ****** EXERCISE : Army ****** 
 * 
 * You decide to recall the happy days of your childhood and play Heroes. 
 * Of course, you need the army.
 * 
 * Your task is to create objects: 5 Unit, 3 Knight, 1 General, 1 Doctor.
 * 
 * Don't forget to give them names!
 */

class Army {

    public static void createArmy() {
        // Create all objects here
    	Unit unitAlpha = new Unit("Alpha");
    	Unit unitBravo = new Unit("Bravo");
    	Unit unitCharlie = new Unit("Charlie");
    	Unit unitDelta = new Unit("Delta");
    	Unit unitEcho = new Unit("Echo");
    	
    	Knight knightGolf = new Knight("Golf");
    	Knight knightHotel = new Knight("Hotel");
    	Knight knightIndia = new Knight("India");
    	
    	General generalKilo = new General("Kilo");
    	
    	Doctor doctorMike = new Doctor("Mike");
    	
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }
	
}
