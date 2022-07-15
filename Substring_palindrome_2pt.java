package String;
import java.util.*;
public class Substring_palindrome_2pt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your string: ");
		Scanner sc= new Scanner(System.in); 
		
		String str = sc.nextLine();
		print_pali_substring(str);
		
	}
	
	public static void print_pali_substring(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{	
				if(isPalindrome(str.substring(i,j))==true)
				System.out.println(str.substring(i,j)); 
			}
		}
	}
	
	public static boolean isPalindrome(String str)
	{
		int i=0;
		int j=str.length()-1;
		
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
				return false;
			
			i++;
			j--;
		}
		return true;
	}



}
