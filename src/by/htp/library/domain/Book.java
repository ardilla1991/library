package by.htp.library.domain;

public class Book extends PrintedEdition{
	
	private String author;
	
	public Book(){
		
	}
	
	public Book(String author){
		this.author = author;
		//super(); // default		
	}
	
	public Book(double price, String title, String author){
		this.setPrice(price);
		this.setTitle(title);
		this.author = author;
	}
	
	/*public Book(double price, String title){
		//this(author);
		super(price, title);
		
	}*/
	
	/*public Book(String author, String title, double price){
		super(price, title);
	}
	
	
	public Book(double price, String title, String author){
		this(author, title, price);	
	}	*/
	
	
	public String printFormat(){
		return "A5";
	}
	
	public String getFirstLetter(){
		return author.substring(0,1);
	}
	
	public String getName(){
		return author;
	}
}
