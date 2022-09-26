
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Movie {
	public static void main(String args[]) {
		String jdbcUrl = "jdbc:sqlite:C:\\Mulesoft1\\mydb.db";
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl);
//			String sql = "Select * from movies";
			String sql = "Select name from movies where actor='Prabhas'";
			
			Statement statement = (Statement) connection.createStatement();
			
			ResultSet result = ((java.sql.Statement) statement).executeQuery(sql);
			
			while(result.next()) {
				String name = result.getString("name");
//				String actor = result.getString("actor");
//				String actress = result.getString("actress");
//				String director = result.getString("director");
//				int year = result.getInt("year");
				
//				System.out.println(name + " | " + actor + " | " + actress + " | " + director + " | " + year);
				System.out.println(name);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}