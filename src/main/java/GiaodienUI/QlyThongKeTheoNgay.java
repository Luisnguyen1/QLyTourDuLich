/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GiaodienUI;

import DTo.HoaDon;
import DTo.Tour;
import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh Tran
 */
public class QlyThongKeTheoNgay extends javax.swing.JPanel {

    ArrayList<HoaDon> danhSachHD = new ArrayList<HoaDon>();
    config con = new config();
    DefaultTableModel model = new DefaultTableModel();

    public QlyThongKeTheoNgay() {
        initComponents();
       try {
            danhSachHD = con.layDL_HoaDon();
        } catch (SQLException ex) {
            Logger.getLogger(QlyThongKeTheoNgay.class.getName()).log(Level.SEVERE, null, ex);
        }
       model = (DefaultTableModel) jTable1.getModel();
        
        for (HoaDon nv : danhSachHD) {
            model.addRow(new Object[]{nv.getMahd(), nv.getNgayxuathoadon(), nv.getTongtien()});
            
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
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDoanhThu = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        cbxNgayDi = new javax.swing.JComboBox<>();
        cbxThangDi = new javax.swing.JComboBox<>();
        cbxNamDi = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(167, 169, 177));

        jPanel1.setBackground(new java.awt.Color(167, 169, 177));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 0, 6));
        jLabel1.setText("                                          Thống Kê Doanh Thu Theo Ngày");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 924, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 0, 6));
        jLabel2.setText("Tìm kiếm theo Ngày :");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa Đơn", "Ngày Đặt", "Thành Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 0, 6));
        jLabel3.setText("  Tổng Doanh Thu :");

        txtDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtDoanhThu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDoanhThu.setBorder(null);
        txtDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoanhThuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addComponent(txtDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnTimkiem.setBackground(new java.awt.Color(21, 110, 71));
        btnTimkiem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTimkiem.setForeground(new java.awt.Color(255, 255, 255));
        btnTimkiem.setText("Search");
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        cbxNgayDi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày" }));

        cbxThangDi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        cbxThangDi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxThangDiActionPerformed(evt);
            }
        });

        cbxNamDi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2023" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxNgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(cbxThangDi, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbxNamDi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnTimkiem)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnTimkiem)
                    .addComponent(cbxNgayDi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxThangDi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNamDi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoanhThuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoanhThuActionPerformed

    private void cbxThangDiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxThangDiActionPerformed
        String thang = cbxThangDi.getSelectedItem().toString();
        int day = 0;

        //Những tháng 1,3,5,7,8,10,12 thì có 31 ngày trong năm 2023
        if (thang.equals("1")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 32; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        } else if (thang.equals("3")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 32; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        } else if (thang.equals("5")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 32; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        } else if (thang.equals("7")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 32; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        } else if (thang.equals("8")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 32; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        } else if (thang.equals("10")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 32; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        } else if (thang.equals("12")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 32; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        }

        //Những tháng 4,6,9,11 thì có 30 ngày trong năm 2023
        if (thang.equals("4")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 31; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        } else if (thang.equals("6")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 31; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        } else if (thang.equals("9")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 31; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        } else if (thang.equals("11")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 31; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        }

        //Còn lại là tháng 2 có 28 ngày trong năm 2023
        if (thang.equals("2")) {
            cbxNgayDi.removeAllItems();
            cbxNgayDi.addItem("Ngày");
            for (int i = 1; i < 29; i++) {
                day = i;
                String Day = Integer.toString(day);
                cbxNgayDi.addItem(Day);
                Day = "";
            }
        }
    }//GEN-LAST:event_cbxThangDiActionPerformed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        try {
            danhSachHD = con.layDL_HoaDon();
        } catch (SQLException ex) {
            Logger.getLogger(QlyThongKeTheoNgay.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int ngayDi = Integer.parseInt(cbxNgayDi.getSelectedItem().toString());
        int thangDi = Integer.parseInt(cbxThangDi.getSelectedItem().toString());
        int namDi = Integer.parseInt(cbxNamDi.getSelectedItem().toString());

        Calendar calendar = Calendar.getInstance();
        calendar.set(namDi, thangDi-1, ngayDi);
        Date ngayDiDate = calendar.getTime();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String ngayDiString = dateFormat.format(ngayDiDate);
                
        
        java.sql.Date ngayXuat = new java.sql.Date(ngayDiDate.getTime());
        System.out.println(ngayXuat); 
        
        ArrayList<HoaDon> tempHD = new ArrayList<>();
        for (HoaDon hoaDon : danhSachHD) {
            System.out.println(hoaDon.getNgayxuathoadon());
            
            if (ngayXuat.getDate()== hoaDon.getNgayxuathoadon().getDate() && ngayXuat.getMonth() == hoaDon.getNgayxuathoadon().getMonth() && ngayXuat.getYear()== hoaDon.getNgayxuathoadon().getYear()) {
                tempHD.add(hoaDon);
                System.out.println("Đúng");
            }
            else{   
                System.out.println("Sai");
            }
        }
        model = (DefaultTableModel) jTable1.getModel();
        long tong = 0;
        for (int i = 0; i < model.getRowCount() + 1; i++) {
            model.removeRow(i);
        }
        for (HoaDon nv : tempHD) {
            model.addRow(new Object[]{nv.getMahd(), nv.getNgayxuathoadon(), nv.getTongtien()});
            tong = tong + nv.getTongtien();
        }
        
        txtDoanhThu.setText( Long.toString(tong));
    }//GEN-LAST:event_btnTimkiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JComboBox<String> cbxNamDi;
    private javax.swing.JComboBox<String> cbxNgayDi;
    private javax.swing.JComboBox<String> cbxThangDi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDoanhThu;
    // End of variables declaration//GEN-END:variables
}
