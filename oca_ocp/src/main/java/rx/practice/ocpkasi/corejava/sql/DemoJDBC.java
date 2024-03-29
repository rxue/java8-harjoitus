package rx.practice.ocpkasi.corejava.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoJDBC {

	private static void derby() {
		try(Connection conn = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true");
			Statement stmt = conn.createStatement()) {
			boolean isResultSet = stmt.execute("CREATE TABLE test(id int)");
			if (!isResultSet)
				System.out.println("Table created");
			ResultSet rs = stmt.executeQuery("select * from test");
			System.out.println(rs.isClosed() ? "ResultSet is closed before running another statement":"ResultSet is open before running another statment");
			stmt.executeUpdate("insert into test values(1)");
			System.out.println(rs.isClosed() ? "ResultSet is closed after running another statement":"ResultSet is open after running another statment");


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void postgres() {
		try(Connection conn = DriverManager.getConnection("jdbc:derby:memory:myDB;create=true");
			Statement stmt = conn.createStatement()) {
			boolean isResultSet = stmt.execute("CREATE TABLE test(id int)");
			if (!isResultSet)
				System.out.println("Table created");
			ResultSet rs = stmt.executeQuery("select * from test");
			System.out.println(rs.isClosed() ? "ResultSet is closed before running another statement":"ResultSet is open before running another statment");
			stmt.executeUpdate("insert into test values(1)");
			System.out.println(rs.isClosed() ? "ResultSet is closed after running another statement":"ResultSet is open after running another statment");


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ClassNotFoundException {
		derby();

	}

}
