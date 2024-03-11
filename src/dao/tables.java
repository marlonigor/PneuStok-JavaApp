package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class tables {
    
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        
        try{
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            //st.executeUpdate("CREATE TABLE user(user_id int AUTO_INCREMENT primary key, userType VARCHAR(50), name VARCHAR(200), password VARCHAR(50), status VARCHAR(50)) ");
            st.executeUpdate("INSERT INTO user(userType, name, password, status) VALUES ('SuperAdmin', 'Super Admin', 'admin', 'Active')");
            JOptionPane.showMessageDialog(null, "Comando Executado com Sucesso!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                con.close();
                st.close();
            }
            catch(Exception e){
                
            }
        }
    }
        
}
