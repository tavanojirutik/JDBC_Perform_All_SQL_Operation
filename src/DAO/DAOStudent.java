package DAO;
import java.sql.*;
import DTO.DTOStudent;

import configration.HealperClass;

public class DAOStudent {
	HealperClass healperclass =new HealperClass();
	Connection connection = null;
	
	
	//Show All The data in Java Output
	public void getAll() {
		
		connection =healperclass.getConnection();
		
		String sql="Select * from student";
		
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			
			ResultSet resultset = preparedstatement.executeQuery();   //Its Used For executed Query 
			
			while (resultset.next()) {
				System.out.println(resultset.getInt(1));
				System.out.println(resultset.getString(2));
				System.out.println(resultset.getInt(3));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	
	
	//Insert Data in Table
	public DTOStudent AddData(DTOStudent student) {   //Add Data From DTO
		
		connection =healperclass.getConnection();
		
		String sql = "INSERT INTO Student values(?,?,?)";
		
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			
			preparedstatement.setInt(1, student.getSid());
			preparedstatement.setString(2, student.getSname());
			preparedstatement.setInt(3, student.getRoll());
			
			preparedstatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}
	
	//Data Update 
	public boolean updateData(int id) {
		
		connection = healperclass.getConnection();
		String sql="UPDATE student SET sname = 'Prashant' where sid = ?";
		
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			
			int i = preparedstatement.executeUpdate();
			
			if(i>0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean DeleteData(int id) {
		
		connection = healperclass.getConnection();
		
		String sql="DELETE from student where sid= ?";
		
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1, id);
			
			int i = preparedstatement.executeUpdate();
			if(i>0) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}
	
	
	
	
}
