package lab.oodp.test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import lab.oodp.library.*;


import static org.junit.Assert.assertEquals;


public class TestLibrarySystem {

    LibrarySystem libsys;

    @Before
	public void setup() {
		libsys = new LibrarySystem();
		
	}
    private ByteArrayOutputStream outContent;

	@Before
	public void setUpStreams() {
	    	
	    outContent = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(outContent));
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	}

    @Test
    public void testStart() {
        libsys.start();
        String newline = System.getProperty("line.separator");

        assertEquals("Displaying all books sorting from book titles" +newline
                     + "Book title:1984 by George Orwell(ISBN:978-0451524935) Status:AVAILABLE"+newline
                     + "Book title:The Great Gatsby by F. Scott Fitzgerald(ISBN:978-0743273565) Status:AVAILABLE"+newline
                     + "Book title:To Kill a Mockingbird by John Doe(ISBN:978-0061120084) Status:AVAILABLE"+newline
                     + "*************************************"+newline
                     + "Displaying all CDs sorting from Cds Artist"+newline
                     + "CD by Michael Jackson Album name:Thriller(Genre:Pop) Status:AVAILABLE"+newline
                     + "CD by Pink Floyd Album name:The Dark Side of the Moon(Genre:Rock) Status:AVAILABLE"+newline
                     + "CD by The Beatles Album name:Abbey Road(Genre:Rock) Status:AVAILABLE"
                    ,outContent.toString().trim());

    }



}
