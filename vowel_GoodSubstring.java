package String;

import java.util.Scanner;

public class vowel_GoodSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your string: ");
		Scanner sc= new Scanner(System.in); 
		
		String str = sc.nextLine();
		
		System.out.println(vowelSubstring(str));
		
	}

	
	/*public static void print_vowel_substring(String str)
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
	public static int isVowel(String str)
	{	int max=0,ans=0;
		for(int i=0;i<str.length();i++)
		{	
			int count=0;
			
			if( str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') 
			{	count=1;
				for(int j=i+1;j<=str.length();j++)
				{
					String sub=str.substring(i,j);
					 max= sub.length();
					 ans= Math.max(ans, max);
				}
			}
		}
		return ans;
	}
	*/
	
	public static int vowelSubstring(String str)
	{	
		int count=0,ans=0;
		
		for(int i=0;i<str.length();i++)
			
		{
			char ch=str.charAt(i);
		if(isVowel(ch)==true)
		{
			count++;
		}
		else
		{
			count=0;
			ans=Math.max(count, ans);
		}
		ans =Math.max(count, ans);
		
		}
		return ans;
	}
	public static boolean isVowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					return true;
				}
		return false;
	}
	
	
}
