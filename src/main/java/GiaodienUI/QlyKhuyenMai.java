/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GiaodienUI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DTo.KhuyenMai;
import java.util.ArrayList;
/**
 *
 * @author Thanh Tran
 */
public class QlyKhuyenMai extends javax.swing.JPanel {

  
    ArrayList<KhuyenMai> danhSachKM = new ArrayList<>();
    /**
     * Creates new form QlyKhuyenMai
     */
    public QlyKhuyenMai() {
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenKhuyenMai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaKhuyenMai = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxNgayKhuyenMai = new javax.swing.JComboBox<>();
        cbxThangKhuyenMai = new javax.swing.JComboBox<>();
        cbxNamKhuyenMai = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbxNgayHanSuDung = new javax.swing.JComboBox<>();
        cbxThangHanSuDung = new javax.swing.JComboBox<>();
        cbxNamHanSuDung = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtTienGiam = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("                           Hệ Thống Quản Lý Khuyến Mãi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addGap(78, 78, 78))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText(" Tên Khuyến Mãi");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTenKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenKhuyenMaiActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText(" Mã Khuyến Mãi");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMaKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaKhuyenMaiActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("  Ngày Khuyến Mãi");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbxNgayKhuyenMai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày" }));
        cbxNgayKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNgayKhuyenMaiActionPerformed(evt);
            }
        });

        cbxThangKhuyenMai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbxThangKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxThangKhuyenMaiActionPerformed(evt);
            }
        });

        cbxNamKhuyenMai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2023" }));
        cbxNamKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNamKhuyenMaiActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("      Hạn Sử Dụng");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbxNgayHanSuDung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày" }));
        cbxNgayHanSuDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNgayHanSuDungActionPerformed(evt);
            }
        });

        cbxThangHanSuDung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbxThangHanSuDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxThangHanSuDungActionPerformed(evt);
            }
        });

        cbxNamHanSuDung.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2023" }));
        cbxNamHanSuDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNamHanSuDungActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText(" Tiền Giảm");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTienGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienGiamActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        btnThem.setBackground(new java.awt.Color(255, 0, 0));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 0, 0));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa\n");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 0, 0));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(255, 0, 0));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("/");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("/");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("/");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("/");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTenKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbxNgayKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxNgayHanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(cbxThangKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMaKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxNamKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cbxThangHanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxNamHanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(87, 87, 87)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(75, 75, 75)
                                    .addComponent(btnTimKiem))
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTienGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxNgayKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxThangKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNamKhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxNgayHanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxThangHanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNamHanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtTienGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTimKiem))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Khuyến Mãi", "Mã Khuyến Mãi", "Ngày Khuyến Mãi", "Hạn Sử Dụng", "Tiền Giảm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTenKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenKhuyenMaiActionPerformed

    private void txtMaKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaKhuyenMaiActionPerformed

    private void cbxNgayKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNgayKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNgayKhuyenMaiActionPerformed

    private void cbxThangKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxThangKhuyenMaiActionPerformed
        // TODO add your handling code here:
        String thang = cbxThangKhuyenMai.getSelectedItem().toString();
int day = 0;

//Những tháng 1,3,5,7,8,10,12 thì có 31 ngày trong năm 2023
if(thang.equals("1")){
    cbxNgayKhuyenMai.removeAllItems();
    cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("3")){
    cbxNgayKhuyenMai.removeAllItems();
cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("5")){
    cbxNgayKhuyenMai.removeAllItems();
cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("7")){
    cbxNgayKhuyenMai.removeAllItems();
cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("8")){
    cbxNgayKhuyenMai.removeAllItems();
cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("10")){
    cbxNgayKhuyenMai.removeAllItems();
cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("12")){
    cbxNgayKhuyenMai.removeAllItems();
cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}

//Những tháng 4,6,9,11 thì có 30 ngày trong năm 2023
if(thang.equals("4")){
    cbxNgayKhuyenMai.removeAllItems();
cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("6")){
    cbxNgayKhuyenMai.removeAllItems();
cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("9")){
    cbxNgayKhuyenMai.removeAllItems();
cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("11")){
    cbxNgayKhuyenMai.removeAllItems();
cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}

//Còn lại là tháng 2 có 28 ngày trong năm 2023
if(thang.equals("2")){
    cbxNgayKhuyenMai.removeAllItems();
    cbxNgayKhuyenMai.addItem("Ngày");
    for(int i = 1 ; i < 29 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayKhuyenMai.addItem(Day);
        Day = "";
    }
}

    }//GEN-LAST:event_cbxThangKhuyenMaiActionPerformed

    private void cbxNamKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNamKhuyenMaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNamKhuyenMaiActionPerformed

    private void cbxNgayHanSuDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNgayHanSuDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNgayHanSuDungActionPerformed

    private void cbxThangHanSuDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxThangHanSuDungActionPerformed
        // TODO add your handling code here:
        String thang = cbxThangHanSuDung.getSelectedItem().toString();
