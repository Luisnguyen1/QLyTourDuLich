/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GiaodienUI;

import DTo.HoaDon;
import DTo.NhanVien;
import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh Tran
 */
public class QlyHoaDon extends javax.swing.JPanel {
    ArrayList<HoaDon> danhSachHD = new ArrayList<HoaDon>();
    public QlyHoaDon() {
        initComponents(); 
        try {
            danhSachHD = con.layDL_HoaDon();
        } catch (SQLException ex) {
            Logger.getLogger(QlyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    config con = new config();

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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtMaKhachHang = new javax.swing.JTextField();
        cbxNgayXuat = new javax.swing.JComboBox<>();
        cbxThangXuat = new javax.swing.JComboBox<>();
        cbxNamXuat = new javax.swing.JComboBox<>();
        txtMaHoaDon = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();

        setBackground(new java.awt.Color(167, 169, 177));

        jPanel1.setBackground(new java.awt.Color(167, 169, 177));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 0, 6));
        jLabel1.setText("                                                Hệ Thống Quản Lý Hóa Đơn");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 903, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(167, 169, 177));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 0, 6));
        jLabel2.setText("     Mã Hóa Đơn");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 0, 6));
        jLabel3.setText("  Mã Khách Hàng");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 0, 6));
        jLabel4.setText("       Ngày Xuất ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cbxNgayXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày" }));
        cbxNgayXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNgayXuatActionPerformed(evt);
            }
        });

        cbxThangXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cbxThangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxThangXuatActionPerformed(evt);
            }
        });

        cbxNamXuat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2023" }));
        cbxNamXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNamXuatActionPerformed(evt);
            }
        });

        txtMaHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHoaDonActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnXoa.setBackground(new java.awt.Color(21, 110, 71));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(21, 110, 71));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnExport.setBackground(new java.awt.Color(21, 110, 71));
        btnExport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(21, 110, 71));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(169, 0, 6));
        jLabel8.setText("    Mã nhân viên");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbxNgayXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxThangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxNamXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMaKhachHang)
                    .addComponent(txtMaHoaDon)
                    .addComponent(txtMaNhanVien))
                .addGap(45, 45, 45)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(152, 152, 152))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaKhachHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaNhanVien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbxNgayXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxThangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxNamXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách Hàng", "Mã Nhân Viên", "Ngày Xuất", "Tổng Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 0, 6));
        jLabel5.setText("       Tổng Tiền");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxNgayXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNgayXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNgayXuatActionPerformed

    private void cbxThangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxThangXuatActionPerformed
        // TODO add your handling code here:
         String thang = cbxThangXuat.getSelectedItem().toString();
int day = 0;

//Những tháng 1,3,5,7,8,10,12 thì có 31 ngày trong năm 2023
if(thang.equals("1")){
    cbxNgayXuat.removeAllItems();
    cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("3")){
    cbxNgayXuat.removeAllItems();
cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("5")){
    cbxNgayXuat.removeAllItems();
cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("7")){
    cbxNgayXuat.removeAllItems();
cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("8")){
    cbxNgayXuat.removeAllItems();
cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("10")){
    cbxNgayXuat.removeAllItems();
cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("12")){
    cbxNgayXuat.removeAllItems();
cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 32 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}

//Những tháng 4,6,9,11 thì có 30 ngày trong năm 2023
if(thang.equals("4")){
    cbxNgayXuat.removeAllItems();
cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("6")){
    cbxNgayXuat.removeAllItems();
cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("9")){
    cbxNgayXuat.removeAllItems();
cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}
else if(thang.equals("11")){
    cbxNgayXuat.removeAllItems();
cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 31 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}

//Còn lại là tháng 2 có 28 ngày trong năm 2023
if(thang.equals("2")){
    cbxNgayXuat.removeAllItems();
    cbxNgayXuat.addItem("Ngày");
    for(int i = 1 ; i < 29 ; i++){
        day = i;
        String Day = Integer.toString(day);
        cbxNgayXuat.addItem(Day);
        Day = "";
    }
}
    }//GEN-LAST:event_cbxThangXuatActionPerformed

    private void cbxNamXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNamXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNamXuatActionPerformed

    private void txtMaHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHoaDonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHoaDonActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
       String maNVCanTim = txtMaHoaDon.getText();

        // Tạo một danh sách để lưu khách hàng tìm được
        ArrayList<HoaDon> ketQuaTimKiem = new ArrayList<>();

        // Lặp qua danh sách khách hàng hiện tại để tìm kiếm
        for (HoaDon nv : danhSachHD) {
            if (nv.getMahd().toLowerCase().contains(maNVCanTim.toLowerCase())) {
                ketQuaTimKiem.add(nv);
            } else {
                JOptionPane.showMessageDialog(null, "Kết Quả Không Tìm Thấy");
                return;
            }
        }

        // Tạo một model mới để hiển thị kết quả tìm kiếm trên JTable
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã hóa đơn");
        model.addColumn("Mã khách hàng");
        model.addColumn("Mã nhân viên");
        model.addColumn("Ngày xuất");
         model.addColumn("Tổng tiền");

        // Thêm các khách hàng tìm được vào model
        for (HoaDon nv : ketQuaTimKiem) {
            model.addRow(new Object[]{nv.getMahd(), nv.getMakhachdatve(), nv.getManv(), nv.getNgayxuathoadon(), nv.getTongtien()});
        }

        // Cập nhật lại model cho JTable
        jTable1.setModel(model);

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        
        int selectedRow = jTable1.getSelectedRow();

// nếu không có hàng nào được chọn, thông báo lỗi và kết thúc
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Vui Lòng Chọn Một Hàng Để Xóa");
            return;
        }

