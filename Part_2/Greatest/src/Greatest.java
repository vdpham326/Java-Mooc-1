
public class Greatest {
	public static int greatest(int number1, int number2, int number3) {

		if (number1 > number2) {
			if (number1 > number3) {
				return number1;
			} else {
				return number3;
			}
		}
		if (number2 > number3) {
			return number2;
		} else {
			return number3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = greatest(15, 50, 45);
		System.out.println("Greatest: " + answer);
	}

}
