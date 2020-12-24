/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

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
import javax.swing.BorderFactory;
import javax.swing.KeyStroke;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1348, 768));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Compiler");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-input-50.png"))); // NOI18N
        jLabel2.setToolTipText("Input");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-output-50.png"))); // NOI18N
        jLabel3.setToolTipText("Output");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-resume-button-60.png"))); // NOI18N
        jButton1.setToolTipText("Run(F5)");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-multiply-60.png"))); // NOI18N
        jButton2.setToolTipText("Close\n");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-save-50.png"))); // NOI18N
        jButton3.setToolTipText("Save(Ctrl + S)");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/compiler/icons8-open-in-popup-50 (1).png"))); // NOI18N
        jButton4.setToolTipText("Open(Ctrl + O)");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 1111, Short.MAX_VALUE))
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
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.createTable();
       //F5 Hotkey
       /*
       JButton button = new JButton();
 
    Action buttonAction = new AbstractAction("Refresh") {
 
    @Override
    public void actionPerformed(ActionEvent evt) {
        System.out.println("Refreshing...");
    }
    };
 
    String key = "Referesh";
 
    button.setAction(buttonAction);
 
    buttonAction.putValue(Action.MNEMONIC_KEY, KeyEvent.VK_R);
 
    button.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
        KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0), key);
 
    button.getActionMap().put(key, buttonAction);
       */
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // closin':
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Savefile sv = new Savefile();
            sv.Write();
        } catch (IOException ex) {
            Logger.getLogger(CompilerView.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
        //CTRL + S Hotkey
        JMenuItem menuItemSave = new JMenuItem();
 
    Action saveAction = new AbstractAction("Save") {
 
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Saving...");
    }
    };
 
    saveAction.putValue(Action.ACCELERATOR_KEY,
        KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_DOWN_MASK));
 
    menuItemSave.setAction(saveAction);*/
        
        
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
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
        "YekiBala",
        "Kam",
        "YekiPain",
        "Zarb",
        "Tagsim",
        "Bagimonde",
    };
 
String[] operators2 = {
      "(",
      ")",
      ",",
      "\"",
      "{",
      "}",
      "[",
      "]",
      "^",
      "="
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
                  }

                  //numbers
                  if(code[i] <= 57 && code[i] >= 48){
                      temp += (char)code[i];
                      state = 4;
                      break;
                  }
                  
                  break;
              case 1:
                  // operator Starts with &
                  if( 65 <= code[i] && code[i] <= 90){
                      temp += (char)code[i];
                  }else{
                      int flag = 0;
                      for (int j = 0; j < operators.length; j++) {
                          if (temp.equals(operators[j])) {
                            tokenTable.add(new DataHelper("operator",""+temp ));
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
                              tokenTable.add(new DataHelper("operators",""+temp ));
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
                  tokenTable.add(new DataHelper("operators",""+temp ));
                  temp = "";
                  state = 0;
                  i--;
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
                case 99:
                    System.err.println("Error! At "+ temp + "\n"+Error);
                    i = code.length;
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
         jTextArea2.setText(OutPut);
    }
    
}
