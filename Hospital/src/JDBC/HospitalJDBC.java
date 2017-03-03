package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import DAO.HospitalDAO;
import Models.Hospital;
import Models.LoginModel;

public class HospitalJDBC implements HospitalDAO {
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	public void insert(Hospital hos) {
		
		String sql ="INSERT INTO tb1" + 
		"(code, HospitalName, AdminName, PhoneNumber, KindHospital, Address) VALUES (?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		
		try {
			conn =  dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, hos.getCode());
			ps.setString(2, hos.getHospitalName());
			ps.setString(3, hos.getAdminName());
			ps.setString(4, hos.getPhoneNumber());
			ps.setString(5, hos.getKindHospital());
			ps.setString(6, hos.getAddress());
			
			ps.executeUpdate();
			ps.close();
		}
		catch(SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			if(conn != null){
				try {
					conn.close();
				}
				catch (SQLException e) {}
			}		
		}	
}
}
