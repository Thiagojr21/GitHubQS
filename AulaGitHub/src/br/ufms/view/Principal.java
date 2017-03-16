/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.view;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

/**
 *
 * @author leolo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setAlwaysOnTop(false);
    }

    public Principal(int nivelAcesso) {
        initComponents();
        this.setAlwaysOnTop(false);
        this.checkAcesso(nivelAcesso);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalFramePrincipal = new javax.swing.JInternalFrame();
        topMenuBar = new javax.swing.JMenuBar();
        headerClientes = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenuItem();
        headerAutomoveis = new javax.swing.JMenu();
        menuAutomovel = new javax.swing.JMenuItem();
        menuCatAutomoveis = new javax.swing.JMenuItem();
        menuRetiradaAutomovel = new javax.swing.JMenuItem();
        headerFuncionario = new javax.swing.JMenu();
        menuFuncionario = new javax.swing.JMenuItem();
        menuNivelAcesso = new javax.swing.JMenuItem();
        headerSA = new javax.swing.JMenu();
        menuServicosAdicionais = new javax.swing.JMenuItem();
        headerReserva = new javax.swing.JMenu();
        MenuReserva = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Janela Principal");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("framePrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(650, 500));
        setResizable(false);

        internalFramePrincipal.setMaximumSize(new java.awt.Dimension(645, 450));
        internalFramePrincipal.setMinimumSize(new java.awt.Dimension(645, 450));
        internalFramePrincipal.setPreferredSize(new java.awt.Dimension(645, 450));
        internalFramePrincipal.setVisible(true);

        javax.swing.GroupLayout internalFramePrincipalLayout = new javax.swing.GroupLayout(internalFramePrincipal.getContentPane());
        internalFramePrincipal.getContentPane().setLayout(internalFramePrincipalLayout);
        internalFramePrincipalLayout.setHorizontalGroup(
            internalFramePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
        );
        internalFramePrincipalLayout.setVerticalGroup(
            internalFramePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        headerClientes.setText("Clientes");

        menuClientes.setText("Cliente");
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        headerClientes.add(menuClientes);

        topMenuBar.add(headerClientes);

        headerAutomoveis.setText("Automóveis");

        menuAutomovel.setText("Automóvel");
        menuAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAutomovelActionPerformed(evt);
            }
        });
        headerAutomoveis.add(menuAutomovel);

        menuCatAutomoveis.setText("Categorias");
        menuCatAutomoveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCatAutomoveisActionPerformed(evt);
            }
        });
        headerAutomoveis.add(menuCatAutomoveis);

        menuRetiradaAutomovel.setText("Retirada");
        menuRetiradaAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRetiradaAutomovelActionPerformed(evt);
            }
        });
        headerAutomoveis.add(menuRetiradaAutomovel);

        topMenuBar.add(headerAutomoveis);

        headerFuncionario.setText("Funcionários");

        menuFuncionario.setText("Funcionário");
        menuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionarioActionPerformed(evt);
            }
        });
        headerFuncionario.add(menuFuncionario);

        menuNivelAcesso.setText("Nível de Acesso");
        menuNivelAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNivelAcessoActionPerformed(evt);
            }
        });
        headerFuncionario.add(menuNivelAcesso);

        topMenuBar.add(headerFuncionario);

        headerSA.setText("Serviços");

        menuServicosAdicionais.setText("Serviços Adicionais");
        menuServicosAdicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuServicosAdicionaisActionPerformed(evt);
            }
        });
        headerSA.add(menuServicosAdicionais);

        topMenuBar.add(headerSA);

        headerReserva.setText("Reservas");

        MenuReserva.setText("Reserva");
        MenuReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReservaActionPerformed(evt);
            }
        });
        headerReserva.add(MenuReserva);

        topMenuBar.add(headerReserva);

        headerReserva.setText("Reservas");

        MenuReserva.setText("Reserva");
        MenuReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReservaActionPerformed(evt);
            }
        });
        headerReserva.add(MenuReserva);

        topMenuBar.add(headerReserva);

        setJMenuBar(topMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(internalFramePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(internalFramePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("LocaCar - Janela Principal");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        System.out.println("Chamado > MenuCliente");
        this.addView(new MenuCliente());
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuCatAutomoveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCatAutomoveisActionPerformed
        System.out.println("Chamado > MenuCategorias");
        this.addView(new MenuCategorias());
    }//GEN-LAST:event_menuCatAutomoveisActionPerformed

    private void menuAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAutomovelActionPerformed
        System.out.println("Chamado > MenuAutomovel");
        this.addView(new MenuAutomovel());
    }//GEN-LAST:event_menuAutomovelActionPerformed

    private void menuNivelAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNivelAcessoActionPerformed
        System.out.println("Chamado > MenuAlterarNivelAcesso");
        this.addView(new MenuAlterarNivelAcesso());
    }//GEN-LAST:event_menuNivelAcessoActionPerformed

    private void menuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionarioActionPerformed
        System.out.println("Chamado > MenuFuncionario");
        this.addView(new MenuFuncionario());
    }//GEN-LAST:event_menuFuncionarioActionPerformed

    private void menuServicosAdicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuServicosAdicionaisActionPerformed
        System.out.println("Chamado > MenuServicosAdicionais");
        this.addView(new MenuServicosAdicionais());
    }//GEN-LAST:event_menuServicosAdicionaisActionPerformed


    private void menuRetiradaAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRetiradaAutomovelActionPerformed
        System.out.println("Chamado > MenuRetiradaAutomovel");
        this.addView(new MenuRetiradaAutomovel());
    }//GEN-LAST:event_menuRetiradaAutomovelActionPerformed

    private void MenuReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReservaActionPerformed
        System.out.println("Chamado > MenuReserva");
        this.addView(new MenuReserva());
    }//GEN-LAST:event_MenuReservaActionPerformed


    private void addView(JFrame window){
        Container interalContainer = internalFramePrincipal.getContentPane();
        interalContainer.removeAll();
        interalContainer.add(window.getContentPane());
        
        internalFramePrincipal.setTitle(window.getTitle());
        internalFramePrincipal.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        internalFramePrincipal.pack();
        //internalFramePrincipal.repaint();
        //jDesktopPane1.add(window.getContentPane());
    }
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuReserva;
    private javax.swing.JMenu headerAutomoveis;
    private javax.swing.JMenu headerClientes;
    private javax.swing.JMenu headerFuncionario;
    private javax.swing.JMenu headerReserva;
    private javax.swing.JMenu headerSA;
    private javax.swing.JInternalFrame internalFramePrincipal;
    private javax.swing.JMenuItem menuAutomovel;
    private javax.swing.JMenuItem menuCatAutomoveis;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenuItem menuFuncionario;
    private javax.swing.JMenuItem menuNivelAcesso;
    private javax.swing.JMenuItem menuRetiradaAutomovel;
    private javax.swing.JMenuItem menuServicosAdicionais;
    private javax.swing.JMenuBar topMenuBar;
    // End of variables declaration//GEN-END:variables

    private void checkAcesso(int nivelAcesso) {
        // 0 - Administrador
        // 1 - Gerente
        // 2 - Funcionario
        switch(nivelAcesso){
            case 2:
                System.out.println("Principal > Bloqueios Funcionario");
                this.menuAutomovel.setEnabled(false);
                this.menuCatAutomoveis.setEnabled(false);
                this.headerSA.setEnabled(false); // Menu Header
                this.menuServicosAdicionais.setEnabled(false);
            case 1:
                System.out.println("Principal > Bloqueios Gerente");
                this.headerFuncionario.setEnabled(false); // Menu Header
                this.menuFuncionario.setEnabled(false);
                this.menuNivelAcesso.setEnabled(false);
        }
    }
}
