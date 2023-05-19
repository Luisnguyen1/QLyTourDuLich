/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GiaodienUI;

import DTo.PhuongTien;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import KetnoiSQL_DAL.config;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh Tran
 */
public class QlyPhuongTien extends javax.swing.JPanel {

    PhuongTien danhSachPT = new PhuongTien();
    DefaultTableModel model = new DefaultTableModel();

    
    public QlyPhuongTien() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < danhSachPT.laySoLuongPhuongTien(); i++) {
            model.addRow(new Object[]{danhSachPT.traPT(i).getBienso(), danhSachPT.traPT(i).getLoaipt(), danhSachPT.traPT(i).getMapt(), danhSachPT.traPT(i).getTongsocho(), danhSachPT.traPT(i).getSochocondu()});
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        cbxLoaiPhuongTien = new javax.swing.JComboBox<>();
        txtTenPhuongTien = new javax.swing.JTextField();
        txtTongSoCho = new javax.swing.JTextField();
        txtSoChoDu = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(167, 169, 177));

        jPanel1.setBackground(new java.awt.Color(167, 169, 177));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 0, 6));
        jLabel1.setText("                                             Hệ Thống Quản Lý Phương Tiện ");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(167, 169, 177));

        cbxLoaiPhuongTien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Loại Phương Tiện", "Xe Bus", "Máy Bay", "Xe Lửa", "Thuyền", " " }));
        cbxLoaiPhuongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLoaiPhuongTienActionPerformed(evt);
            }
        });

        txtTenPhuongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenPhuongTienActionPerformed(evt);
            }
        });

        txtTongSoCho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongSoChoActionPerformed(evt);
            }
        });

        txtSoChoDu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoChoDuActionPerformed(evt);
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

        btnTimKiem.setBackground(new java.awt.Color(21, 110, 71));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(21, 110, 71));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 0, 6));
        jLabel4.setText("   Loại Phương Tiện ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 0, 6));
        jLabel2.setText("   Tên Phương Tiện");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(169, 0, 6));
        jLabel6.setText("        Số Chỗ Dư ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 0, 6));
        jLabel5.setText("      Tổng Số Chỗ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnTimKiem)
                        .addGap(63, 63, 63)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTongSoCho, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoChoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxLoaiPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(99, 99, 99))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSoChoDu, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxLoaiPhuongTien, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenPhuongTien)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTongSoCho, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnTimKiem)
                    .addComponent(btnReset)
                    .addComponent(btnXoa)
                    .addComponent(btnThem))
                .addContainerGap())
        );

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Phương Tiện", "Loại Phương Tiện", "Mã Phương Tiện", "Tổng Số Chỗ", "Số Chỗ Dư"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxLoaiPhuongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLoaiPhuongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLoaiPhuongTienActionPerformed

    private void txtTenPhuongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenPhuongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenPhuongTienActionPerformed

    private void txtTongSoChoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongSoChoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongSoChoActionPerformed

    private void txtSoChoDuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoChoDuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoChoDuActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
    String loaiPT = cbxLoaiPhuongTien.getSelectedItem().toString();   
    String tenPT = txtTenPhuongTien.getText();
    String tongsocho = txtTongSoCho.getText();
    String sochodu = txtSoChoDu.getText();

    if(loaiPT.equals("Chọn Loại Phương Tiện")){
        JOptionPane.showMessageDialog(null,"Chọn Thông Tin Cụ Thể");
    }
    else if(tenPT.equals("")){
        JOptionPane.showMessageDialog(null,"Nhập Đầy Đủ Thông Tin");
    }
    else if(tongsocho.equals("")){
        JOptionPane.showMessageDialog(null,"Nhập Đầy Đủ Thông Tin");
    }
    else if(sochodu.equals("")){
        JOptionPane.showMessageDialog(null,"Nhập Đầy Đủ Thông Tin");
    }
    else {
        long tongSoCho = Long.parseLong(tongsocho);
    long soChoDu = Long.parseLong(sochodu);

        int maxMaPT = danhSachPT.laySoLuongPhuongTien();
        String maPT = "PT" + String.format("%04d", maxMaPT + 1);

        danhSachPT.themPhuongTien(maPT, loaiPT, tenPT, tongSoCho, soChoDu);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.addRow(new Object[]{danhSachPT.traPT(maPT).getBienso(), danhSachPT.traPT(maPT).getLoaipt(), danhSachPT.traPT(maPT).getMapt(), danhSachPT.traPT(maPT).getTongsocho(), danhSachPT.traPT(maPT).getSochocondu()});

        jTable1.setModel(model);

        JOptionPane.showMessageDialog(null, "Thêm Phương Tiện Thành Công");

        txtTenPhuongTien.setText("");
        txtTongSoCho.setText("");
        txtSoChoDu.setText("");
    }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Vui Lòng Chọn Một Hàng Để Xóa");
            return;
        }
        
        String maPT = (String) model.getValueAt(selectedRow,2);
        
        boolean a = danhSachPT.xoaPhuongTien(maPT);
        
        model.removeRow(selectedRow);
        jTable1.setModel(model);
        
        JOptionPane.showMessageDialog(null, "Xóa Phương Tiện Thành Công");
   
