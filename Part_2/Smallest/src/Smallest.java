
public class Smallest {
	public static int smallest(int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} 
		return num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = smallest(10, 7);
		System.out.println(answer);

	}

}
