import java.sql.*;

public class DBConnection 
{
	public static void main(String[] args) 	//DB����
	throws Exception{	
			Connection con;
			Statement st;
			ResultSet rs;

			String url = "jdbc:sqlserver://localhost:1433;databaseName = Bank";
			String user = "sa";
			String password = "123";

			class.forName(dbDriver).newInstance();

			con = DriverManager.getConnection(url,user,password);
			st = con.CreateStatement();
			rs = st.executeQuery(sql);

			con.close();
			st.close();
			rs.close();
	}
}