// TODO add your handling code h
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       int selectedRow = jTable1.getSelectedRow();
      
       if(selectedRow == -1){
           JOptionPane.showMessageDialog(null, "Vui Lòng Chọn Một Hàng Để Sửa");
                    return;
       }
       
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       
       String maPT = (String) model.getValueAt(selectedRow, 2);
      
       danhSachPT.traPT(maPT);
       JComboBox<String> cbxLoaiPhuongTien = new JComboBox<>();
       cbxLoaiPhuongTien.addItem("Xe Bus");
              cbxLoaiPhuongTien.addItem("Máy Bay");
       cbxLoaiPhuongTien.addItem("Xe Lửa");
       cbxLoaiPhuongTien.addItem("Thuyền");
       cbxLoaiPhuongTien.setSelectedItem(danhSachPT.traPT(maPT).getLoaipt());
       JOptionPane.showMessageDialog(null, cbxLoaiPhuongTien, "Chọn loại phương tiện", JOptionPane.QUESTION_MESSAGE);

       String loaipt = (String) cbxLoaiPhuongTien.getSelectedItem();
       
              String tenpt = JOptionPane.showInputDialog(null, "nhập tên phương tiện", danhSachPT.traPT(maPT).getBienso());
       String maptNew = JOptionPane.showInputDialog(null, "nhập mã phương tiện", danhSachPT.traPT(maPT).getMapt());
        long tongSoCho = Long.parseLong(JOptionPane.showInputDialog(null, "nhập tổng số chỗ", danhSachPT.traPT(maPT).getTongsocho()));
        long sochodu = Long.parseLong(JOptionPane.showInputDialog(null, "nhập số chỗ còn dư", danhSachPT.traPT(maPT).getSochocondu()));

       
       danhSachPT.suaPhuongTien(maPT, maptNew, loaipt, tenpt,tongSoCho , sochodu);
       
       model.setValueAt(loaipt, selectedRow,1 );
       model.setValueAt(tenpt,selectedRow,0);
       model.setValueAt(maptNew, selectedRow,2);
       model.setValueAt(tongSoCho, selectedRow, 3);
              model.setValueAt(sochodu, selectedRow, 4);

       JOptionPane.showMessageDialog(null, "Sửa Thông Tin Phương Tiện Thành Công");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String dkTim = JOptionPane.showInputDialog(null, "Nhập điều kiện tìm !"," ");

// Tạo một danh sách để lưu khách hàng tìm được
       danhSachPT.timPhuongTienUnlimit(dkTim);

// Kiểm tra kết quả tìm kiếm
        if (danhSachPT.timPhuongTienUnlimit(dkTim) == null) {
            JOptionPane.showMessageDialog(null, "Kết Quả Không Tìm Thấy");
        } else {
            // Tạo một model mới để hiển thị kết quả tìm kiếm trên JTable
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Tên Phương Tiện");
            model.addColumn("Loại Phương Tiện");
            model.addColumn("Mã Phương Tiện");
            model.addColumn("Tổng Số Chỗ");
            model.addColumn("Số Chỗ Dư");

            // Thêm các khách hàng tìm được vào model
            for (PhuongTien kh : danhSachPT.timPhuongTienUnlimit(dkTim)) {              
            
                model.addRow(new Object[]{kh.getBienso(), kh.getLoaipt(), kh.getMapt(), kh.getTongsocho(),kh.getSochocondu()});
            }

            // Cập nhật lại model cho JTable
            jTable1.setModel(model);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < danhSachPT.laySoLuongPhuongTien(); i++) {
            model.addRow(new Object[]{danhSachPT.traPT(i).getBienso(), danhSachPT.traPT(i).getLoaipt(), danhSachPT.traPT(i).getMapt(), danhSachPT.traPT(i).getTongsocho(), danhSachPT.traPT(i).getSochocondu()});
        }
        jTable1.setModel(model);
    }//GEN-LAST:event_btnResetActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxLoaiPhuongTien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtSoChoDu;
    private javax.swing.JTextField txtTenPhuongTien;
    private javax.swing.JTextField txtTongSoCho;
    // End of variables declaration//GEN-END:variables
}
