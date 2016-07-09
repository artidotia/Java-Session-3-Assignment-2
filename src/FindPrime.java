
public class FindPrime {
	public boolean isPrime(int num1){
		int j, cnt=0;
		if (num1 == 1) 
			cnt++;
		for (j=2; j<=num1/2; j++) {
			if (num1%j==0){
				cnt = cnt + 1;
				break;
			} //if ends
		}// for ends
		if (cnt == 0)
			return (true);
		else return false; 
	}
}
