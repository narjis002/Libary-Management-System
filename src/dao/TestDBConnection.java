
package dao;
import java.sql.Connection;

public class TestDBConnection {
	
public static void main(String[] args) {
		
		Connection c = Dbconnection.getConnection();
		
		if(c != null) {
			System.out.println("Connection Successful");
		}
		
	}


}

