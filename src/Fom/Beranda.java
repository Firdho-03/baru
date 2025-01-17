/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fom;
//import Fom.Data_item1;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Beranda extends javax.swing.JFrame {
    
    Double totalAmount=0.0;
    Double cash=0.0;
    Double balance=0.0;
    Double bHeight=5.50;

    ArrayList<String> menuAry = new ArrayList<>();
    ArrayList<String> qtyAry = new ArrayList<>();
    ArrayList<String> hargaAry = new ArrayList<>();
    ArrayList<String> jumlahAry = new ArrayList<>();

    
    public PreparedStatement ps;
    public ResultSet rs;
    Connection conn = Config.koneksi1.KoneksiDB();
    NumberFormat angkakoma= NumberFormat.getInstance();

    public Beranda() {
        initComponents();
        showdataitem();
        Tampiltanggal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Hitam = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_cari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_menu = new javax.swing.JTable();
        Transaksi = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txt_menu = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_qty = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_transaksi = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_cash = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_kembali = new javax.swing.JTextField();
        btn_bayar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        Tombol = new javax.swing.JButton();
        btn_wa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lb_tgl = new javax.swing.JLabel();
        lb_faktur = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Keluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(0, 0, 0));

        Header.setBackground(new java.awt.Color(0, 51, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("           KASIR CAFE ");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(415, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(544, 544, 544))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        Hitam.setBackground(new java.awt.Color(0, 51, 153));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cari Item");

        txt_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cariActionPerformed(evt);
            }
        });
        txt_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cariKeyReleased(evt);
            }
        });

        tbl_menu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_menu.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        tbl_menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategori", "Menu", "Harga"
            }
        ));
        tbl_menu.setRowHeight(31);
        tbl_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_menuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_menu);

        javax.swing.GroupLayout HitamLayout = new javax.swing.GroupLayout(Hitam);
        Hitam.setLayout(HitamLayout);
        HitamLayout.setHorizontalGroup(
            HitamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HitamLayout.createSequentialGroup()
                .addGroup(HitamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HitamLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(HitamLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HitamLayout.setVerticalGroup(
            HitamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HitamLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(HitamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addGap(9, 9, 9))
        );

        Transaksi.setBackground(new java.awt.Color(0, 51, 153));

        jPanel1.setBackground(new java.awt.Color(0, 51, 153));

        txt_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_menuActionPerformed(evt);
            }
        });

        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_qtyKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txt_qty)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        tbl_transaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbl_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.Faktur", "Tanggal", "Menu", "Quantity", "Harga", "Jumlah"
            }
        ));
        tbl_transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_transaksiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_transaksi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Total Bayar");

        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });

        jLabel3.setText("Cash");

        txt_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cashActionPerformed(evt);
            }
        });
        txt_cash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cashKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cashKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cashKeyTyped(evt);
            }
        });

        jLabel4.setText("Kembali");

        btn_bayar.setBackground(new java.awt.Color(255, 153, 0));
        btn_bayar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_bayar.setText("BAYAR");
        btn_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txt_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txt_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btn_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txt_cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txt_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 153));

        Tombol.setText("Tambah Item");
        Tombol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TombolActionPerformed(evt);
            }
        });

        btn_wa.setText("Laporan");
        btn_wa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_waActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No.Faktur");

        lb_tgl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_tgl.setForeground(new java.awt.Color(255, 255, 255));
        lb_tgl.setText("Tgl hari ini");
        lb_tgl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lb_tgl.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lb_tglAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lb_faktur.setBackground(new java.awt.Color(255, 255, 255));
        lb_faktur.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lb_faktur.setForeground(new java.awt.Color(255, 255, 255));
        lb_faktur.setText("Faktur");
        lb_faktur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tanggal");

        Keluar.setBackground(new java.awt.Color(255, 0, 0));
        Keluar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Keluar.setForeground(new java.awt.Color(255, 255, 255));
        Keluar.setText("Keluar");
        Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tombol, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(lb_faktur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lb_tgl, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                .addGap(251, 251, 251)))
                        .addComponent(Keluar)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_wa, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tombol)
                            .addComponent(btn_wa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_tgl)
                            .addComponent(lb_faktur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout TransaksiLayout = new javax.swing.GroupLayout(Transaksi);
        Transaksi.setLayout(TransaksiLayout);
        TransaksiLayout.setHorizontalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransaksiLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TransaksiLayout.setVerticalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Hitam, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hitam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cariActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel model = (DefaultTableModel)tbl_transaksi.getModel();

          if(txt_menu.getText().equals("")||txt_harga.getText().equals("")||txt_qty.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Gagal menambahkan menu ! ", "Peringatan",JOptionPane.WARNING_MESSAGE);
              
          }else{
              String NoFaktur = lb_faktur.getText();
              String tanggal = lb_tgl.getText();
              String menu = txt_menu.getText();
              int qty = Integer.parseInt(txt_qty.getText());
              String harga = txt_harga.getText();
              String replaceHarga = replaceHarga(harga);
              int jumlah=qty * Integer.parseInt(replaceHarga);
              
            Object[] Rowdata={NoFaktur,tanggal,menu,qty,harga,angkakoma.format(jumlah)};
            model.addRow(Rowdata);
             HitungTotal();
           
            txt_menu.setText("");
            txt_harga.setText("");
            txt_qty.setText("");
            txt_cari.setText("");
            txt_cari.requestFocus();
          }
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void btn_waActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_waActionPerformed
        // TODO add your handling code here:
        Desktop browser = Desktop.getDesktop();
        try {
          browser.browse(new URI("https://wa.me/+6281336988310"));
        } 
        catch (IOException err) {
        }
        catch (URISyntaxException err) {
    }//GEN-LAST:event_btn_waActionPerformed
    }
    private void txt_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cariKeyReleased
        // TODO add your handling code here:
        
         showdataitem();
    }//GEN-LAST:event_txt_cariKeyReleased

    private void txt_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_menuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_menuActionPerformed

    private void tbl_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_menuMouseClicked
        // TODO add your handling code here: 
        
            try { 
       
               DefaultTableModel model = (DefaultTableModel)tbl_menu.getModel();
               int selectedRow = tbl_menu.getSelectedRow();
        
      
                String menu = model.getValueAt(selectedRow, 1).toString();  
                String harga = model.getValueAt(selectedRow, 2).toString();
                int qty = 1;
        
                int confirmDialog = JOptionPane.showConfirmDialog(null,
                    "Apakah anda yakin memilih menu ini?\n" +
                    "Menu: " + menu + "\n" +
                    "Harga: " + harga,
                    "Konfirmasi Pilihan",
                    JOptionPane.YES_NO_OPTION);

                if (confirmDialog == JOptionPane.YES_OPTION) {
                    txt_menu.setText(menu);
                    txt_harga.setText(harga.replace("Rp ", "").replace(".", ""));
                    txt_qty.setText(String.valueOf(qty));
                    txt_qty.requestFocus(); 
                    txt_cari.setText("");
                    showdataitem();
                }else{
                    showdataitem();
                    txt_cari.setText("");
                }

            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_tbl_menuMouseClicked

    private void btn_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bayarActionPerformed
// Mengambil nilai total dan pembayaran dari textfield, menghapus karakter non-digit
String totalStr = txt_total.getText().replaceAll("[^\\d]", "");
String cashStr = txt_cash.getText().replaceAll("[^\\d]", "");

try {

    double total = Double.parseDouble(totalStr);
    double cash = Double.parseDouble(cashStr);
    double kembalian = cash - total;
    
    // code yang membatalakan transaksi jika uang pembayaran tidak cukup
    if (kembalian < 0) {
        JOptionPane.showMessageDialog(this, "Uang pembayaran kurang!", "Peringatan", JOptionPane.WARNING_MESSAGE);
        
        // menghapus isi kolom Cash dan Kembalian jika transaksi dibatalkan karena uang tidak cukup
        txt_kembali.setText("");
        txt_cash.setText("");
        txt_total.requestFocus();
      
        return;
    }
    

    DecimalFormat df = new DecimalFormat("#,###");
    df.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("id")));
    String kembalianFormatted = "Rp " + df.format(kembalian);
    txt_kembali.setText(kembalianFormatted);
    

    //sekedar penambahan untuk memperjelas transaksi
        JOptionPane.showMessageDialog(this, 
        "Pembayaran berhasil!\nTotal: Rp " + df.format(total) + 
        "\nDibayar  : Rp " + df.format(cash) + 
        "\nKembalian: " + kembalianFormatted, 
        "Sukses", 
        JOptionPane.INFORMATION_MESSAGE);


    DefaultTableModel model = (DefaultTableModel) tbl_transaksi.getModel();
    

    for (int i = 0; i < tbl_transaksi.getRowCount(); i++) {

        String nofaktur = model.getValueAt(i, 0).toString();
        String tgl = model.getValueAt(i, 1).toString();
        String item = model.getValueAt(i, 2).toString();
        String qty = model.getValueAt(i, 3).toString();
        String harga = model.getValueAt(i, 4).toString();
        String jumlah = model.getValueAt(i, 5).toString();
        
  
          String sql= "INSERT INTO tbl_penjualan (no_faktur,tgl,item,qty,harga,jumlah) VALUES (?,?,?,?,?,?)";


        ps = conn.prepareStatement(sql);
        ps.setString(1, nofaktur);
        ps.setString(2, tgl);
        ps.setString(3, item);
        ps.setString(4, qty);
        ps.setString(5, harga);
        ps.setString(6, jumlah);
        ps.executeUpdate();
        
      
        menuAry.add(item);
        qtyAry.add(qty);
        hargaAry.add(harga);
        jumlahAry.add(jumlah);
        
    }
    
  
    // Bagian yang di rapikan
    } catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Format angka tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
    
    JOptionPane.showMessageDialog(this, "Transaksi Pembayaran Berhasil", "Penjualan", JOptionPane.INFORMATION_MESSAGE);
    
    } catch (Exception e) {
   
    JOptionPane.showMessageDialog(null, e);
    }
    
    
   
    int konfirmasi = JOptionPane.showConfirmDialog(null, "Cetak Struk?", "Cetak", JOptionPane.YES_NO_OPTION);
    if(konfirmasi == 0) {
  
        PrinterJob pj = PrinterJob.getPrinterJob();        
        pj.setPrintable(new BillPrintable(), getPageFormat(pj));
       
        try {
            pj.print();
            removeAllArray();
        } catch (PrinterException ex) {
            
        }
    } else {
       
        removeAllArray();
    }

    }//GEN-LAST:event_btn_bayarActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void txt_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cashActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txt_cashActionPerformed

    private void txt_cashKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cashKeyTyped
        // TODO add your handling code here:
           char Validasi=evt.getKeyChar();
           char c = evt.getKeyChar();
                 if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
                    evt.consume();
                    
                    
    }
    }//GEN-LAST:event_txt_cashKeyTyped

    private void txt_cashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cashKeyReleased
        // TODO add your handling code here:
    try {
           
            if (!txt_cash.getText().isEmpty()) {
                String cashInput = txt_cash.getText().replaceAll("[^\\d]", "");
                double cashAmount = Double.parseDouble(cashInput);
                DecimalFormat df = new DecimalFormat("#,###");
                df.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("id")));
                txt_cash.setText("Rp " + df.format(cashAmount));
                hitungKembalianOtomatis(cashAmount);
            } else {
                txt_kembali.setText("");
            }
        } catch (NumberFormatException e) {
            txt_kembali.setText("");
        }
    }//GEN-LAST:event_txt_cashKeyReleased

    private void lb_tglAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lb_tglAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_tglAncestorAdded

    private void tbl_transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_transaksiMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)tbl_transaksi.getModel();
        int SelectedRow=tbl_transaksi.getSelectedRow();
        if(SelectedRow!=-1){
            int rowindexmodel=tbl_transaksi.convertColumnIndexToModel(SelectedRow);
            model.removeRow(rowindexmodel);
        }
        HitungTotal();
    }//GEN-LAST:event_tbl_transaksiMouseClicked

    private void txt_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qtyKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_SPACE){
            DefaultTableModel model = (DefaultTableModel)tbl_transaksi.getModel();

          if(txt_menu.getText().equals("")||txt_harga.getText().equals("")||txt_qty.getText().equals("")){
              JOptionPane.showMessageDialog(this, "Gagal menambahkan menu ! ", "Peringatan",JOptionPane.WARNING_MESSAGE);
              
          }else{
              String NoFaktur = lb_faktur.getText();
              String tanggal = lb_tgl.getText();
              String menu = txt_menu.getText();
              int qty = Integer.parseInt(txt_qty.getText());
              String harga = txt_harga.getText();
              String replaceHarga = replaceHarga(harga);
              int jumlah=qty * Integer.parseInt(replaceHarga);
              
            Object[] Rowdata={NoFaktur,tanggal,menu,qty,harga,angkakoma.format(jumlah)};
            model.addRow(Rowdata);
             HitungTotal();
           
            txt_menu.setText("");
            txt_harga.setText("");
            txt_qty.setText("");
            txt_cari.setText("");
            txt_cari.requestFocus();
          }
        }
    }//GEN-LAST:event_txt_qtyKeyPressed

    private void txt_cashKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cashKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_SPACE){
            String totalStr = txt_total.getText().replaceAll("[^\\d]", "");
            String cashStr = txt_cash.getText().replaceAll("[^\\d]", "");
            if(txt_kembali.getText().equals("")){
            simpanTransaksi();


        try {
            double total = Double.parseDouble(totalStr);
            double cash = Double.parseDouble(cashStr);
            double kembalian = cash - total;

            if (kembalian < 0) {
                JOptionPane.showMessageDialog(this, "Uang pembayaran kurang!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }


            DecimalFormat df = new DecimalFormat("#,###");
            df.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("id")));
            String kembalianFormatted = "Rp " + df.format(kembalian);

            txt_kembali.setText(kembalianFormatted);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Format angka tidak valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        JOptionPane.showMessageDialog(this, "Transaksi Pembayaran Berhasil","Penjualan",JOptionPane.INFORMATION_MESSAGE);


            }else{
                try {
                    DefaultTableModel model = (DefaultTableModel) tbl_transaksi.getModel();
                    for (int i=0;i< tbl_transaksi.getRowCount();i++){
                        String nofaktur=model.getValueAt(i, 0).toString();
                        String tgl=model.getValueAt(i, 1).toString();
                        String item=model.getValueAt(i, 2).toString();
                        String qty=model.getValueAt(i, 3).toString();
                        String harga=model.getValueAt(i, 4).toString();
                        String jumlah=model.getValueAt(i, 5).toString();

                        String sql= "INSERT INTO tbl_penjualan (no_faktur,tgl,item,qty,harga,jumlah) VALUES (?,?,?,?,?,?)";
                        ps=conn.prepareStatement(sql);
                        ps.setString(1, nofaktur);
                        ps.setString(2, tgl);
                        ps.setString(3, item);
                        ps.setString(4, qty);
                        ps.setString(5, harga);
                        ps.setString(6, jumlah);
                        ps.executeUpdate();

                        menuAry.add(item);
                        qtyAry.add(qty);
                        hargaAry.add(harga);
                        jumlahAry.add(jumlah);

                    }
                     JOptionPane.showMessageDialog(this, "Transaksi Pembayaran Berhasil","Penjualan",JOptionPane.INFORMATION_MESSAGE);
                    }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
                    int konfirmasi = JOptionPane.showConfirmDialog(null, "Cetak Struk?","Cetak",JOptionPane.YES_NO_OPTION);
                        if(konfirmasi==0){
                        PrinterJob pj = PrinterJob.getPrinterJob();        
                         pj.setPrintable(new BillPrintable(),getPageFormat(pj));
                    try {
                            pj.print();
                            removeAllArray();

                        } catch (PrinterException ex) {
                        }

               }else{
                    removeAllArray();

               }
            }
         }
    }//GEN-LAST:event_txt_cashKeyPressed

    private void TombolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TombolActionPerformed
     int input = JOptionPane.showConfirmDialog(null, "apakah kamu ingin mengedit data ?",
                "konfirmasi",JOptionPane.YES_NO_OPTION);
        
        if(input == 0){
         Data_item1 Di = new Data_item1();
         Di.setLocationRelativeTo(null);
         Di.setVisible(true);
         this.setVisible(false);  } 

    }//GEN-LAST:event_TombolActionPerformed

    private void KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarActionPerformed
    if (JOptionPane.showConfirmDialog(null, "apakah anda yakin ingin keluar ?",
                "konfirmasi",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
        System.exit(0);
    }   // TODO add your handling code here:
    }//GEN-LAST:event_KeluarActionPerformed
       
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
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Hitam;
    private javax.swing.JButton Keluar;
    private javax.swing.JButton Tombol;
    private javax.swing.JPanel Transaksi;
    private javax.swing.JButton btn_bayar;
    private javax.swing.JButton btn_wa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_faktur;
    private javax.swing.JLabel lb_tgl;
    private javax.swing.JTable tbl_menu;
    private javax.swing.JTable tbl_transaksi;
    private javax.swing.JTextField txt_cari;
    private javax.swing.JTextField txt_cash;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_kembali;
    private javax.swing.JTextField txt_menu;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables

    private void showdataitem() {
    DefaultTableModel model = (DefaultTableModel)tbl_menu.getModel();
    model.setRowCount(0);
    String carimenu = txt_cari.getText().trim();
        
    try {
        String sql = "SELECT * FROM tbl_dataitem WHERE nama_item LIKE ? OR Kategori LIKE ?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + carimenu + "%");
        ps.setString(2, "%" + carimenu + "%");
        rs = ps.executeQuery();
            
        while(rs.next()) {
            String kategori = rs.getString("Kategori");
            String nama = rs.getString("nama_item");
            double hargaDb = rs.getDouble("harga");
            
            DecimalFormat df = new DecimalFormat("#,###");
            df.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("id")));
            String harga = "Rp " + df.format(hargaDb);
            
            model.addRow(new Object[]{kategori, nama, harga});
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error database: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     }

            private String replaceHarga(String harga) {
   
                  String hasil = harga.replaceAll("[^\\d]", "");
                 if (hasil.isEmpty()) {
                 return "0";
              }
    
            return hasil;
       
           }
    

    private void HitungTotal() {
    DefaultTableModel model = (DefaultTableModel) tbl_transaksi.getModel();
    int rowCount = model.getRowCount();
    double totalBayar = 0;

    for (int i = 0; i < rowCount; i++) {
        String jumlahStr = model.getValueAt(i, 5).toString();
        String jumlahClean = jumlahStr.replaceAll("[^\\d]", "");
        
        try {
            double jumlah = Double.parseDouble(jumlahClean);
            totalBayar += jumlah;
        } catch (NumberFormatException e) {
            System.err.println("Error parsing amount: " + jumlahStr);
        }
    }

              DecimalFormat df = new DecimalFormat("#,###");
              df.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("id")));
              String totalFormatted = "Rp " + df.format(totalBayar);


             txt_total.setText(totalFormatted);
}            //batas

              private void FormatDesimal(){
                  if(txt_cash.getText().isEmpty()){
                      String ReplaceCash=txt_cash.getText().replaceAll("[^\\d]", "");
                      double FormatDec=Double.parseDouble(ReplaceCash);
                      DecimalFormat decimalFormat =new DecimalFormat("#,###,###");
                      txt_cash.setText(decimalFormat.format(FormatDec));
                         return;
                  }
              }
    
             private void Tampiltanggal(){
             try {

            java.util.Date tgl = new java.util.Date();
            SimpleDateFormat formatTanggal = new SimpleDateFormat("dd MMMM yyyy", new Locale("id", "ID"));
            String tanggalSekarang = formatTanggal.format(tgl);
            SimpleDateFormat formatFaktur = new SimpleDateFormat("yyyyMMdd");
            String tanggalFaktur = formatFaktur.format(tgl);
            String noFaktur = "INV-" + tanggalFaktur + "-001";
            lb_tgl.setText(tanggalSekarang);
            lb_faktur.setText(noFaktur);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error saat menampilkan tanggal: " + e.getMessage());
         }
     }

         private void hitungKembalianOtomatis(double cashAmount) {
             try {
        String totalStr = txt_total.getText().replaceAll("[^\\d]", "");
        double totalAmount = Double.parseDouble(totalStr);
        
        double kembalian = cashAmount - totalAmount;
        
        DecimalFormat df = new DecimalFormat("#,###");
        df.setDecimalFormatSymbols(new DecimalFormatSymbols(new Locale("id")));
        
        if (kembalian < 0) {
            txt_kembali.setText("Uang kurang!");
            txt_kembali.setForeground(Color.RED);
        } else {
            txt_kembali.setText("Rp " + df.format(kembalian));
            txt_kembali.setForeground(Color.BLACK);
        }
        
    } catch (NumberFormatException e) {
        txt_kembali.setText("Error format angka");
        txt_kembali.setForeground(Color.RED);
    }
     
    }
                 
         private void clearForm() {
    DefaultTableModel model = (DefaultTableModel) tbl_transaksi.getModel();
    model.setRowCount(0);
    txt_total.setText("");
    txt_cash.setText("");
    txt_kembali.setText("");
    txt_menu.setText("");
    txt_harga.setText("");
    txt_qty.setText("");
    txt_cari.setText("");
    Tampiltanggal();
}
         
         private void simpanTransaksi() {
    if (txt_kembali.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Mohon masukkan pembayaran terlebih dahulu", 
            "Peringatan", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Connection conn = null;
    PreparedStatement ps = null;
    
    try {
        conn = Config.koneksi1.KoneksiDB();
        conn.setAutoCommit(false);
        
        String sql = "INSERT INTO tbl_penjualan (no_faktur, tgl, item, qty, harga, jumlah) VALUES (?,?,?,?,?,?)";
        ps = conn.prepareStatement(sql);
        
        DefaultTableModel model = (DefaultTableModel) tbl_transaksi.getModel();
        String tanggalDatabase = lb_tgl.getName(); 
        
        for (int i = 0; i < tbl_transaksi.getRowCount(); i++) {
            ps.setString(1, model.getValueAt(i, 0).toString());
            ps.setString(2, tanggalDatabase); 
            ps.setString(3, model.getValueAt(i, 2).toString());
            ps.setInt(4, Integer.parseInt(model.getValueAt(i, 3).toString()));
            ps.setString(5, model.getValueAt(i, 4).toString().replaceAll("[^\\d]", ""));
            ps.setString(6, model.getValueAt(i, 5).toString().replaceAll("[^\\d]", ""));
            ps.addBatch();
        }
        
        ps.executeBatch();
        conn.commit();
        clearForm();
        JOptionPane.showMessageDialog(this, "Transaksi berhasil disimpan", 
            "Sukses", JOptionPane.INFORMATION_MESSAGE);
            
    } catch (Exception e) {
        try {
            if (conn != null) conn.rollback();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, "Error saat menyimpan transaksi: " + e.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (ps != null) ps.close();
            if (conn != null) {
                conn.setAutoCommit(true);
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
      private void reset(){
          DefaultTableModel model=(DefaultTableModel)tbl_transaksi.getModel();
          model.setRowCount(0);
          txt_menu.setText("");
          txt_harga.setText("");
          txt_qty.setText("");
          txt_total.setText("");
          txt_cash.setText("");
          txt_kembali.setText("");
      }    
      
            public PageFormat getPageFormat(PrinterJob pj){

          PageFormat pf = pj.defaultPage();
          Paper paper = pf.getPaper();    

          double bodyHeight = bHeight;  
          double headerHeight = 5.0;                  
          double footerHeight = 5.0;        
          double width = cm_to_pp(8); 
          double height = cm_to_pp(headerHeight+bodyHeight+footerHeight); 
          paper.setSize(width, height);
          paper.setImageableArea(0,10,width,height - cm_to_pp(1));  

          pf.setOrientation(PageFormat.PORTRAIT);  
          pf.setPaper(paper);    

          return pf;
      }
      
      protected static double cm_to_pp(double cm)
    {            
	        return toPPI(cm * 0.393600787);            
    }
 
protected static double toPPI(double inch)
    {            
	        return inch * 72d;            
    }

    private void removeAllArray() {
      menuAry.removeAll(menuAry);
      qtyAry.removeAll(qtyAry);
      hargaAry.removeAll(hargaAry);
      jumlahAry.removeAll(jumlahAry);
    }
    


public class BillPrintable implements Printable {
    
   
    
    
  public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
  throws PrinterException 
  {    
      
      int r= menuAry.size();
      ImageIcon icon=new ImageIcon("C:logo.jpg"); 
      int result = NO_SUCH_PAGE;    
        if (pageIndex == 0) {                    
        
            Graphics2D g2d = (Graphics2D) graphics;                    
            double width = pageFormat.getImageableWidth();                               
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 



            FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
        
        try{
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
            int headerRectHeighta=40;
            
                
            g2d.setFont(new Font("Monospaced",Font.PLAIN,9));
            g2d.drawImage(icon.getImage(), 50, 20, 90, 30, rootPane);y+=yShift+30;
            g2d.drawString("-------------------------------------",12,y);y+=yShift;
            g2d.drawString("               Coffe Shop               ",12,y);y+=yShift;
            g2d.drawString("   Alamat: Jl. TB Simatupang No.Kav.1   ",12,y);y+=yShift;
            g2d.drawString("       RT.3/RW.3, Cilandak Tim.         ",12,y);y+=yShift;
            g2d.drawString("   Ps. Minggu, Kota Jakarta Selatan,    ",12,y);y+=yShift; 
            g2d.drawString("  Daerah Khusus Ibukota Jakarta 12560   ",12,y);y+=yShift;
            g2d.drawString("               @mr.ferd1                ",12,y);y+=yShift;
            
            
            g2d.drawString("-------------------------------------",12,y);y+=headerRectHeight;
            g2d.drawString(" No  : "+lb_faktur.getText()+" ",12,y);y+=yShift;
            g2d.drawString(" Tgl : "+lb_tgl.getText()+" ",12,y);y+=yShift;
            g2d.drawString("-------------------------------------",12,y);y+=headerRectHeight;

            g2d.drawString(" Nama Menu                 Harga   ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=headerRectHeight;
     
            for(int s=0; s<r; s++)
            {
            g2d.drawString(" "+menuAry.get(s)+"                            ",10,y);y+=yShift;
            g2d.drawString("      "+qtyAry.get(s)+" * "+hargaAry.get(s),10,y); g2d.drawString(jumlahAry.get(s),160,y);y+=yShift;

            }
          
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Total belanja:               "+txt_total.getText()+"   ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Tunai      :                 "+txt_cash.getText()+"   ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Kembali    :                 "+txt_kembali.getText()+"   ",10,y);y+=yShift;
  
            g2d.drawString("*************************************",10,y);y+=yShift;
            g2d.drawString("   TERIMA KASIH ATAS KUNJUNGAN ANDA  ",10,y);y+=yShift;
            g2d.drawString("*************************************",10,y);y+=yShift;
            //g2d.drawString("   Mohon, Maaf Barang yang dibeli    ",10,y);y+=yShift;
            //g2d.drawString("    Tidak bisa dikembalikan lagi     ",10,y);y+=yShift;       
           

    }
    catch(Exception e){
    e.printStackTrace();
    }

              result = PAGE_EXISTS;    
          }    
          return result;    
      }
}

}

