/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GiaodienUI;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import DTo.PhuongTien;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh Tran
 */
public class QlyPhuongTien extends javax.swing.JPanel {

    ArrayList<PhuongTien> danhSachPT = new ArrayList<PhuongTien>();
    /**
     * Creates new form QlyPhuongTien
     */
    public QlyPhuongTien() {
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
        jLabel4 = new javax.swing.JLabel();
        cbxLoaiPhuongTien = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTenPhuongTien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaPhuongTien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTongSoCho = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSoChoDu = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(167, 169, 177));

        jPanel1.setBackground(new java.awt.Color(167, 169, 177));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 0, 6));
        jLabel1.setText("                          Hệ Thống Quản Lý Phương Tiện ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(167, 169, 177));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 0, 6));
        jLabel4.setText("  Loại Phương Tiện ");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbxLoaiPhuongTien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Loại Phương Tiện", "Xe Bus", "Máy Bay", "Xe Lửa", "Thuyền", " " }));
        cbxLoaiPhuongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLoaiPhuongTienActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 0, 6));
        jLabel2.setText("  Tên Phương Tiện");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTenPhuongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenPhuongTienActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 0, 6));
        jLabel3.setText("  Mã Phương Tiện");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMaPhuongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaPhuongTienActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 0, 6));
        jLabel5.setText("     Tổng Số Chỗ");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtTongSoCho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongSoChoActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(169, 0, 6));
        jLabel6.setText("       Số Chỗ Dư ");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        btnXuatExcel.setBackground(new java.awt.Color(21, 110, 71));
        btnXuatExcel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatExcel.setText("Xuất Excel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxLoaiPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXuatExcel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtTongSoCho, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSoChoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(btnTimKiem)
                                        .addGap(31, 31, 31)))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxLoaiPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXuatExcel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhuongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTenPhuongTien, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTongSoCho)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSoChoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTimKiem))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxLoaiPhuongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLoaiPhuongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLoaiPhuongTienActionPerformed

    private void txtTenPhuongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenPhuongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenPhuongTienActionPerformed

    private void txtMaPhuongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaPhuongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaPhuongTienActionPerformed

    private void txtTongSoChoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongSoChoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTongSoChoActionPerformed

    private void txtSoChoDuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoChoDuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoChoDuActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
String loaiPT = cbxLoaiPhuongTien.getSelectedItem().toString();   
String tenPT = txtTenPhuongTien.getText();
String maPT = txtMaPhuongTien.getText();
String tongsocho = txtTongSoCho.getText();
String sochodu = txtSoChoDu.getText();

if(loaiPT.equals("Chọn Loại Phương Tiện")){
    JOptionPane.showMessageDialog(null,"Chọn Thông Tin Cụ Thể");
}
else if(tenPT.equals("")){
    JOptionPane.showMessageDialog(null,"Nhập Đầy Đủ Thông Tin");
}
else if(maPT.equals("")){
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
    PhuongTien pt = new PhuongTien(maPT, loaiPT, tenPT, tongSoCho, soChoDu);
    
    danhSachPT.add(pt);   
    
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    
    model.addRow(new Object[]{pt.getBienso(), pt.getLoaipt(), pt.getMapt(), pt.getTongsocho(), pt.getSochocondu()});
    
    jTable1.setModel(model);
    
    JOptionPane.showMessageDialog(null, "Thêm Phương Tiện Thành Công");
   
    txtTenPhuongTien.setText("");
    txtMaPhuongTien.setText("");
    txtTongSoCho.setText("");
    txtSoChoDu.setText("");

}
// TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null,"Vui Lòng Chọn Một Hàng Để Xóa");
            return;
        }
        
        String maPT = (String) model.getValueAt(selectedRow,2);
        
        PhuongTien phuongTienCanXoa = null;
        for(PhuongTien pt : danhSachPT){
            if(pt.getMapt().equals(maPT)){
                phuongTienCanXoa = pt;
                break;
            }
        }
        
        danhSachPT.remove(phuongTienCanXoa);
        model.removeRow(selectedRow);
        jTable1.setModel(model);
        
        JOptionPane.showMessageDialog(null, "Xóa Phương Tiện Thành Công");
        
        if(phuongTienCanXoa == null){
                    JOptionPane.showMessageDialog(null, "Phương Tiện Không Tồn Tại");
                    return;

        }
   
// TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       int selectedRow = jTable1.getSelectedRow();
      
       if(selectedRow == -1){
           JOptionPane.showMessageDialog(null, "Vui Lòng Chọn Một Hàng Để Sửa");
                    return;
       }
       
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       
       String maPT = (String) model.getValueAt(selectedRow, 2);
       PhuongTien phuongTienCanSua = null;
       for(PhuongTien pt : danhSachPT){
           if(pt.getMapt().equals(maPT)){
               phuongTienCanSua = pt;
               break;
           }
       }
       
       if(phuongTienCanSua == null){
                      JOptionPane.showMessageDialog(null, "Phương Tiện Không Tồn Tại");
            return;
       }
       
       JComboBox<String> cbxLoaiPhuongTien = new JComboBox<>();
       cbxLoaiPhuongTien.addItem("Xe Bus");
              cbxLoaiPhuongTien.addItem("Máy Bay");
       cbxLoaiPhuongTien.addItem("Xe Lửa");
       cbxLoaiPhuongTien.addItem("Thuyền");
       cbxLoaiPhuongTien.setSelectedItem(phuongTienCanSua.getLoaipt());
       JOptionPane.showMessageDialog(null, cbxLoaiPhuongTien, "Chọn loại phương tiện", JOptionPane.QUESTION_MESSAGE);

       String loaipt = (String) cbxLoaiPhuongTien.getSelectedItem();
       
              String tenpt = JOptionPane.showInputDialog(null, "nhập tên phương tiện", phuongTienCanSua.getBienso());
       String mapt = JOptionPane.showInputDialog(null, "nhập mã phương tiện", phuongTienCanSua.getMapt());
        String tongsocho = JOptionPane.showInputDialog(null, "nhập tổng số chỗ", phuongTienCanSua.getTongsocho());
        String sochodu = JOptionPane.showInputDialog(null, "nhập số chỗ còn dư", phuongTienCanSua.getSochocondu());

       
       phuongTienCanSua.setLoaipt(loaipt);
       phuongTienCanSua.setBienso(tenpt);
       phuongTienCanSua.setMapt(mapt);
       long tongSoCho = Long.parseLong(tongsocho);
              long soChoDu = Long.parseLong(sochodu);
       phuongTienCanSua.setTongsocho(tongSoCho);
       phuongTienCanSua.setSochocondu(soChoDu);
       
       model.setValueAt(loaipt, selectedRow,1 );
       model.setValueAt(tenpt,selectedRow,0);
       model.setValueAt(mapt, selectedRow,2);
       model.setValueAt(tongSoCho, selectedRow, 3);
              model.setValueAt(soChoDu, selectedRow, 4);

       JOptionPane.showMessageDialog(null, "Sửa Thông Tin Phương Tiện Thành Công");

        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String maPTCanTim = txtMaPhuongTien.getText();
        
        ArrayList<PhuongTien> ketQuaTimKiem = new ArrayList<>();
        
        for(PhuongTien pt : danhSachPT){
            if(pt.getMapt().toLowerCase().contains(maPTCanTim.toLowerCase())){
                ketQuaTimKiem.add(pt);
            }
            else{
                      JOptionPane.showMessageDialog(null, "Kết Quả Không Tìm Thấy");
            return;
            }
        }
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Tên Phương Tiện");
                model.addColumn("Loại Phương Tiện");
        model.addColumn("Mã Phương Tiện");
        model.addColumn("Tổng Số Chỗ");
        model.addColumn("Số Chỗ Dư");
        
        for(PhuongTien pt : ketQuaTimKiem){
            model.addRow(new Object[]{pt.getBienso(), pt.getLoaipt(), pt.getMapt(), pt.getTongsocho(), pt.getSochocondu()});
        }
        
        jTable1.setModel(model);
// TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JComboBox<String> cbxLoaiPhuongTien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMaPhuongTien;
    private javax.swing.JTextField txtSoChoDu;
    private javax.swing.JTextField txtTenPhuongTien;
    private javax.swing.JTextField txtTongSoCho;
    // End of variables declaration//GEN-END:variables
}
