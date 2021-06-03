
public class Statistics {

	private int count;
	private int sum;
	
	public Statistics() {
		
	}
	
	public void addNumber(int number) {
		this.sum += number;
		this.count++;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public int sum() {
		return this.sum;
	}
	
	public double average() {
		return sum * 1.0 / this.count;
	}
}
