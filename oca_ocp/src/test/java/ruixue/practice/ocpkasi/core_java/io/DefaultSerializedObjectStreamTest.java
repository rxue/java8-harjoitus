package ruixue.practice.ocpkasi.core_java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DefaultSerializedObjectStreamTest {
	private static File objectStore;
	@BeforeEach
	public void init() {
		objectStore = new File("object.store");
	}
	
	@AfterEach
	public void destroy() {
		objectStore.delete();
	}
	private void writeDefaultSerializedCompanyUser() {
		try(OutputStream os = new FileOutputStream(objectStore);
			ObjectOutputStream oOs = new ObjectOutputStream(os)) {
				DefaultSerializableCompanyUser user = new DefaultSerializableCompanyUser("Sisu", "password");
				DefaultSerializableCompanyUser.companyName = "Google";
				oOs.writeObject(user);
				DefaultSerializableCompanyUser.companyName = "IBM";
			} catch (IOException e) {
				// TODO Auto-generated catch bloc
				e.printStackTrace();
			} 
	}
	
	@Test
	public void testReadDefaultSerializedObject() {
		writeDefaultSerializedCompanyUser();
		DefaultSerializableCompanyUser.companyName = "IBM";
		try(InputStream is = new FileInputStream(objectStore);
			ObjectInputStream oIs = new ObjectInputStream(is)) {
			DefaultSerializableCompanyUser user = (DefaultSerializableCompanyUser) oIs.readObject();	
			assertEquals("Sisu", user.getUserName());
			assertNull(user.getPassword());
			assertNotEquals("Google", user.companyName);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
