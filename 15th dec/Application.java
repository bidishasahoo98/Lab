package CMS;

import java.sql.SQLException;
import java.util.Scanner;

import BMS.Bank;

public class Application {

	static int in;

	public static void menu() {
		System.out.println("press 1 for New user Registration");
		System.out.println("press 2 for Login account with Id");
		System.out.println("press 3 for Admission");
		System.out.println("press 4 for Display details with Login Id");
		System.out.println("press 5 for Update");
		System.out.println("press 6 for Log out");
	}
	public static void main(String[] args) throws SQLException {
		College c = new College();
		Scanner Sc = new Scanner(System.in);// Scanner obj

		// giving option to user

		do {
			menu();
			in = Sc.nextInt();// taking input

			switch (in) {// using switch case we will do menu draw
			case 1:
				c.registration();
				break;
			case 2:
				c.login();
				break;
			case 3:
				c.admission();
				break;
			case 4:
				c.display();
				break;
			case 5:
				c.update();
				break;
			case 6:
				c.logout();
				break;
			default:
				System.out.println("wrong input");
			}

		} while (in != 6);
		System.out.println("thank you visit again");
	}
}