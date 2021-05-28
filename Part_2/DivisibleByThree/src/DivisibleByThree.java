
public class DivisibleByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divisibleByThreeInRange(2, 10);
	}
	
	public static void divisibleByThreeInRange(int beg, int end) {
		for (int i = beg; i <= end; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
