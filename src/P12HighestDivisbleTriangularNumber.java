


public class P12HighestDivisbleTriangularNumber {
	public static void main(String[] main){
		int maxDivisors = 500;
		int num = 1;
		int nextNum = 2;		
		while(divisors(num) <= 500){
			num += nextNum;
			nextNum++;
		}
		System.out.println("Digit over 500 divisors : "+num);
	}
	public static long divisors(int n){
		long counter = 0;
		for(long i=1; i*i<=n; i++){
			if(i*i < n){
				counter += 2;
			}else{
				counter += 1;
			}
			
		}
		return counter;
	}
}
