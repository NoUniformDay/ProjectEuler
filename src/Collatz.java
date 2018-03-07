import java.util.ArrayList;


public class Collatz {
	private ArrayList<Long> sequence;
	private long collatzNumber;
	
	public Collatz(long collatzNumber){
		this.sequence = new ArrayList<Long>();
		this.collatzNumber = collatzNumber;
		
	}
	
	public long generateSequenceSize(){

			while(collatzNumber > 0){
				if(collatzNumber == 0){
					this.sequence.add((long) 0);
					return sequence.size();
				}
				if(collatzNumber == 1){
					this.sequence.add((long) 1);
					return sequence.size();
				}
				if(collatzNumber % 2 == 0){
					collatzNumber /= 2;
					this.sequence.add(collatzNumber);
				}
				else{
					collatzNumber = (3*collatzNumber + 1);
					this.sequence.add(collatzNumber);
				}
			
		}
		long l = (long) sequence.size();
		return l;
	}
	
	
}
