/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GiaodienUI;

import DTo.ChiTietTourDuLich;
import DTo.Tour;
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
public class TourDuLich_Details extends javax.swing.JPanel {
    ChiTietTourDuLich ctt = new ChiTietTourDuLich();
    config con = new config();
    /**
     * Creates new form TourDuLich_Details
     */
    public TourDuLich_Details() {
        initComponents();
        loadCTTour();
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtDiadiem = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtKhoihanh = new javax.swing.JTextField();
        txtNoiden = new javax.swing.JTextField();
        txtTienan = new javax.swing.JTextField();
        txtTienphong = new javax.swing.JTextField();
        txtPhidichvu = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtThuTuNgay = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(167, 169, 177));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 0, 6));
        jLabel1.setText("                                                    Chi Tiết Tour Du Lịch");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 0, 6));
        jLabel2.setText("      Địa Điểm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 0, 6));
        jLabel4.setText("     Khởi Hành");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 0, 6));
        jLabel5.setText("       Nơi Đến");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        txtDiadiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiadiemActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(169, 0, 6));
        jLabel7.setText("       Tiền Ăn");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(169, 0, 6));
        jLabel8.setText("    Tiền Phòng");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(169, 0, 6));
        jLabel9.setText("    Phí Dịch Vụ");
        jLabel9.setToolTipText("");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        txtTienphong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienphongActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(21, 110, 71));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(21, 110, 71));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
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

        btnTimkiem.setBackground(new java.awt.Color(21, 110, 71));
        btnTimkiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimkiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimkiem.setText("Tìm Kiếm");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Địa Điểm", "Mã Tour", "Khởi Hành", "Nơi Đến", "Thứ Tự Ngày", "Mã Khách Sạn", "Tiền Ăn", "Tiền Phòng", "Phí Dịch Vụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(169, 0, 6));
        jLabel10.setText("   Thứ tự ngày");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNoiden)
                            .addComponent(txtKhoihanh)
                            .addComponent(txtThuTuNgay)
                            .addComponent(txtDiadiem))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTienan, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtTienphong)
                            .addComponent(txtPhidichvu))))
                .addGap(106, 106, 106))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnTimkiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiadiem, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtKhoihanh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNoiden, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtThuTuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnXoa)
                            .addComponent(btnSua)
                            .addComponent(btnTimkiem)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTienphong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPhidichvu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiadiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiadiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiadiemActionPerformed
    
    
    private void txtTienphongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienphongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienphongActionPerformed
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String diaDiem = txtDiadiem.getText();
        String khoiHanh = txtKhoihanh.getText();
        String noiDen = txtNoiden.getText();
        long tienAn = Long.parseLong(txtTienan.getText());
        long tienPhong = Long.parseLong(txtTienphong.getText());
        long phiDV = Long.parseLong(txtPhidichvu.getText());
        int thutungay = Integer.parseInt(txtThuTuNgay.getText());
        
        if(diaDiem.equals("")){
            JOptionPane.showMessageDialog(null,"Vui Lòng Nhập Đầy Đủ Thông Tin");
        }
        else if(khoiHanh.equals("")){
            JOptionPane.showMessageDialog(null,"Vui Lòng Nhập Đầy Đủ Thông Tin");
        }
        else if(noiDen.equals("")){
            JOptionPane.showMessageDialog(null,"Vui Lòng Nhập Đầy Đủ Thông Tin");
        }
        else if(txtTienan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Vui Lòng Nhập Đầy Đủ Thông Tin");
        }
        else if(txtTienphong.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Vui Lòng Nhập Đầy Đủ Thông Tin");
        }
        else if(txtPhidichvu.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Vui Lòng Nhập Đầy Đủ Thông Tin");
        }
        else{
            int maxMaTour = ctt.laySoLuongCTTour();
            String maTour = "CTT" + String.format("%04d", maxMaTour + 1);
            
            int maxMaKS = ctt.laySoLuongCTTour();
            String maKS = "KS" + String.format("%04d", maxMaKS + 1);
            
            ctt.themCTTour(diaDiem, maTour, khoiHanh, noiDen, thutungay, maKS, tienAn, tienPhong, phiDV);
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            model.addRow(new Object[]{ctt.traCTTour(maTour,maKS).getDdtour(),ctt.traCTTour(maTour,maKS).getMatour(),ctt.traCTTour(maTour,maKS).getKhoihanh(),ctt.traCTTour(maTour,maKS).getNoiden(),ctt.traCTTour(maTour,maKS).getThutungay(),ctt.traCTTour(maTour,maKS).getMaks(),ctt.traCTTour(maTour,maKS).getTienan(),ctt.traCTTour(maTour,maKS).getTienphong(),ctt.traCTTour(maTour,maKS).getPhidichvu()});
            
            jTable1.setModel(model);
            
            JOptionPane.showMessageDialog(null, "Thêm Thông Tin Thành Công");
            
            txtDiadiem.setText("");
            txtKhoihanh.setText("");
            txtThuTuNgay.setText("");
            txtNoiden.setText("");
            txtTienan.setText("");
            txtTienphong.setText("");
            txtPhidichvu.setText("");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRow = jTable1.getSelectedRow();     
   
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null, "Vui Lòng Chọn 1 Hàng Để Xóa");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        String MaTour = (String) model.getValueAt(selectedRow, 1);
        
        boolean a = ctt.xoaCTTour(MaTour);
         if (a == false) {
            JOptionPane.showMessageDialog(null, "Tour Không Tồn Tại");
            return;
        }
        model.removeRow(selectedRow);
        jTable1.setModel(model);
        
        JOptionPane.showMessageDialog(null,"Xóa Thành Công");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int selectedRow = jTable1.getSelectedRow();
    
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Vui Lòng Chọn 1 Hàng Để Sửa");
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        String MaTour = (String) model.getValueAt(selectedRow, 1);
        String MaKS = (String) model.getValueAt(selectedRow,5);
        
        ctt.traCTTour(MaTour,MaKS);
        String ddTour = JOptionPane.showInputDialog(null, "Nhập tên địa điểm", ctt.traCTTour(MaTour,MaKS).getDdtour());
        String maTourNew = JOptionPane.showInputDialog(null, "Nhập mã tour", ctt.traCTTour(MaTour,MaKS).getMatour());
        String khoiHanh = JOptionPane.showInputDialog(null, "Nhập địa điểm khởi hành", ctt.traCTTour(MaTour,MaKS).getKhoihanh());
        String noiDen = JOptionPane.showInputDialog(null, "Nhập nơi đến", ctt.traCTTour(MaTour,MaKS).getNoiden());
        String maKS = JOptionPane.showInputDialog(null, "Nhập mã khách sạn", ctt.traCTTour(MaTour,MaKS).getMaks());
        long tienAn = Long.parseLong(JOptionPane.showInputDialog(null, "Nhập tiền ăn", ctt.traCTTour(MaTour,MaKS).getTienan()));
        long tienPhong = Long.parseLong(JOptionPane.showInputDialog(null, "Nhập tiền phòng", ctt.traCTTour(MaTour,MaKS).getTienphong()));
        long phiDV = Long.parseLong(JOptionPane.showInputDialog(null, "Nhập phí dịch vụ", ctt.traCTTour(MaTour,MaKS).getPhidichvu()));
        int thutungay = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhập thứ tự ngày", ctt.traCTTour(MaTour,MaKS).getThutungay()));       

