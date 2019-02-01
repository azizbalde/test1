package fr.ensup.avenger.services;
import java.sql.*;
import java.util.ArrayList;

import fr.ensup.avenger.domaine.Avengers;
import fr.ensup.avenger.dao.Icreate;
public class CreateAvenger implements Icreate {

	@Override
	public void createAv() {
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
		      System.out.println("Inserting ...");
		      stmt = conn.createStatement();
		      
		      String sql = "INSERT INTO avengers " +
		                   "VALUES (10, 'Zara', 'blanc', 'do')";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO avengers " +
		                   "VALUES (11, 'Mahnaz', 'bleu', 25)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO avengers " +
		                   "VALUES (12, 'Zaid', 'gris', 30)";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO avengers " +
		                   "VALUES(13, 'Sumit', 'marron', 28)";
		      stmt.executeUpdate(sql);
		      System.out.println("Inserted ...");

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
