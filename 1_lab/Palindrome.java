/**
* TODO: Описание класса
*/
public class Palindrome
{
	public static String reverseString(String s)
	{
		//создаем пустую строку 
		//переворачиваем слово поэлементно записывая с конца 
		//в начало в строк s1
		//возвращаем строку
		String s1 = "";
		for (int i = s.length()-1; i >= 0; i--) { 
			s1=s1+s.charAt(i);
		}

		return s1;
	}

	public static boolean isPalindrome(String s)
	{
		//проверяем является ли строка полиномом
		//возвращаем ди или нет(правда или ложь)
		String s1=reverseString(s);
		return s1.equals(s);
	}
	
	public static void main(String[] args)
	{
		//основная функция, собирающая воедино все функции
		// и реализующая их работу
	 	for (int i = 0; i < args.length; i++) 
 		{
 			System.out.println(isPalindrome(args[i]));
 		} 
	}
}