package bookStoreObj;

//import java.nio.channels.IllegalChannelGroupException;

/**
 * 
 *  This is called an java Dot command 
 *  
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.validation.Validator;


// Create new class

class UploadBook {

	String BookName;
	int BookPrice;
//	String[] BookImage;
	String BookContent;
	int NoofPages;
	String BookLanguage;

	// Below the code for the set and get Name

	public String getBookName() {
		return BookName;
	}

	public void setBookName(String bookName) {
		BookName = bookName;
	}

	public int getBookPrice() {
		return BookPrice;
	}

	public void setBookPrice(int bookPrice) {
		BookPrice = bookPrice;
	}

//	public String[] getBookImage() {
//		return BookImage;
//	}
//
//	public void setBookImage(String[] bookImage) {
//		BookImage = bookImage;
//	}

	public String getBookContent() {
		return BookContent;
	}

	public void setBookContent(String bookContent) {
		BookContent = bookContent;
	}

	public int getNoofPages() {
		return NoofPages;
	}

	public void setNoofPages(int noofPages) {
		NoofPages = noofPages;
	}

	public String getBookLanguage() {
		return BookLanguage;
	}

	public void setBookLanguage(String bookLanguage) {
		BookLanguage = bookLanguage;
	}

}

// Below the code for validating the book

class BookDetailsValidator {
	
	public static boolean validate(UploadBook uploadbook)
			throws IllegalArgumentException 
			{
				if(uploadbook == null ) 
				{
					throw new IllegalArgumentException("Argument is NULL");
					
				}
				validateBookname(uploadbook.BookName);
				validateBookPrice(uploadbook.BookPrice);
				ValidateBookContent(uploadbook.BookContent);
				ValidateBookLang(uploadbook.BookLanguage);
				ValidateNoofPages(uploadbook.NoofPages);
				return true;
			}	

	static boolean validateBookname(String bookname){
		if (bookname.equals(null) || bookname.trim().toLowerCase().length() <= 40 || bookname.trim().toLowerCase().length() >= 15){
			throw new IllegalArgumentException("Book should atleast 10 characters");
		} else {
			return true;
		}
	}

	static boolean validateBookPrice(int BookPrice) {
		if (BookPrice < 0 || BookPrice > 1500) {
			throw new IllegalArgumentException("Book should atleast 20 characters");
		} else {
			return true;
		}
	}

	static boolean ValidateBookContent(String Bookcontent) {
		if (Bookcontent == null || Bookcontent.trim().length() > 250 || Bookcontent.trim().length() < 10)
		{
			throw new IllegalArgumentException("Book Content should not be vaild");

		} 
		else
		{
			return true;
		}
	}
	
	static boolean ValidateNoofPages(int NoofPages){
		if(NoofPages < 50 || NoofPages > 500 ) 
		{
			throw new IllegalArgumentException("Book pages are not valid or given range");
			
		}
		else
		{
			return true;
			
		}
				
	}
	
	static boolean ValidateBookLang(String Booklang) {
		if(Booklang == null || Booklang.trim().length() < 15 || Booklang.trim().length() >= 4  ) {
			throw new IllegalArgumentException("You Given Wrong Language or Invalid langugages");
		}
		else
		{
			return true;
		}
	}
	
	
}
