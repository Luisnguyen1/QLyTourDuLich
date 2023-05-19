/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GiaodienUI;

import DTo.KhachHang;
import DTo.KhachSan;
import DTo.NhanVien;
import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanh Tran
 */
public class QlyKhachSan extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form QlyKhachSan
     */
    ArrayList<KhachSan> danhsachks = new ArrayList<KhachSan>();
    config con = new config();

    public QlyKhachSan() {
        initComponents();
        danhsachks = con.LayDL_KhachSan();
        model = (DefaultTableModel) jTable1.getModel();
        for (KhachSan nv : danhsachks) {
            model.addRow(new Object[]{nv.getTenKhachSan(), nv.getMaKhachSan(), nv.getSdt(), nv.getTienKhachSan(), nv.getTienPhong(), nv.getDiaDiemTour()});
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

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        cbxDiaDiemTour = new javax.swing.JComboBox<>();
        cbxTenKhachSan = new javax.swing.JComboBox<>();
        txtSoDienThoai = new javax.swing.JTextField();
        txtTienKhachSan = new javax.swing.JTextField();
        txtTienPhong = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        txtMaKhachSan = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnExport = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(167, 169, 177));

        jPanel2.setBackground(new java.awt.Color(167, 169, 177));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(169, 0, 6));
        jLabel7.setText("                                               Hệ Thống Quản Lý Khách Sạn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                .addGap(259, 259, 259))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(167, 169, 177));

        cbxDiaDiemTour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Địa Điểm Tour", "Miền Nam - Thành phố Hồ Chí Minh", "Miền Nam - Vũng Tàu", "Miền Trung - Đà Nẵng ", "Miền Trung - Huế", "Miền Bắc - Hà Nội", "Miền Bắc - Hải Phòng" }));
        cbxDiaDiemTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDiaDiemTourActionPerformed(evt);
            }
        });

        cbxTenKhachSan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Tên Khách Sạn", " " }));
        cbxTenKhachSan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTenKhachSanActionPerformed(evt);
            }
        });

        txtSoDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDienThoaiActionPerformed(evt);
            }
        });

        txtTienKhachSan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienKhachSanActionPerformed(evt);
            }
        });

        txtTienPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienPhongActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(21, 110, 71));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm\n");
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
        btnSua.setText("Sửa\n");
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

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(169, 0, 6));
        jLabel1.setText("     Địa Điểm Tour");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 0, 6));
        jLabel2.setText("     Tên Khách Sạn ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
        );

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(169, 0, 6));
        jLabel4.setText("      Số Điện Thoại");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(169, 0, 6));
        jLabel5.setText("    Tiền Khách Sạn");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
        );

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(169, 0, 6));
        jLabel6.setText("       Tiền Phòng");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
        );

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(169, 0, 6));
        jLabel3.setText("     Mã Khách Sạn ");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3)
        );

        btnExport.setBackground(new java.awt.Color(21, 110, 71));
        btnExport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExport.setForeground(new java.awt.Color(255, 255, 255));
        btnExport.setText("Export");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(79, 79, 79)
                            .addComponent(btnTimKiem)
                            .addGap(79, 79, 79)
                            .addComponent(btnExport, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbxDiaDiemTour, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(188, 188, 188))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbxTenKhachSan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtTienKhachSan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMaKhachSan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxDiaDiemTour, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTenKhachSan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKhachSan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTienPhong))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienKhachSan, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnTimKiem)
                    .addComponent(btnExport))
                .addContainerGap())
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Khách Sạn", "Mã Khách Sạn", "Số Điện Thoại", "Tiền Khách Sạn", "Tiền Phòng", "Địa điểm Tour"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Long.class, java.lang.Long.class
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxDiaDiemTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDiaDiemTourActionPerformed
        String ddtour = cbxDiaDiemTour.getSelectedItem().toString();
        if(ddtour.equalsIgnoreCase("Miền Nam - Thành phố Hồ Chí Minh")){
            cbxTenKhachSan.removeAllItems();
            cbxTenKhachSan.addItem("HANZ Friday Hotel");
            cbxTenKhachSan.addItem("Beautiful Saigon Hotel");
        }
        else if(ddtour.equalsIgnoreCase("Miền Nam - Vũng Tàu")){
            cbxTenKhachSan.removeAllItems();
            cbxTenKhachSan.addItem("Sun Beach Hotel");
            cbxTenKhachSan.addItem("Ruby Hotel");
        }
        else if(ddtour.equalsIgnoreCase("Miền Trung - Đà Nẵng")){
            cbxTenKhachSan.removeAllItems();
            cbxTenKhachSan.addItem("Hanami Hotel Danang");
            cbxTenKhachSan.addItem("Angel Hotel Danang");
        }
        else if(ddtour.equalsIgnoreCase("Miền Trung - Huế")){
            cbxTenKhachSan.removeAllItems();
            cbxTenKhachSan.addItem("Timothy Homestay Hue");
            cbxTenKhachSan.addItem("Soleil Boutique");
        }
        else if(ddtour.equalsIgnoreCase("Miền Bắc - Hà Nội")){
            cbxTenKhachSan.removeAllItems();
            cbxTenKhachSan.addItem("Mayflower Hotel Hanoi");
            cbxTenKhachSan.addItem("AMI Central Hotel Hanoi");
        }
        else if(ddtour.equalsIgnoreCase("Miền Bắc - Hải Phòng")){
            cbxTenKhachSan.removeAllItems();
            cbxTenKhachSan.addItem("Punt Hotel");
            cbxTenKhachSan.addItem("Paloma Hotel");
        }
    }//GEN-LAST:event_cbxDiaDiemTourActionPerformed

    private void cbxTenKhachSanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTenKhachSanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTenKhachSanActionPerformed

    private void txtSoDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDienThoaiActionPerformed

    private void txtTienKhachSanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienKhachSanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienKhachSanActionPerformed

    private void txtTienPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienPhongActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // Lấy thông tin từ GUI
        danhsachks = con.LayDL_KhachSan();
        String soDienThoai = txtSoDienThoai.getText();

        long tienPhong = Long.parseLong(txtTienPhong.getText());
        String maKhachSan = txtMaKhachSan.getText();
        String tenKhachSan = cbxTenKhachSan.getSelectedItem().toString();
        String diaDiemTour = cbxDiaDiemTour.getSelectedItem().toString();
        long tienKhachSan = Long.parseLong(txtTienKhachSan.getText());

        if (tenKhachSan.isEmpty() || maKhachSan.isEmpty() || diaDiemTour.isEmpty() || txtSoDienThoai.getText().isEmpty() || txtTienPhong.getText().isEmpty() || txtTienKhachSan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nhập đầy đủ thông tin");
        } else {
// tạo đối tượng KhachHang mới với thông tin lấy được

            KhachSan kh = new KhachSan(diaDiemTour, tenKhachSan, soDienThoai, tienKhachSan, tienPhong, maKhachSan);
// gọi phương thức "themKhachHang" trong lớp DTO để thêm khách hàng vào danh sách
            danhsachks.add(kh);
               con.UpdateSQL_KhachSan(kh, 1, "null");
// lấy ra model của JTable hiện tại
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

// thêm đối tượng KhachHang vào model
            model.addRow(new Object[]{kh.getTenKhachSan(), kh.getMaKhachSan(), kh.getSdt(), kh.getTienKhachSan(), kh.getTienPhong(), kh.getDiaDiemTour()});

// cập nhật lại model cho JTable
            jTable1.setModel(model);

// thông báo thành công
            JOptionPane.showMessageDialog(null, "Thêm Khách Sạn Thành Công");
            txtMaKhachSan.setText("");
            txtSoDienThoai.setText("");
            txtTienKhachSan.setText("");
            txtTienPhong.setText("");
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // lấy chỉ số hàng được chọn trong JTable
         danhsachks = con.LayDL_KhachSan();
        int selectedRow = jTable1.getSelectedRow();

// nếu không có hàng nào được chọn, thông báo lỗi và kết thúc
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Vui Lòng Chọn Một Hàng Để Xóa");
            return;
        }

