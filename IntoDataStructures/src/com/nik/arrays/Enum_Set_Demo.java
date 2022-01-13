package com.nik.arrays;


//Java program to demonstrate range() method
import java.util.*;

//Creating an enum of GFG type
enum GFG {
	Welcome,
	To,
	The,
	World,
	of,
	Geeks
}
;

class Enum_Set_Demo {

	public static void main(String[] args)
	{

		// Creating an EnumSet
		EnumSet<GFG> e_set, e_set2;

		// Adding elements
		e_set = EnumSet.of(GFG.The);

		// Displaying the updated set
		System.out.println("The enum set is: " + e_set);

		// Adding elements
		e_set2 = EnumSet.of(GFG.Geeks);

		// Displaying the updated set
		System.out.println("The enum set is: " + e_set);

		// Adding elements
		e_set = EnumSet.of(GFG.Welcome);

		// Displaying the updated set
		System.out.println("The enum set is: " + e_set+e_set2);
	}
}

