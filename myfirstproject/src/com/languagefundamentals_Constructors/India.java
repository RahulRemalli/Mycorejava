package com.languagefundamentals_Constructors;

// Parent
class India {
	int states;
	String capital;
	String largeststate;
	String smalleststate;
	String national_bird;

	India() {

	}

	public static void main(String[] args) {

	}

}

// Child
class States extends India {
	States(int states, String capital, String largeststate, String smalleststate, String national_bird) {
		super.states = states;
		super.capital = capital;
		super.largeststate = largeststate;
		super.smalleststate = smalleststate;
		super.national_bird = national_bird;
	}

	public static void main(String[] args) {
		System.out.println("Main method started !");
		States s = new States(28, "New_Delhi", "Rajastan", "Goa", "peacock");
		s.get();
	}

	void get() {
		System.out.println("How many states in india :" + states);
		System.out.println("Capital of india :" + capital);
		System.out.println("Largest state is :" + largeststate);
		System.out.println("Smallest state :" + smalleststate);
		System.out.println("National bird :" + national_bird);

	}
}
