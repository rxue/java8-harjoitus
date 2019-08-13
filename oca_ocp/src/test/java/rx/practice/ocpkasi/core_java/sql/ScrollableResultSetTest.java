package rx.practice.ocpkasi.core_java.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScrollableResultSetTest {
	private static String url = "jdbc:derby:memory:myDB;create=true";
	private static Statement stmt;
	private static Statement scrollableStatement;
	
	@BeforeAll
	public static void init() {
		Connection conn;
		try {
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			scrollableStatement = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_READ_ONLY);
			assertFalse(stmt.execute("CREATE TABLE ANIMAL(ID INT PRIMARY KEY"
					+ " GENERATED ALWAYS AS IDENTITY"
					+ " (START WITH 1, INCREMENT BY 1), NAME VARCHAR(50))"));
			assertEquals(1, stmt.executeUpdate("INSERT INTO ANIMAL(name) VALUES('alien')"));
			assertEquals(1, stmt.executeUpdate("INSERT INTO ANIMAL(name) VALUES('bull')"));
			assertEquals(1, stmt.executeUpdate("INSERT INTO ANIMAL(name) VALUES('cow')"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testAbsolute() {
		try {
			ResultSet rs = stmt.executeQuery("SELECT * FROM ANIMAL");
			assertThrows(SQLException.class, () -> rs.absolute(3));
			ResultSet scrollableResultSet = scrollableStatement.executeQuery("SELECT * FROM ANIMAL");
			assertTrue(scrollableResultSet.absolute(3));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
