package String;

import java.util.Scanner;

public class stringdemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();              //reads string   
		System.out.print("You have entered: "+str);           
		
		System.out.print("Enter a string: ");  
		String str1= sc.next();   //reads string before the space  
		System.out.print("You have entered: "+str1); 
		        
		
		System.out.println("enter text");
		String str2= sc.nextLine();
		System.out.print("You have entered: "+str2); 
		
		System.out.print("enter text");
		String str3= sc.nextLine();
		System.out.print("You have entered: "+str3); 
		
		System.out.println("enter text");
		String str4= sc.next();
		System.out.print("You have entered: "+str4); 
		
		System.out.print("enter text");
		String str5= sc.next();
		System.out.print("You have entered: "+str5); 
	}

}