// cập nhật thông tin khách hàng
       ctt.suaCTTour(MaTour, ddTour, maTourNew, khoiHanh, noiDen, thutungay, maKS, tienAn, tienPhong, phiDV);
// cập nhật lại model cho JTable
        model.setValueAt(ddTour, selectedRow, 0);
        model.setValueAt(maTourNew, selectedRow, 1);
        model.setValueAt(khoiHanh, selectedRow, 2);
        model.setValueAt(noiDen, selectedRow, 3);
        model.setValueAt(thutungay, selectedRow, 4);
        model.setValueAt(maKS, selectedRow, 5);
        model.setValueAt(tienAn, selectedRow, 6);
        model.setValueAt(tienPhong, selectedRow, 7);
        model.setValueAt(phiDV, selectedRow,8);
       
// thông báo thành công
        JOptionPane.showMessageDialog(null, "Sửa Thông Tin Thành Công");
                               
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        String dkTim = JOptionPane.showInputDialog(null,"Nhập điều kiện tìm", "");
        
        ctt.timCTTourUnlimit(dkTim);
        
        if(ctt.timCTTourUnlimit(dkTim) == null){
            JOptionPane.showMessageDialog(null, "Kết quả không tìm thấy");
        }else{
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.addColumn("Địa Điểm");
            model.addColumn("Mã Tour");
            model.addColumn("Khởi Hành");
            model.addColumn("Nơi Đến");
            model.addColumn("Thứ Tự Ngày");
            model.addColumn("Mã Khách Sạn");
            model.addColumn("Tiền Ăn");
            model.addColumn("Tiền Phòng");
            model.addColumn("Phí Dịch Vụ");
            
            for(ChiTietTourDuLich a : ctt.timCTTourUnlimit(dkTim)){
                model.addRow(new Object[]{a.getDdtour(),a.getMatour(),a.getKhoihanh(),a.getNoiden(),a.getThutungay(),a.getMaks(),a.getTienan(),a.getTienphong(),a.getPhidichvu()});
            }
            jTable1.setModel(model);
        }
               
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void loadCTTour(){
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0 ; i < ctt.laySoLuongCTTour(); i++) {            
            model.addRow(new Object[]{ctt.traCTTour(i).getDdtour(),ctt.traCTTour(i).getMatour(),ctt.traCTTour(i).getKhoihanh(),ctt.traCTTour(i).getNoiden(),ctt.traCTTour(i).getThutungay(),ctt.traCTTour(i).getMaks(),ctt.traCTTour(i).getTienan(),ctt.traCTTour(i).getTienphong(),ctt.traCTTour(i).getPhidichvu()});
    }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtDiadiem;
    private javax.swing.JTextField txtKhoihanh;
    private javax.swing.JTextField txtNoiden;
    private javax.swing.JTextField txtPhidichvu;
    private javax.swing.JTextField txtThuTuNgay;
    private javax.swing.JTextField txtTienan;
    private javax.swing.JTextField txtTienphong;
    // End of variables declaration//GEN-END:variables
}
