import java.util.Scanner;
import java.util.ArrayList;

public class Items {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Item> itemList = new ArrayList<>();
		
		while (true) {
			System.out.print("Name: ");
			String name = scan.nextLine();
			if (name.isEmpty()) {
				break;
			}
			
			itemList.add(new Item(name));
		}
		
		for(Item item: itemList) {
			System.out.println(item);
		}
	}

}
