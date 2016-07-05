package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import configuration.DBUtility;
import model.dto.UserDTO;

public class UserDAO {
	
	Connection conn =null;
	
	public UserDAO() throws ClassNotFoundException, SQLException {
		conn = DBUtility.getConnection();
	}
	
	public ArrayList<UserDTO> getAllUsers() throws SQLException{
		ArrayList<UserDTO> users = new ArrayList<>();
		UserDTO  user = new UserDTO();
		final String SQL="SELECT * FROM tbluser";	
		PreparedStatement pstmt = conn.prepareStatement(SQL);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			System.out.print(rs.getString("username"));
			System.out.println(rs.getString("password"));
			
			users.add(user);
		}
		return 	users;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ArrayList<UserDTO> users = new UserDAO().getAllUsers();
		for(UserDTO user: users){
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
		}
		
	}
}
