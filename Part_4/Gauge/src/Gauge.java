
public class Gauge {

	private int value;
	
	public Gauge() {
		value = 0;
	}
	
	public void increase() {
		if (value <= 4) {
			value++;
		}
	}
	
	public void decrease() {
		if(value >= 1) {
			value -= 1;
		}
	}
	
	public int value() {
		return this.value;
	}
	
	public boolean full() {
		if (this.value == 5) {
			return true;
		}
		return false;
	}
	
}
