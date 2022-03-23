import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		try {
			Connection c= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/company?autoReconnect=true&useSSL=false","root","");
		Scanner s =new Scanner(System.in);
		String empcode,empname,desig,salary,mobilenum;
		System.out.println("Employee Code :");
		empcode=s.nextLine();
		System.out.println("Employee Name :");
		empname=s.nextLine();
		System.out.println("Designation :");
		desig=s.nextLine();
		System.out.println("Salary :");
		salary=s.nextLine();
		System.out.println("Mobile Number :");
		mobilenum=s.nextLine();
		
		Statement stmt=c.createStatement();
		stmt.executeUpdate("INSERT INTO employee(  `Emp_Code`, `Emp_Name`, `Designation`, `Salary`, `Mobile_Num`) VALUES('"+empcode+"','"+empname+"','"+desig+"',"+salary+","+mobilenum+")");
		System.out.println("Inserted Successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
