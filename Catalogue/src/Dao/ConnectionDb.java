package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDb{
private Connection connexion;
private Statement statement;
private PreparedStatement preparedStatement;

public  ConnectionDb(){
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/musique","root","");
		statement = connexion.createStatement();
	
	} catch ( SQLException | ClassNotFoundException e){
		e.printStackTrace();

	}
}
public Connection getConnexion(){
return connexion;
}
public void setConnexion(Connection connexion){
this.connexion = connexion;
}

public Statement getStatement(){
return statement;
}
public void setStatement(Statement statement){
this.statement = statement;
}

public PreparedStatement getPreparedStatement(){
return preparedStatement;
}

public void setPreparedStatement(PreparedStatement preparedStatement){
this.preparedStatement = preparedStatement;
}
public void close() {
	if (connexion != null) {
		try {
			connexion.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}	
}
}
