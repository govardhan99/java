import java.sql.*;

public class JdbcC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String dbURL="jdbc:mysql://localhost:3306/demo";
		   String username="root";
		   String password="gOvardhan@98";
		   try {
			   Connection conn=DriverManager.getConnection(dbURL, username, password);
			   if(conn!=null) {
				   System.out.println("we got connected");
				/*  String sql="INSERT INTO emptable(emp_id,emp_name,emp_des,emp_age,emp_sal)VALUES(?,?,?,?,?)";
				  PreparedStatement statement=conn.prepareStatement(sql);
				  statement.setString(1,"101");
				  statement.setString(2,"ravi");
				  statement.setString(3,"junior Analyst");
				  statement.setString(4, "40");
				  statement.setString(5, "100");
				  int rowsInserted=statement.executeUpdate();
				  
				  PreparedStatement statement1=conn.prepareStatement(sql);
				  statement.setString(1,"102");
				  statement.setString(2,"raju");
				  statement.setString(3,"junior Analyst");
				  statement.setString(4, "32");
				  statement.setString(5, "100");
				   rowsInserted=statement.executeUpdate();
				  
					  PreparedStatement statement2=conn.prepareStatement(sql);
					  statement.setString(1,"103");
					  statement.setString(2,"ramu");
					  statement.setString(3,"senior Analyst");
					  statement.setString(4, "53");
					  statement.setString(5, "600");
					   rowsInserted=statement.executeUpdate();
					   
						  PreparedStatement statement3=conn.prepareStatement(sql);
						  statement.setString(1,"104");
						  statement.setString(2,"john");
						  statement.setString(3,"Manager");
						  statement.setString(4, "55");
						  statement.setString(5, "700");
						   rowsInserted=statement.executeUpdate();
						   
							  PreparedStatement statement4=conn.prepareStatement(sql);
							  statement.setString(1,"105");
							  statement.setString(2,"ramesh");
							  statement.setString(3,"junior Analyst");
							  statement.setString(4, "42");
							  statement.setString(5, "100");
							   rowsInserted=statement.executeUpdate();
				   if(rowsInserted>0) { 
					   System.out.println("Inserted");
				  }*/
				   String sql="UPDATE emptable " +
				             "SET emp_des = 'Manager',emp_sal=800 WHERE emp_age>40";;
				   PreparedStatement statement = conn.prepareStatement(sql);
				   
				  
				
				   int rowsupdated=statement.executeUpdate();
				   if(rowsupdated>0) {
					   System.out.println("done");
				   }
				  
			   }
				   else {
					   System.out.println("we didn't connect");
				   }
				   conn.close();
			   }
			   catch(SQLException e) {
				   e.printStackTrace();
				   
			   }
		       
			}

		}
