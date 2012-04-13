package belajar.jdbc;

import java.sql.*;

public class ProdukDao{
	
	private String jdbcDriver = "com.mysql.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost/belajar";
	private String jdbcUsername = "root";
	private String jdbcPassword = "";
	
	private Connection koneksi;
	
	// pada waktu diinstankan, langsung inisialisasi koneksi database
	public ProdukDao() throws Exception {
		// inisialisasi driver database
		Class.forName(jdbcDriver);
	}
	
	public void connectDatabase() throws Exception {
		koneksi = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
	}
	
	public void disconnectDatabase() throws Exception {
		koneksi.close();
	}
	
	public void insertProduk(String kode, String nama) throws Exception {
		// prepared statement, template sql yang akan dijalankan
		String sql = "insert into produk (kode, nama) values (?,?)";
		PreparedStatement ps = koneksi.prepareStatement(sql);
		
		// isi templatenya dengan data
		ps.setString(1, kode);
		ps.setString(2, nama);
		
		// jalankan
		ps.executeUpdate();
	}
}