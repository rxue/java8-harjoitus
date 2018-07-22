package ruixue.practice.ocpkasi.core_java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apple implements Serializable {
	private String type;
	static String color = "none";
	public Apple(String type) {
		this.type = type;
		color = "red";
	}
	public Apple() {
		color = "green";
	}
}

public class TestObjectStream {
	@Test
	public void testReadStaticField() {
		File objectStore = new File("test.objects");
		try(OutputStream os = new FileOutputStream(objectStore);
				ObjectOutputStream oOs = new ObjectOutputStream(os);) {
				Apple apple = new Apple("sample");
				oOs.writeObject(apple);
			} catch (IOException e) {
				// TODO Auto-generated catch bloc
				e.printStackTrace();
			} 
		try(InputStream is = new FileInputStream(objectStore);
		ObjectInputStream oIs = new ObjectInputStream(is)) {
		Apple.color = "grey";
		Apple retrievedApple = (Apple) oIs.readObject();
		assertEquals("grey", retrievedApple.color);
		objectStore.delete();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testReadStaticField2() {
		File objectStore = new File("test.objects");
		try(OutputStream os = new FileOutputStream(objectStore);
				ObjectOutputStream oOs = new ObjectOutputStream(os);) {
				Apple apple = new Apple("sample");
				oOs.writeObject(apple);
			} catch (IOException e) {
				// TODO Auto-generated catch bloc
				e.printStackTrace();
			} 
		try(InputStream is = new FileInputStream(objectStore);
		ObjectInputStream oIs = new ObjectInputStream(is)) {
		new Apple("granade");
		Apple retrievedApple = (Apple) oIs.readObject();
		assertEquals("red", retrievedApple.color);
		objectStore.delete();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
}
