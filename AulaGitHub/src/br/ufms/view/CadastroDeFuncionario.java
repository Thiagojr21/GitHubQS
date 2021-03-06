/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.view;

import br.ufms.bean.Funcionario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RVM
 */
public class CadastroDeFuncionario extends javax.swing.JFrame {
    private String loginAux;
    /**
     * Creates new form CadastroDeFuncionario
     */
    public CadastroDeFuncionario() {
        initComponents();
        btAlt.setVisible(false);
    }

    CadastroDeFuncionario(Funcionario func) {
        initComponents();
        loginAux = func.getLogin();
        this.nome.setText(func.getNome());
        endereco.setText(func.getEndereco());
        cidade.setText(func.getCidade());
        int i;
        for(i=0;i < 27;i++){
            if(func.getEstado().equals(estados.getItemAt(i))){
                break;
            }
        }
        estados.setSelectedIndex(i);
        tel1.setText(func.getTelefone1());
        tel2.setText(func.getTelefone2());
        SimpleDateFormat st = new SimpleDateFormat("M/d/yy");
        Date d = func.getDataDeNascimento();
        data.setText(st.format(d));
        login.setText(func.getLogin());
        senha.setText(func.getSenha());
        nivel.setSelectedIndex(func.getNivelDeAcesso());
        btCadastrar.setVisible(false);
        btAlt.setVisible(true);
        textoTitulo.setText("Alteraração de Funcionário");
        this.setTitle("Alteraração de Funcionário");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jSeparator2 = new javax.swing.JSeparator();
        textoTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        login = new javax.swing.JTextField();
        cidade = new javax.swing.JTextField();
        estados = new javax.swing.JComboBox<>();
        nivel = new javax.swing.JComboBox<>();
        btCadastrar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        data = new javax.swing.JFormattedTextField();
        tel1 = new javax.swing.JTextField();
        tel2 = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        btAlt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastramento de  Funcionário ");

        textoTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textoTitulo.setText("Cadastro de  funcionario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Nome :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Endereço :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cidade :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Estado :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Data de Nascimento :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Login :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Telefones :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Senha :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Nivel de acesso :");

        nome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        endereco.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        cidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cidadeActionPerformed(evt);
            }
        });

        estados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        estados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre\t\t ", "Alagoas\t\t ", "Amapá\t\t ", "Amazonas\t\t ", "Bahia\t\t ", "Ceará\t\t ", "Distrito Federal\t ", "Espírito Santo\t\t ", "Goiás\t\t ", "Maranhão\t\t ", "Mato Grosso\t\t ", "Mato Grosso do Sul\t ", "Minas Gerais\t\t ", "Pará\t\t ", "Paraíba\t\t ", "Paraná\t\t ", "Pernambuco\t\t ", "Piauí\t\t ", "Rio de Janeiro\t\t ", "Rio Grande do Norte\t\t ", "Rio Grande do Sul\t\t ", "Rondônia\t\t ", "Roraima\t\t ", "Santa Catarina\t\t ", "São Paulo\t\t ", "Sergipe\t\t ", "Tocantins" }));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, estados, org.jdesktop.beansbinding.ObjectProperty.create(), estados, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        nivel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Gerente", "Funcionário", "" }));

        btCadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCadastrar.setText("CADASTRAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btcancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btcancelar.setText("CANCELAR");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        data.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        tel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel1ActionPerformed(evt);
            }
        });

        tel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel2ActionPerformed(evt);
            }
        });

        senha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("DD/MM/AAAA");

        btAlt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAlt.setText("ALTERAR");
        btAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                            .addComponent(jLabel6)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btcancelar))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3)
                                .addGap(292, 292, 292))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(endereco)
                                    .addComponent(cidade)
                                    .addComponent(estados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(senha)
                                    .addComponent(login)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nome)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btCadastrar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btAlt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(nivel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(21, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(estados, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btcancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void cidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cidadeActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void tel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel2ActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed
    private boolean validarEntradas() {
        String pass = new String(senha.getPassword());
        return(vPlv(nome.getText())&&vPlv(endereco.getText())
               && vPlv(endereco.getText()) && vPlv(tel1.getText())
               && vPlv(data.getText()) && vPlv(login.getText())
               && vPlv(pass));
    }
    
    private boolean vPlv(String palavra){ 
            return (palavra != null && ! palavra.trim().isEmpty());
    }
    
    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
          Funcionario funcionario = new Funcionario();
          String Login = this.login.getText();
          if(validarEntradas()){
          if(! funcionario.verificaFuncionarioLogin(Login)){
              funcionario.setNome(nome.getText());
              funcionario.setEndereco(endereco.getText());
              funcionario.setCidade(cidade.getText());
              int aux = estados.getSelectedIndex();
              funcionario.setEstado(estados.getItemAt(aux));
              funcionario.setTelefone1(tel1.getText());
              funcionario.setTelefone2(tel2.getText()+"");
              SimpleDateFormat st = new SimpleDateFormat("M/d/yy");
              
              Date dt = new Date();
              try {
                  dt = st.parse(this.data.getText());
              } catch (ParseException ex) {
                  Logger.getLogger(CadastroDeFuncionario.class.getName()).log(Level.SEVERE, null, ex);
              }
              funcionario.setDataDeNascimento(dt);
              funcionario.setLogin(this.login.getText());
              String pass = new String(senha.getPassword());
              funcionario.setSenha(pass);
        
              funcionario.setNivelDeAcesso(this.nivel.getSelectedIndex());
              
              if(funcionario.CadastrarFuncionario(funcionario)){
                  JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
                  this.dispose();   
              }
          }else{
              JOptionPane.showMessageDialog(null, "Erro ao cadastrar login existente");
           }
          }else{
              JOptionPane.showMessageDialog(null, "Prencha o formulario corretamente");
          }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void tel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel1ActionPerformed

    private void btAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAltActionPerformed
           if(validarEntradas()){
              Funcionario funcionario = new Funcionario();
              funcionario.setNome(nome.getText());
              funcionario.setEndereco(endereco.getText());
              funcionario.setCidade(cidade.getText());
              int aux = estados.getSelectedIndex();
              funcionario.setEstado(estados.getItemAt(aux));
              funcionario.setTelefone1(tel1.getText());
              funcionario.setTelefone2(tel2.getText());
              SimpleDateFormat st = new SimpleDateFormat("M/d/yy");
              
              Date dt = new Date();
              try {
                  dt = st.parse(this.data.getText());
              } catch (ParseException ex) {
                  Logger.getLogger(CadastroDeFuncionario.class.getName()).log(Level.SEVERE, null, ex);
              }
              funcionario.setDataDeNascimento(dt);
              funcionario.setLogin(this.login.getText());
              String pass = new String(senha.getPassword());
              funcionario.setSenha(pass);
        
              funcionario.setNivelDeAcesso(this.nivel.getSelectedIndex());
              
              if(funcionario.alteraFuncionario(loginAux,funcionario)){
                  JOptionPane.showMessageDialog(null, "Funcionario alterado com sucesso");
                  this.dispose();   
              }else{
                  JOptionPane.showMessageDialog(null, "Erro ao alterar");
              }
           }else{
             JOptionPane.showMessageDialog(null, "Prencha o formulario corretamente");  
           }
    }//GEN-LAST:event_btAltActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroDeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
                new CadastroDeFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlt;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btcancelar;
    private javax.swing.JTextField cidade;
    private javax.swing.JFormattedTextField data;
    private javax.swing.JTextField endereco;
    private javax.swing.JComboBox<String> estados;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField login;
    private javax.swing.JComboBox<String> nivel;
    private javax.swing.JTextField nome;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField tel1;
    private javax.swing.JTextField tel2;
    private javax.swing.JLabel textoTitulo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    
}
