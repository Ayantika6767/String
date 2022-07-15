

package String;
import java.util.*; 
public class Substring_method {

	public static void main(String[] args) {
		
		
		System.out.println("Enter your string: ");
		Scanner sc= new Scanner(System.in); 
		
		String str = sc.nextLine();
		substring(str);
	
		
	}
	public static void substring(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j)); 
			}
		}
	}

}
