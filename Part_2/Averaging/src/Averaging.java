
public class Averaging {
	public static int sum(int num1, int num2, int num3, int num4) {
		return num1 + num2 + num3 + num4;
	}
	
	public static double average(int num1, int num2, int num3, int num4) {
		return sum(num1, num2, num3, num4) / 4.0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = average(4, 3, 6, 1);
		System.out.println("Average: " + result);
	}

}
