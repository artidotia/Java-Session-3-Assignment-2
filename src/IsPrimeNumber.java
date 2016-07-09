import java.util.Scanner;


public class IsPrimeNumber {
	public static void main(String[] args) {
		int num1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number: ");
		num1 = sc.nextInt();
		FindPrime fp = new FindPrime();
		if (fp.isPrime(num1)) 
			System.out.println(num1 + " is a Prime Number");
		else 
			System.out.println(num1 + " is not a Prime Number");
	}
}
