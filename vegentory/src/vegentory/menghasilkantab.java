package vegentory;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

public class menghasilkantab extends javax.swing.JFrame {

   public menghasilkantab() {
        initComponents();
          this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        //baca baris dan kolom di tabel yang di klik
        tabellihatdatamengirim1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tabellihatdatamengirim1.rowAtPoint(e.getPoint());
                int col = tabellihatdatamengirim1.columnAtPoint(e.getPoint());

                if (row >= 0 && col >= 0) {
                    displayForUpdate();
                    
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        lihatdatabutton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellihatmenghasilkan = new javax.swing.JTable();
        backbutton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        kuantitiasproduksifield = new javax.swing.JTextField();
        tanggalpanenfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        editbutton = new javax.swing.JButton();
        idpemasokfield = new javax.swing.JTextField();
        namasayurfield = new javax.swing.JTextField();
        backbutton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabellihatdatamengirim1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        kuantitasproduksifield1 = new javax.swing.JTextField();
        tanggalfield1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addbutton1 = new javax.swing.JButton();
        idpemasokfield1 = new javax.swing.JTextField();
        namasayurfield1 = new javax.swing.JTextField();
        backbutton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabellihatdatamenghasilkan2 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        kuantitasproduksifield2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        deletebutton = new javax.swing.JButton();
        backbutton3 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tanggalpanenfield2 = new javax.swing.JTextField();
        jLabel330 = new javax.swing.JLabel();
        jLabel332 = new javax.swing.JLabel();
        idpemasokfield2 = new javax.swing.JTextField();
        namasayurfield2 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabellihatdatamenghasilkan3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(24, 140, 84));

        lihatdatabutton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lihatdatabutton1.setText("View");
        lihatdatabutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatdatabutton1ActionPerformed(evt);
            }
        });

        tabellihatmenghasilkan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kuantitas Produksi", "Tanggal Panen", "ID Pemasok", "Nama Sayur"
            }
        ));
        tabellihatmenghasilkan.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabellihatmenghasilkanAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(tabellihatmenghasilkan);

        backbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        backbutton.setText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(703, Short.MAX_VALUE)
                .addComponent(lihatdatabutton1)
                .addGap(744, 744, 744))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(backbutton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lihatdatabutton1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(backbutton)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("View Data", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        kuantitiasproduksifield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuantitiasproduksifieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Tanggal Panen");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Kuantitas Produksi");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("ID Pemasok");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Nama Sayur");

        editbutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editbutton.setText("Edit");
        editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbuttonActionPerformed(evt);
            }
        });

        namasayurfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namasayurfieldActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(backbutton1)
                        .addGap(210, 210, 210)
                        .addComponent(editbutton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namasayurfield, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                    .addComponent(idpemasokfield)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(86, 86, 86))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(69, 69, 69)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kuantitiasproduksifield, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                    .addComponent(tanggalpanenfield)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kuantitiasproduksifield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tanggalpanenfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(idpemasokfield, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(namasayurfield, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbutton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(24, 140, 84));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Check Data");

        tabellihatdatamengirim1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kuantitas Produksi", "Tanggal Panen", "ID Pemasok", "Nama Sayur"
            }
        ));
        jScrollPane2.setViewportView(tabellihatdatamengirim1);

        jLabel9.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Please check your data here before editing");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Edit Data", jPanel4);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));

        kuantitasproduksifield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuantitasproduksifield1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Tanggal Panen");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setText("Kuantitas Produksi");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("ID Pemasok");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Nama Sayur");

        addbutton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addbutton1.setText("Add");
        addbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutton1ActionPerformed(evt);
            }
        });

        namasayurfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namasayurfield1ActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idpemasokfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kuantitasproduksifield1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tanggalfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(namasayurfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(348, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(backbutton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(kuantitasproduksifield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tanggalfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(idpemasokfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(namasayurfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbutton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbutton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(24, 140, 84));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Check Data");

        jLabel18.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Please check your data here before editing");

        tabellihatdatamenghasilkan2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kuantitas Produksi", "Tanggal Panen", "ID Pemasok", "Nama Sayur"
            }
        ));
        jScrollPane3.setViewportView(tabellihatdatamenghasilkan2);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(29, 29, 29)
                .addComponent(jLabel18)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Add Data", jPanel6);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        kuantitasproduksifield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuantitasproduksifield2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setText("Kuantitas Produksi");

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

        jLabel25.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        jLabel25.setText("If you want to delete a piece of data,");

        jLabel28.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        jLabel28.setText("Please enter the complete information for that data");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel32.setText("Tanggal Panen");

        jLabel330.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel330.setText("ID Pemasok");

        jLabel332.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel332.setText("Nama Sayur");

        idpemasokfield2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpemasokfield2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel332, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel330, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(38, 38, 38)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(kuantitasproduksifield2)
                                    .addComponent(tanggalpanenfield2)
                                    .addComponent(idpemasokfield2)
                                    .addComponent(namasayurfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(backbutton3)
                        .addGap(113, 113, 113)
                        .addComponent(deletebutton)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGap(35, 35, 35)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(kuantitasproduksifield2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(tanggalpanenfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel330)
                    .addComponent(idpemasokfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel332, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namasayurfield2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbutton3)
                    .addComponent(deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(214, 214, 214))
        );

        jPanel11.setBackground(new java.awt.Color(24, 140, 84));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Check Data");

        jLabel27.setFont(new java.awt.Font("Poor Richard", 2, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Please check your data here before editing");

        tabellihatdatamenghasilkan3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kuantititas Produksi", "Tanggal Panen", "ID Pemasok", "Nama Sayur"
            }
        ));
        jScrollPane4.setViewportView(tabellihatdatamenghasilkan3);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addComponent(jLabel27)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Delete Data", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1523, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 767, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lihatdatabutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatdatabutton1ActionPerformed
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

        try (Connection connection = DriverManager.getConnection(connectionUrl); Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT * from menghasilkan;";
            rs = statement.executeQuery(selectSql);
            //             Print results from select statement
            DefaultTableModel tm = (DefaultTableModel) tabellihatmenghasilkan.getModel();
            tm.setRowCount(0);
            while (rs.next()) {
                Object o[]={rs.getInt("kuantitas_produksi"), rs.getDate("tanggal_panen"), rs.getString("id_pemasok"), rs.getString("nama_sayur")};
                tm.addRow(o);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_lihatdatabutton1ActionPerformed

    private void tabellihatmenghasilkanAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabellihatmenghasilkanAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabellihatmenghasilkanAncestorAdded

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        MasterData obj = new MasterData();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void kuantitiasproduksifieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuantitiasproduksifieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kuantitiasproduksifieldActionPerformed

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbuttonActionPerformed
        // TODO add your handling code here:
        String kuantitas = kuantitiasproduksifield.getText();
        String tanggal = tanggalpanenfield.getText();
        String id = idpemasokfield.getText();
        String namaSayur = namasayurfield.getText();

        ResultSet rs = null;
        String connectionUrl
                = "jdbc:sqlserver://" + SQLTaker.instanceName
                + "database=" + SQLTaker.dbName
                + "user=" + SQLTaker.id
                + "password=" + SQLTaker.pass
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=10;";
        try (Connection connection = DriverManager.getConnection(connectionUrl); Statement statement = connection.createStatement();) {

            // Sesuaikan pernyataan SQL sesuai kebutuhan update
            String sql = "UPDATE menghasilkan SET kuantitas_produksi=? WHERE id_pemasok=? AND tanggal_panen=? AND nama_sayur=?";
            PreparedStatement ptstmt = connection.prepareStatement(sql);

            // Set parameter sesuai urutan placeholder (?)
            ptstmt.setInt(1, Integer.parseInt(kuantitas));
            ptstmt.setString(2, id);
            ptstmt.setString(3, tanggal);
            ptstmt.setString(4, namaSayur);

            // Eksekusi pernyataan update
            ptstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Record updated successfully");
            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT * from menghasilkan;";
            rs = statement.executeQuery(selectSql);
            //             Print results from select statement
            DefaultTableModel tm = (DefaultTableModel) tabellihatdatamengirim1.getModel();
            tm.setRowCount(0);
            while (rs.next()) {
                Object o[]={rs.getInt("kuantitas_produksi"), rs.getDate("tanggal_panen"), rs.getString("id_pemasok"), rs.getString("nama_sayur")};
                tm.addRow(o);
            }

            kuantitiasproduksifield.setText("");
            tanggalpanenfield.setText("");
            idpemasokfield.setText("");
            namasayurfield.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_editbuttonActionPerformed

    private void namasayurfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namasayurfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namasayurfieldActionPerformed

    private void backbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton1ActionPerformed
        // TODO add your handling code here:
        MasterData obj = new MasterData();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbutton1ActionPerformed

    private void kuantitasproduksifield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuantitasproduksifield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kuantitasproduksifield1ActionPerformed

    private void addbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutton1ActionPerformed
        // TODO add your handling code here:
        String kuantitas = kuantitasproduksifield1.getText();
        String tanggal = tanggalfield1.getText();
        String id = idpemasokfield1.getText();
        String namaSayur = namasayurfield1.getText();

        ResultSet rs = null;
        String connectionUrl
                = "jdbc:sqlserver://" + SQLTaker.instanceName
                + "database=" + SQLTaker.dbName
                + "user=" + SQLTaker.id
                + "password=" + SQLTaker.pass
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=10;";
        try (Connection connection = DriverManager.getConnection(connectionUrl); PreparedStatement ptstmt = connection.prepareStatement(
            "INSERT INTO menghasilkan (kuantitas_produksi, tanggal_panen, id_pemasok, nama_sayur) "
            + "VALUES (?, ?, ?, ?)");) {

        // Set parameter values
        ptstmt.setInt(1, Integer.parseInt(kuantitas));
        ptstmt.setString(2, tanggal);
        ptstmt.setString(3, id);
        ptstmt.setString(4, namaSayur);

        // Execute the insert statement
        int rowsInserted = ptstmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new row has been inserted.");
            // Clear the text fields after successful insertion
            kuantitasproduksifield1.setText("");
            tanggalfield1.setText("");
            idpemasokfield1.setText("");
            namasayurfield1.setText("");
        }
        JOptionPane.showMessageDialog(null, "Record updated successfully");
        // Create and execute a SELECT SQL statement.

        PreparedStatement statement2 = connection.prepareStatement("SELECT * from menghasilkan");
        rs = statement2.executeQuery();
        //             Print results from select statement
        DefaultTableModel tm = (DefaultTableModel) tabellihatdatamenghasilkan2.getModel();
        tm.setRowCount(0);
        while (rs.next()) {
            Object o[]={rs.getInt("kuantitas_produksi"), rs.getDate("tanggal_panen"), rs.getString("id_pemasok"), rs.getString("nama_sayur")};
            tm.addRow(o);
        }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_addbutton1ActionPerformed

    private void namasayurfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namasayurfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namasayurfield1ActionPerformed

    private void backbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutton2ActionPerformed
        // TODO add your handling code here:
        MasterData obj = new MasterData();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbutton2ActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        String kuantitas = kuantitasproduksifield2.getText();
        String tanggal = tanggalpanenfield2.getText();
        String id = idpemasokfield2.getText();
        String namaSayur = namasayurfield2.getText();
        
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
            String sql = "DELETE FROM menghasilkan WHERE kuantitas_produksi=? AND tanggal_panen=? AND id_pemasok=? AND nama_sayur=?";
            try (PreparedStatement ptstmt = connection.prepareStatement(sql)) {
                // Set parameter values
                ptstmt.setInt(1, Integer.parseInt(kuantitas));
                ptstmt.setString(2, tanggal);
                ptstmt.setString(3, id);
                ptstmt.setString(4, namaSayur);

                int rowsInserted = ptstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new row has been inserted.");
                    // Clear the text fields after successful insertion
                    kuantitasproduksifield2.setText("");
                }

                JOptionPane.showMessageDialog(null, "Data deleted successfully");

                PreparedStatement statement3 = connection.prepareStatement("SELECT * from menghasilkan");
                rs = statement3.executeQuery();
                //             Print results from select statement
                DefaultTableModel tm = (DefaultTableModel) tabellihatdatamenghasilkan3.getModel();
                tm.setRowCount(0);
                while (rs.next()) {
                    Object o[]={rs.getInt("kuantitas_produksi"), rs.getDate("tanggal_panen"), rs.getString("id_pemasok"), rs.getString("nama_sayur")};
                    tm.addRow(o);
                }

                kuantitasproduksifield2.setText("");
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

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        // TODO add your handling code here:
        if (jTabbedPane2.getSelectedIndex() == 1) {
            ResultSet rs = null;
            String connectionUrl
                = "jdbc:sqlserver://" + SQLTaker.instanceName
                + "database=" + SQLTaker.dbName
                + "user=" + SQLTaker.id
                + "password=" + SQLTaker.pass
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=10;";
            try (Connection connection = DriverManager.getConnection(connectionUrl); Statement statement = connection.createStatement();) {

                // Create and execute a SELECT SQL statement.
                String selectSql = "SELECT * from menghasilkan;";
                rs = statement.executeQuery(selectSql);
                //             Print results from select statement
                DefaultTableModel tm = (DefaultTableModel) tabellihatdatamengirim1.getModel();
                tm.setRowCount(0);
                while (rs.next()) {
                    Object o[]={rs.getInt("kuantitas_produksi"), rs.getDate("tanggal_panen"), rs.getString("id_pemasok"), rs.getString("nama_sayur")};
                    tm.addRow(o);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else if (jTabbedPane2.getSelectedIndex() == 2) {
            ResultSet rs = null;
            String connectionUrl
                = "jdbc:sqlserver://" + SQLTaker.instanceName
                + "database=" + SQLTaker.dbName
                + "user=" + SQLTaker.id
                + "password=" + SQLTaker.pass
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=10;";
            try (Connection connection = DriverManager.getConnection(connectionUrl); Statement statement = connection.createStatement();) {

                // Create and execute a SELECT SQL statement.
                String selectSql = "SELECT * from menghasilkan;";
                rs = statement.executeQuery(selectSql);
                //             Print results from select statement
                DefaultTableModel tm = (DefaultTableModel) tabellihatdatamenghasilkan2.getModel();
                tm.setRowCount(0);
                while (rs.next()) {
                    Object o[]={rs.getInt("kuantitas_produksi"), rs.getDate("tanggal_panen"), rs.getString("id_pemasok"), rs.getString("nama_sayur")};
                    tm.addRow(o);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        } else if (jTabbedPane2.getSelectedIndex() == 3) {
            ResultSet rs = null;
            String connectionUrl
                = "jdbc:sqlserver://" + SQLTaker.instanceName
                + "database=" + SQLTaker.dbName
                + "user=" + SQLTaker.id
                + "password=" + SQLTaker.pass
                + "encrypt=false;"
                + "trustServerCertificate=false;"
                + "loginTimeout=10;";
            try (Connection connection = DriverManager.getConnection(connectionUrl); Statement statement = connection.createStatement();) {

                // Create and execute a SELECT SQL statement.
                String selectSql = "SELECT * from menghasilkan;";
                rs = statement.executeQuery(selectSql);
                //             Print results from select statement
                DefaultTableModel tm = (DefaultTableModel) tabellihatdatamenghasilkan3.getModel();
                tm.setRowCount(0);
                while (rs.next()) {
                    Object o[]={rs.getInt("kuantitas_produksi"), rs.getDate("tanggal_panen"), rs.getString("id_pemasok"), rs.getString("nama_sayur")};
                    tm.addRow(o);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }

        }
    }//GEN-LAST:event_jTabbedPane2StateChanged
void displayForUpdate(){
        String kuantitasproduksi = "";
        String tanggalpanen = "";
        String idpemasok = "";
        String namasayur = "";
        String kelurahan = "";
                

        
        int selectedRow = tabellihatdatamengirim1.getSelectedRow();
        if (selectedRow >= 0) {
            // Check if the value is an Integer, then convert it to String
         Object value =  tabellihatdatamengirim1.getValueAt(selectedRow, 0);
            if (value instanceof Integer) {
                kuantitasproduksi = String.valueOf(value); // Convert Integer to String
            } else {
                kuantitasproduksi = (String) value; // If it's already String, keep it as is
            }
         java.util.Date dateValue = (java.util.Date) tabellihatdatamengirim1.getValueAt(selectedRow, 1);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        tanggalpanen = formatter.format(dateValue);
        
         idpemasok = (String) tabellihatdatamengirim1.getValueAt(selectedRow, 2);
         namasayur = (String) tabellihatdatamengirim1.getValueAt(selectedRow, 3);
     
         
        }
        kuantitiasproduksifield.setText(kuantitasproduksi);
        tanggalpanenfield.setText(tanggalpanen);
        idpemasokfield.setText(idpemasok);
        namasayurfield.setText(namasayur);
}
    private void kuantitasproduksifield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuantitasproduksifield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kuantitasproduksifield2ActionPerformed

    private void idpemasokfield2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpemasokfield2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpemasokfield2ActionPerformed

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
            java.util.logging.Logger.getLogger(menghasilkantab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menghasilkantab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menghasilkantab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menghasilkantab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menghasilkantab().setVisible(true);
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
    private javax.swing.JTextField idpemasokfield;
    private javax.swing.JTextField idpemasokfield1;
    private javax.swing.JTextField idpemasokfield2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel330;
    private javax.swing.JLabel jLabel332;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
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
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField kuantitasproduksifield1;
    private javax.swing.JTextField kuantitasproduksifield2;
    private javax.swing.JTextField kuantitiasproduksifield;
    private javax.swing.JButton lihatdatabutton1;
    private javax.swing.JTextField namasayurfield;
    private javax.swing.JTextField namasayurfield1;
    private javax.swing.JTextField namasayurfield2;
    private javax.swing.JTable tabellihatdatamenghasilkan2;
    private javax.swing.JTable tabellihatdatamenghasilkan3;
    private javax.swing.JTable tabellihatdatamengirim1;
    private javax.swing.JTable tabellihatmenghasilkan;
    private javax.swing.JTextField tanggalfield1;
    private javax.swing.JTextField tanggalpanenfield;
    private javax.swing.JTextField tanggalpanenfield2;
    // End of variables declaration//GEN-END:variables
}
