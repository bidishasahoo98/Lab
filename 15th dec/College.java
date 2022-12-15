package CMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class College {

	static int Login_Id;// declearing datatype and verable
	static String sname,address,course,regtype;
	static int oldLogin_Id;
	static int phone_no,year_of_passing;
	static double tenth_marks,twelveth_marks;

	public static void registration() throws SQLException {

		Scanner Sc = new Scanner(System.in);// scanner obj
		System.out.println("enter your Login_Id");
		int Login_Id = Sc.nextInt();// user iuput
		System.out.println("enter your password");
		int password = Sc.nextInt();
		System.out.println("Choose your reg_type" + "Enter 1 for new user" + " Enter 2 for already reistration done");// giving option
																										// for user

		int reg_type = Sc.nextInt();
		String RegType;
		if (reg_type == 1) {
			regtype= "new user";
		}
		if (reg_type == 2) {
			regtype = "registration done";
		}
		System.out.println("Enter your Login_Id");
		int balance = Sc.nextInt();
		System.out.println("enter youe password" + " kindly note it not more than 4 digt");
		int pin = Sc.nextInt();

		Connection conn = Helper.con();// connection done from helper class
		Statement stmt1 = conn.createStatement();// create Statment
		ResultSet rs = stmt1.executeQuery("Select * from Admission");
		try {
			while (rs.next()) {
				oldLogin_Id= (rs.getInt(1));
				if (Login_Id == oldLogin_Id) {
					throw new Exception(" Login_Id already exist try again");
				}
			}
			PreparedStatement stmt = conn.prepareStatement("insert into Admission values(?,?,?,?,?,?,?,?)");// taking input
			// creating account // from user
			stmt.setInt(1, Login_Id);
			stmt.setString(2, sname);
			stmt.setString(3, address);
			stmt.setInt(4, phone_no);
			stmt.setString(5, course);
			stmt.setDouble(6, tenth_marks);
			stmt.setDouble(7, twelveth_marks);
			stmt.setInt(8,year_of_passing);
			stmt.executeUpdate();
			System.out.println("ac open  ");
		} catch (Exception e) {
			System.out.println(e);// printing Exception
		}}}

	

	