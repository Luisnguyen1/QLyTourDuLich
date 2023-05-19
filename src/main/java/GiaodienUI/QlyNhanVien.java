package GiaodienUI;

import DTo.NhanVien;
import Excel.ExportExcel;
import Excel.ImportExcel;
import KetnoiSQL_DAL.config;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import static org.apache.poi.hssf.usermodel.HeaderFooter.file;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class QlyNhanVien extends javax.swing.JPanel {
    NhanVien danhSachNV = new NhanVien();
    DefaultTableModel model = new DefaultTableModel();

   

    /**
     * Creates new form QlyNhanVien
     */
    public QlyNhanVien() {
        initComponents();
        
        model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < danhSachNV.laySoLuongNhanVien(); i++) {
            model.addRow(new Object[]{danhSachNV.traNV(i).getTennv(), danhSachNV.traNV(i).getManv(), danhSachNV.traNV(i).getDiachi(), danhSachNV.traNV(i).getLoainv(), danhSachNV.traNV(i).getChucvu()});
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
        txtHoTen = new javax.swing.JTextField();
        txtMaNhanVien = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        cbxLoaiNhanVien = new javax.swing.JComboBox<>();
        cbxChucVu = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnImport = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();

        setBackground(new java.awt.Color(167, 169, 177));

        jPanel1.setBackground(new java.awt.Color(167, 169, 177));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 0, 6));
        jLabel1.setText("                                              Hệ Thống Quản Lý Nhân Viên");

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(167, 169, 177));

        txtHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoTenActionPerformed(evt);
            }
        });

        txtMaNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNhanVienActionPerformed(evt);
            }
        });

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        cbxLoaiNhanVien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại Nhân Viên", "Nhân Viên Bán Hàng", "Quản Lý Kho", "Nhân Viên Văn Phòng", " " }));
        cbxLoaiNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLoaiNhanVienActionPerformed(evt);
            }
        });

        cbxChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chức Vụ", "Nhân Viên", "Quản Lý", " " }));
        cbxChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxChucVuActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        btnThem.setBackground(new java.awt.Color(21, 110, 71));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm ");
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

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 0, 6));
        jLabel2.setText("      Họ và Tên");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 0, 6));
        jLabel3.setText("   Mã Nhân Viên");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 0, 6));
        jLabel4.setText("        Địa Chỉ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
        );

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 0, 6));
        jLabel5.setText("  Loại Nhân Viên");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(169, 0, 6));
        jLabel6.setText("       Chức Vụ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxLoaiNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(142, 142, 142)))
                .addGap(0, 156, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(btnTimKiem))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(104, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(95, 95, 95)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbxLoaiNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addGap(61, 61, 61))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxChucVu)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem)
                            .addComponent(btnSua)
                            .addComponent(btnXoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnTimKiem)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(186, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(73, 73, 73)))
        );

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ và Tên", "Mã Nhân Viên", "Địa Chỉ", "Loại Nhân Viên", "Chức Vụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnImport.setBackground(new java.awt.Color(21, 110, 71));
        btnImport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImport.setForeground(new java.awt.Color(255, 255, 255));
        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnImport, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExport)
                    .addComponent(btnImport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoTenActionPerformed

    private void txtMaNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNhanVienActionPerformed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void cbxLoaiNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLoaiNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLoaiNhanVienActionPerformed

    private void cbxChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxChucVuActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        
        String maNV = txtMaNhanVien.getText();
        String hoTen = txtHoTen.getText();
        String diaChi = txtDiaChi.getText();
        String loaiNV = cbxLoaiNhanVien.getSelectedItem().toString();
        String chucVu = cbxChucVu.getSelectedItem().toString();

        if (maNV.equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập Đầy Đủ Thông Tin");
        } else if (hoTen.equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập Đầy Đủ Thông Tin");
        } else if (diaChi.equals("")) {
            JOptionPane.showMessageDialog(null, "Nhập Đầy Đủ Thông Tin");
        } else if (loaiNV.equals("Loại Nhân Viên")) {
            JOptionPane.showMessageDialog(null, "Chọn Thông Tin Cụ Thể");
        } else if (chucVu.equals("Chức Vụ")) {
            JOptionPane.showMessageDialog(null, "Chọn Thông Tin Cụ Thể");
        } else {
       
           

       
            danhSachNV.themNhanVien(maNV, maNV, diaChi, loaiNV, chucVu);
            // Tạo đối tượng DefaultTableModel


            // thêm đối tượng KhachHang vào model
            model.addRow(new Object[]{nv.getTennv(), nv.getManv(), nv.getDiachi(), nv.getLoainv(), nv.getChucvu()});

// cập nhật lại model cho JTable
            jTable1.setModel(model);

// thông báo thành công
            JOptionPane.showMessageDialog(null, "Thêm Nhân Viên Thành Công");
            txtMaNhanVien.setText("");
            txtHoTen.setText("");
            txtDiaChi.setText("");
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // lấy chỉ số hàng được chọn trong JTable
        try {
            // Lấy thông tin từ GUI
            danhSachNV = con.layDL_NhanVien();
        } catch (SQLException ex) {
            Logger.getLogger(QlyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        NhanVien nhanVienCanXoa = null;
        for (NhanVien nv : danhSachNV) {
            if (nv.getManv().equals(maNV)) {
                nhanVienCanXoa = nv;
                break;
            }
        }

// nếu không tìm thấy khách hàng, thông báo lỗi và kết thúc
        if (nhanVienCanXoa == null) {
            JOptionPane.showMessageDialog(null, "Nhân Viên Không Tồn Tại");
            return;
        }

// xóa khách hàng khỏi danh sách
        danhSachNV.remove(nhanVienCanXoa);
        con.UpdateSQL_NhanVien(nhanVienCanXoa, 2, "null");
// xóa hàng được chọn trong model
        model.removeRow(selectedRow);

// cập nhật lại model cho JTable
        jTable1.setModel(model);

// thông báo thành công
        JOptionPane.showMessageDialog(null, "Xóa Nhân Viên Thành Công");

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // lấy chỉ số hàng được chọn trong JTable
        // lấy chỉ số hàng được chọn trong JTable
        try {
            // Lấy thông tin từ GUI
            danhSachNV = con.layDL_NhanVien();
        } catch (SQLException ex) {
            Logger.getLogger(QlyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        NhanVien nhanVienCanSua = null;
        for (NhanVien nv : danhSachNV) {
            if (nv.getManv().equals(maNV)) {
                nhanVienCanSua = nv;
                break;
            }
        }

// nếu không tìm thấy khách hàng, thông báo lỗi và kết thúc
        if (nhanVienCanSua == null) {
            JOptionPane.showMessageDialog(null, "Nhân Viên Không Tồn Tại");
            return;
        }

// hiển thị form sửa thông tin khách hàng
        String tenNV = JOptionPane.showInputDialog(null, "Nhập tên nhân viên", nhanVienCanSua.getTennv());
        String maNVNew = JOptionPane.showInputDialog(null, "Nhập mã nhân viên", maNV);
        String diaChi = JOptionPane.showInputDialog(null, "Nhập địa chỉ", nhanVienCanSua.getDiachi());
// thêm ComboBox để chọn loại nhân viên
        JComboBox<String> cbxLoaiNhanVien = new JComboBox<>();
        cbxLoaiNhanVien.addItem("Nhân Viên Bán Hàng");
        cbxLoaiNhanVien.addItem("Quản Lý Kho");
        cbxLoaiNhanVien.addItem("Nhân Viên Văn Phòng");
        cbxLoaiNhanVien.setSelectedItem(nhanVienCanSua.getLoainv());
        JOptionPane.showMessageDialog(null, cbxLoaiNhanVien, "Chọn loại nhân viên", JOptionPane.QUESTION_MESSAGE);

        String loainv = (String) cbxLoaiNhanVien.getSelectedItem();
// thêm ComboBox để chọn chức vụ
        JComboBox<String> cbxChucVu = new JComboBox<>();
        cbxChucVu.addItem("Nhân Viên");
        cbxChucVu.addItem("Quản Lý");
        cbxChucVu.setSelectedItem(nhanVienCanSua.getChucvu());
        JOptionPane.showMessageDialog(null, cbxChucVu, "Chọn chức vụ", JOptionPane.QUESTION_MESSAGE);

        String chucvu = (String) cbxChucVu.getSelectedItem();

// cập nhật thông tin khách hàng
        nhanVienCanSua.setTennv(tenNV);
        nhanVienCanSua.setManv(maNVNew);
        nhanVienCanSua.setDiachi(diaChi);
        nhanVienCanSua.setLoainv(loainv);
        nhanVienCanSua.setChucvu(chucvu);

// cập nhật lại model cho JTable
        model.setValueAt(tenNV, selectedRow, 0);
        model.setValueAt(maNVNew, selectedRow, 1);
        model.setValueAt(diaChi, selectedRow, 2);
        model.setValueAt(loainv, selectedRow, 3);
        model.setValueAt(chucvu, selectedRow, 4);

        con.UpdateSQL_NhanVien(nhanVienCanSua, 3, oldNV);
// thông báo thành công
        JOptionPane.showMessageDialog(null, "Sửa Thông Tin Nhân Viên Thành Công");

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String maNVCanTim = txtMaNhanVien.getText();

        // Tạo một danh sách để lưu khách hàng tìm được
        ArrayList<NhanVien> ketQuaTimKiem = new ArrayList<>();

        // Lặp qua danh sách khách hàng hiện tại để tìm kiếm
        for (NhanVien nv : danhSachNV) {
            if (nv.getManv().toLowerCase().contains(maNVCanTim.toLowerCase())) {
                ketQuaTimKiem.add(nv);
            }
        }

// Kiểm tra kết quả tìm kiếm
        if (ketQuaTimKiem.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kết Quả Không Tìm Thấy");
        } else {

            // Tạo một model mới để hiển thị kết quả tìm kiếm trên JTable
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Họ và Tên");
            model.addColumn("Mã Nhân Viên");
            model.addColumn("Địa Chỉ");
            model.addColumn("Loại Nhân Viên");
            model.addColumn("Chức Vụ");

            // Thêm các khách hàng tìm được vào model
            for (NhanVien nv : ketQuaTimKiem) {
                model.addRow(new Object[]{nv.getTennv(), nv.getManv(), nv.getDiachi(), nv.getLoainv(), nv.getChucvu()});
            }

            // Cập nhật lại model cho JTable
            jTable1.setModel(model);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        ExportExcel ex = new ExportExcel();
        ex.ExportNhanVien(danhSachNV);
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        ImportExcel im = new ImportExcel();
        try {
            im.ImportNhanVien();
            JOptionPane.showMessageDialog(null, "Import thành công");
        } catch (InvalidFormatException ex) {
            JOptionPane.showMessageDialog(null, "Import thất bại");
            Logger.getLogger(QlyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            danhSachNV = con.layDL_NhanVien();
        } catch (SQLException ex) {
            Logger.getLogger(QlyNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
        model = (DefaultTableModel) jTable1.getModel();
        for (NhanVien nv : danhSachNV) {
            model.addRow(new Object[]{nv.getTennv(), nv.getManv(), nv.getDiachi(), nv.getLoainv(), nv.getChucvu()});
        }
        
    }//GEN-LAST:event_btnImportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxChucVu;
    private javax.swing.JComboBox<String> cbxLoaiNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNhanVien;
    // End of variables declaration//GEN-END:variables
}
