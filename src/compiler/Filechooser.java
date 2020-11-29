/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class Filechooser
{
    public String Chooser(String lastroot) throws FileNotFoundException, IOException
    {
        
         JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		jfc.setDialogTitle("Choose a file to Open: ");
		jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);

		int returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
                            Compiler.DirectoryRootAddress =  jfc.getSelectedFile().getPath();  
                            File ss = new File(Compiler.DirectoryRootAddress);
                            
                            BufferedReader br = new BufferedReader(new FileReader(ss)); 

                            String st; 
                            while ((st = br.readLine()) != null) 
                                CompilerView.jTextArea1.setText(st);
                            System.out.println(jfc.getSelectedFile().getPath());
                            return (jfc.getSelectedFile().getPath());
		}
        return lastroot;
    }
}
