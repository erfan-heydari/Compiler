/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

/**
 *
 * @author Batiss
 */

class DataHelper{
  String Lexeme;
  String Token;

    public DataHelper(String lex, String tok) {
        this.Lexeme = lex;
        this.Token = tok;
    }
  
    public String getToken(){
       return this.Token;
    }
    
    public String getLexeme(){
       return this.Lexeme;
    }
  
}
