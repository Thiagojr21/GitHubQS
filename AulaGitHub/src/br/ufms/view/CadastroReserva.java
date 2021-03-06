/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.view;

import br.ufms.bean.Reserva;
import br.ufms.bean.ClienteFisico;
import br.ufms.bean.ClienteJuridico;
import br.ufms.bean.Categorias;
import br.ufms.bean.Automovel;
import br.ufms.bean.ServicosAdicionais;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Plabiany
 */
public class CadastroReserva extends javax.swing.JFrame {

    private DefaultComboBoxModel modelCategorias;
    private DefaultComboBoxModel modelServicosAdicionais;
    private DefaultComboBoxModel modelAutomovel;
    private JTable tabela;
    private String[] titulo = {"valor reserva", "valor serviços adicionais", "valor desconto", "valor total"};
    private Object[][] valores = new Object[1][4];
    private double valorReservaData;
    private double valorServico;
    private double valorDesconto;
    private double valorTotal;
    private Reserva reservaAux;
    private String msgErroCliente;

    /**
     * Creates new form CadastroReserva
     */
    public CadastroReserva() {
        initComponents();
        //painelTabela.setLayout(new BorderLayout());
        // painelTabela.setVisible(true);
        IniciaCombos();

    }

    public CadastroReserva(Reserva r) {
        initComponents();
        IniciaCombos();
        this.reservaAux = r;
        SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        Date retirada = r.getDataRetirada();
        dataRetirada.setText(dt.format(retirada));

        Date devolucao = r.getDataDevolucao();
        dataDevolucao.setText(dt.format(devolucao));
        Calendar horaFomat = Calendar.getInstance();
        horaFomat.setTime(retirada);
        String minuto;
        if (horaFomat.get(Calendar.MINUTE) < 10) {
            minuto = "0" + horaFomat.get(Calendar.MINUTE);
        } else {
            minuto = "" + horaFomat.get(Calendar.MINUTE);
        }
        String hR = horaFomat.get(Calendar.HOUR_OF_DAY) + ":" + minuto;
        horaRetirada.setText(hR);
        horaFomat.setTime(devolucao);
        if (horaFomat.get(Calendar.MINUTE) < 10) {
            minuto = "0" + horaFomat.get(Calendar.MINUTE);
        } else {
            minuto = "" + horaFomat.get(Calendar.MINUTE);
        }
        String hD = horaFomat.get(Calendar.HOUR_OF_DAY) + ":" + minuto;
        horaDevolucao.setText(hD);

        String ct = r.getCategoria().getdescCategoria();
        int i;
        for (i = 0; i < categoria.getMaximumRowCount(); i++) {
            if (ct.equals(categoria.getItemAt(i))) {
                break;
            }
        }
        categoria.setSelectedIndex(i);
        if (r.getCarro() != null) {
            CarroSelecionado.setText(r.getCarro().getMarca() + "/" + r.getCarro().getModelo());
        }

        if (r.getServico() != null) {
            for (i = 0; i < comboServicos.getMaximumRowCount(); i++) {
                if (r.getServico().getDescricao().equals(comboServicos.getItemAt(i))) {
                    comboServicos.setSelectedIndex(i);
                    break;
                }
            }
        }
        String cpfCnpj = r.getCpfCnpj();
        ClienteFisico c = new ClienteFisico();
        c = c.buscaClienteFisico(cpfCnpj);
        if (c != null) {
            idcliente.setText(cpfCnpj);
            CPF.setSelected(true);
        } else {
            idcliente.setText(cpfCnpj);
            CPF.setSelected(true);
        }
        cartaocliente.setText(r.getCartaoCliente());
        taxaMulta.setText(Double.toString(r.getTaxaMulta()));
        if (r.getServico() != null) {
            String desc = Double.toString((r.getDesconto() * 100) / (r.getLocacao() + r.getDesconto() + r.getServico().getPreco()));
        } else {
            String desc = Double.toString((r.getDesconto() * 100) / (r.getLocacao() + r.getDesconto()));
            descontoPorcentagem.setText(desc);
        }
        if (calculaValorTotalReserva()) {
            prencheTabela();
        }
        btSalvar.setText("Alterar Reserva");
        this.setTitle("Alterar Reserva");
    }

