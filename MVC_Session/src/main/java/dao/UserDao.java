package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;
import util.DbConnection;

public class UserDao {
	Connection cn;
	public UserDao() {
		DbConnection con=new DbConnection();
		cn= con.getConn();
	}
	public boolean loginCheck(User u) {
		boolean b=false;
		try {
			PreparedStatement ps =cn.prepareStatement("select * from user where uname=? and pass=?");
			ps.setString(1, u.getUname());
			ps.setString(2, u.getPass());
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				b=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}
