package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
 
public class Connexion {
    private static Connection connection = null;
    protected static Statement statement = null;
 
    
    private static String url = "jdbc:mysql://localhost:8889/nestix_test";
	private static String user = "test_user";
	private static String password = "test_mdp";

    public static void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            
            System.out.println("Connexion a " + url + " avec succ�s");
        } catch (ClassNotFoundException notFoundException) {
            notFoundException.printStackTrace();
            System.out.println("Erreur de connexion");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Erreur de connexion");
        }
    }
 
    public static void close() {
        try {
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static ResultSet query(String requet) {
        ResultSet resultat = null;
        try {
            getConnexion();
            statement = connection.createStatement();
        	System.out.println(requet);
            resultat = statement.executeQuery(requet);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erreur dans la requ�te : " + requet);
        }
        return resultat;
  
    }

    public static Connection getConnexion(){
        if (connection == null){
            connect();
        }
    return connection;
    }
}