package ruixue.practice.ocpkasi.core_java.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Apple implements Serializable {
	private String type;
	public Apple(String type) {
		this.type = type;
	}
}

public class TestObjectStream {
	private static File objectStore;
	@BeforeAll
	public static void init() {
		objectStore = new File("test.objects");
	}
	
	@AfterAll
	public static void destroy() {
		objectStore.delete();
	}
	@Test
	public void testReadNullFromObjectInputStream() {
		try(OutputStream os = new FileOutputStream(objectStore);
			ObjectOutputStream oOs = new ObjectOutputStream(os);
			InputStream is = new FileInputStream(objectStore);
			ObjectInputStream oIs = new ObjectInputStream(is)) {
			oOs.writeObject(new Apple("Fuji"));
			oOs.writeObject(null);
			oOs.writeObject(new Apple("Granade"));
			oIs.readObject();
			assertNull(oIs.readObject());
			oIs.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		} 
	}

}
