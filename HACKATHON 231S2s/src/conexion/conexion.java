/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import static java.lang.Class.forName;
import java.sql.DriverManager;

/**
 *
 * @author Usuario1
 */
public class conexion {
   
        Connection con;
       public  conexion(){
            try {
               Class.forName("com.mysql.jdbc.Driver");
               
           } catch (Exception e) {
           }
        }
        public Connection getConnection(){
            return con;
        }
    
}
