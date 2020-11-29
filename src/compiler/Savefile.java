/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Savefile {
    
    File output = new File(Compiler.DirectoryRootAddress);
    public void Write() 
  throws IOException {
    String str = CompilerView.jTextArea1.getText();
    BufferedWriter writer = new BufferedWriter(new FileWriter(output));
    writer.write(str);
    
    writer.close();
}
}
