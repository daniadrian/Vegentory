/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vegentory;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class menjualtab extends javax.swing.JFrame {

    public menjualtab() {
        initComponents();
           this.setLocationRelativeTo(null);
        this.setResizable(false);
        tabellihatdatamenjual1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tabellihatdatamenjual1.rowAtPoint(e.getPoint());
                int col = tabellihatdatamenjual1.columnAtPoint(e.getPoint());

                if (row >= 0 && col >= 0) {
                    displayForUpdate();
                    
                }
            }
        });
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lihatdatabutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellihatmenjual = new javax.swing.JTable();
        backbutton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        kodewilayahfield = new javax.swing.JTextField();
        iddistributorfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        namasayurfield = new javax.swing.JTextField();
        editbutton = new javax.swing.JButton();
        kuantitaspenjualanfield = new javax.swing.JTextField();
        tanggaltransaksifield = new javax.swing.JTextField();
        backbutton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        hargafield = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabellihatdatamenjual1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        kodewilayahfield1 = new javax.swing.JTextField();
        iddistributorfield1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        namasayurfield1 = new javax.swing.JTextField();
        addbutton1 = new javax.swing.JButton();
        kuantitaspenjualanfield1 = new javax.swing.JTextField();
        tanggaltransaksifield1 = new javax.swing.JTextField();
        backbutton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        hargafield1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabellihatdatamenjual2 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        deletebutton = new javax.swing.JButton();
        backbutton3 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        kodewilayahfield3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        iddistributorfield3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        kuantitaspenjualanfield2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tanggaltransaksifield2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        namasayurfield2 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        hargafield2 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabellihatdatamenjual3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(24, 140, 84));

        lihatdatabutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lihatdatabutton.setText("View");
        lihatdatabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatdatabuttonActionPerformed(evt);
            }
        });

        tabellihatmenjual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Wilayah", "ID Distributor", "Kuantitas Penjualan", "Tanggal Transaksi", "Nama Sayur", "Harga"
            }
        ));
        tabellihatmenjual.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabellihatmenjualAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabellihatmenjual);

        backbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(703, Short.MAX_VALUE)
                .addComponent(lihatdatabutton)
                .addGap(744, 744, 744))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(backbutton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lihatdatabutton)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(backbutton)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Data", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        kodewilayahfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodewilayahfieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("ID Distributor");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Kode Wilayah");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Kuantitas Penjualan");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Tanggal Transaksi");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Nama Sayur");

        editbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editbutton.setText("Edit");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        tanggaltransaksifield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggaltransaksifieldActionPerformed(evt);
            }
        });

        backbutton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backbutton1.setText("Back");
        backbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Edit Data");

        jLabel7.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        jLabel7.setText("Please edit your data here");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("Harga");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iddistributorfield, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(kuantitaspenjualanfield)
                            .addComponent(kodewilayahfield)
                            .addComponent(tanggaltransaksifield)
                            .addComponent(namasayurfield)
                            .addComponent(hargafield))
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(backbutton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editbutton)))
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kodewilayahfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(iddistributorfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4))
                    .addComponent(kuantitaspenjualanfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tanggaltransaksifield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(89, 89, 89)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(backbutton1)))
                            .addComponent(hargafield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(namasayurfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(24, 140, 84));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Check Data");

        tabellihatdatamenjual1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Wilayah", "ID Distributor", "Kuantitas Penjualan", "Tanggal Transaksi", "Nama Sayur", "Harga"
            }
        ));
        jScrollPane2.setViewportView(tabellihatdatamenjual1);

        jLabel9.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Please check your data here before editing");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Edit Data", jPanel3);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        kodewilayahfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodewilayahfield1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("ID Distributor");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Kode Wilayah");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Kuantitas Penjualan");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Tanggal Transaksi");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Nama Sayur");

        addbutton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addbutton1.setText("Add");
        addbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton1ActionPerformed(evt);
            }
        });

        tanggaltransaksifield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggaltransaksifield1ActionPerformed(evt);
            }
        });

        backbutton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backbutton2.setText("Back");
        backbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setText("Add Data");

        jLabel16.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        jLabel16.setText("Please add your data here");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel29.setText("Harga");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backbutton2)
                .addGap(284, 284, 284)
                .addComponent(addbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(namasayurfield1)
                                .addComponent(hargafield1)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(kodewilayahfield1)
                                        .addComponent(iddistributorfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(tanggaltransaksifield1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kuantitaspenjualanfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(45, 45, 45)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(kodewilayahfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(iddistributorfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(kuantitaspenjualanfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tanggaltransaksifield1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(namasayurfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(hargafield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(61, 61, 61)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(24, 140, 84));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Check Data");

        jLabel18.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Please check your data here before editing");

        tabellihatdatamenjual2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Wilayah", "ID Distributor", "Kuantitas Penjualan", "Tanggal Transaksi", "Nama Sayur", "Harga"
            }
        ));
        jScrollPane3.setViewportView(tabellihatdatamenjual2);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(29, 29, 29)
                .addComponent(jLabel18)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Add Data", jPanel5);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        deletebutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        backbutton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backbutton3.setText("Back");
        backbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutton3ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel24.setText("Delete Data");

        kodewilayahfield3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodewilayahfield3ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setText("Kode Wilayah");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel22.setText("ID Distributor");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel23.setText("Kuantitas Penjualan");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel30.setText("Tanggal Transaksi");

        tanggaltransaksifield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggaltransaksifield2ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel31.setText("Nama Sayur");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel33.setText("Harga");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(backbutton3))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(deletebutton)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30))
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kuantitaspenjualanfield2)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(kodewilayahfield3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tanggaltransaksifield2)
                                    .addComponent(namasayurfield2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hargafield2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(iddistributorfield3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(kodewilayahfield3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(iddistributorfield3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(kuantitaspenjualanfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(tanggaltransaksifield2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(namasayurfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(hargafield2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(backbutton3)
                .addGap(88, 88, 88))
        );

        jPanel10.setBackground(new java.awt.Color(24, 140, 84));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Check Data");

        jLabel27.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Please check your data here before editing");

        tabellihatdatamenjual3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Wilayah", "ID Distirbutor", "Kuantitas Penjualan", "Tanggal Transaksi", "Nama Sayur", "Harga"
            }
        ));
        jScrollPane4.setViewportView(tabellihatdatamenjual3);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addComponent(jLabel27)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Delete Data", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1523, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 767, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lihatdatabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatdatabuttonActionPerformed
        // TODO add your handling code here:
        String connectionUrl
                = "jdbc:sqlserver://" + SQLTaker.instanceName
                + "database=" + SQLTaker.dbName
                + "user=" + SQLTaker.id
                + "password=" + SQLTaker.pass
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=10;";

        ResultSet rs = null;

        try ( Connection connection = DriverManager.getConnection(connectionUrl);  Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT * from menjual;";
            rs = statement.executeQuery(selectSql);
            //             Print results from select statement
            DefaultTableModel tm = (DefaultTableModel) tabellihatmenjual.getModel();
            tm.setRowCount(0);
            while (rs.next()) {
                Object o[] = {rs.getInt("kode_wilayah"), rs.getString("id_distributor"), rs.getInt("kuantitas_penjualan"), rs.getDate("tanggal_transaksi"), rs.getString("nama_sayur"), rs.getInt("harga")};
                tm.addRow(o);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lihatdatabuttonActionPerformed

    private void tabellihatmenjualAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabellihatmenjualAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabellihatmenjualAncestorAdded

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        MasterData obj = new MasterData();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void kodewilayahfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodewilayahfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodewilayahfieldActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
        // TODO add your handling code here:
        String iddistributor = iddistributorfield.getText();
        String namasayur = namasayurfield.getText();

        ResultSet rs = null;
        String connectionUrl
                = "jdbc:sqlserver://" + SQLTaker.instanceName
                + "database=" + SQLTaker.dbName
                + "user=" + SQLTaker.id
                + "password=" + SQLTaker.pass
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=10;";
        try ( Connection connection = DriverManager.getConnection(connectionUrl);  Statement statement = connection.createStatement();) {

            // Sesuaikan pernyataan SQL sesuai kebutuhan update
            String sql = "UPDATE menjual SET kuantitas_penjualan=?, harga=? WHERE kode_wilayah=? AND id_distributor=? AND tanggal_transaksi=? AND nama_sayur=?";
            PreparedStatement ptstmt = connection.prepareStatement(sql);

            // Set parameter sesuai urutan placeholder (?)
            ptstmt.setInt(3, Integer.parseInt(kodewilayahfield.getText()));
            ptstmt.setString(4, iddistributor);
            ptstmt.setString(6, namasayur);
            ptstmt.setString(5, tanggaltransaksifield.getText());
            ptstmt.setInt(1, Integer.parseInt(kuantitaspenjualanfield.getText()));
            ptstmt.setInt(2, Integer.parseInt(hargafield.getText()));

            // Eksekusi pernyataan update
            ptstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Record updated successfully");
            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT * from menjual;";
            rs = statement.executeQuery(selectSql);
            //             Print results from select statement
            DefaultTableModel tm = (DefaultTableModel) tabellihatdatamenjual1.getModel();
            tm.setRowCount(0);
            while (rs.next()) {
                Object o[] = {rs.getInt("kode_wilayah"), rs.getString("id_distributor"), rs.getInt("kuantitas_penjualan"), rs.getDate("tanggal_transaksi"), rs.getString("nama_sayur"), rs.getInt("harga")};
                tm.addRow(o);
            }

            kodewilayahfield.getText();
            iddistributorfield.getText();
            kuantitaspenjualanfield.getText();
            tanggaltransaksifield.getText();
            namasayurfield.getText();
            hargafield.getText();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_editbuttonActionPerformed

    private void tanggaltransaksifieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggaltransaksifieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggaltransaksifieldActionPerformed

    private void backbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton1ActionPerformed
        // TODO add your handling code here:
        MasterData obj = new MasterData();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbutton1ActionPerformed

    private void kodewilayahfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodewilayahfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodewilayahfield1ActionPerformed

    private void addbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton1ActionPerformed
        // TODO add your handling code here:
        String iddistributor = iddistributorfield1.getText();
        String namasayur = namasayurfield1.getText();

        ResultSet rs = null;
        String connectionUrl
                = "jdbc:sqlserver://" + SQLTaker.instanceName
                + "database=" + SQLTaker.dbName
                + "user=" + SQLTaker.id
                + "password=" + SQLTaker.pass
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=10;";
        try ( Connection connection = DriverManager.getConnection(connectionUrl);  PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO menjual (kode_wilayah, id_distributor, kuantitas_penjualan, tanggal_transaksi, nama_sayur, harga) "
                + "VALUES (?, ?, ?, ?, ?, ?)");) {

            // Set parameter values
            statement.setInt(1, Integer.parseInt(kodewilayahfield1.getText()));

            statement.setString(2, iddistributor);
            statement.setString(5, namasayur);
            statement.setString(4, tanggaltransaksifield1.getText());

            statement.setInt(3, Integer.parseInt(kuantitaspenjualanfield1.getText()));
            statement.setInt(6, Integer.parseInt(hargafield1.getText()));

            // Execute the insert statement
            statement.executeUpdate();
            
            kodewilayahfield1.setText("");
            iddistributorfield1.setText("");
            kuantitaspenjualanfield1.setText("");
            tanggaltransaksifield1.setText("");
            namasayurfield1.setText("");
            hargafield1.setText("");
            JOptionPane.showMessageDialog(null, "Record updated successfully");
            // Create and execute a SELECT SQL statement.

            PreparedStatement statement2 = connection.prepareStatement("SELECT * from menjual");
            rs = statement2.executeQuery();
            //             Print results from select statement
            DefaultTableModel tm = (DefaultTableModel) tabellihatdatamenjual2.getModel();
            tm.setRowCount(0);
            while (rs.next()) {
                Object o[] = {rs.getInt("kode_wilayah"), rs.getString("id_distributor"), rs.getInt("kuantitas_penjualan"), rs.getDate("tanggal_transaksi"), rs.getString("nama_sayur"), rs.getInt("harga")};
                tm.addRow(o);
            }

            kodewilayahfield1.setText("");
            iddistributorfield1.setText("");
            kuantitaspenjualanfield1.setText("");
            tanggaltransaksifield1.setText("");
            namasayurfield1.setText("");
            hargafield1.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_addbutton1ActionPerformed

    private void tanggaltransaksifield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggaltransaksifield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggaltransaksifield1ActionPerformed

    private void backbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton2ActionPerformed
        // TODO add your handling code here:
        MasterData obj = new MasterData();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbutton2ActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        try {
            String connectionUrl
                    = "jdbc:sqlserver://" + SQLTaker.instanceName
                    + "database=" + SQLTaker.dbName
                    + "user=" + SQLTaker.id
                    + "password=" + SQLTaker.pass
                    + "encrypt=false;"
                    + "trustServerCertificate=false;"
                    + "loginTimeout=10;";
            ResultSet rs = null;
            Connection connection = DriverManager.getConnection(connectionUrl);

            // Gunakan PreparedStatement untuk menghindari SQL injection
            String sql = "DELETE FROM menjual WHERE kode_wilayah=? AND id_distributor=? AND tanggal_transaksi=? AND harga=? AND nama_sayur=? AND kuantitas_penjualan=?";
            try ( PreparedStatement pstmt = connection.prepareStatement(sql)) {
                // Set parameter values
                pstmt.setString(1, kodewilayahfield3.getText());
                pstmt.setString(2, iddistributorfield3.getText());
                pstmt.setString(3, tanggaltransaksifield2.getText());
                pstmt.setString(4, hargafield2.getText());
                pstmt.setString(5, namasayurfield2.getText());
                pstmt.setString(6, kuantitaspenjualanfield2.getText());
                
                

                // Tergantung pada tipe data kolom id_pemasok di database Anda
                // Jika id_pemasok adalah string
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data deleted successfully");

                PreparedStatement statement3 = connection.prepareStatement("SELECT * from pemasok");
                rs = statement3.executeQuery();
                //             Print results from select statement
                DefaultTableModel tm = (DefaultTableModel) tabellihatdatamenjual3.getModel();
                tm.setRowCount(0);
                while (rs.next()) {
                    Object o[] = {rs.getInt("kode_wilayah"), rs.getString("id_distributor"), rs.getInt("kuantitas_penjualan"), rs.getDate("tanggal_transaksi"), rs.getString("nama_sayur"), rs.getInt("harga")};
                    tm.addRow(o);
                }

            }

            // Jangan lupa menutup koneksi
            connection.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void backbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton3ActionPerformed
        // TODO add your handling code here:
        MasterData obj = new MasterData();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbutton3ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        if (jTabbedPane1.getSelectedIndex() == 1) {
            ResultSet rs = null;
            String connectionUrl
                    = "jdbc:sqlserver://" + SQLTaker.instanceName
                    + "database=" + SQLTaker.dbName
                    + "user=" + SQLTaker.id
                    + "password=" + SQLTaker.pass
                    + "encrypt=false;"
                    + "trustServerCertificate=false;"
                    + "loginTimeout=10;";
            try ( Connection connection = DriverManager.getConnection(connectionUrl);  Statement statement = connection.createStatement();) {

                // Create and execute a SELECT SQL statement.
                String selectSql = "SELECT * from menjual;";
                rs = statement.executeQuery(selectSql);
                //             Print results from select statement
                DefaultTableModel tm = (DefaultTableModel) tabellihatdatamenjual1.getModel();
                tm.setRowCount(0);
                while (rs.next()) {
                    Object o[] = {rs.getInt("kode_wilayah"), rs.getString("id_distributor"), rs.getInt("kuantitas_penjualan"), rs.getDate("tanggal_transaksi"), rs.getString("nama_sayur"), rs.getInt("harga")};
                    tm.addRow(o);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (jTabbedPane1.getSelectedIndex() == 2) {
            ResultSet rs = null;
            String connectionUrl
                    = "jdbc:sqlserver://" + SQLTaker.instanceName
                    + "database=" + SQLTaker.dbName
                    + "user=" + SQLTaker.id
                    + "password=" + SQLTaker.pass
                    + "encrypt=false;"
                    + "trustServerCertificate=false;"
                    + "loginTimeout=10;";
            try ( Connection connection = DriverManager.getConnection(connectionUrl);  Statement statement = connection.createStatement();) {

                // Create and execute a SELECT SQL statement.
                String selectSql = "SELECT * from menjual;";
                rs = statement.executeQuery(selectSql);
                //             Print results from select statement
                DefaultTableModel tm = (DefaultTableModel) tabellihatdatamenjual2.getModel();
                tm.setRowCount(0);
                while (rs.next()) {
                    Object o[] = {rs.getInt("kode_wilayah"), rs.getString("id_distributor"), rs.getInt("kuantitas_penjualan"), rs.getDate("tanggal_transaksi"), rs.getString("nama_sayur"), rs.getInt("harga")};
                    tm.addRow(o);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else if (jTabbedPane1.getSelectedIndex() == 3) {
            ResultSet rs = null;
            String connectionUrl
                    = "jdbc:sqlserver://" + SQLTaker.instanceName
                    + "database=" + SQLTaker.dbName
                    + "user=" + SQLTaker.id
                    + "password=" + SQLTaker.pass
                    + "encrypt=false;"
                    + "trustServerCertificate=false;"
                    + "loginTimeout=10;";
            try ( Connection connection = DriverManager.getConnection(connectionUrl);  Statement statement = connection.createStatement();) {

                // Create and execute a SELECT SQL statement.
                String selectSql = "SELECT * from menjual;";
                rs = statement.executeQuery(selectSql);
                //             Print results from select statement
                DefaultTableModel tm = (DefaultTableModel) tabellihatdatamenjual3.getModel();
                tm.setRowCount(0);
                while (rs.next()) {
                    Object o[] = {rs.getInt("kode_wilayah"), rs.getString("id_distributor"), rs.getInt("kuantitas_penjualan"), rs.getDate("tanggal_transaksi"), rs.getString("nama_sayur"), rs.getInt("harga")};
                    tm.addRow(o);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_jTabbedPane1StateChanged
void displayForUpdate() {
    int kodeWilayah = 0;
    String idDistributor = "";
    int kuantitasPenjualan = 0;
    String tanggalTransaksi = "";
    String namaSayur = "";
    int harga = 0;

    int selectedRow = tabellihatdatamenjual1.getSelectedRow();
    if (selectedRow >= 0) {
        kodeWilayah = (int) tabellihatdatamenjual1.getValueAt(selectedRow, 0);
        idDistributor = (String) tabellihatdatamenjual1.getValueAt(selectedRow, 1);
        kuantitasPenjualan = (int) tabellihatdatamenjual1.getValueAt(selectedRow, 2);
        // Formatting the date
        Date date = (Date) tabellihatdatamenjual1.getValueAt(selectedRow, 3);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        tanggalTransaksi = dateFormat.format(date);
        namaSayur = (String) tabellihatdatamenjual1.getValueAt(selectedRow, 4);
        harga = (int) tabellihatdatamenjual1.getValueAt(selectedRow, 5);
    }

    kodewilayahfield.setText(String.valueOf(kodeWilayah));
    iddistributorfield.setText(idDistributor);
    kuantitaspenjualanfield.setText(String.valueOf(kuantitasPenjualan));
    tanggaltransaksifield.setText(tanggalTransaksi);
    namasayurfield.setText(namaSayur);
    hargafield.setText(String.valueOf(harga));
}

    private void kodewilayahfield3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodewilayahfield3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodewilayahfield3ActionPerformed

    private void tanggaltransaksifield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggaltransaksifield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggaltransaksifield2ActionPerformed

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
            java.util.logging.Logger.getLogger(menjualtab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menjualtab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menjualtab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menjualtab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menjualtab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton1;
    private javax.swing.JButton backbutton;
    private javax.swing.JButton backbutton1;
    private javax.swing.JButton backbutton2;
    private javax.swing.JButton backbutton3;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton editbutton;
    private javax.swing.JTextField hargafield;
    private javax.swing.JTextField hargafield1;
    private javax.swing.JTextField hargafield2;
    private javax.swing.JTextField iddistributorfield;
    private javax.swing.JTextField iddistributorfield1;
    private javax.swing.JTextField iddistributorfield3;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField kodewilayahfield;
    private javax.swing.JTextField kodewilayahfield1;
    private javax.swing.JTextField kodewilayahfield3;
    private javax.swing.JTextField kuantitaspenjualanfield;
    private javax.swing.JTextField kuantitaspenjualanfield1;
    private javax.swing.JTextField kuantitaspenjualanfield2;
    private javax.swing.JButton lihatdatabutton;
    private javax.swing.JTextField namasayurfield;
    private javax.swing.JTextField namasayurfield1;
    private javax.swing.JTextField namasayurfield2;
    private javax.swing.JTable tabellihatdatamenjual1;
    private javax.swing.JTable tabellihatdatamenjual2;
    private javax.swing.JTable tabellihatdatamenjual3;
    private javax.swing.JTable tabellihatmenjual;
    private javax.swing.JTextField tanggaltransaksifield;
    private javax.swing.JTextField tanggaltransaksifield1;
    private javax.swing.JTextField tanggaltransaksifield2;
    // End of variables declaration//GEN-END:variables
}
