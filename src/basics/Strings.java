package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice= "rings" ;
		bookTitle = "The lord of the rings";
		if(bookTitle.contains(wordChoice)){
			System.out.println("The book contains the word " + wordChoice);
		} 
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")){
			System.out.println("The browser is chrome");
		}
		String firstName = "Tim";
		String lastName = "Short";
		String SSN="984162168";
		System.out.print(firstName.substring(0,3));
		System.out.println(lastName.substring(0,1));
		System.out.println(SSN.substring(5));

	}

}
