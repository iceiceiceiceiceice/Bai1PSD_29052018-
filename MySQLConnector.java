package Shop;

import com.mysql.jdbc.*;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

public class MySQLConnector {
	private Connection con;
	private Statement sta;
	private ResultSet rs;
	public MySQLConnector(){
		try{
			MysqlDataSource dataSource = new MysqlDataSource();
			dataSource.setUser("root");
			dataSource.setPassword("12345678");
			dataSource.setServerName("localhost");
			dataSource.setDatabaseName("classicmodels");
			con = (Connection) dataSource.getConnection();
			sta = (Statement) con.createStatement();
		}
		catch(Exception e){
			
		}
	}
	public void getData(String query1){
		try{
			String query = "select * from employees";
			rs = (ResultSet) sta.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString("lastname"));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
