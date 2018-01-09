package formulaire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.jdbc.Driver;

public class ReservationManager {

	//private final static ReservationManager INSTANCE = new ReservationManager();
	private final static String BDPATH = "jdbc:mysql://localhost:3306/mydb";
	private final static String DBUSER = "admin";
	private final static String DBPASSWORD = "admin";

	private static Connection connect;

	public void connection() throws ClassNotFoundException {
		// TODO Auto-generated catch block	
		Class.forName("com.mysql.jdbc.Driver");
		// Load the database driver
		try {

			System.out.println("driver ok");
			connect = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);
			System.out.println("connection ok");
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void insertData(String nom , String prenom) //, String adresse, String telephone, String email,
//			int participantSlct, int duree, String regionOrigine, boolean animal, boolean parking, boolean fumeur,
//			boolean don, String typeSejour) 
	throws SQLException {
		Statement statement = null;

		try {
			statement = connect.createStatement();
			String sql = "INSERT INTO `reservations` (`nom`, `prenom`) VALUES ('" + nom + "', '" + prenom + "')";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("Une erreur s'est produite lors de l'insertion des données !");
	} 	finally {
		statement.close();
		}

		System.out.println();
	}

	public void showData() throws SQLException {
		Statement statement = null;
		ResultSet rs = null;

		try {
			// Create the statement
			statement = connect.createStatement();
			String sql = "SELECT * FROM reservations";

			// Execute the query
			rs = statement.executeQuery(sql);

			// Loop on the results extracted from the database
			System.out.println("Liste des réservations :");
			while (rs.next()) {
				System.out.println(
						"  - " + rs.getString("id_resa") + " : " + rs.getString("nom") + " " + rs.getString("prenom"));
			}
		} catch (SQLException e) {
			System.out.println("Une erreur s'est produite lors de la lecture des données !");
		} finally {
			statement.close();
		}

		System.out.println();
	}
}

// methode ajouter
// methode restituer
