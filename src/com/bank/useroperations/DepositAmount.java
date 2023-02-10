package com.bank.useroperations;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.bank.user.NewUser;


public class DepositAmount {
	String amount;
	NewUser newUser;

	
	public NewUser depositAmount(NewUser nu) throws ClassNotFoundException, IOException, SQLException {
		
		try {
			@SuppressWarnings("resource")
			Scanner s2 = new Scanner(System.in);
			newUser=nu;
			System.out.print("\nEnter user name : ");
			String name = s2.nextLine();
			if (newUser.getUserName().equalsIgnoreCase(name)) {
				System.out.print("\nEnter amount you want to deposit : ");
				amount = s2.nextLine();
				if(amount.contains("-") || amount.contains("+"))
					throw new Exception();
				newUser.setBalance(newUser.getBalance() + Double.valueOf(amount));
				System.out.println("\nSuccesfully deposited "+amount+" Rs. in "+newUser.getUserName()+"'s account.");
				System.out.println(newUser.getUserName()+"'s balance : "+newUser.getBalance()+" Rs.\n");
		
			} else {
				System.out.println("\nUser does not exist !\n");
			}
		} catch(Exception e) {
			System.out.println("\nPlease enter valid data !\n");
			UserOperations u = new UserOperations();
			u.getOptions(newUser);
		}
		
		return newUser;
	}
}
