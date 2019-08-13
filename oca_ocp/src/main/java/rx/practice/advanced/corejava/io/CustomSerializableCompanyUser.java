package rx.practice.advanced.corejava.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomSerializableCompanyUser implements Serializable {
	private String userName;
	private transient String password;
	public static String companyName; 
	private static final long serialVersionUID = 1L;
	public CustomSerializableCompanyUser(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	private void writeObject(ObjectOutputStream s) throws ClassNotFoundException, IOException {
		s.defaultWriteObject();
		s.writeUTF("Google");
	}
	private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
		s.defaultReadObject();
		companyName = s.readUTF();
	}
}
