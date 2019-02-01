package fr.ensup.avenger.services;

import java.sql.SQLException;
import java.util.ArrayList;

import fr.ensup.avenger.dao.Connexion;
import fr.ensup.avenger.dao.ReadAvengers;
import fr.ensup.avenger.domaine.Avengers;


public class AvengersService {

	public ArrayList<Avengers> ListeAvengers(Connexion conn) throws SQLException{

		ArrayList<Avengers> listAvengers = new ArrayList<>();

		ReadAvengers daoAvengers = new ReadAvengers();
		
		listAvengers = daoAvengers.ListeAvengers(conn);
		
		return listAvengers;
	}
}
