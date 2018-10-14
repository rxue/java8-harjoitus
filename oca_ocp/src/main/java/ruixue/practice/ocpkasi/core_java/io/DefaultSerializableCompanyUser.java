package ruixue.practice.ocpkasi.core_java.io;

import java.io.Serializable;

public class DefaultSerializableCompanyUser implements Serializable {
	private String userName;
	private transient String password;
	public static String companyName; 
	private static final long serialVersionUID = 1L;
	public DefaultSerializableCompanyUser(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}

}
