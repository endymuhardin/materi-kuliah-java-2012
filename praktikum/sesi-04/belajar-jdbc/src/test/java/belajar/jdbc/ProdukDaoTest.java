package belajar.jdbc;

import java.sql.*;
import org.junit.*;

public class ProdukDaoTest{

	private static String jdbcDriver = "com.mysql.jdbc.Driver";
	private static String jdbcUrl = "jdbc:mysql://localhost/belajar";
	private static String jdbcUsername = "root";
	private static String jdbcPassword = "";
	
	private static Connection koneksi;

	@BeforeClass
	public static void connectDatabase() throws Exception {
		// inisialisasi driver database
		Class.forName(jdbcDriver);
		koneksi = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
	}
	
	@AfterClass
	public static void disconnectDatabase() throws Exception {
		koneksi.close();
	}
	
	@Before
	public void resetDatabase() throws Exception {
		koneksi.createStatement()
		.executeUpdate("delete from produk");
	}

	@Test
	public void testInsert() throws Exception {
		String sqlHitung = "select count(*) from produk";
	
		
		// sebelum insert harusnya database kosong
		ResultSet rsSebelum = koneksi.createStatement().executeQuery(sqlHitung);
		Assert.assertTrue(rsSebelum.next()); // query harus ada hasilnya
		// hasil query harusnya nol
		Assert.assertEquals(new Long(0), new Long(rsSebelum.getLong(1)));
		rsSebelum.close();
		
		ProdukDao p = new ProdukDao();
		p.connectDatabase();
		p.insertProduk("001", "Produk 001");
		p.disconnectDatabase();
		
		// setelah insert, harusnya database berisi satu record
		ResultSet rsSetelah = koneksi.createStatement().executeQuery(sqlHitung);
		Assert.assertTrue(rsSetelah.next()); // query harus ada hasilnya
		// hasil query harusnya nol
		Assert.assertEquals(new Long(1), new Long(rsSetelah.getLong(1)));
		rsSetelah.close();
			
	}
}