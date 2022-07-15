package String;

public class stringdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "hello"; // suppose address 1k
		String str1= "hello"; // address will point at 1k in the INTERN POOL/STRING POOL of Heap Memory 
		                      // since same content stored
		
		String st= new String("hello"); // suppose address 2k and 3k created by st and st1
		String st1= new String("hello"); // using new keyword new addresses in heap memory is created
		
		/*
		 * NEW KEYWORD Implicitly runs when:
		 * 1. new keyword
		 * 2. user input
		 * 3. +
		 * 4. concat function
		 * (ADDRESS POINTS OUT OF POOL BUT INSIDE HEAP
		 */
		
		System.out.println(st1==st); // false since diff location
		/*
		 * WHEN WE USE  == IN non primitive data types
		 * like: class, strings, arraylist etc
		 * address gets compared not content
		 */
		System.out.println(st1.equals(st)); // true since content is compared
		System.out.println(str==str1); // true since same location
		System.out.println(str==st); // false since diff location
		
		str = str +"bye";
		System.out.println(str); // WE CANT CHANGE STRING CONTENT IN THE SAME LOCATION ADDRESS
		
		/*
		 * Now since we have used "+" 
		 * Str copies its location out of pool in heap memory somewhere 
		 * suppose new location is 4k
		 * Now "bye" gets added to "hello" in heap out of pool
		 * location pointing to a different memory address 
		 * what about the older address? : str1 still points to 1k 
		 * OR ELSE GARBAGE COLLECTOR takes away content of the location which has no pointer pointing to it.
		 */
		
		String s= "hell"+"o";//stored in pool
		String s1= "hell";//stored in pool but new location 
		s1= s1+"o";// stored in heap out of pool in new location
		
		System.out.println(str1==s);//true since adds o in the first line so reads as hello in the first place
		System.out.println(str1==s1); //false since adds o in 2nd line, "hello" points to a new location
		
		
	}

}
