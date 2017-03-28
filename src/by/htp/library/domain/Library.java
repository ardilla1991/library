package by.htp.library.domain;

public class Library {
	
	private PrintedEdition list[] = new PrintedEdition[0]; 
	
	public void add(PrintedEdition edition){
		PrintedEdition addedEdition[] = new PrintedEdition[list.length + 1];
		/* arraycopy заменить на ручное копирование проходом по циклу */
		//System.arraycopy(list, 0, addedEdition, 0, list.length);
		for (int i = 0; i < list.length; i++){
			addedEdition[i] = list[i];
		}
		addedEdition[list.length] = edition;
		
		list = addedEdition;
	}
	
	public PrintedEdition[] getList(){
		return list;
	}
	
	public void printList(){
		System.out.println("Library");
		int sizeOfLibrary = list.length;
		if ( sizeOfLibrary > 0 ) {
			for ( int i = 0; i < sizeOfLibrary; i++ ) {
				System.out.print("Name: " + list[i].getName() + ", ");
				System.out.print("Title: " + list[i].getTitle() + ", ");
				System.out.println("Price: " + list[i].getPrice() + "; "); 
			}
		} else {
			System.out.println("Empty");
		}
	}
	
	public void printItemsStartWithLetter(String letter){
		System.out.println("Editions that names start with " + letter);
		int sizeOfLibrary = list.length;
		for ( int i = 0; i < sizeOfLibrary; i++ ) {
			if ((list[i].getFirstLetter()).equals(letter)) {
				System.out.print("Name: " + list[i].getName() + ", ");
				System.out.print("Title: " + list[i].getTitle() + ", ");
				System.out.println("Price: " + list[i].getPrice() + "; "); 
			}
		}
	}	

}
