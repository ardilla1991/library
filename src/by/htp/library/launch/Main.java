package by.htp.library.launch;

import by.htp.library.domain.Book;
import by.htp.library.domain.Library;
import by.htp.library.domain.Magazine;
import by.htp.library.domain.PrintedEdition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Book book = new Book();
		book.setPrice(15.3);
		book.setTitle("First Book");*/
		
		Book book1 = new Book(15.3, "First Book", "Author1");
		Book book2 = new Book(15.4, "Second Book", "Author2");
		//System.out.println("Book: price = " + book.getPrice() + " " + "title:" + " " + book.getTitle());
		//System.out.println("Book2: price = " + book2.getPrice() + " " + "title:" + " " + book2.getTitle());
		
		Magazine magazine1 = new Magazine(14.2, "First Magazine", "Editor 1");
		Magazine magazine2 = new Magazine(14.3, "Second Magazine", "Editor 2");
		//magazine.setPrice(14.2);
		//magazine.setTitle("First Magazine");
		
		
		
		//PrintedEdition pE= new PrintedEdition(); //error
		//PrintedEdition printedEdition = new Book();  //Ok
		
		//Object book12 = new Book(); //ok
		
		//PrintedEdition prints[] = new PrintedEdition[10]; //ok
		Library library = new Library();
		library.add(book1);
		library.add(book2);
		library.add(magazine1);
		library.add(magazine2);
		
		library.printList();
		
		System.out.println("*****************************");
		
		library.printItemsStartWithLetter("A");
	}

}
