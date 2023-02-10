package com.bank.user;

import java.io.IOException;
import java.sql.SQLException;

import com.bank.useroperations.UserOperations;

public class MainUser {
	static NewUser newUser = null;
	
	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("************************WELCOME TO ONLINE BANKING************************\n\n");

		UserOperations u = new UserOperations();
		u.getOptions(newUser);
		
	}
}
