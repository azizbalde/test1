package fr.ensup.avenger.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {

	private static Connection connect = null;

	private static Statement statement = null;

	/**
	 * @return Cette méthode permet la connexion de l'application à la base de
	 *         donnée
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
	 * Méthode permettant de fermer la connexion
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
