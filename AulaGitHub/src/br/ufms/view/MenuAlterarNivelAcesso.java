/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.view;

import br.ufms.bean.Funcionario;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruna
 */
public class MenuAlterarNivelAcesso extends javax.swing.JFrame {

    private Funcionario F;

    /**
     * Creates new form MenuAlterarNivelAcesso
     */
    public MenuAlterarNivelAcesso() {
        initComponents();
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
        CPFLabel = new javax.swing.JLabel();
        Logintxt = new javax.swing.JTextField();
        BuscarBTN = new javax.swing.JButton();
        NomeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EnderecoLabel = new javax.swing.JLabel();
        EnderecoFuncLabel = new javax.swing.JLabel();
        CidadeLabel = new javax.swing.JLabel();
        CidadeFuncLabel = new javax.swing.JLabel();
        EstadoLabel = new javax.swing.JLabel();
        EstadoFuncLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NivelCB = new javax.swing.JComboBox<>();
        NomeFuncLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        VoltarButton = new javax.swing.JButton();
        SalvarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Nível de Acesso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        CPFLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CPFLabel.setText("LOGIN FUNCIONÁRIO");

        Logintxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogintxtActionPerformed(evt);
            }
        });

        BuscarBTN.setText("BUSCAR");
        BuscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBTNActionPerformed(evt);
            }
        });

        NomeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        NomeLabel.setText("Nome:");

        EnderecoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EnderecoLabel.setText("Endereço:");

        CidadeLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CidadeLabel.setText("Cidade:");

        EstadoLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        EstadoLabel.setText("Estado:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nivel de Acesso:");

        NivelCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Gerente", "Funcionário" }));
        NivelCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NivelCBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ALTERAR NÍVEL DE ACESSO");

        VoltarButton.setText("VOLTAR");

        SalvarButton.setText("SALVAR");
        SalvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NomeLabel)
                                            .addComponent(EnderecoLabel)
                                            .addComponent(CidadeLabel)
                                            .addComponent(EstadoLabel))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NomeFuncLabel))
                                            .addComponent(EnderecoFuncLabel)
                                            .addComponent(CidadeFuncLabel)
                                            .addComponent(EstadoFuncLabel)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(68, 68, 68)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(NivelCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CPFLabel)
                                        .addGap(8, 8, 8)
                                        .addComponent(Logintxt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BuscarBTN))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel1)))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(VoltarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SalvarButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CPFLabel)
                            .addComponent(Logintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarBTN))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomeLabel)
                            .addComponent(jLabel2)
                            .addComponent(NomeFuncLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EnderecoLabel)
                            .addComponent(EnderecoFuncLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CidadeLabel)
                            .addComponent(CidadeFuncLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EstadoLabel)
                            .addComponent(EstadoFuncLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(NivelCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarButton)
                    .addComponent(SalvarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NivelCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NivelCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NivelCBActionPerformed

    private void BuscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBTNActionPerformed
        if (CPFLabel.getText().isEmpty()) {
            F = new Funcionario().buscarFuncionario(Logintxt.getText());
            if (F != null) {
                NomeFuncLabel.setText(F.getNome());
                EnderecoFuncLabel.setText(F.getEndereco());
                CidadeFuncLabel.setText(F.getCidade());
                EstadoFuncLabel.setText(F.getEstado());
                NivelCB.setSelectedIndex(F.getNivelDeAcesso());
            } else {
                JOptionPane.showMessageDialog(this, "Funcinario nao encontrado!");
            }
        }
    }//GEN-LAST:event_BuscarBTNActionPerformed

    private void SalvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarButtonActionPerformed
        if (CPFLabel.getText().isEmpty()) {
            F.setNivelDeAcesso(NivelCB.getSelectedIndex());
            if (F.alteraFuncionario(F.getLogin(), F) == true) {
                JOptionPane.showMessageDialog(this, "Alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Não alterado!");
            }
        }   // TODO add your handling code here:
    }//GEN-LAST:event_SalvarButtonActionPerformed

    private void LogintxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogintxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LogintxtActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAlterarNivelAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAlterarNivelAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAlterarNivelAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAlterarNivelAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAlterarNivelAcesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarBTN;
    private javax.swing.JLabel CPFLabel;
    private javax.swing.JLabel CidadeFuncLabel;
    private javax.swing.JLabel CidadeLabel;
    private javax.swing.JLabel EnderecoFuncLabel;
    private javax.swing.JLabel EnderecoLabel;
    private javax.swing.JLabel EstadoFuncLabel;
    private javax.swing.JLabel EstadoLabel;
    private javax.swing.JTextField Logintxt;
    private javax.swing.JComboBox<String> NivelCB;
    private javax.swing.JLabel NomeFuncLabel;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JButton SalvarButton;
    private javax.swing.JButton VoltarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
