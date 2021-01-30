package compiler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Batiss
 */
public class CChanger {

    public List<DataHelper> originalCode;
    public HashMap<String, String> rep = new HashMap<String, String>();
    File myObj;
    
    public CChanger(List<DataHelper> code) {
           this.originalCode = code;
           this.originalCode.remove(originalCode.size()-1);
           
           rep.put("Benevis","printf");
           rep.put("Begir","scanf");
           rep.put("agar", "if");
           rep.put("ta", "while");
           rep.put("Ashari", "float");
           rep.put("Sahih", "int");
           rep.put("Harf", "char");
           rep.put("^", ";");
           rep.put("&B", ">");
           rep.put("&BM", "=>");
           rep.put("&K", "<");
           rep.put("&KM", "<=");
           rep.put("&MM", "==");
           rep.put("Jam", "+");
           rep.put("YekiBala", "++");
           rep.put("Kam", "-");
           rep.put("YekiPain", "--");
           rep.put("Zarb", "*");
           rep.put("Tagsim", "/");
           rep.put("Bagimonde", "%");
           rep.put("[", "{");
           rep.put("]", "}");
           rep.put("{", "(");
           rep.put("}", ")");
           rep.put("=", "=");

    }
    
    
    
    public void changer(){

        for (int i = 0; i < originalCode.size(); i++) {
            
            String sCode = originalCode.get(i).getToken();
            String lexeme = originalCode.get(i).getLexeme();
            
            if (lexeme.equals("identifier")||lexeme.equals("Integer")||lexeme.equals("Double")) {
                continue;
            }
            if (rep.get(sCode) != null ){
                originalCode.get(i).Token = rep.get(sCode);
            }
        }
        
        makeFile();
        
    }
    public void makeFile(){
        
        String code = "";
        
         for (int j = 0; j < originalCode.size(); j++){
             if (originalCode.get(j).getLexeme().equals("identifier")) {
                code = code + " " +originalCode.get(j).getToken() + " ";
             }else{
                code += originalCode.get(j).getToken();
             }
         }
         
         System.out.println(code);
        
         code = "# include <stdio.h>\n" +
              "  int main(){\n" + code + " int m = 0; scanf(\"%d\",&m);  return 0;\n" +
                "}";
         
         try {
            myObj = new File("run.c");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
         
          try {
            FileWriter myWriter = new FileWriter("run.c");
            myWriter.write(code);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        runCode();
    }
    public void runCode(){
        File dir = new File(myObj.getAbsolutePath().replace(myObj.getPath(), ""));
        
        try {
            Process child = Runtime.getRuntime().exec("cmd.exe /c gcc -o run run.c & start run.exe ",null,dir);
        } catch (IOException ex) {
            Logger.getLogger(CChanger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
