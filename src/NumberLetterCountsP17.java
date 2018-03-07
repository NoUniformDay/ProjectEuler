
public class NumberLetterCountsP17 {
	public static void main(String args){
		System.out.println(numberInLetters(242));
	}
	
	//Given a digit number returns string of number written e.g 1 -> 'one'
	public static String numberInLetters(int n){
		String num = String.valueOf(n);
		String[] numAsArray = null;
		for(int i=0;i<num.length();i++){
			numAsArray[i] = num.substring(i, i+1);
		}
		return num;

	}
}
