package com.bank.useroperations;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.bank.user.NewUser;

public class WithdrawAmount {
	String amount;
	NewUser newUser;


	public NewUser withdrawAmount(NewUser nu) throws ClassNotFoundException, IOException, SQLException {
		try {
			@SuppressWarnings("resource")
			Scanner s1 = new Scanner(System.in);
			newUser=nu;
			System.out.print("\nEnter user name : ");
			String name = s1.nextLine();
			
			if (newUser.getUserName().equalsIgnoreCase(name)) {
				System.out.print("\nEnter amount you want to withdraw : ");
				amount = s1.nextLine();
				if(amount.contains("-") || amount.contains("+"))
					throw new Exception();
				if (Double.valueOf(amount) > newUser.getBalance()) {
					System.out.println("\nCannot withdraw ! Insufficient balance... \n");
				} else {
					newUser.setBalance(newUser.getBalance() - Double.valueOf(amount));
					System.out.println("\nSuccesfully withdraw " + Double.valueOf(amount) + " Rs. from " + newUser.getUserName() + "'s account.");
					System.out.println(newUser.getUserName() + "'s balance : " + newUser.getBalance() + " Rs.\n");
				}
		
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
