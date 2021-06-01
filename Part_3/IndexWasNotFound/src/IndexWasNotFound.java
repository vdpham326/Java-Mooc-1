import java.util.Scanner;

public class IndexWasNotFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;
        
        System.out.print("Search for? ");
        int num = Integer.valueOf(scan.nextLine());
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if(array[i] ==  num) {
                System.out.println(num + " is at index " + i + ".");
            } else {
                System.out.println(num + " was not found.");
            }
        }
        
        
	}

}
