package testSGBDConnection;

import static org.junit.Assert.assertNotEquals;

import java.sql.Connection;

import org.junit.Test;

import SGBDConnection.MySqlConnection;

public class testMySqlConnection {

	@Test
	public void testConnectionBSGBDMySql() {
		Connection sgbd = null;
		sgbd = MySqlConnection.getInstance();
		assertNotEquals(sgbd, null);
	}
}
