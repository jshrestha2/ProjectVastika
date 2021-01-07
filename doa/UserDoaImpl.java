package com.vastika.doa;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vastika.model.User;
import com.vastika.uis.util.DBUtil;

public class UserDoaImpl implements UserDoa{
	public static final String SAVE_SQL = "insert into transaction_tbl(balance, withdrawn_amt, id, deposit_amt) values (?,?,?,?)";
	
	
	@Override
	public int saveUserInfo(User user) {
		int saved = 0;
		try (PreparedStatement ps = DBUtil.getConnection().prepareStatement(SAVE_SQL);){
			ps.setInt(1, user.getBalance());
			ps.setInt(2, user.getWithdrawn_amt());
			ps.setInt(3, user.getId());
			ps.setInt(4, user.getDeposit_amt());
			
			saved = ps.executeUpdate();
		}
		catch (SQLException e) {
			
		
			
		
			e.printStackTrace();
		}
		return saved;
		
	}
}
