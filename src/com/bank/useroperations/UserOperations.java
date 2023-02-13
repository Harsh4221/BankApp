package com.bank.useroperations;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Scanner;

import com.bank.user.NewUser;
	
public class UserOperations {
	static NewUser newUser = null;

	public void getOptions(NewUser nu) throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		newUser = nu;

		int choice = 0;
		try {
			while (choice != 6) {
				System.out.println("*************************************************************************");
				System.out.println("Choose an option : ");
				System.out.println("1. Create account");
				System.out.println("2. Deposit money");
				System.out.println("3. Withdraw money");
				System.out.println("4. Check balance");
				System.out.println("5. Users details");
				System.out.println("6. exit");
				System.out.println("*************************************************************************");
				System.out.print("\nEnter your choice : ");
				choice = scan.nextInt();
				scan.nextLine();
				System.out.println("*************************************************************************");

				switch (choice) {
				case 1 ->  {
					CreateAccount ca = new CreateAccount();
					newUser = ca.createNewAccount(newUser);
				}
				case 2 -> {
					if (Objects.isNull(newUser)) {
						newUser = getNullObject();	
					} else {
							DepositAmount da = new DepositAmount();
							newUser = da.depositAmount(newUser);
						} 
					}
				case 3 -> {
					if (Objects.isNull(newUser)) {
						newUser = getNullObject();	
					} else {
						WithdrawAmount wa = new WithdrawAmount();
						newUser = wa.withdrawAmount(newUser);
					}
				}
				case 4 -> {
					if (Objects.isNull(newUser)) {
						newUser = getNullObject();	
					} else {
						CheckBalance cb = new CheckBalance();
						cb.getBalance(newUser);
					}
				}
				case 5 -> {
					if (Objects.isNull(newUser)) {
						newUser = getNullObject();	
					} else
						System.out.println(newUser.toString());
				}
				case 6 -> {
					System.out.println("\nThank you ! Have a nice day.");
					System.out.println("\n\n**************************************************************************\n\n");
					System.exit(0);
				}		
				default ->
					System.out.println("\nEnter Valid Choice !\n");
				}
			}
		} catch(Exception e) {
			System.out.println("\nPlease enter valid data !\n");
			UserOperations u = new UserOperations();
			u.getOptions(newUser);
		}


		System.out.println();
		scan.close();
	}



	private NewUser getNullObject() throws ClassNotFoundException, IOException, SQLException {
		// TODO Auto-generated method stub
		HandledNullObject nullObject = new HandledNullObject();
		newUser = nullObject.handledNullObject(newUser);
		return newUser;
	}
}
