/*
Ahmad Abdel Naser
 * 2013
 * Sterio007
 */
package compiler;

import static compiler.CompilerView.jTextArea1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Parser {
//input
   public List<DataHelper> input;//"i*i$"
    private int indexOfInput=-1;
    //Stack
    Stack <String> strack=new Stack<String>();
    //Table of rules
    String [][] table=
    {
/* S */ {null,"D ^ S ",null,"D ^ S ","D ^ S ",null,null,null,"tohi ","[ S ] ",null,null,null,null,null,null,null,null,null, "agar C " ,"ta C ","Begir B ","Benevis B ","Harf I ","Ashari A ","Sahih A "}
            ,
/* A */ {null,null,null,null,"identifier E ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* E */ {null,null,null,null,null,"^ S ","= F ",", A ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* F */ {null,null,null,"number L ","identifier N ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* N */ {null,null,null,null,null,"L ",null,"L ",null,null,null,"L ",null,null,null,null,null,null,"Operator3 O ",null,null,null,null,null}
            ,
/* O */ {null,null,null,null,null,"^ S ",null,", A ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* L */ {null,null,null,null,null,"^ S ",null,", A ",null,null,null,"OperatorM M ",null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* M */ {null,null,null,"number L ","identifier L ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* B */ {null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,"( \" String \" G ",null,null,null,null,null,null,null}
            ,
/* G */ {null,null,null,null,null,null,null,", identifier G ",null,null,null,null,null,null,") ^ S ",null,null,null,null,null,null,null,null,null,null}
            ,
/* C */ {null,null,null,null,null,null,null,null,null,null,null,null,null,"{ D } Z ",null,null,null,null,null,null,null,null,null,null,null}
            ,
/* D */ {null,"P H ",null,"P H ","P H ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* H */ {null,null,null,null,null,null,null,null,null,null,"epsilon ","OperatorM P ",null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* Z */ {null,null,null,null,null,null,null,null,null,"[ S ] ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* I */ {null,null,null,"identifier J ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* J */ {null,null,null,null,null,null,"= K ",", I ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* K */ {null,"' Character ' ^ ",null,null,"identifier ^ ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}
            ,
/* P */ {null,"' Character ' ",null,"number ","identifier ",null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null}

    };
    String [] nonTers={
        "S","A","E",
        "F","N","O",
        "L","M","B",
        "G","C","D",
        "H","Z","I",
        "J","K","P"};
    String [] terminals={
        "$","'","character","number","identifier","^",
        "=",",","]","[","epsilon",
        "OperatorM","}","{",")","\"",
        "String","(","Operator3","agar",
        "ta","Begir","Benevis","Harf","Ashari",
        "Sahih"
        };


public Parser(List<DataHelper> in)
{

this.input=in;
}

private  void pushRule(String rule)
{
String [] rules = rule.split(" ");
    
for(int i=rules.length-1;i>=0;i--)
{
push(rules[i]);
}
}

public void startParsing()
{
    
    //first init
    push("$");
    push("S");
    
    String token=read();
    String top=null;
    
    do
    {
        top=this.pop();
        //if top is non-terminal
        if (top.equals("tohi")) {
            continue;
        }
        if(isNonTerminal(top))
        { 
        String rule=this.getRule(top, token);
        this.pushRule(rule);
        }
        else if(isTerminal(top))
        {
            if(!top.equals(token))
            {
            error("this token is not corrent , By Grammer rule . Token : ("+token+")");
            }   
            else
            {
                System.out.println("Matching: Terminal :( "+token+" )");
                System.out.println(indexOfInput);
                token = read();
            }   
        }
        else
        {
        error("Never Happens , Because top : ( "+top+" )");
        }
        if(token.equals("$"))
        {
        break;
        }
        //if top is terminal
    
    }while(true);//out of the loop when $
    
    //accept
    if(token.equals("$"))
        {
         System.out.println("Input is Accepted by LL1");   
         //start change to C
            CChanger change = new CChanger(this.input);
            change.changer();
        }
    else
    {
     System.out.println("Input is not Accepted by LL1");   
    }
}

    private boolean isTerminal(String s) {
               for(int i=0;i<this.terminals.length;i++)
        {
        if(s.equals(this.terminals[i]))
        {
        return true;
        }

        }
              return false;
    }

    private boolean isNonTerminal(String s) {
        for(int i=0;i<this.nonTers.length;i++)
        {
        if(s.equals(this.nonTers[i]))
        {
        return true;
        }

        }
              return false;
    }

    private String read() {
        indexOfInput++;
        String str = "";
    if(this.input.get(indexOfInput).getLexeme().equals("identifier") || this.input.get(indexOfInput).getLexeme().equals("OperatorM") 
            || this.input.get(indexOfInput).getLexeme().equals("Operator3")||this.input.get(indexOfInput).getLexeme().equals("String")){
        str = this.input.get(indexOfInput).getLexeme();
    }else if(this.input.get(indexOfInput).getLexeme().equals("Integer")||this.input.get(indexOfInput).getLexeme().equals("Double")){
        str = "number";
    }else if(this.input.get(indexOfInput).getLexeme().equals("Operator")){
        str = this.input.get(indexOfInput).getToken();
    }else{
        str = this.input.get(indexOfInput).getToken();
    }
        return str;
    }

    private void push(String s) {
     this.strack.push(s);   
    }
        private String pop() {
   return this.strack.pop();   
    }

    private void error(String message) {
        System.out.println(message);
        throw new RuntimeException(message);
    }
    public String getRule(String non,String term)
    {

    int row=getnonTermIndex(non);
    int column=getTermIndex(term);
    String rule=this.table[row][column];
    if(rule==null)
    {
        System.out.println(strack);
    error("There is no Rule by this , Non-Terminal("+non+") ,Terminal("+term+") ");
    }
    return rule;
    }

    private int getnonTermIndex(String non) {
       for(int i=0;i<this.nonTers.length;i++)
       {
       if(non.equals(this.nonTers[i]))
       {
       return i;
       }
       }
       error(non +" is not NonTerminal");
       return -1;
    }

    private int getTermIndex(String term) {
              for(int i=0;i<this.terminals.length;i++)
       {
       if(term.equals(this.terminals[i]))
       {
       return i;
       }
       }
       error(term +" is not Terminal");
       return -1;
    }
    
        //main
//    public static void main(String[] args) {
//        // TODO code application logic here
//        
//        LL1_Parser parser=new LL1_Parser("Sahih");//i*i+(i+i)$
//        parser.algorithm();
//  
//    }

}
/*
 
 */