    /**
     * metodo que prenche os combos categoria e serviços
     *
     */
    private void IniciaCombos() {
        ArrayList<Categorias> lista = Categorias.listaCategorias;
        for (int i = 0; i < lista.size(); i++) {
            categoria.addItem(lista.get(i).getdescCategoria());
        }
        ArrayList<ServicosAdicionais> lista2 = ServicosAdicionais.listaServicos;
        if (!lista2.isEmpty()) {
            for (int i = 1; i < lista.size(); i++) {
                comboServicos.addItem(lista2.get(i).getDescricao());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        idcliente = new javax.swing.JTextField();
        cartaocliente = new javax.swing.JTextField();
        descontoPorcentagem = new javax.swing.JTextField();
        CPF = new javax.swing.JRadioButton();
        CNPJ = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox<>();
        comboServicos = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btCalcular = new javax.swing.JButton();
        painelTabela = new javax.swing.JPanel();
        dataRetirada = new javax.swing.JFormattedTextField();
        dataDevolucao = new javax.swing.JFormattedTextField();
        horaRetirada = new javax.swing.JFormattedTextField();
        horaDevolucao = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        taxaMulta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        CarroSelecionado = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Reserva");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("RESERVA");

        jLabel2.setText("Horario da Retirada:");

        jLabel3.setText("Data de Retirada:");

        jLabel4.setText("Data de Devolução:");

        jLabel5.setText("Horario de Devolução:");

        jLabel6.setText("Identificação do Cliente:");

        jLabel7.setText("Categoria do Automóvel:");

        jLabel9.setText("Serviços Adicionais: ");

        jLabel12.setText("Cartão de Crédito (Cliente):");

        jLabel13.setText("Desconto:");

        btSalvar.setText("Efetuar Reserva");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btVoltar.setText("Cancelar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        idcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idclienteActionPerformed(evt);
            }
        });

        descontoPorcentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descontoPorcentagemActionPerformed(evt);
            }
        });

        buttonGroup1.add(CPF);
        CPF.setText("Cliente Físico");
        CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPFActionPerformed(evt);
            }
        });

        buttonGroup1.add(CNPJ);
        CNPJ.setText("Cliente Jurídico");

        jLabel14.setText("CPF/CNPJ:");

        categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        categoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                categoriaItemStateChanged(evt);
            }
        });
        categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaActionPerformed(evt);
            }
        });

        comboServicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));

        jLabel10.setText("Automóvel:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("%");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("DD/MM/AAAA");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("DD/MM/AAAA");

        jLabel11.setText("HH:MM");

        jLabel18.setText("HH:MM");

        btCalcular.setText("CALCULAR VALOR DA RESERVA");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        painelTabela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout painelTabelaLayout = new javax.swing.GroupLayout(painelTabela);
        painelTabela.setLayout(painelTabelaLayout);
        painelTabelaLayout.setHorizontalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );
        painelTabelaLayout.setVerticalGroup(
            painelTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 72, Short.MAX_VALUE)
        );

        dataRetirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        dataRetirada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataRetiradaActionPerformed(evt);
            }
        });

        dataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        dataDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDevolucaoActionPerformed(evt);
            }
        });

        horaRetirada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        horaDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        jLabel8.setText("Taxa de Multa ");

        jButton1.setText("Selecionar Veiculo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CarroSelecionado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CarroSelecionado.setText("--");
        CarroSelecionado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel20.setText("Descriçaõ");

        jLabel21.setText("R$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7))
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cartaocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(descontoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel15))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(taxaMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel21))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CPF)
                                                .addGap(18, 18, 18)
                                                .addComponent(CNPJ))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(comboServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(39, 39, 39)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel19)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(dataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(10, 10, 10)
                                                    .addComponent(dataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(horaRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(horaDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel18)))
                                            .addComponent(CarroSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horaRetirada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel16)
                        .addComponent(dataRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel5)
                            .addComponent(horaDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CarroSelecionado)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(CPF)
                    .addComponent(CNPJ))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cartaocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(descontoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(taxaMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(26, 26, 26)
                .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btVoltar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * metodo que calcula os valor da reserva apartir das datas
     *
     */
    private boolean calcValorResDatas() {
        Categorias c = new Categorias();
        c = Categorias.buscaCatDesCat(categoria.getItemAt(categoria.getSelectedIndex()));
        if (c != null) {
            String dataR = dataRetirada.getText();
            String dataD = dataDevolucao.getText();

            if (dataR != null && dataD != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date data1 = null;
                Date data2 = null;
                try {
                    data1 = sdf.parse(dataR);
                    data2 = sdf.parse(dataD);
                } catch (java.text.ParseException e) {
                }
                long diff = data2.getTime() - data1.getTime();

                long diffDays = diff / (24 * 60 * 60 * 1000);
               
                

                double mes = diffDays / 30;
                double semanas = (diffDays % 30) / 7;
                double d = (diffDays % 30) % 7;
                valorReservaData = (c.getvalorMensal() * mes) + (c.getvalorSemanal() * semanas) + (c.getvalorDiario() * d);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Prencha as datas de retirada e devolução");
            }
        }
        return false;
    }

    private void categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaActionPerformed
    private boolean VerificaCarroDisponivel(Reserva reserva, String modelo) {
        if (modelo.equals("--")) {
            return false;
        } else {
            String[] d = modelo.split("/");
            ArrayList<Automovel> lista = Automovel.getListaAutomovel();
            ArrayList<Reserva> lista2 = Reserva.listaReservas;
            String cdgCat = categoria.getItemAt(categoria.getSelectedIndex());
            for (Automovel carro : lista) {
                if (cdgCat.equals(carro.getCategoria().getdescCategoria())) {
                    if (d[0].equals(carro.getMarca()) && d[1].equals(carro.getModelo())) {
                        if (reservaAux != null && reservaAux.getCarro().equals(carro)) {
                            reserva.setCarro(carro);
                            return true;
                        }
                        boolean state = true;
                        for (Reserva res : lista2) {
                            if (res.getCarro().getPlaca().equals(carro.getPlaca())) {
                                state = false;
                                break;
                            }
                        }
                        if (state) {
                            reserva.setCarro(carro);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private boolean verificaCliente(Reserva reserva) {
        if (CPF.isSelected()) {
            ClienteFisico cf = new ClienteFisico();
            cf = cf.buscaClienteFisico(idcliente.getText());
            if (cf != null) {
                if (cf.getSituaçao_de_inadimplência()) {
                    reserva.setClienteFisico(cf);
                    reserva.setCpfCnpj(idcliente.getText());
                    return true;
                } else {
                    this.msgErroCliente = "Cliente inadimplente";
                }
            } else {
                this.msgErroCliente = "CPF ou CNPJ inválido";
                return false;
            }
        } else if (CNPJ.isSelected()) {
            ClienteJuridico CJ = new ClienteJuridico();
            ClienteJuridico cj = CJ.buscaClienteJuridico(idcliente.getText());
            if (cj != null && cj.getSituaçao_de_inadimplência() == true) {
                if (cj.getSituaçao_de_inadimplência()) {
                    reserva.setClienteJuridico(cj);
                    reserva.setCpfCnpj(idcliente.getText());
                    return true;
                } else {
                    this.msgErroCliente = "Cliente inadimplente";
                }
            } else {
                this.msgErroCliente = "CPF ou CNPJ inválido";
                return false;
            }
        }
        return false;
    }

    private Categorias verificaCategoriaCarroDisponivel(String descricao) {
        Categorias c = new Categorias();
        c = Categorias.buscaCatDesCat(descricao);
        if (reservaAux != null) {
            return c;
        }
        ArrayList<Reserva> lista = Reserva.listaReservas;
        int aux = 0, aux2;
        aux2 = Integer.parseInt(c.getqtdAutomoveis());
        for (Reserva x : lista) {
            if (x.getCategoria().getdescCategoria().equals(descricao)) {
                aux++;
            }
        }
        if (aux < aux2) {
            return c;
        }
        return null;
    }


    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (calculaValorTotalReserva() && idcliente.getText() != null
                && !idcliente.getText().isEmpty() && !horaDevolucao.getText().isEmpty()
                && !horaRetirada.getText().isEmpty()
                && !taxaMulta.getText().isEmpty()) {
            Reserva reserva = new Reserva();
            String descricao = categoria.getItemAt(categoria.getSelectedIndex());
            Categorias c = verificaCategoriaCarroDisponivel(descricao);
            if (c != null) {
                if (verificaCliente(reserva)) {
                    String modelo = CarroSelecionado.getText();
                    if (VerificaCarroDisponivel(reserva, modelo)) {
                        reserva.setCategoria(c);
                        SimpleDateFormat st = new SimpleDateFormat("dd/MM/yyyy");
                        Date dataR = new Date();
                        Date dataD = new Date();
                        try {
                            dataR = st.parse(this.dataRetirada.getText());
                            dataD = st.parse(this.dataDevolucao.getText());
                            dataR.setHours(Integer.parseInt(horaRetirada.getText().substring(0, 2)));
                            dataR.setMinutes(Integer.parseInt(horaRetirada.getText().substring(3, 5)));
                            dataD.setHours(Integer.parseInt(horaDevolucao.getText().substring(0, 2)));
                            dataD.setMinutes(Integer.parseInt(horaDevolucao.getText().substring(3, 5)));
                        } catch (ParseException ex) {
                            Logger.getLogger(CadastroReserva.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        reserva.setDataDevolucao(dataD);
                        reserva.setDataRetirada(dataR);

                        String serv = comboServicos.getItemAt(comboServicos.getSelectedIndex());
                        if (serv.equals("--")); else {
                            reserva.setServicoAdc(new ServicosAdicionais().buscarSA(serv));
                        }

                        reserva.setCartaoCliente(cartaocliente.getText());
                        reserva.setTaxaMulta(Double.parseDouble(taxaMulta.getText()));
                        reserva.setDesconto(valorDesconto);
                        reserva.setLocacao(valorTotal);
                        if (reservaAux == null) {
                            if (reserva.insereReserva(reserva)) {
                                JOptionPane.showMessageDialog(null, "reserva efetuada");
                                this.dispose();
                            } else {
                                JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
                            }
                        } else if (reserva.alteraReserva(reservaAux, reserva)) {
                            JOptionPane.showMessageDialog(null, "reserva Alterada com sucesso");
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Erro ao Alterar");

                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "selecione o veiculo");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, this.msgErroCliente);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Automovel da categoria não disponivel");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar prencha os campos obrigatorios");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed
    /**
     * metodo para setar no combo automovel todos os automoveis da categoria
     *
     * @param evt
     */
    private void categoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoriaItemStateChanged

    }//GEN-LAST:event_categoriaItemStateChanged

    private void descontoPorcentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descontoPorcentagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descontoPorcentagemActionPerformed

    private void CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPFActionPerformed

    private void dataRetiradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataRetiradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataRetiradaActionPerformed

    private void dataDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataDevolucaoActionPerformed
    /**
     * metodo que calcula Valor total da reserva
     *
     */
    private boolean calculaValorTotalReserva() {
        if (calcValorResDatas()) {
            String tipo_servico = comboServicos.getItemAt(comboServicos.getSelectedIndex());
            if (tipo_servico.equals("--")) {
                valorDesconto = 0;
            } else {
                ServicosAdicionais c = new ServicosAdicionais();

                c = c.buscarServicoDes(tipo_servico);

                valorServico = c.getPreco();
            }
            valorTotal = valorReservaData + valorServico;
            String desconto = descontoPorcentagem.getText();
            if (desconto != null && !desconto.isEmpty()) {
                double aux = (Double.parseDouble(desconto)) / 100;
                valorDesconto = valorTotal * aux;
                valorTotal = valorTotal - valorDesconto;
            } else {
                valorDesconto = 0;
            }
            return true;
        }
        return false;
    }

    private void prencheTabela() {
        valores[0][0] = valorReservaData;
        valores[0][1] = valorServico;
        valores[0][2] = valorDesconto;
        valores[0][3] = valorTotal;

        tabela = new JTable(valores, titulo);
        JScrollPane p = new JScrollPane(tabela);
        p.setPreferredSize(new Dimension(604, 70));
        painelTabela.setLayout(new BorderLayout());
        painelTabela.add(p, BorderLayout.CENTER);
        this.revalidate();
    }
    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        if (calculaValorTotalReserva()) {
            prencheTabela();
        }
    }//GEN-LAST:event_btCalcularActionPerformed

    private void idclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idclienteActionPerformed
    public void prencheCampoCarro(String modelo) {
        this.CarroSelecionado.setText(modelo);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (categoria.getSelectedIndex() != 0) {
            TelaSelecaoAutomovel t = new TelaSelecaoAutomovel(categoria.getItemAt(categoria.getSelectedIndex()), this);
            t.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "selecione a categoria ");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public Reserva getReservaAux() {
        return reservaAux;
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
            java.util.logging.Logger.getLogger(CadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroReserva().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CNPJ;
    private javax.swing.JRadioButton CPF;
    private javax.swing.JLabel CarroSelecionado;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cartaocliente;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JComboBox<String> comboServicos;
    private javax.swing.JFormattedTextField dataDevolucao;
    private javax.swing.JFormattedTextField dataRetirada;
    private javax.swing.JTextField descontoPorcentagem;
    private javax.swing.JFormattedTextField horaDevolucao;
    private javax.swing.JFormattedTextField horaRetirada;
    private javax.swing.JTextField idcliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painelTabela;
    private javax.swing.JTextField taxaMulta;
    // End of variables declaration//GEN-END:variables
}
