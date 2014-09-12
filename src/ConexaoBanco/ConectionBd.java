/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBanco;

import java.sql.Connection; // conexão SQL para java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.SQLException; // classe para tratamento de exceções


/**
 *
 * @author Carina
 */
public class ConectionBd {
    private final String Dd = "xe";
	private final String ConnString = "jdbc:oracle:thin:@10.1.2.4:1521/" + Dd;
	private final String User = "aleaguado";
	private final String Pass = "aleaguado";
	private Connection connection;
	
	private static  ConectionBd instance;

	public static ConectionBd getInstance(){
		if (instance == null){
                    instance = new ConectionBd();
		}
		return instance;
	}
	
	public Connection getConnection() throws SQLException{
		if (connection == null){
                    connection = DriverManager.getConnection(ConnString,User,Pass);
		}
		return connection;
	}
}
