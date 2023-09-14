package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import config.ConnectionProvider;
import model.User;

public class RegisterDao {
	public static int register(User u){  
		int status=0;  
		try{  
		Connection con=ConnectionProvider.getCon();  
		PreparedStatement ps=con.prepareStatement("insert into productdetails values(?,?,?)");  
		ps.setString(1,u.getUid());  
		ps.setString(2,u.getUname());  
		ps.setString(3,u.getUtype());  
		              
		status=ps.executeUpdate(); 
			
		}catch(Exception e){}  
		      
		return status;  
		}  
}