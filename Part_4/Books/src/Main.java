import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> books = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("Title: ");
			String title = scan.nextLine();
			if (title.isEmpty()) {
				break;
			}
			System.out.print("Pages: ");
			int pages = Integer.valueOf(scan.nextLine());
			System.out.print("Publication year: ");
			int year = Integer.valueOf(scan.nextLine());
			
			books.add(new Book(title, pages, year));
		}
		
		System.out.print("What information will be printed? ");
		String info = scan.nextLine();
		
		for (Book book: books) {
			if (info.equals("everything")) {
				System.out.println(book);
			}
			if (info.equals("name")) {
				System.out.println(book.getTitle());
			}
		}
	}	

}
