
public class PrintNeatly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 1, 3, 4, 2};
		printNeatly(array);
		
	}
	
	public static void printNeatly(int[] array) {
		
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		
		System.out.println(array[array.length - 1]);
	}

}
