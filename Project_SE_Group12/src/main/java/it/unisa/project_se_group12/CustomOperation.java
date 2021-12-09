/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it.unisa.project_se_group12;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;

/**
 *
 * @author PC MSI
 */
/*this class allows us to manage the interface that consent at the user to create custom
operations*/
public class CustomOperation extends javax.swing.JFrame {
    UDO udo;
    DefaultListModel<String> model;
    /**
     * Creates new form CustomOperation
     */
    public CustomOperation(UDO udo, DefaultListModel<String> model) {
        initComponents();
        this.udo = udo;
        this.model = model;
        setDefaultCloseOperation(CustomOperation.DISPOSE_ON_CLOSE);
        NameList.setModel(this.model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        insertNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InsertButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        DiffButton = new javax.swing.JButton();
        PerButton = new javax.swing.JButton();
        javax.swing.JButton DivButton = new javax.swing.JButton();
        javax.swing.JButton RadButton = new javax.swing.JButton();
        javax.swing.JButton InvertButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        dropButton = new javax.swing.JButton();
        dupButton = new javax.swing.JButton();
        swapButton = new javax.swing.JButton();
        overButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        operationArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        NameList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        OperationView = new javax.swing.JTextArea();
        deleteButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(31, 194, 194));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Custom new operation");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name: ");

        insertNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertNameFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select operations:");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("New Operations");

        InsertButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        InsertButton.setForeground(new java.awt.Color(0, 153, 153));
        InsertButton.setText("INSERT");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(0, 153, 153));
        AddButton.setText("+");
        AddButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DiffButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        DiffButton.setForeground(new java.awt.Color(0, 153, 153));
        DiffButton.setText("-");
        DiffButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DiffButton.setPreferredSize(new java.awt.Dimension(15, 23));
        DiffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiffButtonActionPerformed(evt);
            }
        });

        PerButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        PerButton.setForeground(new java.awt.Color(0, 153, 153));
        PerButton.setText("x");
        PerButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PerButton.setPreferredSize(new java.awt.Dimension(15, 23));
        PerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerButtonActionPerformed(evt);
            }
        });

        DivButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        DivButton.setForeground(new java.awt.Color(0, 153, 153));
        DivButton.setText("÷");
        DivButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DivButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivButtonActionPerformed(evt);
            }
        });

        RadButton.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        RadButton.setForeground(new java.awt.Color(0, 153, 153));
        RadButton.setText("√");
        RadButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        RadButton.setPreferredSize(new java.awt.Dimension(15, 23));
        RadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadButtonActionPerformed(evt);
            }
        });

        InvertButton.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        InvertButton.setForeground(new java.awt.Color(0, 153, 153));
        InvertButton.setText("+-");
        InvertButton.setActionCommand("-x");
        InvertButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        InvertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvertButtonActionPerformed(evt);
            }
        });

        clearButton.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(0, 153, 153));
        clearButton.setText("CLEAR");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        dropButton.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        dropButton.setForeground(new java.awt.Color(0, 153, 153));
        dropButton.setText("DROP");
        dropButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropButtonActionPerformed(evt);
            }
        });

        dupButton.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        dupButton.setForeground(new java.awt.Color(0, 153, 153));
        dupButton.setText("DUP");
        dupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dupButtonActionPerformed(evt);
            }
        });

        swapButton.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        swapButton.setForeground(new java.awt.Color(0, 153, 153));
        swapButton.setText("SWAP");
        swapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swapButtonActionPerformed(evt);
            }
        });

        overButton.setFont(new java.awt.Font("Tw Cen MT", 3, 14)); // NOI18N
        overButton.setForeground(new java.awt.Color(0, 153, 153));
        overButton.setText("OVER");
        overButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overButtonActionPerformed(evt);
            }
        });

        operationArea.setColumns(20);
        operationArea.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        operationArea.setRows(5);
        jScrollPane2.setViewportView(operationArea);

        NameList.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        NameList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        NameList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NameListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(NameList);

        OperationView.setColumns(20);
        OperationView.setRows(5);
        jScrollPane1.setViewportView(OperationView);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        modifyButton.setText("Modify");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insertNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(DiffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(PerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(DivButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dropButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(swapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(overButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(InvertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2)
                    .addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(insertNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton)
                            .addComponent(DiffButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PerButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DivButton)
                            .addComponent(RadButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InvertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dupButton)
                            .addComponent(clearButton)
                            .addComponent(dropButton)
                            .addComponent(swapButton)
                            .addComponent(overButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deleteButton)
                                .addGap(18, 18, 18)
                                .addComponent(modifyButton)
                                .addGap(18, 18, 18)
                                .addComponent(SubmitButton)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/*text field for the name of the custom operation*/
    private void insertNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertNameFieldActionPerformed
        
    }//GEN-LAST:event_insertNameFieldActionPerformed
/*button to insert the operation into the Hash Map that preserve all custom 
  operations created by the user*/
    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        String name = insertNameField.getText();
        String operation = operationArea.getText();
        udo.insertUDO(name, operation);
        model.addElement(name);
        insertNameField.setText("");
        operationArea.setText("");
    }//GEN-LAST:event_InsertButtonActionPerformed
/*button to add sum operation into the text field of the operation that a custom operation have to do*/
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        operationArea.setText(operationArea.getText() + "+ ");
    }//GEN-LAST:event_AddButtonActionPerformed
/*button to add difference operation into the text field of the operation that a custom operation have to do*/
    private void DiffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiffButtonActionPerformed
        operationArea.setText(operationArea.getText() + "- ");
    }//GEN-LAST:event_DiffButtonActionPerformed
/*button to add product operation into the text field of the operation that a custom operation have to do*/
    private void PerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerButtonActionPerformed
        operationArea.setText(operationArea.getText() + "* ");
    }//GEN-LAST:event_PerButtonActionPerformed
