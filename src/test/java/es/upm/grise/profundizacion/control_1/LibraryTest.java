package es.upm.grise.profundizacion.control_1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class LibraryTest {
	
	static Library lib;
	
	@BeforeEach
	void setup() {
		lib = new Library();
		try {
			lib.addBook(new Book("Cazador"));
		} catch (DuplicatedBookException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void addTest() {
		try {
			lib.addBook(new Book("Cazador"));
			lib.addBook(new Book("Cazador"));
			fail();
		} catch (DuplicatedBookException e) {
			assertTrue(true);
		}
	}
	
	@Test
	public void getTest() {
		try {
			lib.removeBook(lib.getBook("Cazador"));
			lib.getBook("Cazador");
		} catch (NonExistingBookException e) {
			assertTrue(true);
		} catch (EmptyLibraryException e) {
			assertTrue(true);
		}
		
		
	}
	
	
	public void removeTest() {
		try {
			lib.removeBook(lib.getBook("Cazador"));
			lib.getBook("Cazador");
		} catch (NonExistingBookException e) {
			assertTrue(false);
		} catch (EmptyLibraryException e) {
			assertTrue(true);
		}
		
		
	}

}
