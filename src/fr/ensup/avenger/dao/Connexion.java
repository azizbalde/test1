package fr.ensup.avenger.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {

	private static Connection connect = null;

	private static Statement statement = null;

	/**
	 * @return Cette m�thode permet la connexion de l'application � la base de
	 *         donn�e
	 * @throws SQLException 
	 */
	public static Statement getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				connect = DriverManager
						.getConnection("jdbc:mysql://localhost/projetjframe?user=root&password=");
				statement = connect.createStatement();

				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
		return statement;
	}
	/**
	 * M�thode permettant de fermer la connexion
	 */
	public static void closeConnection() {
		try {
			connect.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
