package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import DAO.PazireshDAO;
import Models.PazireshModel;

public class PazireshJDBC implements PazireshDAO {
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	
	@Override
	public void insert(PazireshModel pm) {
		String sql = "INSERT INTO tbpaziresh" + 
						"(Name, Family, FatherName, MCode, City, MobileNumber, HomeNumber, IllnessKind,"
						+ "InsuranceKind, Gender, Address)"
						+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, pm.getName());
			ps.setString(2, pm.getFamily());
			ps.setString(3, pm.getFName());
			ps.setInt(4, pm.getMCode());
			ps.setString(5, pm.getCity());
			ps.setString(6, pm.getMobileNumber());
			ps.setString(7, pm.getHomeNumber());
			ps.setString(8, pm.getIllnessKind());
			ps.setString(9, pm.getInsuranceKind());
			ps.setString(10, pm.getGender());
			ps.setString(11, pm.getAddress());
			
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		}
	}
