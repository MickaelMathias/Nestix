package app;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Requete extends Connexion {


	public static Object[][] rechercheFilm(String requete){
         
        Object[][] tabObj = null;
        ResultSet resultat = query(requete);
        try{ 
        ResultSetMetaData rsmd = resultat.getMetaData();
    
        resultat.last();
        tabObj = new Object[resultat.getRow()][rsmd.getColumnCount()+1];
        resultat.beforeFirst();

        int i = 0;
        while(resultat.next())
            {
                tabObj[i][0] = resultat.getString("media_id");
                tabObj[i][1] = resultat.getString("media_title");
                i++;
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        //close();
        return tabObj;
    }

    public static String[] rechercheInfosMedias(int idMedia) throws SQLException{
          
        ResultSet resultat = query("SELECT * FROM media WHERE media_Id = " + idMedia);        
        ResultSetMetaData rsmd = resultat.getMetaData();
        
        String test[] = new String[rsmd.getColumnCount()];
        while(resultat.next())
        {
            test[0] = resultat.getString("media_id");
            test[1] = resultat.getString("media_title");
            test[2] = resultat.getString("media_type");
        	test[3] = resultat.getString("media_cover");
        	test[4] = resultat.getString("media_link");
        }
        return test;
    }
	
	public static Object[][] rechercheLivre(String requete) throws SQLException
    {
        Object[][] tabObj = null;
        ResultSet resultat = query(requete); 
        try{
        ResultSetMetaData rsmd = resultat.getMetaData();
        
        
        resultat.last();
        tabObj = new Object[resultat.getRow()][rsmd.getColumnCount()];
        resultat.beforeFirst();

        int i = 0;
        while(resultat.next())
            {
                tabObj[i][0] = resultat.getString("media_title");
                i++;
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        close();
        return tabObj;
    }

    public static String requeteUniqueTexteString(String requete){

        String ma_requete = requete;
        String ma_variable_retour="";
        try {
        ResultSet resultat_requete = query(ma_requete); 
        resultat_requete.next();
            ma_variable_retour = resultat_requete.getString(1);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return ma_variable_retour;
    }

    public static int requeteUniqueTexteInt(String requete){

        String ma_requete = requete;
        int ma_variable_retour=0;
        try {
        ResultSet resultat_requete = query(ma_requete); 
        resultat_requete.next();
            ma_variable_retour = resultat_requete.getInt(1);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return ma_variable_retour;
    }

    public static int requeteInsert(String requete){

        String ma_requete = requete;
        int result= 0;
        Connection maco;
        Statement state = null;
        try {
            maco = getConnexion();
            state = maco.createStatement();
            result = state.executeUpdate(ma_requete); 
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return result;
    }
}
