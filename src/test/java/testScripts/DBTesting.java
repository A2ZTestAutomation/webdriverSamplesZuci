package testScripts;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTesting {
	// Connection object
	static Connection con = null;
	// Statement object
	private static Statement stmt;
	// Constant for Database URL - MySql
//		public static String DB_URL = "jdbc:mysql://localhost/Testdata";
	//Database url SQlite
	public static String DB_URL = "jdbc:sqlite:F://DBInstance/sampleDB.db";
	// Database Username
	public static String DB_USER = "";
	// Database Password
	public static String DB_PASSWORD = "";

	@BeforeTest
	public void setUp() throws Exception {
		try {
			// Database connection
//			String dbClass = "com.mysql.cj.jdbc.Driver";
//			Class.forName(dbClass).newInstance();
			// Get connection to DB
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			// Statement object to send the SQL statement to the Database
			stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test() {
		try {
			String query = "select * from Students";
			// Get the contents of userinfo table from DB
			ResultSet res = stmt.executeQuery(query);
			// Print the result until all the records are printed
			// res.next() returns true if there is any next record else returns false
			while (res.next()) {
				
				System.out.print(res.getString(1));
				System.out.print(" " + res.getString(2));
				System.out.print(" " + res.getString(3));
				System.out.println(" " + res.getString(4));
				System.out.println(" " + res.getString(5));
			}
			
			String query1 = "Select name from Students Where Students.id NOT IN( SELECT studentID FROM Student_Course);";
			
			ResultSet res1 = stmt.executeQuery(query1);
			String studName ="";
			while(res1.next()) {
				studName = res1.getString("name");
				
			}
			System.out.println("Student name : " + studName);
			Assert.assertEquals(studName, "Rattan");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@AfterTest
	public void tearDown() throws Exception {
		// Close DB connection
		if (con != null) {
			con.close();
		}
	}

}

//> show databases
//>create database user
//> use user
//> show tables


//create table userinfo
//(
//userId int,
//userName varchar(255),
//userAge int,
//userAddress varchar(255)
//);
//


//insert into userinfo (userID, userName, userAge, userAddress) values (‘1’, ‘shruti’, ’25’, ‘Noida’)


