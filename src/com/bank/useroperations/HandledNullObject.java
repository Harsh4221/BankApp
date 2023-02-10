package com.bank.useroperations;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.bank.user.NewUser;

public class HandledNullObject {

	public NewUser handledNullObject(NewUser newUser) throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		try {
			@SuppressWarnings("resource")
			Scanner s4 = new Scanner(System.in);
			System.out.println("\nUser does not exist !\n");
			System.out.print("do you want create account (yes / no) : ");
			String newAccountCreation = s4.nextLine();
		
			boolean isValid = Pattern.matches(".*\\d.*", newAccountCreation);
			
			if (isValid || newAccountCreation.isEmpty())
				throw new Exception();
			
			if(newAccountCreation.equalsIgnoreCase("yes") || newAccountCreation.equalsIgnoreCase("no")) {
				if (newAccountCreation.equalsIgnoreCase("yes")) {
					CreateAccount ca = new CreateAccount();
					newUser = ca.createNewAccount(newUser);
				} else {
					System.out.println("\nThank you ! Have a nice day.");
					System.out
							.println("\n\n**************************************************************************\n\n");
					System.exit(0);
				}
			}
			else {
				throw new Exception();
			}

			
		} catch (Exception e) {
			System.out.println("\nPlease enter valid data !\n");
			UserOperations u = new UserOperations();
			u.getOptions(newUser);
		}

		return newUser;
	}

}
