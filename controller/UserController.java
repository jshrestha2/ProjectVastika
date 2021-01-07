package com.vastika.controller;

import javax.swing.JOptionPane;

import com.vastika.model.User;
import com.vastika.service.UserServiceImpl;
import com.vastika.service.Userservice;

public class UserController {
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
		String name = JOptionPane.showInputDialog("name:");
		int accountno = Integer.parseInt(JOptionPane.showInputDialog("acc:"));
		int id = Integer.parseInt(JOptionPane.showInputDialog("id:"));
		String email = JOptionPane.showInputDialog("email:");
		long mobileno = Long.parseLong(JOptionPane.showInputDialog("mobno:"));
		
		int balance = Integer.parseInt(JOptionPane.showInputDialog("balance:"));
		int withdrwanamt = Integer.parseInt(JOptionPane.showInputDialog("withdrwanamt:"));
		
		int depositamt = Integer.parseInt(JOptionPane.showInputDialog("depositamt:"));
		
		
		
		user.setAccount_no(accountno);
		user.setEmail(email);
		user.setId(id);
		user.setMobile_no(mobileno);
		user.setName(name);
		
		user.setBalance(balance);
		user.setWithdrawn_amt(withdrwanamt);
		
		user.setDeposit_amt(depositamt);;
	
		return user;
	}
}