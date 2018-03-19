
public class Primes 
{


	public static void main(String[] args)
	 {
	 	//код программы поочередно вводящий числа 
	 	//от 1 до 100 и выводящий только просые 
	 	//согласно нашему алгоритму isPrime
	 	for (int i=1; i<=100; i++)
	 	{
	 		if(isPrime(i))
	 			System.out.println(i);

	 	}

	 }
	public static boolean isPrime(int n)
	{
		//код программы выясняющий является ли число простым
		for (int i=2; i<n; i++)
		{
			if ((n%i)==0)
				return false;
		}
			return true;
		
	}
}