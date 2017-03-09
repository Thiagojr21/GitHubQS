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
   private String[] titulo = {"valor reserva","valor serviços adicionais","valor desconto","valor total"};
   private Object[][] valores = new Object[1][3] ;
   private double valorReservaData;
   private double valorServico;
   private double valorDesconto;
   private double valorTotal;
    /**
     * Creates new form CadastroReserva
     */
    public CadastroReserva() {
        initComponents();
        painelTabela.setLayout(new BorderLayout());
        IniciaCombos();
        
    }
    
    public CadastroReserva(Reserva r){
        initComponents();
        IniciaCombos();
       SimpleDateFormat dt = new SimpleDateFormat("dd/MM/yyyy");
        Date retirada = r.getDataRetirada();
        dataRetirada.setText(dt.format(retirada));
        
        Date devolucao = r.getDataDevolucao();
        dataDevolucao.setText(dt.format(devolucao));
        
        String hR = retirada.getHours() + ";"+ retirada.getMinutes();
        horaRetirada.setText(hR);
        String hD = devolucao.getHours() + ":"+ devolucao.getMinutes();
        horaDevolucao.setText(hD);
        
        String ct = r.getCategoria().getcodCategoria();
        int i;
        for (i = 0; i < categoria.getMaximumRowCount(); i++) {
            if (ct.equals(categoria.getItemAt(i))) {
                break;
            }
        }
        categoria.setSelectedIndex(i);
        if (r.getCarro() != null) {
            String placa = r.getCarro().getPlaca();
            combosCarros(ct, placa);
        } else {
            combosCarros(ct, null);
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
        if(c != null){
            idcliente.setText(cpfCnpj);
            CPF.setSelected(true);
        }
        else{
           idcliente.setText(cpfCnpj);
           CPF.setSelected(true);
        }
        cartaocliente.setText(r.getCartaoCliente());
        String desc = Double.toString((r.getDesconto() * 100)/r.getLocacao());
        descontoPorcentagem.setText(desc);
        
           if(calculaValorTotalReserva()){
            prencheTabela();
         }
        
    }

    /**
     * metodo que prenche os combos categoria e serviços
     *  
     */
    private void IniciaCombos(){
        ArrayList<Categorias> lista = Categorias.listaCategorias;
        for (int i = 0; i < lista.size(); i++) {
            categoria.addItem(lista.get(i).getcodCategoria());
        }
        ArrayList<ServicosAdicionais> lista2 = ServicosAdicionais.listaServicos;
        for (int i = 1; i < lista.size(); i++) {
            comboServicos.addItem(lista2.get(i).getServico());
        }
    }
     private void combosCarros(String codCategoria,String placa){
         ArrayList<Automovel> lista = Automovel.getListaAutomovel();
         for (Automovel aux : lista) {
             if (aux.getCategoria().getcodCategoria().equals(codCategoria)) {
                 comboAutomovel.addItem(aux.getMarca() + "/" + aux.getModelo());
             }
         }
         if (placa != null) {
             int x = 0;
             for (Automovel aux : lista) {
                 if (aux.getCategoria().getcodCategoria().equals(codCategoria)
                         && placa.equals(aux.getPlaca())) {
                     comboAutomovel.setSelectedIndex(x);
                     break;
                 }
                 x++;
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
        comboAutomovel = new javax.swing.JComboBox<>();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        comboAutomovel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        comboAutomovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAutomovelActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel6)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(comboServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(cartaocliente, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(descontoPorcentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel15))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(39, 39, 39)
                                                        .addComponent(jLabel10)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(comboAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(CPF)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(CNPJ))))
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
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(horaRetirada, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(horaDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel18))))
                                        .addGap(4, 4, 4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(btSalvar)))))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(comboAutomovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(27, 27, 27)
                .addComponent(painelTabela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
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
    private boolean calcValorResDatas(){
        Categorias c = new Categorias();
        c = c.buscarCatAutomoveis(categoria.getToolTipText());
        if (c != null) {
            String dataR = dataRetirada.getText();
            String dataD = dataDevolucao.getText();
            if (dataR != null && dataD != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar data1 = Calendar.getInstance();
                Calendar data2 = Calendar.getInstance();
                try {
                    data1.setTime(sdf.parse(dataR));
                    data2.setTime(sdf.parse(dataD));
                } catch (java.text.ParseException e) {
                }
                int dias = data2.get(Calendar.DAY_OF_YEAR) - data1.get(Calendar.DAY_OF_YEAR);
                System.out.println(dias);

                int mes = dias / 30;
                int semanas = (dias - (mes * 30)) / 7;
                int d = (dias - (mes * 30)) % 7;
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
    private Categorias verificaCarroDisponivel(String codigo){
        Categorias c = new Categorias();
        c = c.buscarCatAutomoveis(codigo);
        ArrayList<Reserva> lista = Reserva.listaReservas;
        int aux =0, aux2;
        aux2 = Integer.parseInt(c.getqtdAutomoveis());
        for (Reserva x : lista) {
            if (x.getCategoria().getcodCategoria().equals(codigo)) {
                aux++;
            }
        }
        if (aux < aux2) {
            return c;
        }
        return null;
    }
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
            
            if (calculaValorTotalReserva() && idcliente.getText() != null) {
            Reserva reserva = new Reserva();
            int x = categoria.getSelectedIndex();
            String cdgCategoria = categoria.getItemAt(x);
            Categorias c = verificaCarroDisponivel(cdgCategoria);
            if (c != null) {
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
                if(serv.equals("--"));
                else{
                    reserva.setServicoAdc(new ServicosAdicionais().buscarSA(serv));
                }
                String modelo = comboAutomovel.getItemAt(comboAutomovel.getSelectedIndex());
                if (modelo.equals("--")); else {
                    String[] d = modelo.split("/");
                    ArrayList<Automovel> lista = Automovel.getListaAutomovel();
                    ArrayList<Reserva> lista2 = Reserva.listaReservas;
                    for (Automovel carro : lista) {
                        if (cdgCategoria.equals(carro.getCategoria().getcodCategoria())) {
                            if (d[0].equals(carro.getFabricante()) && d[1].equals(carro.getModelo())) {
                                boolean state = true;
                                for(Reserva res : lista2){
                                    if(res.getCarro().equals(carro)){
                                        state = false;
                                        break;
                                    }
                                }
                                if(state){
                                    reserva.setCarro(carro);
                                    break;
                                }
                            }
                        }
                    }
                }
                if (CPF.isSelected()) {
                    ClienteFisico CF = new ClienteFisico();
                    ClienteFisico cf = CF.buscaClienteFisico(idcliente.getText());
                    reserva.setClienteFisico(cf);
                }
                if (CNPJ.isSelected()) {
                    ClienteJuridico CJ = new ClienteJuridico();
                    ClienteJuridico cj = CJ.buscaClienteJuridico(idcliente.getText());
                    reserva.setClienteJuridico(cj);
                }
                
                reserva.setCpfCnpj(idcliente.getText());
                reserva.setCartaoCliente(cartaocliente.getText());
                reserva.setDesconto(valorDesconto);
                reserva.setLocacao(valorTotal);
            } else {
                JOptionPane.showMessageDialog(null, "Automovel da categoria não disponivel");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed
    /**
     * metodo para setar no combo automovel todos os automoveis da categoria
     *
     * @param evt
     */
    private void categoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_categoriaItemStateChanged
        int x = categoria.getSelectedIndex();
        Categorias c = new Categorias();
        ArrayList<Automovel> lista = Automovel.getListaAutomovel();
        for (Automovel aux : lista) {
            if (aux.getCategoria().getcodCategoria().equals(categoria.getItemAt(x))) {
                comboAutomovel.addItem(aux.getMarca() + "/" + aux.getModelo());
            }
        }
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
    private boolean calculaValorTotalReserva(){
        if(calcValorResDatas()){
        int x = comboServicos.getSelectedIndex();
        String tipo_servico = comboServicos.getItemAt(x);
        if(tipo_servico.equals("--")){
            valorDesconto = 0;
        }else{    
            ServicosAdicionais c =new ServicosAdicionais();
            valorServico = Double.parseDouble(c.getPreco());
        }
        valorTotal = valorReservaData + valorServico;
        String desconto = descontoPorcentagem.getText();
        if(desconto != null){
            int aux = Integer.parseInt(desconto)/100;
            valorDesconto = (valorTotal - (valorTotal*aux));
            valorTotal = valorTotal - valorDesconto;
        }else{
          valorDesconto = 0;   
        }
        return true;
        }
        return false;
    }
    private void prencheTabela(){
         valores[0][0] = valorReservaData;
            valores[0][1] = valorServico;
            valores[0][2] = valorDesconto;
            valores[0][3] = valorTotal;
            
            tabela = new JTable(valores, titulo);
            JScrollPane p = new JScrollPane(tabela);
            p.setPreferredSize(new Dimension(604, 70));
            painelTabela.setLayout(new BorderLayout());
            painelTabela.add(p,BorderLayout.CENTER);
            this.revalidate();
    }
    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        if(calculaValorTotalReserva()){
            prencheTabela();
        }
    }//GEN-LAST:event_btCalcularActionPerformed

    private void idclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idclienteActionPerformed

    private void comboAutomovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAutomovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAutomovelActionPerformed

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
    private void atualizarCategorias() {
        for (Categorias categoria : Categorias.listaCategorias) {
            this.modelCategorias.addElement(categoria.getcodCategoria());
        }
    }
    private void atualizarSA(){
        for(ServicosAdicionais Servicos : ServicosAdicionais.listaServicos){
            this.modelServicosAdicionais.addElement(Servicos.getServico());
        }
    }
    private void atualizarAutomovel(){
        for(Automovel auto : Automovel.getListaAutomovel()){
            this.modelAutomovel.addElement(auto.getModelo());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CNPJ;
    private javax.swing.JRadioButton CPF;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cartaocliente;
    private javax.swing.JComboBox<String> categoria;
    private javax.swing.JComboBox<String> comboAutomovel;
    private javax.swing.JComboBox<String> comboServicos;
    private javax.swing.JFormattedTextField dataDevolucao;
    private javax.swing.JFormattedTextField dataRetirada;
    private javax.swing.JTextField descontoPorcentagem;
    private javax.swing.JFormattedTextField horaDevolucao;
    private javax.swing.JFormattedTextField horaRetirada;
    private javax.swing.JTextField idcliente;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painelTabela;
    // End of variables declaration//GEN-END:variables
}
