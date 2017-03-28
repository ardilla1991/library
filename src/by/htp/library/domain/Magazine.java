package by.htp.library.domain;

public class Magazine extends PrintedEdition{
	
	private String editor;
	
	public String printFormat(){
		return "A4";
	}
	
	public Magazine(double price, String title, String editor){
		super(price, title);
		this.editor = editor;
	}
	
	public String getFirstLetter(){
		return editor.substring(0,1);
	}
	
	public String getName(){
		return editor;
	}

}