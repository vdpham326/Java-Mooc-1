import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 3;
		arr[2] = 5;
		arr[3] = 7;
		arr[4] = 9;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Give two indices to swap: ");
		int index1 = Integer.valueOf(scan.nextLine());
		int index2 = Integer.valueOf(scan.nextLine());
		
		int helper = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = helper;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