// lấy ra model của JTable hiện tại
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

// lấy mã khách hàng của hàng được chọn
        String maKH = (String) model.getValueAt(selectedRow, 1);

// tìm khách hàng trong danh sách dựa vào mã
        KhachSan khachHangCanXoa = null;
        for (KhachSan kh : danhsachks) {
            if (kh.getMaKhachSan().equals(maKH)) {
                khachHangCanXoa = kh;
                break;
            }
        }

// nếu không tìm thấy khách hàng, thông báo lỗi và kết thúc
        if (khachHangCanXoa == null) {
            JOptionPane.showMessageDialog(null, "Khách Hàng Không Tồn Tại");
            return;
        }

// xóa khách hàng khỏi danh sách
        danhsachks.remove(khachHangCanXoa);
         con.UpdateSQL_KhachSan(khachHangCanXoa, 2, "null");
// xóa hàng được chọn trong model
        model.removeRow(selectedRow);

// cập nhật lại model cho JTable
        jTable1.setModel(model);

// thông báo thành công
        JOptionPane.showMessageDialog(null, "Xóa Khách Sạn Thành Công");

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // lấy chỉ số hàng được chọn trong JTable
          danhsachks = con.LayDL_KhachSan();
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
        KhachSan nhanVienCanSua = null;
        for (KhachSan nv : danhsachks) {
            if (nv.getMaKhachSan().equals(maNV)) {
                nhanVienCanSua = nv;
                break;
            }
        }

// nếu không tìm thấy khách hàng, thông báo lỗi và kết thúc
        if (nhanVienCanSua == null) {
            JOptionPane.showMessageDialog(null, "Khách Sạn Không Tồn Tại");
            return;
        }

