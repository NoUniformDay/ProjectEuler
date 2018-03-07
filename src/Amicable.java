import java.util.ArrayList;

/*
 * Finds d(n) the sum of divisors of n, if a != b && d(a) == d(b)
 * a and b are said to be Amicable numbers
 * Program finds the sum of amicable numbers under 10,000
 */
public class Amicable {
	public static void main(String[] args){
		int[] sumDivisors = new int[10000];
		ArrayList<Integer> amicables = new ArrayList<Integer>();
		
		for(int i = 0; i < 10000; i++){
			int x = sumDivisors(i);
			sumDivisors[i] = x;
			if(x < i){
				if(sumDivisors[x] == i){
					System.out.println("Amicable pair "+x+" and "+i+"");
					amicables.add(Integer.valueOf(i));
					amicables.add(Integer.valueOf(x));
				}
			}
		}
		int sum =0;
		for(Integer i : amicables){
			sum += i.intValue();
		}
		System.out.println("Amicable sum : "+sum);
		
	}
	public static int sumDivisors(int n){
		int runningTotal = 0;
		for(int i = 1; i < n; i++){
			if(n % i == 0){
				runningTotal += i;
			}
		}
		return runningTotal;
	}
}
