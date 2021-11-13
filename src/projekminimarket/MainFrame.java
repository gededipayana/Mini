package projekminimarket;

import com.sun.glass.events.KeyEvent;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JFrame {

    KoneksiDB koneksi = new KoneksiDB();
    FrameAwal log = new FrameAwal();
    
    String namaStaff = null;

    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    DefaultTableModel modelTabel = new DefaultTableModel();

    public MainFrame() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFrame = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        buttonHome = new javax.swing.JButton();
        buttonKasir = new javax.swing.JButton();
        buttonStock = new javax.swing.JButton();
        buttonStaff = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        panelHome = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        panelKeterangan = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        panelKasir = new javax.swing.JPanel();
        panelHeader = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelJamTanggal1 = new javax.swing.JPanel();
        labelTanggal = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        labelStaff = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        labelJam = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textKodeBarang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textJumlahBarang = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStruk = new javax.swing.JTable();
        panelUang = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        textTotalBayar = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        textJumlahBayar = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        textKembalian = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        panelStock = new javax.swing.JPanel();
        panelHeader1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelStock = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        textStockHargaBarang = new javax.swing.JTextField();
        textStockNamaBarang = new javax.swing.JTextField();
        textStockKodeBarang = new javax.swing.JTextField();
        textStockJumlahBarang = new javax.swing.JTextField();
        buttonInsert = new javax.swing.JButton();
        buttonUpdateHarga = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonUpdateStock = new javax.swing.JButton();
        panelStaff = new javax.swing.JPanel();
        panelHeader2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelStaff = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        textPassword = new javax.swing.JTextField();
        textNamaStaff = new javax.swing.JTextField();
        textID = new javax.swing.JTextField();
        buttonInsertStaff = new javax.swing.JButton();
        buttonUpdatePassword = new javax.swing.JButton();
        buttonDeleteStaff = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFrame.setBackground(new java.awt.Color(255, 204, 0));

        panelMenu.setBackground(new java.awt.Color(255, 102, 51));

        buttonHome.setText("HOME");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });

        buttonKasir.setText("KASIR");
        buttonKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKasirActionPerformed(evt);
            }
        });

        buttonStock.setText("STOCK");
        buttonStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStockActionPerformed(evt);
            }
        });

        buttonStaff.setText("STAFF");
        buttonStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStaffActionPerformed(evt);
            }
        });

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Calibri", 3, 30)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("SADHAR");

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Calibri", 3, 30)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("MART");

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Calibri", 3, 30)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("OFFICIAL");

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Calibri", 3, 20)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Cerdas dan");
        jLabel39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Calibri", 3, 20)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Humanis");
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonKasir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonStock, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(buttonStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(89, 89, 89)
                .addComponent(buttonHome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(buttonStock, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addGap(65, 65, 65))
        );

        panelMain.setBackground(new java.awt.Color(255, 204, 0));
        panelMain.setLayout(new java.awt.CardLayout());

        panelHome.setBackground(new java.awt.Color(255, 204, 0));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Y  O  G  Y  A  K  A  R  T  A");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel9.setText("UNIVERSITAS SANATA DHARMA");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 80)); // NOI18N
        jLabel10.setText("W E L C O M E    T O");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo sadhar.png"))); // NOI18N

        panelKeterangan.setBackground(new java.awt.Color(255, 204, 0));
        panelKeterangan.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("JL. PAINGAN, MAGUWOHARJO, KEC. DEPOK, SELEMAN");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Telp. (0274) 513301, 515352  Fax. (0274) 562383 - Telegram : SADHAR YOGYA - Homepage : http://www.usd.ac.id ");

        javax.swing.GroupLayout panelKeteranganLayout = new javax.swing.GroupLayout(panelKeterangan);
        panelKeterangan.setLayout(panelKeteranganLayout);
        panelKeteranganLayout.setHorizontalGroup(
            panelKeteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKeteranganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelKeteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelKeteranganLayout.setVerticalGroup(
            panelKeteranganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKeteranganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 70)); // NOI18N
        jLabel17.setText("SADHAR MART");

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(417, 417, 417))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                        .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                                .addGroup(panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(12, 12, 12)))
                        .addGap(275, 275, 275))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHomeLayout.createSequentialGroup()
                        .addComponent(panelKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel14)
                .addGap(86, 86, 86)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(45, 45, 45)
                .addComponent(panelKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMain.add(panelHome, "card2");

        panelKasir.setBackground(new java.awt.Color(255, 204, 0));
        panelKasir.setLayout(null);

        panelHeader.setBackground(new java.awt.Color(255, 204, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo sadhar.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 70)); // NOI18N
        jLabel7.setText("SADHAR MART");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel8.setText("UNIVERSITAS SANATA DHARMA");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Y  O  G  Y  A  K  A  R  T  A");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel6)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(0, 31, Short.MAX_VALUE))
        );

        panelKasir.add(panelHeader);
        panelHeader.setBounds(0, 0, 995, 222);

        panelJamTanggal1.setBackground(new java.awt.Color(255, 204, 0));
        panelJamTanggal1.setBorder(new javax.swing.border.MatteBorder(null));

        labelTanggal.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel18.setText("TANGGAL");

        jLabel29.setText("STAFF");

        jLabel11.setText("JAM");

        labelJam.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelJamTanggal1Layout = new javax.swing.GroupLayout(panelJamTanggal1);
        panelJamTanggal1.setLayout(panelJamTanggal1Layout);
        panelJamTanggal1Layout.setHorizontalGroup(
            panelJamTanggal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJamTanggal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJamTanggal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJamTanggal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJamTanggal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelJam, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelJamTanggal1Layout.setVerticalGroup(
            panelJamTanggal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJamTanggal1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJamTanggal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelJamTanggal1Layout.createSequentialGroup()
                        .addComponent(labelStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(panelJamTanggal1Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelJamTanggal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelJamTanggal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJamTanggal1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addComponent(labelJam, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        panelKasir.add(panelJamTanggal1);
        panelJamTanggal1.setBounds(100, 250, 260, 100);

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setText("KODE BARANG");

        textKodeBarang.setBackground(new java.awt.Color(255, 204, 0));

        jLabel5.setText("JUMLAH");

        textJumlahBarang.setBackground(new java.awt.Color(255, 204, 0));

        buttonAdd.setBackground(new java.awt.Color(51, 204, 0));
        buttonAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonAdd.setText("add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAdd)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textKodeBarang)
                        .addComponent(textJumlahBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textKodeBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAdd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelKasir.add(jPanel2);
        jPanel2.setBounds(100, 380, 313, 130);

        tableStruk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE BARANG", "NAMA BARANG", "HARGA", "JUMLAH", "SUB TOTAL"
            }
        ));
        tableStruk.setGridColor(new java.awt.Color(255, 204, 0));
        jScrollPane1.setViewportView(tableStruk);

        panelKasir.add(jScrollPane1);
        jScrollPane1.setBounds(420, 380, 528, 130);

        panelUang.setBackground(new java.awt.Color(255, 204, 0));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("TOTAL");

        textTotalBayar.setBackground(new java.awt.Color(255, 204, 0));
        textTotalBayar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("TUNAI");

        textJumlahBayar.setBackground(new java.awt.Color(255, 204, 0));
        textJumlahBayar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textJumlahBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textJumlahBayarKeyPressed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("KEMBALI");

        textKembalian.setBackground(new java.awt.Color(255, 204, 0));
        textKembalian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelUangLayout = new javax.swing.GroupLayout(panelUang);
        panelUang.setLayout(panelUangLayout);
        panelUangLayout.setHorizontalGroup(
            panelUangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelUangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textJumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        panelUangLayout.setVerticalGroup(
            panelUangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelUangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textJumlahBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textKembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelKasir.add(panelUang);
        panelUang.setBounds(600, 520, 350, 141);

        buttonSave.setText("SAVE");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        panelKasir.add(buttonSave);
        buttonSave.setBounds(710, 670, 110, 23);

        panelMain.add(panelKasir, "card3");

        panelStock.setBackground(new java.awt.Color(255, 204, 0));

        panelHeader1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo sadhar.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 70)); // NOI18N
        jLabel25.setText("SADHAR MART");

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel26.setText("UNIVERSITAS SANATA DHARMA");

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Y  O  G  Y  A  K  A  R  T  A");
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        tabelStock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga", "Jumlah"
            }
        ));
        jScrollPane2.setViewportView(tabelStock);
        if (tabelStock.getColumnModel().getColumnCount() > 0) {
            tabelStock.getColumnModel().getColumn(3).setHeaderValue("Jumlah");
        }

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Kode Barang");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Nama Barang");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Jumlah");

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel28.setText("Harga");

        textStockHargaBarang.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        textStockNamaBarang.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        textStockKodeBarang.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        textStockJumlahBarang.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        buttonInsert.setText("INSERT");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        buttonUpdateHarga.setText("UPDATE HARGA");
        buttonUpdateHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateHargaActionPerformed(evt);
            }
        });

        buttonDelete.setText("DELETE");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonUpdateStock.setText("UPDATE STOCK");
        buttonUpdateStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateStockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textStockKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonUpdateHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(buttonDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonUpdateStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textStockNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textStockHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textStockJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStockKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textStockNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStockHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStockJumlahBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(buttonInsert)
                .addGap(18, 18, 18)
                .addComponent(buttonUpdateHarga)
                .addGap(18, 18, 18)
                .addComponent(buttonUpdateStock)
                .addGap(18, 18, 18)
                .addComponent(buttonDelete)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelHeader1Layout = new javax.swing.GroupLayout(panelHeader1);
        panelHeader1.setLayout(panelHeader1Layout);
        panelHeader1Layout.setHorizontalGroup(
            panelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeader1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel24)
                .addGroup(panelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeader1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(panelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)))
                    .addGroup(panelHeader1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeader1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        panelHeader1Layout.setVerticalGroup(
            panelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeader1Layout.createSequentialGroup()
                .addGroup(panelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeader1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27))
                    .addGroup(panelHeader1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel24)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panelHeader1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelStockLayout = new javax.swing.GroupLayout(panelStock);
        panelStock.setLayout(panelStockLayout);
        panelStockLayout.setHorizontalGroup(
            panelStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelStockLayout.setVerticalGroup(
            panelStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStockLayout.createSequentialGroup()
                .addComponent(panelHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        panelMain.add(panelStock, "card4");

        panelStaff.setBackground(new java.awt.Color(255, 204, 0));

        panelHeader2.setBackground(new java.awt.Color(255, 204, 0));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo sadhar.png"))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Calibri", 1, 70)); // NOI18N
        jLabel32.setText("SADHAR MART");

        jLabel33.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel33.setText("UNIVERSITAS SANATA DHARMA");

        jLabel34.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Y  O  G  Y  A  K  A  R  T  A");
        jLabel34.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        tabelStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama Staff", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabelStaff);

        jPanel3.setBackground(new java.awt.Color(255, 204, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel35.setText("ID");

        jLabel36.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel36.setText("Nama ");

        jLabel38.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel38.setText("Password");

        textPassword.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        textNamaStaff.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        textID.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        buttonInsertStaff.setText("INSERT");
        buttonInsertStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertStaffActionPerformed(evt);
            }
        });

        buttonUpdatePassword.setText("UPDATE Password");
        buttonUpdatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdatePasswordActionPerformed(evt);
            }
        });

        buttonDeleteStaff.setText("DELETE");
        buttonDeleteStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteStaffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonUpdatePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonInsertStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonDeleteStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textNamaStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(textNamaStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(75, 75, 75)
                .addComponent(buttonInsertStaff)
                .addGap(18, 18, 18)
                .addComponent(buttonUpdatePassword)
                .addGap(18, 18, 18)
                .addComponent(buttonDeleteStaff)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelHeader2Layout = new javax.swing.GroupLayout(panelHeader2);
        panelHeader2.setLayout(panelHeader2Layout);
        panelHeader2Layout.setHorizontalGroup(
            panelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeader2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jLabel31)
                .addGroup(panelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeader2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(panelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel33)))
                    .addGroup(panelHeader2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHeader2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
        panelHeader2Layout.setVerticalGroup(
            panelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeader2Layout.createSequentialGroup()
                .addGroup(panelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeader2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34))
                    .addGroup(panelHeader2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(panelHeader2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelStaffLayout = new javax.swing.GroupLayout(panelStaff);
        panelStaff.setLayout(panelStaffLayout);
        panelStaffLayout.setHorizontalGroup(
            panelStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelStaffLayout.setVerticalGroup(
            panelStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStaffLayout.createSequentialGroup()
                .addComponent(panelHeader2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
        );

        panelMain.add(panelStaff, "card5");

        javax.swing.GroupLayout panelFrameLayout = new javax.swing.GroupLayout(panelFrame);
        panelFrame.setLayout(panelFrameLayout);
        panelFrameLayout.setHorizontalGroup(
            panelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFrameLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFrameLayout.setVerticalGroup(
            panelFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();

        panelMain.add(panelHome);
        panelMain.repaint();
        panelMain.revalidate();
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKasirActionPerformed
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();

        panelMain.add(panelKasir);
        panelMain.repaint();
        panelMain.revalidate();
        
        TglJm();
        labelStaff.setText(namaStaff);
    }//GEN-LAST:event_buttonKasirActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed

        conn = koneksi.getConnection();
        String kode = textKodeBarang.getText();
        int jumlah = Integer.parseInt(textJumlahBarang.getText());
        DefaultTableModel model = (DefaultTableModel) tableStruk.getModel();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select KODE_BARANG, NAMA_BARANG, HARGA_BARANG from BARANG where KODE_BARANG = '" + kode + "'");

            Object[] isi = new Object[5];
            while (rs.next()) {
                isi[0] = rs.getString("KODE_BARANG");
                isi[1] = rs.getString("NAMA_BARANG");
                isi[2] = Integer.parseInt(rs.getString("HARGA_BARANG"));
                isi[3] = textJumlahBarang.getText();
                isi[4] = String.valueOf(jumlah * Integer.parseInt(rs.getString("HARGA_BARANG")));

                model.addRow(isi);
            }

            conn.commit();

            double hargaTotal = 0;
            for (int i = 0; i < tableStruk.getRowCount(); i++) {
                hargaTotal = hargaTotal + Integer.parseInt(tableStruk.getValueAt(i, 4).toString());
            }

            textTotalBayar.setText(String.valueOf(hargaTotal));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
        finally {
                   conn = koneksi.getConnection();

        try {
            st = conn.createStatement();
            rs = st.executeQuery("update BARANG set JUMLAH_BARANG = JUMLAH_BARANG - "+textJumlahBarang.getText()+" where KODE_BARANG = '"+textKodeBarang.getText()+"'");
            conn.commit();
//            JOptionPane.showMessageDialog(rootPane, "Stock Berhasil Diperbaharui");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            try {
                rs.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
            clearKasir();
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStockActionPerformed
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();

        panelMain.add(panelStock);
        panelMain.repaint();
        panelMain.revalidate();

        tampilStock();
    }//GEN-LAST:event_buttonStockActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed

        conn = koneksi.getConnection();

        try {
            ps = conn.prepareStatement("insert into barang values(?,?,?,?)");
            ps.setString(1, textStockKodeBarang.getText());
            ps.setString(2, textStockNamaBarang.getText());
            ps.setDouble(3, Integer.parseInt(textStockHargaBarang.getText()));
            ps.setDouble(4, Integer.parseInt(textStockJumlahBarang.getText()));
            ps.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dtambahkan");
            tampilStock();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            clear();
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void buttonUpdateHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateHargaActionPerformed
        conn = koneksi.getConnection();

        try {
            ps = conn.prepareStatement("update BARANG set HARGA_BARANG = ? where KODE_BARANG = ?");
            ps.setInt(1, Integer.parseInt(textStockHargaBarang.getText()));
            ps.setString(2, (textStockKodeBarang.getText()));
            ps.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(rootPane, "Harga Berhasil Diperbaharui");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            tampilStock();
            clear();
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }//GEN-LAST:event_buttonUpdateHargaActionPerformed

    private void textJumlahBayarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textJumlahBayarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            textKembalian.setText(String.valueOf(Double.parseDouble(textJumlahBayar.getText()) - Double.parseDouble(textTotalBayar.getText())));
        }
    }//GEN-LAST:event_textJumlahBayarKeyPressed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        conn = koneksi.getConnection();

        try {
            ps = conn.prepareStatement("delete from BARANG where KODE_BARANG = ?");
            ps.setString(1, textStockKodeBarang.getText());
            ps.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(rootPane, "Barang Berhasil Dihapus");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            tampilStock();
            clear();
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonUpdateStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateStockActionPerformed
        conn = koneksi.getConnection();

        try {
            ps = conn.prepareStatement("update BARANG set JUMLAH_BARANG = ? where KODE_BARANG = ?");
            ps.setInt(1, Integer.parseInt(textStockJumlahBarang.getText()));
            ps.setString(2, (textStockKodeBarang.getText()));
            ps.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(rootPane, "Stock Berhasil Diperbaharui");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            tampilStock();
            clear();
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }//GEN-LAST:event_buttonUpdateStockActionPerformed

    private void buttonStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStaffActionPerformed
        panelMain.removeAll();
        panelMain.repaint();
        panelMain.revalidate();

        panelMain.add(panelStaff);
        panelMain.repaint();
        panelMain.revalidate();
        
        tampilStaff();
    }//GEN-LAST:event_buttonStaffActionPerformed

    private void buttonInsertStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertStaffActionPerformed
        conn = koneksi.getConnection();

        try {
            ps = conn.prepareStatement("insert into STAFF values(?,?,?)");
            ps.setString(1, textID.getText());
            ps.setString(2, textNamaStaff.getText());
            ps.setString(3, textPassword.getText());
            ps.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(null, "Data Berhasil Dtambahkan");
            tampilStaff();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            clearStaff();
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_buttonInsertStaffActionPerformed

    private void buttonUpdatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdatePasswordActionPerformed
        conn = koneksi.getConnection();

        try {
            ps = conn.prepareStatement("update STAFF set PASSWORD = ? where ID = ?");
            ps.setString(1, textPassword.getText());
            ps.setString(2, textID.getText());
            ps.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(rootPane, "Password Berhasil Diperbaharui");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            tampilStaff();
            clearStaff();
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }//GEN-LAST:event_buttonUpdatePasswordActionPerformed

    private void buttonDeleteStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteStaffActionPerformed
        conn = koneksi.getConnection();

        try {
            ps = conn.prepareStatement("delete from STAFF where ID = ?");
            ps.setString(1, textID.getText());
            ps.executeUpdate();
            conn.commit();
            JOptionPane.showMessageDialog(rootPane, "Staff Berhasil Dihapus");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        } finally {
            tampilStaff();
            clearStaff();
            try {
                ps.close();
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        }
    }//GEN-LAST:event_buttonDeleteStaffActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed

        String kode = null, nama = null, harga = null, jumlah = null;
                
            for (int i = 0; i < tableStruk.getRowCount(); i++) {
            kode = String.valueOf(tableStruk.getValueAt(i, 0).toString());
            nama = String.valueOf(tableStruk.getValueAt(i, 1).toString());
            harga = String.valueOf(tableStruk.getValueAt(i, 2).toString());
            jumlah = String.valueOf(tableStruk.getValueAt(i, 3).toString());
            
        }
        
        StringBuffer buffer = new StringBuffer();
        buffer.append("|");
        buffer.append(kode);
        buffer.append("\n |");
        buffer.append(nama);
        buffer.append("\n |");
        buffer.append(harga);
        buffer.append("\n |");
        buffer.append(jumlah);
        buffer.append("|");
        
        FileOutputStream outStream = null;         
        JFileChooser chooser = new JFileChooser();
        chooser.showSaveDialog(chooser);
        File outFile = chooser.getSelectedFile();
    
        try{
            outStream = new FileOutputStream(outFile);
            outStream.write(buffer.toString().getBytes());

            outStream.close();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Save");
            
            textTotalBayar.setText("");
            textJumlahBayar.setText("");
            textKembalian.setText("");
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        DataOutputStream outputDataStream = new DataOutputStream(outStream);
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void tampilStock() {

        DefaultTableModel modelTabel = new DefaultTableModel();
        modelTabel.addColumn("Kode Barang");
        modelTabel.addColumn("Nama Barang");
        modelTabel.addColumn("Harga");
        modelTabel.addColumn("Jumlah");

        conn = koneksi.getConnection();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from BARANG");

            while (rs.next()) {
                modelTabel.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)
                });
            }
            tabelStock.setModel(modelTabel);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private void tampilStaff() {

        DefaultTableModel modelTabel = new DefaultTableModel();
        modelTabel.addColumn("ID");
        modelTabel.addColumn("Nama");
        modelTabel.addColumn("Password");

        conn = koneksi.getConnection();
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from STAFF");

            while (rs.next()) {
                modelTabel.addRow(new Object[]{
                    rs.getString(1), rs.getString(2), rs.getString(3)
                });
            }
            tabelStaff.setModel(modelTabel);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private void clear() {
        textStockKodeBarang.setText("");
        textStockNamaBarang.setText("");
        textStockHargaBarang.setText("");
        textStockJumlahBarang.setText("");
    }

    private void clearKasir() {
        textKodeBarang.setText("");
        textJumlahBarang.setText("");
    }

    private void clearStaff() {
        textID.setText("");
        textNamaStaff.setText("");
        textPassword.setText("");
    }
    
    private void TglJm(){
        Thread x = new Thread(){
            public void run(){
                for (;;) {
                    
                    Calendar tanggal = new GregorianCalendar();
                    int hari = tanggal.get(Calendar.DAY_OF_MONTH);
                    int bulan = tanggal.get(Calendar.MONTH);
                    int tahun = tanggal.get(Calendar.YEAR);
                    labelTanggal.setText(hari+" / "+bulan+" / "+tahun);
                    
                    int jam = tanggal.get(Calendar.HOUR);
                    int menit = tanggal.get(Calendar.MINUTE);
                    int detik = tanggal.get(Calendar.SECOND);
                    int ampm = tanggal.get(Calendar.AM_PM);
                    
                    String waktu = "";
                    if(ampm == 1){
                        waktu = "PM";
                    }
                    else{
                        waktu = "AM";
                    }
                    
                    labelJam.setText(jam+" : "+menit+" : "+detik+"  "+waktu);
                    
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            }
        };
        x.start();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonDeleteStaff;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonInsertStaff;
    private javax.swing.JButton buttonKasir;
    private javax.swing.JButton buttonSave;
    private javax.swing.JButton buttonStaff;
    private javax.swing.JButton buttonStock;
    private javax.swing.JButton buttonUpdateHarga;
    private javax.swing.JButton buttonUpdatePassword;
    private javax.swing.JButton buttonUpdateStock;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelJam;
    private javax.swing.JLabel labelStaff;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JPanel panelFrame;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelHeader1;
    private javax.swing.JPanel panelHeader2;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelJamTanggal1;
    private javax.swing.JPanel panelKasir;
    private javax.swing.JPanel panelKeterangan;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelStaff;
    private javax.swing.JPanel panelStock;
    private javax.swing.JPanel panelUang;
    private javax.swing.JTable tabelStaff;
    private javax.swing.JTable tabelStock;
    private javax.swing.JTable tableStruk;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textJumlahBarang;
    private javax.swing.JTextField textJumlahBayar;
    private javax.swing.JTextField textKembalian;
    private javax.swing.JTextField textKodeBarang;
    private javax.swing.JTextField textNamaStaff;
    private javax.swing.JTextField textPassword;
    private javax.swing.JTextField textStockHargaBarang;
    private javax.swing.JTextField textStockJumlahBarang;
    private javax.swing.JTextField textStockKodeBarang;
    private javax.swing.JTextField textStockNamaBarang;
    private javax.swing.JTextField textTotalBayar;
    // End of variables declaration//GEN-END:variables
}
