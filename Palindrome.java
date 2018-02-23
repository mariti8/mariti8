/**
* TODO: Описание класса
*/
public class Palindrome
{
	public static String reverseString(String s)
	{
		String s1 = "";
		for (int i = s.length()-1; i > 0; i--) { 
			s1=s1+s.charAt(i);
		}

		return s1;
	}

	public static boolean isPalindrome(String s)
	{
		String s1=reverseString(s);
		return s1.equals(s);
	}
	/**
	* функция main
	*/
	public static void main(String[] args)
	{
	 	for (int i = 0; i < args.length(); i++) 
 		{
 			//String s = args[i];

 			if ( isPalindrome(args[i]))
 			System.out.println("1");
 		else
 			System.out.println("0");

 		} 
	}
}