/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GiaodienUI;

import DTo.VeTour;
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
public class DSachVeTourDaBan extends javax.swing.JPanel {
    ArrayList<VeTour> danhSachVT = new ArrayList<>();
    /**
     * Creates new form DSachVeTourDaBan
     */
    public DSachVeTourDaBan() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        txtMaVeTour = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(167, 169, 177));

        jPanel1.setBackground(new java.awt.Color(167, 169, 177));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 0, 6));
        jLabel1.setText("                                                  Danh Sách Vé Tour Đã Bán");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Vé Tour", "Mã Tour", "Mã Khách Hàng", "Ngày Đặt Vé", "Hạn Sử Dụng", "Tiền Vé Giảm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        btnExport.setBackground(new java.awt.Color(21, 110, 71));
        btnExport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("Export");

        btnTimKiem.setBackground(new java.awt.Color(21, 110, 71));
        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMaVeTour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTimKiem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 217, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMaVeTour)
                        .addGap(1, 1, 1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTimKiem)
                        .addComponent(btnXoa)
                        .addComponent(btnSua)
                        .addComponent(btnExport)))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRow = jTable1.getSelectedRow(); 
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null, "Vui Lòng Chọn 1 Hàng Để Xóa");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        String maVT = (String) model.getValueAt(selectedRow, 0);
        
        VeTour veTourCanXoa = null;
        for(VeTour vt : danhSachVT){
            if(vt.getMavetour().equals(maVT)){
                veTourCanXoa = vt;
                break;
            }
        }

        if(veTourCanXoa == null){
            JOptionPane.showMessageDialog(null,"Vé Tour Không Tồn Tại");
        }
        
        danhSachVT.remove(veTourCanXoa);
        model.removeRow(selectedRow);
        
        jTable1.setModel(model);
        
        JOptionPane.showMessageDialog(null,"Xóa Vé Tour Thành Công");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
       int selectedRow = jTable1.getSelectedRow();
        
       
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(null, "Vui Lòng Chọn 1 Hàng Để Sửa");
        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        String maVT = (String) model.getValueAt(selectedRow,0);
        String old = maVT;
        VeTour veTourCanSua = null;
        for(VeTour vt : danhSachVT){
            if(vt.getMavetour().equals(maVT)){
                veTourCanSua = vt;
                break;
            }
        }
        
        
        if(veTourCanSua == null){
            JOptionPane.showMessageDialog(null,"Vé Tour Không Tồn Tại");
        }
        
        String MaVT = JOptionPane.showInputDialog(null,"Nhập mã vé tour",veTourCanSua.getMavetour());
        String MaTour = JOptionPane.showInputDialog(null,"Nhập mã tour",veTourCanSua.getMatour());
    
        String TienGiam = JOptionPane.showInputDialog(null,"Nhập tiền vé giảm",veTourCanSua.getTiengiam());
       
        JComboBox<String> NgayDV = new JComboBox<>();
        for(int i = 1 ; i < 32 ; i++){
            NgayDV.addItem(Integer.toString(i));
        }
        NgayDV.setSelectedItem(veTourCanSua.getNgaydatve());
        JOptionPane.showMessageDialog(null,NgayDV,"Chọn ngày đặt vé",JOptionPane.QUESTION_MESSAGE);
        int ngayDV = Integer.parseInt(NgayDV.getSelectedItem().toString());
        
        JComboBox<String> ThangDV = new JComboBox<>();
        for(int i = 1 ; i < 13 ; i++){
            ThangDV.addItem(Integer.toString(i));
        }
        ThangDV.setSelectedItem(veTourCanSua.getNgaydatve());
        JOptionPane.showMessageDialog(null, ThangDV,"Chọn tháng đặt vé",JOptionPane.QUESTION_MESSAGE);
                int thangDV = Integer.parseInt(ThangDV.getSelectedItem().toString());

        JComboBox<String> NamDV = new JComboBox<>();
        NamDV.addItem("2023");
        NamDV.setSelectedItem(veTourCanSua.getNgaydatve());
        JOptionPane.showMessageDialog(null, NamDV,"Chọn năm đặt vé",JOptionPane.QUESTION_MESSAGE);
                int namDV = Integer.parseInt(NamDV.getSelectedItem().toString());

        JComboBox<String> NgayHSD = new JComboBox<>();
        for(int i = 1 ; i < 32 ; i++){
            NgayHSD.addItem(Integer.toString(i));
        }
        NgayHSD.setSelectedItem(veTourCanSua.getHansudung());
        JOptionPane.showMessageDialog(null, NgayHSD,"Chọn ngày hạn sử dụng",JOptionPane.QUESTION_MESSAGE);
                int ngayHSD = Integer.parseInt(NgayHSD.getSelectedItem().toString());

        JComboBox<String> ThangHSD = new JComboBox<>();
        for(int i = 1 ; i < 13 ; i++){
            ThangHSD.addItem(Integer.toString(i));
        }
        ThangHSD.setSelectedItem(veTourCanSua.getHansudung());
        JOptionPane.showMessageDialog(null, ThangHSD,"Chọn tháng hạn sử dụng",JOptionPane.QUESTION_MESSAGE);
                int thangHSD = Integer.parseInt(ThangHSD.getSelectedItem().toString());

        JComboBox<String> NamHSD = new JComboBox<>();
        NamHSD.addItem("2023");
        NamHSD.setSelectedItem(veTourCanSua.getHansudung());
        JOptionPane.showMessageDialog(null, NamHSD,"Chọn năm hạn sử dụng",JOptionPane.QUESTION_MESSAGE);
                int namHSD = Integer.parseInt(NamHSD.getSelectedItem().toString());
        
        Calendar calendar = Calendar.getInstance();
        calendar.set(namDV,thangDV ,ngayDV);
        Date ngayDVDate = calendar.getTime();
        calendar.set(namHSD,thangHSD,ngayHSD);
        Date hanSDDate = calendar.getTime();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngayDVString = dateFormat.format(ngayDVDate);
        String hanSDString = dateFormat.format(hanSDDate);
        
        veTourCanSua.setMavetour(MaVT);
                veTourCanSua.setMatour(MaTour);
 
        veTourCanSua.setTiengiam(Long.parseLong(TienGiam));
        veTourCanSua.setNgaydatve(ngayDVDate);
        veTourCanSua.setHansudung(hanSDDate);

        model.setValueAt(MaVT,selectedRow,0);
        model.setValueAt(MaTour,selectedRow,1);
       
        model.setValueAt(TienGiam,selectedRow,4);
        model.setValueAt(ngayDVString,selectedRow,2);
        model.setValueAt(hanSDString,selectedRow,3);
        
        jTable1.setModel(model);
   
        JOptionPane.showMessageDialog(null,"Sửa Thông Tin Vé Tour Thành Công");
        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String maNVCanTim = txtMaVeTour.getText();

        // Tạo một danh sách để lưu khách hàng tìm được
        ArrayList<VeTour> ketQuaTimKiem = new ArrayList<>();

        // Lặp qua danh sách khách hàng hiện tại để tìm kiếm
        // Lặp qua danh sách khách hàng hiện tại để tìm kiếm
        for (VeTour nv : danhSachVT) {
            if (nv.getMavetour().toLowerCase().contains(maNVCanTim.toLowerCase())) {
                ketQuaTimKiem.add(nv);
            }
        }

// Kiểm tra kết quả tìm kiếm
        if (ketQuaTimKiem.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kết Quả Không Tìm Thấy");
        } else {

        // Tạo một model mới để hiển thị kết quả tìm kiếm trên JTable
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã vé Tour");
        model.addColumn("Mã Tour");
      
        model.addColumn("Ngày đặt vé");
        model.addColumn("Hạn sử dụng");
        model.addColumn("Tiền vé giảm");
        

        // Thêm các khách hàng tìm được vào model
        for (VeTour vt : ketQuaTimKiem) {
             model.addRow(new Object[]{vt.getMavetour(), vt.getMatour(), ngayDVString, hanSDString, vt.getTiengiam()});
        }

        // Cập nhật lại model cho JTable
        jTable1.setModel(model);
    }       
    }//GEN-LAST:event_btnTimKiemActionPerformed

     private String ngayDVString;
    private String hanSDString;
    private Date ngayDiDate;
    private Date ngayVeDate;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMaVeTour;
    // End of variables declaration//GEN-END:variables
}
