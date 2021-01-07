package com.vastika.doa;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.model.User;
import com.vastika.uis.util.DBUtil;

public class UserDoaImpl1 implements UserDoa1{
	public static final String INSERT_SQL = "insert into account_tbl(name, account_no, id, email, mobile_no) values (?,?,?,?,?)";
	@Override
	
	
	public int saveUserInfo(User user) {
		int saved = 0;
	
		
		try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(INSERT_SQL);){
			ps.setString(1, user.getName());
			ps.setInt(2, user.getAccount_no());
			ps.setInt(3, user.getId());
			ps.setString(4, user.getEmail());
			ps.setLong(5, user.getMobile_no());
			saved = ps.executeUpdate();
		}
		catch (SQLException e) {
			
		
			
		
			e.printStackTrace();
		}
		return saved;
	}


}
