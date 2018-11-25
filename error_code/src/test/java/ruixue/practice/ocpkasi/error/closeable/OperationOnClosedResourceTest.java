package ruixue.practice.ocpkasi.error.closeable;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OperationOnClosedResourceTest {
	private static final String CONNECTION_URL = "jdbc:derby:memory:myDB;create=true";
	@BeforeAll
	public static void init() {
		try(Connection conn = DriverManager.getConnection(CONNECTION_URL);
			Statement scrollableStatement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
						ResultSet.CONCUR_READ_ONLY);) {
			
			assertFalse(scrollableStatement.execute("CREATE TABLE ANIMAL(ID INT PRIMARY KEY"
					+ " GENERATED ALWAYS AS IDENTITY"
					+ " (START WITH 1, INCREMENT BY 1), NAME VARCHAR(50))"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testOperationOnClosedResultSet() {
		try (Connection conn = DriverManager.getConnection(CONNECTION_URL);
				Statement stmt = conn.createStatement()) {
			ResultSet rs1 = stmt.executeQuery("select * from animal");
			ResultSet rs2 = stmt.executeQuery("select * from animal");
			assertThrows(SQLException.class, () -> rs1.next());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
