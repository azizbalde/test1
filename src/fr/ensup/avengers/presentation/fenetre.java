package fr.ensup.avengers.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTable;

import fr.ensup.avenger.dao.Connexion;
import fr.ensup.avenger.services.*;
import fr.ensup.avenger.dao.ReadAvengers;
import fr.ensup.avenger.domaine.Avengers;
import fr.ensup.avenger.services.AvengersService;

public class fenetre extends JComponent{

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		//JFrame
		JFrame f = new JFrame("Avengers"); 
		f.setSize(700, 400);
		f.setLocationRelativeTo(null);
		JPanel p = new JPanel();

		JMenu m1 = new JMenu("Accueil");
		JMenu m2 = new JMenu("Option");
		JMenu m3 = new JMenu("Edition");
		JMenuBar mb = new JMenuBar(); 
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		f.setJMenuBar(mb);
		
		//JFrame
		AvengersService avengersService = new AvengersService();
		Connexion conn = new Connexion();
		
		//System.out.println(avengersService.ListeAvengers(conn));
		/**
		 * Instenciation du tableau listAven
		 */
		ArrayList<Avengers> listAven = new ArrayList<Avengers>();
		/**
		 * Récupération du service et stockage dans listAven
		 */
		listAven = avengersService.ListeAvengers(conn);
		/**
		 * 
		 */
		JComboBox avenListJCombo = new JComboBox(listAven.toArray());
		p.add(avenListJCombo);
		f.add(p);
		f.setVisible(true);
		
		//inserer dans la base de donnees 
		CreateAvenger ca = new CreateAvenger();
		//ca.createAv();
		
		//suppr dans la base
		DeleteAvenger da = new DeleteAvenger();
		//da.deleteAv();
		//da.deleteAllAv();
		
		

	}

}