// lấy ra model của JTable hiện tại
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

// lấy mã khách hàng của hàng được chọn
        String maNV = (String) model.getValueAt(selectedRow, 1);

// tìm khách hàng trong danh sách dựa vào mã
        HoaDon nhanVienCanXoa = null;
        for (HoaDon nv : danhSachHD) {
            if (nv.getMahd().equals(maNV)) {
                nhanVienCanXoa = nv;
                break;
            }
        }

// nếu không tìm thấy khách hàng, thông báo lỗi và kết thúc
        if (nhanVienCanXoa == null) {
            JOptionPane.showMessageDialog(null, "Hóa đơn Không Tồn Tại");
            return;
        }

// xóa khách hàng khỏi danh sách
        danhSachHD.remove(nhanVienCanXoa);

// xóa hàng được chọn trong model
        model.removeRow(selectedRow);

// cập nhật lại model cho JTable
        jTable1.setModel(model);

// thông báo thành công
        JOptionPane.showMessageDialog(null, "Xóa Hóa Đơn Thành Công");

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // lấy chỉ số hàng được chọn trong JTable
       
        int selectedRow = jTable1.getSelectedRow();

// nếu không có hàng nào được chọn, thông báo lỗi và kết thúc
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Vui Lòng Chọn Một Hàng Để Sửa");
            return;
        }

// lấy ra model của JTable hiện tại
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

// lấy mã khách hàng của hàng được chọn
        String maNV = (String) model.getValueAt(selectedRow, 1);
        String oldNV = maNV;
// tìm khách hàng trong danh sách dựa vào mã
        HoaDon nhanVienCanSua = null;
        for (HoaDon nv : danhSachHD) {
            if (nv.getMahd().equals(maNV)) {
                nhanVienCanSua = nv;
                break;
            }
        }

// nếu không tìm thấy khách hàng, thông báo lỗi và kết thúc
        if (nhanVienCanSua == null) {
            JOptionPane.showMessageDialog(null, "Hóa Đơn Không Tồn Tại");
            return;
        }

// hiển thị form sửa thông tin khách hàng
        String maKH = JOptionPane.showInputDialog(null, "Nhập mã khách hàng", nhanVienCanSua.getMakhachdatve());
        String maNVien = JOptionPane.showInputDialog(null, "Nhập mã nhân viên", nhanVienCanSua.getManv());
        String maHDnew = JOptionPane.showInputDialog(null, "Nhập mã hóa đơn", maNV);
        String tongtien = JOptionPane.showInputDialog(null, "Nhập tổng tiền", nhanVienCanSua.getTongtien());
        long tongtienLong = Long.parseLong(tongtien);
// thêm ComboBox để chọn loại nhân viên
        JComboBox<String> cbxNamXuat = new JComboBox<>();
        cbxNamXuat.addItem("2023");

        cbxNamXuat.setSelectedItem(nhanVienCanSua.getNgayxuathoadon());

        JOptionPane.showMessageDialog(null, cbxNamXuat, "Chọn năm xuất", JOptionPane.QUESTION_MESSAGE);
        String namDiString = (String) cbxNamXuat.getSelectedItem();
        int namDi = Integer.parseInt(namDiString);

        JComboBox<String> cbxThangXuat = new JComboBox<>();
        int day = 0;
        for (int i = 1; i < 13; i++) {
            day = i;
            String Day = Integer.toString(day);
            cbxThangXuat.addItem(Day);
            Day = "";
        }
        cbxThangXuat.setSelectedItem(nhanVienCanSua.getNgayxuathoadon());
        JOptionPane.showMessageDialog(null, cbxThangXuat, "Chọn Tháng xuất", JOptionPane.QUESTION_MESSAGE);
        String TDiString = (String) cbxThangXuat.getSelectedItem();
        int ThangDi = Integer.parseInt(TDiString);

        JComboBox<String> cbxNgayXuat = new JComboBox<>();
        for (int i = 1; i < 32; i++) {
            String Day = Integer.toString(i);
            cbxNgayXuat.addItem(Day);
            Day = "";
        }
        cbxNgayXuat.setSelectedItem(nhanVienCanSua.getNgayxuathoadon());
        JOptionPane.showMessageDialog(null, cbxNgayXuat, "Chọn Ngày xuất", JOptionPane.QUESTION_MESSAGE);
        String ngaydi = (String) cbxNgayXuat.getSelectedItem();
        int ngayDi = Integer.parseInt(ngaydi);
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(namDi, ThangDi - 1, ngayDi);
        Date ngayDiDate = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngayDiString = dateFormat.format(ngayDiDate);
 
// cập nhật thông tin khách hàng
        nhanVienCanSua.setMahd(maHDnew);
        nhanVienCanSua.setMakhachdatve(maKH);
        nhanVienCanSua.setNgayxuathoadon(ngayDiDate);
        nhanVienCanSua.setTongtien(tongtienLong);   
        nhanVienCanSua.setManv(maNVien);
// cập nhật lại model cho JTable
        model.setValueAt(maHDnew, selectedRow, 0);
        model.setValueAt(maKH, selectedRow, 1);
        model.setValueAt(maNVien, selectedRow, 2);
        model.setValueAt(ngayDiDate, selectedRow, 3);
        model.setValueAt(tongtienLong, selectedRow, 4);
        


// thông báo thành công
        JOptionPane.showMessageDialog(null, "Sửa Thông Tin Hóa Đơn Thành Công");

    }//GEN-LAST:event_btnSuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxNamXuat;
    private javax.swing.JComboBox<String> cbxNgayXuat;
    private javax.swing.JComboBox<String> cbxThangXuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtMaKhachHang;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