/*button to add division operation into the text field of the operation that a custom operation have to do*/
    private void DivButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivButtonActionPerformed
        operationArea.setText(operationArea.getText() + "÷ ");
    }//GEN-LAST:event_DivButtonActionPerformed
/*button to add square root operation into the text field of the operation that a custom operation have to do*/
    private void RadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadButtonActionPerformed
        operationArea.setText(operationArea.getText() + "√ ");
    }//GEN-LAST:event_RadButtonActionPerformed
/*button to add invert sign operation into the text field of the operation that a custom operation have to do*/
    private void InvertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvertButtonActionPerformed
        operationArea.setText(operationArea.getText() + "+- ");
    }//GEN-LAST:event_InvertButtonActionPerformed
/*button to add clear operation into the text field of the operation that a custom operation have to do*/
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        operationArea.setText(operationArea.getText() + "Clear ");
    }//GEN-LAST:event_clearButtonActionPerformed
/*button to add drop operation into the text field of the operation that a custom operation have to do*/
    private void dropButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropButtonActionPerformed
       operationArea.setText(operationArea.getText() + "Drop ");
    }//GEN-LAST:event_dropButtonActionPerformed
/*button to add dup operation into the text field of the operation that a custom operation have to do*/
    private void dupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dupButtonActionPerformed
       operationArea.setText(operationArea.getText() + "Dup "); 
    }//GEN-LAST:event_dupButtonActionPerformed
/*button to add swap operation into the text field of the operation that a custom operation have to do*/
    private void swapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swapButtonActionPerformed
        operationArea.setText(operationArea.getText() + "Swap ");
    }//GEN-LAST:event_swapButtonActionPerformed
/*button to add over operation into the text field of the operation that a custom operation have to do*/
    private void overButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overButtonActionPerformed
        operationArea.setText(operationArea.getText() + "Over ");
    }//GEN-LAST:event_overButtonActionPerformed
/*list of the custom operation that the user have created before*/
    private void NameListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NameListMouseClicked
        String key = NameList.getSelectedValue();
        OperationView.setText(udo.getMap().get(key));
    }//GEN-LAST:event_NameListMouseClicked
/*button to delete a custom operation*/
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
         String key = NameList.getSelectedValue();
         udo.deleteUDO(key);
         this.model.removeElement(key);
         OperationView.setText("");
    }//GEN-LAST:event_deleteButtonActionPerformed
/*button to modify a custom operation*/
    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        String key = NameList.getSelectedValue();
        insertNameField.setText(key);
        operationArea.setText(udo.getMap().get(key));
        udo.deleteUDO(key);
        this.model.removeElement(key);
        OperationView.setText("");
    }//GEN-LAST:event_modifyButtonActionPerformed
/*button that allows us to reutilize a custom operation as argument of a new custom operation*/
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        operationArea.setText(NameList.getSelectedValue() + " ");
    }//GEN-LAST:event_SubmitButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(CustomOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomOperation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
    //         new CustomOperation().setVisible(false);
       }
       });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DiffButton;
    private javax.swing.JButton InsertButton;
    private javax.swing.JList<String> NameList;
    private javax.swing.JTextArea OperationView;
    private javax.swing.JButton PerButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton dropButton;
    private javax.swing.JButton dupButton;
    private javax.swing.JTextField insertNameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton modifyButton;
    private javax.swing.JTextArea operationArea;
    private javax.swing.JButton overButton;
    private javax.swing.JButton swapButton;
    // End of variables declaration//GEN-END:variables
}
