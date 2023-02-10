package com.bank.useroperations;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.bank.database.connection.DatabaseConnection;
import com.bank.user.NewUser;


public class CreateAccount {

	public NewUser createNewAccount(NewUser newUser) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
//		DatabaseConnection dc = new DatabaseConnection();
//		Connection conn = dc.establishConnection();
//		
//		if (conn == null) {
//			System.out.println("\n\nSomething Went Wrong !\n\n");
//			System.exit(0);
//		}
			
		try {
			System.out.print("\nEnter user name : ");
			String userName = s.nextLine();
			System.out.print("Enter user account number : ");
			long accountNumber = s.nextLong();
			s.nextLine();
			System.out.print("Enter user gender (m / f) : ");
			String gender = s.nextLine();
			boolean isValid = Pattern.matches(".*\\d.*", gender);

			if(isValid)
				throw new Exception();
			if(!(gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")))
				throw new Exception();
			
			System.out.print("Enter balance : ");
			double balance = s.nextDouble();
			s.nextLine();
			
			newUser = new NewUser();
			
			newUser.setUserName(userName);
			newUser.setAccountNumber(accountNumber);
			newUser.setGender(gender);
			newUser.setBalance(balance);
			
		} catch(Exception e) {
			System.out.println("\nPlease enter valid data !\n");
			UserOperations u = new UserOperations();
			u.getOptions(newUser);
		}
		
		//conn.close();
		return newUser;
	
	}

}
