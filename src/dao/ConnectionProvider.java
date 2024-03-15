package dao;

import java.sql.Connection;
import java.sql.DriverManager;

//conexao bd
public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?useSSL=false","root","admin");
            return con;
            
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
