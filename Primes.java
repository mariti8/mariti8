/**
* TODO: Описание класса
*/
public class Palindrome
{
	public static String reverseString (String s)
	{
		String s1 = "";
		for (int i = s.length; i > 0; i--) { 
			s1=s1+s.charAt(i);
		}

		return s1;
	}

	public boolean isPalindrome(String s)
	{
		string s1=reverseString(s);
		return s1.equals(s);
	}
	/**
	* TODO: Описание метода
	*/
	public static void main(String[] args)
	{
	 	for (int i = 0; i < args.length; i++) 
 		{
 			String s = args[i];
 			System.out.println(isPalindrome(s));
 		} 
	}
}