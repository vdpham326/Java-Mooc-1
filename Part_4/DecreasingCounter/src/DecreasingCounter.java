
public class DecreasingCounter {
	
	private int value;
	
	public DecreasingCounter(int initialValue) {
		this.value = initialValue;
	}
	
	public void printValue() {
		System.out.println("value: " + this.value);
	}
	
	public void decrement() {
		this.value--;
		if (this.value < 0) {
			this.value = 0;
		}
	}
	
	public void reset() {
		this.value = 0;
	}
}
