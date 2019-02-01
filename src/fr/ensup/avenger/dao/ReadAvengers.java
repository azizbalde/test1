package fr.ensup.avenger.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fr.ensup.avenger.domaine.Avengers;



public class ReadAvengers {
	public ArrayList<Avengers> ListeAvengers(Connexion conn) throws SQLException {
		ArrayList<Avengers> listAvengers = new ArrayList<>();
		ReadAvengers avenger = new ReadAvengers();

		try {

			ResultSet res = conn.getConnection().executeQuery("SELECT * "
					+ "FROM avengers ;");
			
			while (res.next()) {
				Avengers avengers = new Avengers(0, null, null, null);
				avengers.setAge(res.getInt("age"));
				avengers.setName(res.getString("name"));
				avengers.setCostume(res.getString("costume"));
				avengers.setPouvoir(res.getString("pouvoir"));
				
				listAvengers.add(avengers);
			}

		}

		catch (Exception e) {
			String message = "Erreur lors de la requête de recherhce des reservation : <br/>" + e.getMessage();
		}

		return listAvengers;

	}
}
