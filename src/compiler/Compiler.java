/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;
 
//hi
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author Batiss
 */
public class Compiler {

    /**
     * @param args the command line arguments
     */
    static CompilerView cv;
    static String DirectoryRootAddress;
    
    public static void main(String[] args) {
        
        
        
        cv = new CompilerView();
        cv.getContentPane().setBackground(Color.DARK_GRAY);
        cv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cv.setLocationRelativeTo(null);
        cv.setVisible(true);
       
        
    }
    
}
