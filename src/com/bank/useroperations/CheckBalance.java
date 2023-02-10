package com.bank.useroperations;

import java.util.Scanner;

import com.bank.user.NewUser;

public class CheckBalance {

	public void getBalance(NewUser newUser) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner s3 = new Scanner(System.in);
		System.out.print("\nEnter user name : ");
		String name = s3.nextLine();
		if (newUser.getUserName().equalsIgnoreCase(name)) {
			System.out.println(
					"\n" + newUser.getUserName() + "'s current balance : " + newUser.getBalance() + " Rs.\n");
		} else {
			System.out.println("\nUser does not exist !\n");
		}

	}

}