int day = 0;

//Những tháng 1,3,5,7,8,10,12 thì có 31 ngày trong năm 2023
if(thang.equals("1")){
    cbxNgayHanSuDung.removeAllItems();
    cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("3")){
    cbxNgayHanSuDung.removeAllItems();
cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("5")){
    cbxNgayHanSuDung.removeAllItems();
cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("7")){
    cbxNgayHanSuDung.removeAllItems();
cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("8")){
    cbxNgayHanSuDung.removeAllItems();
cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("10")){
    cbxNgayHanSuDung.removeAllItems();
cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("12")){
    cbxNgayHanSuDung.removeAllItems();
cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}

//Những tháng 4,6,9,11 thì có 30 ngày trong năm 2023
if(thang.equals("4")){
    cbxNgayHanSuDung.removeAllItems();
cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("6")){
    cbxNgayHanSuDung.removeAllItems();
cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("9")){
    cbxNgayHanSuDung.removeAllItems();
cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("11")){
    cbxNgayHanSuDung.removeAllItems();
cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}

//Còn lại là tháng 2 có 28 ngày trong năm 2023
if(thang.equals("2")){
    cbxNgayHanSuDung.removeAllItems();
    cbxNgayHanSuDung.addItem("Ngày");
    for(int i = 1 ; i < 29 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayHanSuDung.addItem(Day);
        Day = "";
    }
}
    }//GEN-LAST:event_cbxThangHanSuDungActionPerformed

    private void cbxNamHanSuDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNamHanSuDungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNamHanSuDungActionPerformed

    private void txtTienGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienGiamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienGiamActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
       try{
        String tenKM = txtTenKhuyenMai.getText();
        String maKM = txtMaKhuyenMai.getText();
        long tienGiam = Long.parseLong(txtTienGiam.getText());
        int ngayKM = Integer.parseInt(cbxNgayKhuyenMai.getSelectedItem().toString());
        int thangKM = Integer.parseInt(cbxThangKhuyenMai.getSelectedItem().toString());
        int namKM = Integer.parseInt(cbxNamKhuyenMai.getSelectedItem().toString());
        int ngayHSD = Integer.parseInt(cbxNgayHanSuDung.getSelectedItem().toString());
        int thangHSD = Integer.parseInt(cbxThangHanSuDung.getSelectedItem().toString());
        int namHSD = Integer.parseInt(cbxNamHanSuDung.getSelectedItem().toString());
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(namKM,thangKM - 1,ngayKM);
        Date ngayKMDate = calendar.getTime();
        calendar.set(namHSD,thangHSD - 1,ngayHSD);
        Date hanSDDate = calendar.getTime();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngayKMString = dateFormat.format(ngayKMDate);
        String hanSDString = dateFormat.format(hanSDDate);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       
        KhuyenMai km = new KhuyenMai(maKM,tenKM,ngayKM,ngayHSD,tienGiam);
       
        model.addRow(new Object[]{km.getMakm(),km.getTenkm(),ngayKMString, hanSDString, km.getTiengiam()});
        
        jTable1.setModel(model);
        
                   JOptionPane.showMessageDialog(null,"Thêm Khuyến Mãi Thành Công");
                   
        txtTenKhuyenMai.setText("");
                txtMaKhuyenMai.setText("");
        txtTienGiam.setText("");
        
       }catch(NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Vui Lòng Nhập Đầy Đủ Thông Tin Và Kiểm Tra Lại");
       }
        
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
         int selectedRow = jTable1.getSelectedRow();
        
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null, "Vui Lòng Chọn 1 Hàng Để Xóa");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        String maKM = (String) model.getValueAt(selectedRow, 1);
        
        KhuyenMai khuyenMaiCanXoa = null;
        for(KhuyenMai km : danhSachKM){
            if(km.getMakm().equals(maKM)){
                khuyenMaiCanXoa = km;
                break;
            }
        }
        
        if(khuyenMaiCanXoa == null){
            JOptionPane.showMessageDialog(null,"Khuyến Mãi Không Tồn Tại");
        }
        
        danhSachKM.remove(khuyenMaiCanXoa);
        model.removeRow(selectedRow);
        
        jTable1.setModel(model);
        
        JOptionPane.showMessageDialog(null,"Xóa Khuyến Mãi Thành Công");
       
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxNamHanSuDung;
    private javax.swing.JComboBox<String> cbxNamKhuyenMai;
    private javax.swing.JComboBox<String> cbxNgayHanSuDung;
    private javax.swing.JComboBox<String> cbxNgayKhuyenMai;
    private javax.swing.JComboBox<String> cbxThangHanSuDung;
    private javax.swing.JComboBox<String> cbxThangKhuyenMai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMaKhuyenMai;
    private javax.swing.JTextField txtTenKhuyenMai;
    private javax.swing.JTextField txtTienGiam;
    // End of variables declaration//GEN-END:variables
}
