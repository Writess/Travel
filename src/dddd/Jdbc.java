package dddd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc {
				public	static  Connection	getconn()
				{			Connection conn=null;
					try {
						Class.forName("com.mysql.jdbc.Driver");
						 conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cms?useUnicode=true&amp;characterEncoding=utf-8", "root", "root");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return 	conn;
				}
				public  static	void	close(Connection	conn,	PreparedStatement		ps,	ResultSet	rs)
				{
							try {
								rs.close();
								ps.close();
								conn.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
					
				}
				public  static	void	close(Connection	conn,	PreparedStatement		ps)
				{
							try {
								
								ps.close();
								conn.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
					
				}
}
