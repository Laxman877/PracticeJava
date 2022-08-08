package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Message;
import model.User;
import util.DbConnection;

public class UserDao {
	Connection cn;
	public UserDao() {
		DbConnection con=new DbConnection();
		cn=con.mkConn();
	}

	public int regUser(User u) {
		int i=0;
		String qry="insert into user values(?,?,?,?,?)";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setInt(1, 0);
			ps.setString(2, u.getFname());
			ps.setString(3, u.getLname());
			ps.setString(4, u.getEmail());
			ps.setString(5, u.getMobile());
			
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public String isExist(User u) {
		String user=null;
		String qry="select * from user where email=? or mobile=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getMobile());
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				user=rs.getString(2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

	public boolean loginCheck(User u) {
		boolean b=false ;
		String qry="select * from user where email=? and mobile=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setString(1, u.getEmail());
			ps.setString(2, u.getMobile());
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

	public ArrayList<User> getUser() {
		ArrayList<User> al=new ArrayList<User>();
		String qry="select * from user";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				User u=new User();
				u.setUid(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setMobile(rs.getString(5));
				al.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}

	public User editById(int uid) {
		User u=new User();
		String qry="select * from user where uid=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setInt(1, uid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				u.setUid(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setMobile(rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public User editByEmail(String email) {
		User u=new User();
		String qry="select * from user where email=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setString(1, email);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				u.setUid(rs.getInt(1));
				u.setFname(rs.getString(2));
				u.setLname(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setMobile(rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}

	public int msgAdd(Message ms) {
		int i=0;
		String qry="insert into message values(?,?,?,?)";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setInt(1, 0);
			ps.setString(2, ms.getFrom());
			ps.setString(3, ms.getMsg());
			ps.setString(4, ms.getTo());
			
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}

	public int updateData(User u) {
		int i=0;
		String qry="update user set fname=?,lname=?,email=?,mobile=? where uid=?";
		try {
			PreparedStatement ps=cn.prepareStatement(qry);
			ps.setInt(5, u.getUid());
			ps.setString(1, u.getFname());
			ps.setString(2, u.getLname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getMobile());
			i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
}
