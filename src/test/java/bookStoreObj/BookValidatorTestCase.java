package bookStoreObj;

import java.awt.print.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookValidatorTestCase {

	// Below the code for valid
	@Test
	void TestValidbookname() {
		BookDetailsValidator.validateBookname("Attitude is Everything By jeff keller");
	}

	// Below the code for invalid
	@Test
	void TestInvalid() {
		try {
			BookDetailsValidator.validateBookname("B");
		}
		catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Book name should atleast 10 characters", ex.getMessage());

		}

	}

	// Below the code valid Test case
	@Test
	void TestValidBookPrice() {
		BookDetailsValidator.validateBookPrice(200);

	}

	// Below the code for invalid test case
	@Test
	void TestInvalidBookPrice() {
		try {
			BookDetailsValidator.validateBookPrice(3000);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Book should atleast 20 characters", ex.getMessage());
		}

	}

	// Below the code for valid
	@Test
	void TestValidBookContent() {
		BookDetailsValidator.ValidateBookContent("This is very intersting and very funny and very infromative also");

	}

	// Below the code of invalid
	@Test
	void TestInvalidBookContent() {
		try {
			BookDetailsValidator.ValidateBookContent("Book");

		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Book Content should not be vaild", ex.getMessage());
		}
	}

	// Below the code for valid Test Case

	@Test
	void TestvalidNoofPages() {
		BookDetailsValidator.ValidateNoofPages(250);
	}

	// Below the code for invalid TestCase
	@Test
	void TestInvalidNoofpages() {
		try {
			BookDetailsValidator.ValidateNoofPages(100);

		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Book pages are not valid or given range", ex.getMessage());
		}
	}

	// Below the code for valid TestCase
	@Test
	void TestValidBookLang()
	{
		BookDetailsValidator.ValidateBookLang("Tamil");
		
	}

	// Below the code for Invalid Test case
	@Test
	void TestInvalidBookLang()
	{
		try
		{
			if(BookDetailsValidator.ValidateBookLang("Tam") || BookDetailsValidator.validateBookname(null))
			{
				
			 throw new IllegalArgumentException();			}
				
		}
		
		catch (IllegalArgumentException ex)
		{
			Assertions.assertEquals("You Given Wrong Language or Invalid langugages", ex.getMessage());
		}
	}
}