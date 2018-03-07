import java.util.BitSet;


public class GetPrime {
	public static void main(String[] args){
		//System.out.println("Here");
		//System.out.println(isPrime(100001));
		//System.out.println("Here");
		long[] arr = new long[10007];
		//arr = generateNPrimes(10001);
		//System.out.println(arr[4]);
		//System.out.println(arr[0]);
		System.out.println(computePrimes(10002));
	}
	public static long[] generateNPrimes(int n){
		System.out.println("Here");
		//System.out.println(isPrime(7));
		System.out.println("Here");
		int i =0;
		int k =0;
		long[] a = new long[100002];
		long[] b = new long[100002];
		//a[1] = 4;
		System.out.println(isPrime(5));
		System.out.println(a[1]);
		for(i=0;i<=n;i++){
			if(isPrime(i)){
				//System.out.println("inside isPrime");
				a[k] = i;
				
				//System.out.println(a[k]);
				k++;
			}
			
		}
		for(t=0;t<=n;t++){
			if(isPrime(i)){
				//System.out.println("inside isPrime");
				a[k] = i;
				
				//System.out.println(a[k]);
				k++;
			}
			
		}
		
		for(int p=0;p<10001;p++){
			if(a[p] == 9973){
				System.out.println("index" +p); 
				break;
			}
			System.out.println(a[p]);
		}
		System.out.println("------");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		return a;
		
	}
	public static boolean isPrime(int n){
		for(int i=2;i<n;i++){
			if(n%i == 0) return false;
		}
		return true;
		
	}
	
	public static BitSet computePrimes(int limit)
	{
	    final BitSet primes = new BitSet();
	    primes.set(0, false);
	    primes.set(1, false);
	    primes.set(2, limit, true);
	    for (int i = 0; i * i < limit; i++)
	    {
	        if (primes.get(i))
	        {
	            for (int j = i * i; j < limit; j += i)
	            {
	                primes.clear(j);
	            }
	        }
	    }
	    return primes;
	}
}
