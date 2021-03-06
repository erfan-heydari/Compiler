/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.KeyStroke;
import javax.swing.text.html.HTMLEditorKit;

/**
 *
 * @author Batiss
 */
public class CompilerView extends javax.swing.JFrame {

    /**
     * Creates new form CompilerView
     */
    public CompilerView() {
        initComponents();
        jTextArea1.setBorder(BorderFactory.createCompoundBorder(
                        jTextArea1.getBorder(), 
                        BorderFactory.createEmptyBorder(15, 15, 15, 5)));
        jTextArea2.setBorder(BorderFactory.createCompoundBorder(
                        jTextArea1.getBorder(), 
                        BorderFactory.createEmptyBorder(15, 15, 15, 5)));
        jEditorPane2.setBorder(BorderFactory.createCompoundBorder(
                        jTextArea1.getBorder(), 
                        BorderFactory.createEmptyBorder(15, 15, 15, 5)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1348, 768));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Compiler");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-input-50.png"))); // NOI18N
        jLabel2.setToolTipText("Input");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-output-50.png"))); // NOI18N
        jLabel3.setToolTipText("Output");

        jButton1.setMnemonic('R');
        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-resume-button-60.png"))); // NOI18N
        jButton1.setToolTipText("Run(Alt + R)\n");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        //Action saveAction = new AbstractAction("Save") {
            //
            //    @Override
            //    public void actionPerformed(ActionEvent e) {
                //        System.out.println("Saving...");
                //    }
            //    };
        //
        //    saveAction.putValue(Action.ACCELERATOR_KEY,
            //        KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
        //jButton1.setAction(saveAction);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setMnemonic('C');
        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-multiply-60.png"))); // NOI18N
        jButton2.setToolTipText("Close(Alt + C)\n\n");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setMnemonic('S');
        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-save-50.png"))); // NOI18N
        jButton3.setToolTipText("Save(Alt + S)\n");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setMnemonic('O');
        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-open-in-popup-50 (1).png"))); // NOI18N
        jButton4.setToolTipText("Open(Alt + O)\n");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-code-100.png"))); // NOI18N
        jLabel4.setToolTipText("Sina#");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Lexer Output");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Parser Output");

        jEditorPane2.setBackground(new java.awt.Color(153, 153, 153));
        jEditorPane2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jScrollPane5.setViewportView(jEditorPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(170, 170, 170)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(242, 242, 242))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane5))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static boolean isLexemOK = true;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        isLexemOK = true;
        jEditorPane2.setEditorKit(new HTMLEditorKit());
        tokenTable.clear();
        this.createTable();
    
        
        
        if(isLexemOK){
            tokenTable.add(new DataHelper("end", "$"));
            Parser parser=new Parser(tokenTable);//i*i+(i+i)$
            parser.startParsing();
        }
       
  
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // closin':
        
        this.setVisible(false);
        System.exit(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Savefile sv = new Savefile();
            sv.Write();
        } catch (IOException ex) {
            Logger.getLogger(CompilerView.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Filechooser fc = new Filechooser();
        try {
            fc.Chooser("");
        } catch (IOException ex) {
            Logger.getLogger(CompilerView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompilerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompilerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompilerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompilerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
      

                new CompilerView().setVisible(true);
                            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
 String[] operators = {
        "&B",
        "&BM",
        "&K",
        "&KM",
        "&MM",
        "Jam",
        "Kam",
        "Zarb",
        "Tagsim",
        "Bagimonde",
    };
 String[] operator3 = {
        "YekiBala",
        "YekiPain",
 };
String[] operators2 = {
      "(",
      ")",
      ",",
      "\"",
      "'",
      "{",
      "}",
      "[",
      "]",
      "^",
      "=",
    };

    String[] keyWords = {
        "Sahih",
        "Ashari",
        "Harf",
        "Benevis",
        "Begir",
        "agar",
        "ta",
        
    };
    List<DataHelper> tokenTable = new ArrayList<DataHelper>();

    private void createTable() {
           
        String Error = "";
         
        byte[] code = (jTextArea1.getText()+" ").toString().getBytes();
        
        boolean whiteSpaceORComment = false;
        
        boolean isInt = true;
        
        String temp = "";
        
        int state = 0;
        
        for (int i = 0; i < code.length; i++) {
            
            switch(state){
              case 0:
                  
                  if(whiteSpaceORComment){
                      //do nothing
                      break;
                  }
                  
                  //Syntax starts with &
                  if(code[i] == 38){
                      temp += (char)code[i];
                      state = 1;
                      break;
                  }

                  //identifier & keyWords
                  if (97 <= code[i] && code[i] <= 122) {
                      temp += (char)code[i];
                      state = 2;
                      break;
                  }
                  if ((65 <= code[i] && code[i] <= 90)) {
                      temp += (char)code[i];
                      state = 2;
                      break;
                  }
                  
                  //operator ( ) ^ . . .
                  for (int j = 0; j < operators2.length; j++) {
                      if (String.valueOf(((char) code[i])).equals(operators2[j])) {
                          state = 3;
                          temp = operators2[j];
                      }
                      
//                      if (i != code.length-1) {
////                          System.err.println((String.valueOf(((char) code[i]))+String.valueOf(((char) code[++i]))));
//                          if ((String.valueOf(((char) code[i]))+String.valueOf(((char) code[i+1]))).equals(operators2[j])) {
//                          state = 3;
//                          temp = operators2[j];
//                        }
//                      }
//                      
                  }

                  //numbers
                  if(code[i] <= 57 && code[i] >= 48){
                      temp += (char)code[i];
                      state = 4;
                      break;
                  }
                  
//                  if(temp.equals("'")){
//                      System.out.println("yes");
//                      state = 6;
//                      i--;
//                      temp = "";
//                  }else{
//                      temp = "";
//                  }
//                  
                  break;
              case 1:
                  // operator Starts with &
                  if( 65 <= code[i] && code[i] <= 90){
                      temp += (char)code[i];
                  }else{
                      int flag = 0;
                      for (int j = 0; j < operators.length; j++) {
                          if (temp.equals(operators[j])) {
                            tokenTable.add(new DataHelper("OperatorM",""+temp ));
                            temp = ""; state = 0; i--;
                            flag = 1;
                            break;
                          }
                      }
                      for (int j = 0; j < operator3.length; j++) {
                          if (temp.equals(operator3[j])) {
                            tokenTable.add(new DataHelper("Operator3",""+temp ));
                            temp = ""; state = 0; i--;
                            flag = 1;
                            break;
                          }
                      }
                      if (flag == 1 ) break;
                      else state = 99;
                      
                  }
                  break;
              case 2:
                  if ((97 <= code[i] && code[i] <= 122)||65 <= code[i] && code[i] <= 90) {
                      temp += (char)code[i];
                      break;
                  }else if(code[i] <= 57 && code[i] >= 48){
                      temp += (char)code[i];
                  }else{
                      //save
                      for (int j = 0; j < operators.length; j++) {
                          if (temp.equals(operators[j])) {
                              tokenTable.add(new DataHelper("OperatorM",""+temp ));
                              temp = ""; state = 0; i--;
                              break;
                          }
                      }
                      for (int j = 0; j < operator3.length; j++) {
                          if (temp.equals(operator3[j])) {
                            tokenTable.add(new DataHelper("Operator3",""+temp ));
                            temp = ""; state = 0; i--;
                            break;
                          }
                      }
                      for (int j = 0; j < keyWords.length; j++) {
                          if (temp.equals(keyWords[j])) {
                              tokenTable.add(new DataHelper("keyWords",""+temp ));
                              temp = ""; state = 0; i--;
                              break;
                          }
                      }
                      if (!temp.equals("")) {
                          tokenTable.add(new DataHelper("identifier",""+temp ));
                          temp = ""; state = 0; i--;
                      }
                  }

                  break;
                case 3:
                  tokenTable.add(new DataHelper("Operator",""+temp ));
                  
//                  if(!temp.equals("%d"))
//                     i--;

                  if(temp.equals("\"")){
                      state = 5;
                      i--;
                      temp = "";
                  }else if(temp.equals("'")){
                      state = 6;
                      i--;
                      temp = "";
                  }
                  else{
                      i--;
                      temp = "";
                      state = 0;
                  }
                  
                  
                  break;
                case 4:
                  
                    if (code[i] <= 57 && code[i] >= 48) {
                        temp = temp + (char)code[i];
                    }else if((char)code[i] == '.'){
                        temp = temp + (char)code[i];
                        isInt = false;
                    }else {
                        if (isInt) {
                            tokenTable.add(new DataHelper("Integer",""+temp ));
                            temp = ""; state = 0; i--;
                        }else{
                            try {
                                double d = Double.parseDouble(temp);
                                tokenTable.add(new DataHelper("Double",""+temp ));
                                temp = ""; state = 0; i--; isInt = true;
                            } catch (Exception e) {
                                i--;
                                Error = e.toString();
                                state = 99;  
                            }
                        }
                    }
                  break;
                case 5:
                    
                    if((char)code[i] != '"')
                    {
                        temp += (char)code[i];
                        state = 5;
                        
                    }else{
                        //save String
                        
                        tokenTable.add(new DataHelper("String",""+temp ));
                        tokenTable.add(new DataHelper("Operator","\""));

                        temp = "";
                        state = 0;
                        
                    }
                    
                    break;
                case 6:
                   if((char)code[i] != '\'')
                    {
                        temp += (char)code[i];
                        state = 6;
                        
                    }else{
                        //save Char
                        
                        tokenTable.add(new DataHelper("Character",""+temp ));
                        tokenTable.add(new DataHelper("Operator","'"));

                        temp = "";
                        state = 0;
                        
                    } 
                    
                    break;
                case 99:
                    
                    String error = "********  LEXER Error ********\n" + "Error! At "+ temp +Error;
                    System.err.println(error);
                    jTextArea2.setText(error);
                    
                    
                    i = code.length;
                    isLexemOK = false;
                    break;
              default:
                  state = 99;
                  break;
            };
        }
        String OutPut = "";
         for (DataHelper operator : tokenTable)
         {
             OutPut += operator.getLexeme() + "   " + operator.getToken() + "\n";
         }
         if (isLexemOK) {
             jTextArea2.setText(OutPut);
        }
    }
    
}