// hiển thị form sửa thông tin khách hàng
        JComboBox<String> cbxDiaDiemTour = new JComboBox<>();
        cbxDiaDiemTour.addItem("Nhân Viên Bán Hàng");
        cbxDiaDiemTour.addItem("Quản Lý Kho");
        cbxDiaDiemTour.addItem("Nhân Viên Văn Phòng");
        cbxDiaDiemTour.setSelectedItem(nhanVienCanSua.getDiaDiemTour());
        JOptionPane.showMessageDialog(null, cbxDiaDiemTour, "Chọn địa điểm Tour", JOptionPane.QUESTION_MESSAGE);

        String diadiemTour = (String) cbxDiaDiemTour.getSelectedItem();
        String maKS = JOptionPane.showInputDialog(null, "Nhập mã khách sạn", maNV);
        JComboBox<String> cbxTenKhachSan = new JComboBox<>();
        cbxTenKhachSan.addItem("Nhân Viên Bán Hàng");
        cbxTenKhachSan.addItem("Quản Lý Kho");
        cbxTenKhachSan.addItem("Nhân Viên Văn Phòng");
        cbxTenKhachSan.setSelectedItem(nhanVienCanSua.getTenKhachSan());
        JOptionPane.showMessageDialog(null, cbxTenKhachSan, "Chọn tên khách sạn", JOptionPane.QUESTION_MESSAGE);
        String tenKS = (String) cbxTenKhachSan.getSelectedItem();
// thêm ComboBox để chọn loại nhân viên
        String sdt = JOptionPane.showInputDialog(null, "Nhập số điện thoại", txtSoDienThoai.getText());

// thêm ComboBox để chọn chức vụ
        long tienKS = Long.parseLong(JOptionPane.showInputDialog(null, "Nhập tiền khách sạn", txtTienKhachSan.getText()));
        long tienPhong = Long.parseLong(JOptionPane.showInputDialog(null, "Nhập tiền phòng", txtTienPhong.getText()));

// cập nhật thông tin khách hàng
        nhanVienCanSua.setDiaDiemTour(diadiemTour);
        nhanVienCanSua.setMaKhachSan(maNV);
        nhanVienCanSua.setSdt(sdt);
        nhanVienCanSua.setTienKhachSan(tienKS);
        nhanVienCanSua.setTienPhong(tienPhong);
        nhanVienCanSua.setTenKhachSan(tenKS);

// cập nhật lại model cho JTable
        model.setValueAt(tenKS, selectedRow, 0);
        model.setValueAt(maNV, selectedRow, 1);
        model.setValueAt(sdt, selectedRow, 2);
        model.setValueAt(tienKS, selectedRow, 3);
        model.setValueAt(tienPhong, selectedRow, 4);
         model.setValueAt(diadiemTour, selectedRow, 5);
          con.UpdateSQL_KhachSan(nhanVienCanSua, 3, "null");
// thông báo thành công
        JOptionPane.showMessageDialog(null, "Sửa Thông Tin Khách Sạn Thành Công");

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String tenKHCanTim = txtMaKhachSan.getText();
        danhsachks = con.LayDL_KhachSan();
    // Tạo một danh sách để lưu khách hàng tìm được
    ArrayList<KhachSan> ketQuaTimKiem = new ArrayList<>();
    
    // Lặp qua danh sách khách hàng hiện tại để tìm kiếm
    for (KhachSan kh : danhsachks) {
        if (kh.getMaKhachSan().toLowerCase().contains(tenKHCanTim.toLowerCase())) {
            ketQuaTimKiem.add(kh);
        }else{
                      JOptionPane.showMessageDialog(null, "Kết Quả Không Tìm Thấy");
            return;
            }
    }
    
// Kiểm tra kết quả tìm kiếm
        if (ketQuaTimKiem.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kết Quả Không Tìm Thấy");
        } else {
    
    // Tạo một model mới để hiển thị kết quả tìm kiếm trên JTable
    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Tên khách sạn");
    model.addColumn("Mã Khách Sạn");
    model.addColumn("Số Điện Thoại");
    model.addColumn("Tiền khách sạn");
    model.addColumn("Tiền phòng");
    model.addColumn("Địa điểm Tour");
    
    // Thêm các khách hàng tìm được vào model
    for (KhachSan kh : ketQuaTimKiem) {
            model.addRow(new Object[]{kh.getTenKhachSan(), kh.getMaKhachSan(), kh.getSdt(), kh.getTienKhachSan(), kh.getTienPhong(), kh.getDiaDiemTour()});
    }
    
    // Cập nhật lại model cho JTable
    jTable1.setModel(model);
    }//GEN-LAST:event_btnTimKiemActionPerformed
    }
    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbxDiaDiemTour;
    private javax.swing.JComboBox<String> cbxTenKhachSan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtMaKhachSan;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTienKhachSan;
    private javax.swing.JTextField txtTienPhong;
    // End of variables declaration//GEN-END:variables
}
