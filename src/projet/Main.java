/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package projet;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import javax.swing.UIManager;
import ralationBD.BD;

/**
 *
 * @author Péniél
 */
public class Main {
    public static void main(String[] args) {
        try {
            FlatArcDarkOrangeIJTheme.setup();
            Cover objCover = new Cover();
            objCover.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}