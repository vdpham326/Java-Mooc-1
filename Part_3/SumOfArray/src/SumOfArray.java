import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] numbers = {5, 1, 3, 4, 2};
		int total = sumOfNumbersInArray(numbers);
		
		System.out.println(total);
	}
	
	public static int sumOfNumbersInArray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		return sum;
	}

}
