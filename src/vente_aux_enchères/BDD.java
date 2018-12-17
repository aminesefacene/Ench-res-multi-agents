package vente_aux_enchères;

import java.net.Socket;
import java.security.MessageDigest;
import java.sql.*;

public class BDD {

	Connection connection;
	Statement statement;
	String SQL;
	String url;
	String username;
	String password;
	Socket client;
	int Port;
	String Host;

	public BDD(String url, String username, String password, String Host,
			int Port) {

		this.url = url;
		this.username = username;
		this.password = password;
		this.Host = Host;
		this.Port = Port;

	}

	// fonction de connexion à la base de données

	public Connection connexionDatabase() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return connection;

	}

	// fonction pour fermer la connexion à la base de données
	public Connection closeconnexion() {
		try {
			connection.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return connection;
	}

	// Execution des requetes
	public ResultSet executionQuery(String sql) {
		connexionDatabase();
		ResultSet resultset = null;
		try {
			statement = connection.createStatement();
			resultset = statement.executeQuery(sql);
			System.out.println(sql);
		} catch (SQLException ex) {
			System.err.println(ex);
		}
		return resultset;
	}

	// Execution d'une requete update
	public String executionUpdate(String sql) {
		connexionDatabase();
		String result = "";
		try {
			statement = connection.createStatement();
			statement.executeUpdate(sql);
			result = sql;
		} catch (SQLException ex) {
			result = ex.toString();
		}
		return result;
	}

	// Afficher tous les éléments d'une table

	public ResultSet querySelectAll(String nomTable) {

		connexionDatabase();
		SQL = "SELECT * FROM " + nomTable;
		System.out.println(SQL);
		return this.executionQuery(SQL);
	}

	public ResultSet querySelectAll(String nomTable, String etat) {

		connexionDatabase();
		SQL = "SELECT * FROM " + nomTable + " WHERE " + etat;
		System.out.println(SQL);
		return this.executionQuery(SQL);
	}
        
        public ResultSet querySelectAll(String nomTable, String etat, String etat1) {

		connexionDatabase();
		SQL = "SELECT * FROM " + nomTable + " WHERE " + etat + etat1; 
		System.out.println(SQL);
		return this.executionQuery(SQL);
	}
        

	public ResultSet querySelect(String[] nomColonne, String nomTable) {
		connexionDatabase();
		int i;
		SQL = " SELECT ";

		for (i = 0; i<= nomColonne.length -1; i++){
			SQL += nomColonne[i];
			if (i < nomColonne.length-1) {
				SQL += ",";
			}
		}
		SQL += " FROM " + nomTable;
		return this.executionQuery(SQL);
	}
	
	public ResultSet fcSelectCommand(String[] nomColonne, String nomTable, String etat) {
		connexionDatabase();
		int i;
		SQL = " SELECT";
		
		for(i = 0; i<= nomColonne.length; i++){
			SQL += nomColonne[i];
			if (i < nomColonne.length - 1){
				SQL += ",";
			}
		}
		SQL += " FROM " + nomTable + " WHERE " + etat;
		return this.executionQuery(SQL);
	}
	
	// Fonction d'insertion de données 
	
	public String queryInsert(String nomTable, String[] contenuTableau) {
		connexionDatabase();
		int i;
		SQL = " INSERT INTO " + nomTable + " VALUES(";
		
		for (i=0; i<= contenuTableau.length-1; i++) {
			SQL += "'" + contenuTableau[i] + "'";
			if (i < contenuTableau.length-1) {
				SQL += ",";
			}
		}
		SQL += ")";
		return this.executionUpdate(SQL);
	}
	
	public String queryInsert(String nomTable, String[] nomColonne, String[] contenuTableau) {
		connexionDatabase();
		int i;
		SQL = " INSERT INTO " + nomTable + "(";
		for (i=0; i<= nomColonne.length-1; i++) {
			SQL += nomColonne[i];
			if (i < nomColonne.length - 1) {
				SQL += ",";
			}
		}
		SQL += ") VALUES("; 
		for (i=0; i<= contenuTableau.length-1; i++) {
			SQL += "'" + contenuTableau[i] + "'";
			if (i < contenuTableau.length-1) {
				SQL += ",";
			}
		}
		SQL += ")";
		return this.executionUpdate(SQL);
	}
        
        public String queryUpdate(String nomTable, String[] nomColonne, String[] contenuTableau, String etat) {
            connexionDatabase();
            int i;
            SQL = "UPDATE " + nomTable + " SET ";
            
            for (i = 0; i <= nomColonne.length - 1; i++) {
                SQL += nomColonne[i] + "='" + contenuTableau[i] + "'";
                if (i < nomColonne.length - 1){
                    SQL += ",";
                }
            }        
             
            SQL += " WHERE " + etat;
            return this.executionUpdate(SQL);
        }
        
        public String queryDelete(String nomTable) {
            connexionDatabase();
            SQL = " DELETE FROM " + nomTable;
            return this.executionUpdate(SQL);
        }
        
        public String queryDelete(String nomTable, String etat){
            connexionDatabase();
            SQL = "DELETE FROM " + nomTable + " WHERE " + etat;
            return this.executionUpdate(SQL);
            
                 
        }
        
        
        public static String getMD5(String message){
		 String digest = null;
	        try {
	            MessageDigest md = MessageDigest.getInstance("MD5");
	            byte[] hash = md.digest(message.getBytes("UTF-8"));
	           
	            //converting byte array to Hexadecimal String
	           StringBuilder sb = new StringBuilder(2*hash.length);
	           for(byte b : hash){
	               sb.append(String.format("%02x", b&0xff));
	           }
	          
	           digest = sb.toString();
	          
	        } catch (Exception ex) {
	        	ex.printStackTrace();
	        }
	        return digest;
	}
        
}
        


