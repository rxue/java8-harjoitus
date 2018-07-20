package ruixue.practice.ocpkasi.core_java.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestObjectDecoratorInputStream {
	private static File file;
	
	@BeforeAll
	public static void init()  {
		file = new File("test.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterAll
	public static void destroy() {
		file.delete();
	}
	@Test
	public void testMarkSupportedOnDataInputStreamWithFileInputStream() throws FileNotFoundException {
		InputStream fileInputStream = new FileInputStream(file);
		DataInputStream in = new DataInputStream(fileInputStream);
		assertFalse(in.markSupported());
	}
	
	@Test
	public void testMarkSupportedOnDataInputStreamWithBufferedInputStream() throws FileNotFoundException {
		InputStream fileInputStream = new FileInputStream(file);
		DataInputStream in = new DataInputStream(new BufferedInputStream(fileInputStream));
		assertTrue(in.markSupported());
	}

}
