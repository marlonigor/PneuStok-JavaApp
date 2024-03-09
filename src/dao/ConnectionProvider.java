/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;

//conexao bd
public class ConnectionProvider {
    
    public static Connection getCon(){
        try{
            Class.forName("com.sql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/")
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
}
