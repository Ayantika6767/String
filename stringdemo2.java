package String;

public class stringdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="abcdef";
		String str1 ="ghijk";
		
		System.out.println(str.charAt(3));//d
		System.out.println(str.substring(2,5));// cde: substring from begining index to last+1
		System.out.println(str.substring(2));//cdef: till last 
		System.out.println(str.substring(2,6));// cdef
		System.out.println(str.substring(1,1));//prints nothing
		
		System.out.println(str.concat(str1));
		System.out.println(str.compareTo(str1));
		
	}

}
