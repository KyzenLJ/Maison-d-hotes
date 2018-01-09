package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//import com.mysql.jdbc.Driver;

public class jdbcResa {

		private final static String BDPATH = "jdbc:mysql://localhost:3306/mydb";
		private final static String DBUSER = "admin";
		private final static String DBPASSWORD = "admin";
		
		private static Connection connection;
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			// Load the database driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Create the jdbc connection
			connection = DriverManager.getConnection(BDPATH, DBUSER, DBPASSWORD);
			
			Scanner sc = new Scanner(System.in);
			String input = "";
			while(!input.equals("exit"))
			{
				System.out.println("Que voulez-vous faire ? R - Restituer le contenu de la BDD / A - Ajouter des entrées à la BDD");
				input = sc.nextLine();
				
				switch (input) {
				case "A":
		
					String nom = "";
					String prenom = "";
					while((nom.isEmpty()) || (prenom.isEmpty()))
					{
						System.out.println("'Nom' à ajouter :");
						nom = sc.nextLine();
						
						System.out.println("'Prenom' à ajouter :");
						prenom = sc.nextLine();
					}
					
					insertData(nom, prenom);
					
					break;
				case "R":
					System.out.println("");
					showData();
					break;
				default:
					System.out.println("Mauvaise saisie !");
					break;
				}
				
				System.out.println();
			}
					
			
			// At the end, close the connection
			connection.close();
		}

		
		public static void insertData(String nom, String prenom) throws SQLException
		{
			Statement statement = null;

			try {
				statement = connection.createStatement();
				String sql = "INSERT INTO `reservations` (`nom`, `prenom`) VALUES ('" + nom + "', '" + prenom + "')";
				statement.executeUpdate(sql);
			}
			catch(SQLException e){
				System.out.println("Une erreur s'est produite lors de l'insertion des données !");
			}
			finally{	 
				statement.close();
			}
		
			System.out.println();
		}
		
		public static void showData() throws SQLException
		{
			Statement statement = null;
			ResultSet rs = null;

			try {
				// Create the statement
				statement = connection.createStatement();
				String sql = "SELECT * FROM reservations";
				
				// Execute the query
				rs = statement.executeQuery(sql);
			
				// Loop on the results extracted from the database
				System.out.println("Liste des réservations :");
				while (rs.next()) {
					System.out.println("  - " + rs.getString("id_resa") + " : " + rs.getString("nom") + " " +  rs.getString("prenom"));
				}
			}
			catch(SQLException e){
				System.out.println("Une erreur s'est produite lors de la lecture des données !");
			}
			finally{	 
				statement.close();
			}
			
			System.out.println();
		}
	}
