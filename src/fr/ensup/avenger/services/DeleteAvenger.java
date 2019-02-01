package fr.ensup.avenger.services;
import fr.ensup.avenger.dao.Idelete;
import java.sql.*;
public class DeleteAvenger implements Idelete {

	@Override
	public void deleteAv() {
		// TODO Auto-generated method stub
		   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   final String DB_URL = "jdbc:mysql://localhost/projetjframe";

		   //  Database credentials
		    final String USER = "root";
		    final String PASS = "";
		 
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("statement...");
		      stmt = conn.createStatement();
		      String sql = "DELETE FROM avengers " +
		                   "WHERE age = 10 ";
		      stmt.executeUpdate(sql);

		      // Now you can extract all the records
		      // to see the remaining records
		      sql = "SELECT * FROM avengers";
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		        
		         int age = rs.getInt("age");

		         //Display values
		        /* System.out.print("ID: " + id);
		         System.out.print(", Age: " + age);
		         System.out.print(", First: " + first);
		         System.out.println(", Last: " + last);*/
		      }
		      rs.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		}

	@Override
	public void deleteAllAv() {
		// TODO Auto-generated method stub
		   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   final String DB_URL = "jdbc:mysql://localhost/projetjframe";

		   //  Database credentials
		    final String USER = "root";
		    final String PASS = "";
		 
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting ...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("statement...");
		      stmt = conn.createStatement();
		      String sql = "truncate avengers";
		      stmt.executeUpdate(sql);

		      // Now you can extract all the records
		      // to see the remaining records
		      sql = "SELECT * FROM avengers";
		      ResultSet rs = stmt.executeQuery(sql);

		      while(rs.next()){
		         //Retrieve by column name
		        
		         int age = rs.getInt("age");

		       
		      }
		      rs.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Good!");
		
	}
	

}
