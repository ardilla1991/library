package by.htp.library.domain;

public abstract class PrintedEdition {
	
	private double price;
	private String title;
	
	public PrintedEdition(){
		super(); // default 
	}
	
	public PrintedEdition(double price, String title){
		this.price = price;
		this.title = title;
	}
	
	public void setPrice( double price){
		this.price = price;
	}
	
	public double getPrice(){
		return this.price; // return price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public abstract String printFormat()//{
		//return "Def";
	//}
	;
	public abstract String getFirstLetter();

	public abstract String getName();
	
}
