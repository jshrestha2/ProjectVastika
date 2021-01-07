package com.vastika.controller;

import javax.swing.JOptionPane;

import com.vastika.model.User;
import com.vastika.service.UserServiceImpl;
import com.vastika.service.Userservice;

public class UserController1 {
	public static void main(String[] args) {
		Userservice userservice = new UserServiceImpl();
		User user = getUser();
		
		int saved = userservice.saveUserInfo(user);
		if (saved>=1) {
			JOptionPane.showMessageDialog(null, "user info is saved");
			
		}else {
			JOptionPane.showMessageDialog(null, "error");
		}
	}
	public static User getUser() {
		User user = new User();
		int balance = Integer.parseInt(JOptionPane.showInputDialog("balance:"));
		int withdrwanamt = Integer.parseInt(JOptionPane.showInputDialog("withdrwanamt:"));
		int id = Integer.parseInt(JOptionPane.showInputDialog("id:"));
		int depositamt = Integer.parseInt(JOptionPane.showInputDialog("depositamt:"));
		
		user.setBalance(balance);
		user.setWithdrawn_amt(withdrwanamt);
		user.setId(id);
		user.setDeposit_amt(depositamt);;
	
		return user;
	}
}

