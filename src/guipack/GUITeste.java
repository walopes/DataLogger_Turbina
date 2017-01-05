/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guipack;

//import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

//import java.util.Timer;


/*
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.Timestamp;
import java.util.Date;
*/

/**
 *
 * @author Willian
 */

//import java.nio.file.*;

public class GUITeste extends javax.swing.JFrame {


    public GUITeste() {
        initComponents();
    }
    
    private static dba DBA = null;
    
    serial Sr1;

    public static int Tensao1 = -1;
    public static int Tensao2 = -1;
    public static int Tensao3 = -1;
    public static int Corrente1 = -1;
    public static int Corrente2 = -1;
    public static int Corrente3 = -1;
    public static int Irradiacao = -1;
    
    private Timer timer;
            
    int var=0;


    String TMPsup = null;
    String TMPinf = null;
    String Grand = null;
    
         @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jComboBox7 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        ComboPorta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ComboBaud = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jComboBox10 = new javax.swing.JComboBox<>();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jSeparator9 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JSeparator();
        jButton4 = new javax.swing.JButton();

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "P1.0", "P1.1", "P1.3", "P1.4", "P1.5", "P1.6", "P1.7" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ComboPorta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- selecione -", "COM3", "COM1", "COM2", "COM4", "COM5", "COM6", "COM7", "COM8", "COM9", "COM10", "COM11", " " }));
        ComboPorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboPortaActionPerformed(evt);
            }
        });

        jLabel1.setText("Porta");

        jLabel2.setText("Baud rate");

        ComboBaud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- selecione -", "9600" }));
        ComboBaud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBaudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ComboPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBaud, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ComboBaud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jButton1.setText("Iniciar leitura");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Parar leitura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel4.setText("P1.0");

        jLabel5.setText("P1.1");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Tensao1", "Tensao2", "Tensao3", "Corrente1", "Corrente2", "Corrente3", "Irradiacao" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel7.setText("P1.3");

        jLabel8.setText("P1.7");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setText("P1.4");

        jLabel10.setText("P1.5");

        jLabel11.setText("P1.6");

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   -", "Tensao1", "Tensao2", "Tensao3", "Corrente1", "Corrente2", "Corrente3", "Irradiacao" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   -", "Tensao1", "Tensao2", "Tensao3", "Corrente1", "Corrente2", "Corrente3", "Irradiacao" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   -", "Tensao1", "Tensao2", "Tensao3", "Corrente1", "Corrente2", "Corrente3", "Irradiacao" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   -", "Tensao1", "Tensao2", "Tensao3", "Corrente1", "Corrente2", "Corrente3", "Irradiacao" }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   -", "Tensao1", "Tensao2", "Tensao3", "Corrente1", "Corrente2", "Corrente3", "Irradiacao" }));
        jComboBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox14ActionPerformed(evt);
            }
        });

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   -", "Tensao1", "Tensao2", "Tensao3", "Corrente1", "Corrente2", "Corrente3", "Irradiacao" }));
        jComboBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gráficos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTextField1.setText("Ex: 2016-05-25 00:00:00");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Timestamp superior");

        jLabel6.setText("Timestamp inferior");

        jTextField2.setText("Ex: 2016-05-25 00:00:00");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Grandeza");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Tensao1", "Tensao2", "Tensao3", "Corrente1", "Corrente2", "Corrente3", "Irradiacao" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButton3.setText("Show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(49, 49, 49)))
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(28, 28, 28))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton4.setText("Encerrar programa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator2)
                                    .addComponent(jSeparator13)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       
       if(DBA == null){
        dba Banco = new dba();
        DBA = Banco;

        DBA.create_table(1);
        DBA.create_table(2);
        DBA.create_table(3);

       }
       GUITeste.tabelamento(P0,P1,P3,P4,P5,P6,P7);       
       
       //timer = new Timer(1000, new ActionListener() {
          // @Override
           //public void actionPerformed(ActionEvent e) {
               //System.out.println("Entrou");
               Sr1 = new serial(DBA,Porta, Baud,Tensao1,Tensao2,Tensao3,Corrente1,Corrente2,Corrente3,Irradiacao);
           //}
      // });
       //timer.start();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboPortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboPortaActionPerformed
        
        Porta = ComboPorta.getSelectedItem().toString();
        
    }//GEN-LAST:event_ComboPortaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        // Botao de finalizar
        
        // Tratar o fechamento das portas (banco de dados e serial)
        //System.exit(0);
        //Sr1.close();
        timer.stop();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ComboBaudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBaudActionPerformed
               
        Baud = Integer.parseInt(ComboBaud.getSelectedItem().toString());
    }//GEN-LAST:event_ComboBaudActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        P0 = jComboBox3.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        P1 = jComboBox10.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        P3 = jComboBox11.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        P4 = jComboBox12.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        P5 = jComboBox13.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jComboBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox14ActionPerformed
        P6 = jComboBox14.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox14ActionPerformed

    private void jComboBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox15ActionPerformed
        P7 = jComboBox15.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox15ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        TMPsup = jTextField1.getText();
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        TMPinf = jTextField2.getText();
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        Grand = jComboBox4.getSelectedItem().toString();
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
       if(DBA == null){
        dba Banco = new dba();
        DBA = Banco;

        DBA.create_table(1);
        DBA.create_table(2);
        DBA.create_table(3);
        //System.out.println("");

       }
        
        
        
        //System.out.println(ver +"|"+ TMPsup +"|"+ TMPinf );
        //Banco2.query(ver,TMPsup,TMPinf);
        DBA.query(Grand, TMPsup, TMPinf);
        
        //SELECT * FROM TEMPOFEIO
        //WHERE VALTEMPO > '2016-05-22 00:00:00' AND
	//VALTEMPO < '2016-05-23 00:00:00'
        // P/ as buscas:
        // String mdb = "'"+ano+"'"+"'"+dia"'"+"'"+mes+"'"+...
        // ACIMA DEIXADO COM ERRO DE FORMA PROPOSITAL -> PARA VER MESMO
        //////////////////////////////////////////////////////////////////////////////////
                
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DBA.close();
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

   //String Path = "/Users/Willian/Documents/Solardba"; //Diretorio padrão
    //private String Path;// Path = ComboDirActionPerformed.getSelectedItem().toString();
   String Porta = null;
   int Baud = -1;   
    
    String P0 = null;
    String P1 = null;
    String P3 = null;
    String P4 = null;
    String P5 = null;
    String P6 = null;
    String P7 = null;
    
    private static void tabelamento(String P0,String P1,String P3, String P4,String P5,String P6,String P7)
    {
        // Esta função irá atribuir o valor devido da leitura de cada porta à respectiva grandeza mensurada
        if(P0 != null){
           if(P0 == "Tensao1") Tensao1 = 0;               
           else if(P0 == "Tensao2") Tensao2 = 0;              
           else if(P0 == "Tensao3") Tensao3 = 0;              
           else if(P0 == "Corrente1") Corrente1 = 0;              
           else if(P0 == "Corrente2") Corrente2 = 0;              
           else if(P0 == "Corrente3") Corrente3 = 0;              
           else if(P0 == "Irradiacao") Irradiacao = 0;
       } 
        if(P1 != null){
           if(P1 == "Tensao1") Tensao1 = 1;               
           else if(P1 == "Tensao2") Tensao2 = 1;              
           else if(P1 == "Tensao3") Tensao3 = 1;              
           else if(P1 == "Corrente1") Corrente1 = 1;              
           else if(P1 == "Corrente2") Corrente2 = 1;              
           else if(P1 == "Corrente3") Corrente3 = 1;              
           else if(P1 == "Irradiacao") Irradiacao = 1;
       } 
        if(P3 != null){
           if(P3 == "Tensao1") Tensao1 = 3;               
           else if(P3 == "Tensao2") Tensao2 = 3;              
           else if(P3 == "Tensao3") Tensao3 = 3;              
           else if(P3 == "Corrente1") Corrente1 = 3;              
           else if(P3 == "Corrente2") Corrente2 = 3;              
           else if(P3 == "Corrente3") Corrente3 = 3;              
           else if(P3 == "Irradiacao") Irradiacao = 3;
       } 
        if(P4 != null){
           if(P4 == "Tensao1") Tensao1 = 4;               
           else if(P4 == "Tensao2") Tensao2 = 4;              
           else if(P4 == "Tensao3") Tensao3 = 4;              
           else if(P4 == "Corrente1") Corrente1 = 4;              
           else if(P4 == "Corrente2") Corrente2 = 4;              
           else if(P4 == "Corrente3") Corrente3 = 4;              
           else if(P4 == "Irradiacao") Irradiacao = 4;
       } 
        if(P5 != null){
           if(P5 == "Tensao1") Tensao1 = 5;               
           else if(P5 == "Tensao2") Tensao2 = 5;              
           else if(P5 == "Tensao3") Tensao3 = 5;              
           else if(P5 == "Corrente1") Corrente1 = 5;              
           else if(P5 == "Corrente2") Corrente2 = 5;              
           else if(P5 == "Corrente3") Corrente3 = 5;              
           else if(P5 == "Irradiacao") Irradiacao = 5;
       } 
        if(P6 != null){
           if(P6 == "Tensao1") Tensao1 = 6;               
           else if(P6 == "Tensao2") Tensao2 = 6;              
           else if(P6 == "Tensao3") Tensao3 = 6;              
           else if(P6 == "Corrente1") Corrente1 = 6;              
           else if(P6 == "Corrente2") Corrente2 = 6;              
           else if(P6 == "Corrente3") Corrente3 = 6;              
           else if(P6 == "Irradiacao") Irradiacao = 6;
       } 
        if(P7 != null){
           if(P7 == "Tensao1") Tensao1 = 7;               
           else if(P7 == "Tensao2") Tensao2 = 7;              
           else if(P7 == "Tensao3") Tensao3 = 7;              
           else if(P7 == "Corrente1") Corrente1 = 7;              
           else if(P7 == "Corrente2") Corrente2 = 7;              
           else if(P7 == "Corrente3") Corrente3 = 7;              
           else if(P7 == "Irradiacao") Irradiacao = 7;
       }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBaud;
    private javax.swing.JComboBox<String> ComboPorta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
