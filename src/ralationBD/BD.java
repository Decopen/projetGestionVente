/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ralationBD;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
/**
 *
 * @author Péniél
 */
public class BD {
    public static Connection con = null;
     
    public static void Connect(){
        String u = "jdbc:mysql://localhost:3307/gestionvente";
        String r="root";
        String p = "123456789Pepero#";
        try {
            con = DriverManager.getConnection(u, r, p);
            if (con != null){
                JOptionPane.showMessageDialog(null, "Connection réussite");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erreur de connection"+e);
        }
}
}
