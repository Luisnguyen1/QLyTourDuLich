/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetnoiSQL_DAL;

import DTo.TaiKhoan;
import DTo.HoaDon;
import DTo.KhuyenMai;
import DTo.NhanVien;
import DTo.PhuongTien;
import DTo.BookVe;
import DTo.ChiTietHoaDonVe;
import DTo.ChiTietTourDuLich;
import DTo.DiaDiem;
import DTo.DiaDiemVuiChoi;
import DTo.FeedBack;
import DTo.KhachHang;
import DTo.KhachSan;
import DTo.Tour;
import DTo.VeTour;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.sql.*;

public class config {

    private final String url = "jdbc:mysql://localhost:3306/qltour?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true&zeroDateTimeBehavior=convertToNull";
    private final String user = "root";
    private final String password = "";

    public void CheckConnect() {
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Thành công");
            System.out.println(con.getCatalog());
        } catch (SQLException ex) {
            Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<TaiKhoan> layDL_TK() throws SQLException {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con = DriverManager.getConnection(url, user, password);

        // Thực hiện truy vấn và lấy kết quả
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM taikhoan");

        ArrayList<TaiKhoan> danhSachTaiKhoan = new ArrayList<>();

        while (rs.next()) {
            TaiKhoan taikhoan = new TaiKhoan();
            taikhoan.setMatk(rs.getString("tentaikhoan"));
            taikhoan.setMatkhau(rs.getString("matkhau"));
            danhSachTaiKhoan.add(taikhoan);
        }
        return danhSachTaiKhoan;
    }

    public void UpdateSQL_HoaDon(HoaDon HoaDon, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO hoadon VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM hoadon";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, HoaDon.getMahd());
                stmt.setString(2, HoaDon.getMakhachdatve());
                stmt.setLong(3, HoaDon.getTongtien());
                java.sql.Date ngaySD = new java.sql.Date(HoaDon.getNgayxuathoadon().getTime());
                stmt.setDate(4, ngaySD);
                stmt.setString(5, HoaDon.getManv());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
        if (i == 2) { // xóa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM hoadon WHERE mahoadon = '" + HoaDon.getMahd() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM hoadon WHERE mahoadon = '" + HoaDon.getMahd() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO hoadon VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM hoadon";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, HoaDon.getMahd());
                stmt.setString(2, HoaDon.getMakhachdatve());
                stmt.setLong(3, HoaDon.getTongtien());
                java.sql.Date ngaySD = new java.sql.Date(HoaDon.getNgayxuathoadon().getTime());
                stmt.setDate(4, ngaySD);
                stmt.setString(5, HoaDon.getManv());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }

    public void UpdateSQL_NhanVien(NhanVien nhanvien, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO nhanvien VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM nhanvien";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, nhanvien.getManv());
                stmt.setString(2, nhanvien.getLoainv());
                stmt.setString(3, nhanvien.getTennv());
                stmt.setString(4, nhanvien.getDiachi());
                stmt.setString(5, nhanvien.getChucvu());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM nhanvien WHERE MaNV = '" + nhanvien.getManv() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

            // crate statement to insert student
        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM nhanvien WHERE MaNV = '" + MaNV_OLD + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO nhanvien VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM nhanvien";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, nhanvien.getManv());
                stmt.setString(2, nhanvien.getLoainv());
                stmt.setString(3, nhanvien.getTennv());
                stmt.setString(4, nhanvien.getDiachi());
                stmt.setString(5, nhanvien.getChucvu());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }

        }
    }

    public void UpdateSQL_KhachHang(KhachHang nhanvien, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO khachhang VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM khachhang";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, nhanvien.getMakh());
                stmt.setString(2, nhanvien.getTenkh());
                stmt.setString(3, nhanvien.getDiachi());
                stmt.setString(4, nhanvien.getSdt());
                stmt.setString(5, nhanvien.getEmail());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM khachhang WHERE makh = '" + nhanvien.getMakh() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

            // crate statement to insert student
        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM khachhang WHERE makh = '" + nhanvien.getMakh() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

            String sqlInsert = "INSERT INTO khachhang VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM khachhang";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, nhanvien.getMakh());
                stmt.setString(2, nhanvien.getTenkh());
                stmt.setString(3, nhanvien.getDiachi());
                stmt.setString(4, nhanvien.getSdt());
                stmt.setString(5, nhanvien.getEmail());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }

    public void UpdateSQL_KhachSan(KhachSan nhanvien, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO khachsan VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM khachsan";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, nhanvien.getMaKhachSan());
                stmt.setString(2, nhanvien.getTenKhachSan());
                stmt.setString(3, nhanvien.getSdt());
                stmt.setInt(4, (int) nhanvien.getTienKhachSan());
                stmt.setInt(5, (int) nhanvien.getTienPhong());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM khachsan WHERE maks = '" + nhanvien.getMaKhachSan() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

            // crate statement to insert student
        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM khachsan WHERE maks = '" + nhanvien.getMaKhachSan() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

            String sqlInsert = "INSERT INTO khachsan VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM khachsan";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, nhanvien.getMaKhachSan());
                stmt.setString(2, nhanvien.getTenKhachSan());
                stmt.setString(3, nhanvien.getSdt());
                stmt.setInt(4, (int) nhanvien.getTienKhachSan());
                stmt.setInt(5, (int) nhanvien.getTienPhong());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }

    public void UpdateSQL_VeTour(VeTour nhanvien, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO ve VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM ve";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, nhanvien.getMavetour());
                java.sql.Date ngayDV = new java.sql.Date(nhanvien.getNgaydatve().getTime());
                stmt.setDate(2, ngayDV);
                java.sql.Date ngaySD = new java.sql.Date(nhanvien.getHansudung().getTime());
                stmt.setDate(3, ngaySD);
                stmt.setString(4, nhanvien.getMatour());
                
                stmt.setLong(5, nhanvien.getTiengiam());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) );
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM vetour WHERE mavetour = '" + nhanvien.getMavetour() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM vetour WHERE mavetour = '" + nhanvien.getMavetour() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO vetour VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM vetour";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, nhanvien.getMavetour());
                java.sql.Date ngayDV = new java.sql.Date(nhanvien.getNgaydatve().getTime());
                stmt.setDate(2, ngayDV);
                java.sql.Date ngaySD = new java.sql.Date(nhanvien.getHansudung().getTime());
                stmt.setDate(3, ngaySD);
                stmt.setString(4, nhanvien.getMatour());
                
                stmt.setLong(5, nhanvien.getTiengiam());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }

    public void UpdateSQL_PhuongTien(PhuongTien PhuongTien, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO phuongtien VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM phuongtien";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, PhuongTien.getMapt());
                stmt.setString(2, PhuongTien.getLoaipt());
                stmt.setString(3, PhuongTien.getBienso());
                stmt.setLong(4, PhuongTien.getSochocondu());
                stmt.setLong(5, PhuongTien.getTongsocho());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM phuongtien WHERE MaPT = '" + PhuongTien.getMapt() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM phuongtien WHERE MaPT = '" + PhuongTien.getMapt() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO phuongtien VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM phuongtien";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, PhuongTien.getMapt());
                stmt.setString(2, PhuongTien.getLoaipt());
                stmt.setString(3, PhuongTien.getBienso());
                stmt.setLong(4, PhuongTien.getSochocondu());
                stmt.setLong(5, PhuongTien.getTongsocho());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }

    public void UpdateSQL_Tour(Tour Tour, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO tour VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
            String selectAll = "SELECT * FROM tour";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, Tour.getMaTour());
                stmt.setInt(2, Tour.getTongsocho());
                stmt.setInt(3, Tour.getSochodu());
                stmt.setString(4, Tour.getTenTour());
                stmt.setString(5, Tour.getDiaDiemTour());
                stmt.setString(6, Tour.getDiaDiemdi());
                stmt.setString(7, Tour.getDiaDiemden());
                stmt.setString(8, Tour.getLoaiTour());
                stmt.setInt(9, Tour.getSongaydi());
                java.sql.Date ngayDi = new java.sql.Date(Tour.getNgaydi().getTime());
                stmt.setDate(10, ngayDi);
                stmt.setLong(11, Tour.getGiaTour());
                java.sql.Date ngayVe = new java.sql.Date(Tour.getNgayve().getTime());
                stmt.setDate(12, ngayVe);
                stmt.setString(13, "null");
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM tour WHERE matour = '" + Tour.getMaTour() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

            // crate statement to insert student
        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM tour WHERE matour = '" + Tour.getMaTour() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM tour WHERE matour = '" + Tour.getMaTour() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            // Khởi tạo kết nối đến cơ sở dữ liệu

            //1 là thêm
            String sqlInsert = "INSERT INTO tour VALUES(?, ?, ?,?,?,?,?,?,?,?,?,?,?)";
            String selectAll = "SELECT * FROM tour";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, Tour.getMaTour());
                stmt.setInt(2, Tour.getTongsocho());
                stmt.setInt(3, Tour.getSochodu());
                stmt.setString(4, Tour.getTenTour());
                stmt.setString(5, Tour.getDiaDiemTour());
                stmt.setString(6, Tour.getDiaDiemdi());
                stmt.setString(7, Tour.getDiaDiemden());
                stmt.setString(8, Tour.getLoaiTour());
                stmt.setInt(9, Tour.getSongaydi());
                java.sql.Date ngayDi = new java.sql.Date(Tour.getNgaydi().getTime());
                stmt.setDate(10, ngayDi);
                stmt.setLong(11, Tour.getGiaTour());
                java.sql.Date ngayVe = new java.sql.Date(Tour.getNgayve().getTime());
                stmt.setDate(12, ngayVe);
                stmt.setString(13, "null");
                stmt.execute();
                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }

    public ArrayList<HoaDon> layDL_HoaDon() {
        ArrayList<HoaDon> danhSachHoaDon = new ArrayList<>();
        try {
            // Khởi tạo kết nối đến cơ sở dữ liệu
            Connection con = DriverManager.getConnection(url, user, password);
            
            // Thực hiện truy vấn và lấy kết quả
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM hoadon");
            
            
            
            while (rs.next()) {
                HoaDon HoaDon = new HoaDon();
                HoaDon.setMahd(rs.getString("MaHD"));
                HoaDon.setMakhachdatve(rs.getString("makh"));
                HoaDon.setTongtien(Long.parseLong(rs.getString("tongtien")));
                HoaDon.setNgayxuathoadon(rs.getDate("ngayxuathoadon"));
                HoaDon.setManv(rs.getString("manv"));
                danhSachHoaDon.add(HoaDon);
            }
            return danhSachHoaDon;
        } catch (SQLException ex) {
            Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachHoaDon;
    }

    //-----------------------------------------------
    public void UpdateSQL_DDVC(DiaDiemVuiChoi DDVC, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO diadiemvuichoi VALUES(?, ?, ?)";
            String selectAll = "SELECT * FROM diadiemvuichoi";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(3, DDVC.getDiaDiemTour());
                stmt.setString(2, DDVC.getTenDiaDiem());
                stmt.setString(1, DDVC.getMaDiaDiem());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM diadiemvuichoi WHERE MaDDVC = '" + DDVC.getDiaDiemTour() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM diadiemvuichoi WHERE MaDDVC = '" + DDVC.getDiaDiemTour() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO diadiemvuichoi VALUES(?, ?, ?)";
            String selectAll = "SELECT * FROM diadiemvuichoi";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(3, DDVC.getDiaDiemTour());
                stmt.setString(2, DDVC.getTenDiaDiem());
                stmt.setString(1, DDVC.getMaDiaDiem());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void UpdateSQL_KhuyenMai(KhuyenMai KhuyenMai, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO khuyenmai VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM khuyenmai";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, KhuyenMai.getMakm());
                stmt.setString(2, KhuyenMai.getTenkm());
                java.sql.Date ngayDi = new java.sql.Date(KhuyenMai.getNgaykm().getTime());
                stmt.setDate(3, ngayDi);
                java.sql.Date ngayVe = new java.sql.Date(KhuyenMai.getHansudung().getTime());
                stmt.setDate(4, ngayVe);
                stmt.setLong(5, KhuyenMai.getTiengiam());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM khuyenmai WHERE makhuyenmai = '" + KhuyenMai.getMakm() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM khuyenmai WHERE makhuyenmai = '" + KhuyenMai.getMakm() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO khuyenmai VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM khuyenmai";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, KhuyenMai.getMakm());
                stmt.setString(2, KhuyenMai.getTenkm());
                stmt.setDate(3, (Date) KhuyenMai.getNgaykm());
                stmt.setDate(4, (Date) KhuyenMai.getHansudung());
                stmt.setLong(5, KhuyenMai.getTiengiam());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }

    public void UpdateSQL_CTHD(ChiTietHoaDonVe KhuyenMai, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO cthd VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM cthd";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, KhuyenMai.getMaHD());
                stmt.setString(2, KhuyenMai.getMave());
                stmt.setLong(3, KhuyenMai.getSoluongve());
                stmt.setLong(4, KhuyenMai.getTienve());
                stmt.setString(5, KhuyenMai.getMaCTHD());
                
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM cthd WHERE MaHD = '" + KhuyenMai.getMaCTHD()+ "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
           try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM cthd WHERE MaHD = '" + KhuyenMai.getMaCTHD()+ "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO cthd VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM cthd";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, KhuyenMai.getMaHD());
                stmt.setString(2, KhuyenMai.getMave());
                stmt.setLong(3, KhuyenMai.getSoluongve());
                stmt.setLong(4, KhuyenMai.getTienve());
                stmt.setString(5, KhuyenMai.getMaCTHD());


                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }

    public void UpdateSQL_DiaDiem(DiaDiem KhuyenMai, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO diadiem VALUES(?, ?, ?,?)";
            String selectAll = "SELECT * FROM diadiem";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, KhuyenMai.getMadd());
                stmt.setString(2, KhuyenMai.getTendd());
                stmt.setString(3, KhuyenMai.getThuoctinh());
                stmt.setString(4, KhuyenMai.getKhuvuc());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) );
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM diadiem WHERE MaDD = '" + KhuyenMai.getMadd() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM diadiem WHERE MaDD = '" + KhuyenMai.getMadd() + "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        String sqlInsert = "INSERT INTO diadiem VALUES(?, ?, ?,?)";
        String selectAll = "SELECT * FROM diadiem";
        try {
            // connect to database
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);

            // crate statement to insert student
            PreparedStatement stmt = con.prepareStatement(sqlInsert);
            stmt.setString(1, KhuyenMai.getMadd());
            stmt.setString(2, KhuyenMai.getTendd());
            stmt.setString(3, KhuyenMai.getThuoctinh());
            stmt.setString(4, KhuyenMai.getKhuvuc());
            stmt.execute();

            // select all student
            stmt = con.prepareStatement(selectAll);
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery();
            // show data
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                        + "  " + rs.getString(3) + "  " + rs.getString(4) );
            }
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            //ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
        }
    }

    public void UpdateSQL_FeedBack(FeedBack fb, int i, String hoten_old) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO feedback VALUES(?, ?, ?,?,?,?)";
            String selectAll = "SELECT * FROM feedback";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, fb.getHoten());
                stmt.setString(2,fb.getMakh());
                stmt.setString(3, fb.getSdt());
                stmt.setString(4, fb.getEmail());
                stmt.setString(5, fb.getDiachi());
                stmt.setString(6, fb.getNoidung());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5) + "  " + rs.getString(6));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM feedback WHERE hoten = '" + fb.getHoten() + "';";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM feedback WHERE hoten = '" + fb.getHoten() + "';";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO feedback VALUES(?, ?, ?,?,?,?)";
            String selectAll = "SELECT * FROM feedback";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, fb.getHoten());
                stmt.setString(2,fb.getMakh());
                stmt.setString(3, fb.getSdt());
                stmt.setString(4, fb.getEmail());
                stmt.setString(5, fb.getDiachi());
                stmt.setString(6, fb.getNoidung());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5)+ "  " + rs.getString(6));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }

    public void UpdateSQL_CTTour(ChiTietTourDuLich fb, int i, String matour_old) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO chitiettour VALUES(?, ?, ?,?,?,?,?,?,?)";
            String selectAll = "SELECT * FROM chitiettour";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, fb.getDdtour());
                stmt.setString(2, fb.getMatour());
                stmt.setString(3, fb.getMaks());
                stmt.setString(4, fb.getNoiden());
                stmt.setString(5, fb.getKhoihanh());
                stmt.setInt(6, fb.getThutungay());
                stmt.setLong(7,fb.getTienan());
                stmt.setLong(8, fb.getTienphong());
                stmt.setLong(9, fb.getPhidichvu());
                
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5) + rs.getString(6) + "  " + rs.getString(7) + "  " + rs.getString(8) + "  " + rs.getString(9) );
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM chitiettour WHERE MaTour = '" + fb.getMatour() + "';";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM chitiettour WHERE MaTour = '" + fb.getMatour() + "';";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO chitiettour VALUES(?, ?, ?,?,?,?,?,?,?)";
            String selectAll = "SELECT * FROM chitiettour";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, fb.getDdtour());
                stmt.setString(2, fb.getMatour());
                stmt.setString(3, fb.getMaks());
                stmt.setString(4, fb.getNoiden());
                stmt.setString(5, fb.getKhoihanh());
                stmt.setInt(6, fb.getThutungay());
                stmt.setLong(7,fb.getTienan());
                stmt.setLong(8, fb.getTienphong());
                stmt.setLong(9, fb.getPhidichvu());
                
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5) + rs.getString(6) + "  " + rs.getString(7) + "  " + rs.getString(8) + "  " + rs.getString(9) );
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    
    public void UpdateSQL_TaiKhoan(TaiKhoan tk, int i, String matkhau_old) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO taikhoan(tentaikhoan, matkhau, email, loaitk) VALUES(?, ?, ?,?)";
            String selectAll = "SELECT * FROM taikhoan";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, tk.getMatk());
                stmt.setString(2, tk.getMatkhau());
                stmt.setString(3, tk.getEmail());
                stmt.setString(4, tk.getQuyentruycap());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
        if (i == 2) { // xóa                      
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM taikhoan WHERE matkhau = '" + tk.getMatkhau() + "';";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM taikhoan WHERE matkhau = '" + tk.getMatkhau() + "';";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO taikhoan VALUES(?, ?, ?,?)";
            String selectAll = "SELECT * FROM taikhoan";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, tk.getMatk());
                stmt.setString(2, tk.getMatkhau());
                stmt.setString(3, tk.getEmail());
                stmt.setString(4, tk.getQuyentruycap());
                stmt.execute();

                // select all student
                stmt = con.prepareStatement(selectAll);
                // get data from table 'student'
                ResultSet rs = stmt.executeQuery();
                // show data
                while (rs.next()) {
                    System.out.println(rs.getInt(1) + "  " + rs.getString(2)
                            + "  " + rs.getString(3) + "  " + rs.getString(4) + "  " + rs.getString(5));
                }
                stmt.close();
                con.close();
            } catch (SQLException ex) {
                //ex.printStackTrace();
            } catch (ClassNotFoundException e) {
                //e.printStackTrace();
            }
        }
    }
     
      
    //--------------------------------------------------------

    public ArrayList<KhuyenMai> layDL_KhuyenMai() throws SQLException {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con = DriverManager.getConnection(url, user, password);

        // Thực hiện truy vấn và lấy kết quả
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM khuyenmai");

        ArrayList<KhuyenMai> danhSachTaiKhoan = new ArrayList<>();

        while (rs.next()) {
            KhuyenMai taikhoan = new KhuyenMai();
            taikhoan.setMakm(rs.getString("makhuyenmai"));
            taikhoan.setTenkm(rs.getString("tenkhuyenmai"));
            taikhoan.setNgaykm(rs.getDate("ngaykhuyenmai"));
            taikhoan.setHansudung(rs.getDate("hansudung"));
            taikhoan.setTiengiam(rs.getLong("tiengiam"));
            danhSachTaiKhoan.add(taikhoan);
        }
        return danhSachTaiKhoan;
    }

    public ArrayList<VeTour> layDL_VeTour()  {
        ArrayList<VeTour> danhSachVeTour = new ArrayList<>();
        try (Connection con= DriverManager.getConnection(url, user, password)){

        // Thực hiện truy vấn và lấy kết quả
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ve");

        

        while (rs.next()) {
            VeTour vt = new VeTour();
            vt.setMavetour(rs.getString("mave")); 
            vt.setMatour(rs.getString("matour")); 
            vt.setHansudung(rs.getDate("hansudung"));
            vt.setNgaydatve(rs.getDate("ngaytaove"));
            vt.setTiengiam((int) rs.getLong("tiengiam"));
            danhSachVeTour.add(vt);
        }
        } catch (SQLException ex) {
            //Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachVeTour;
    }

    //--------------------------------------------------------------------
    public ArrayList<NhanVien> layDL_NhanVien()  {
         ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();
        try (Connection con= DriverManager.getConnection(url, user, password)){
            
            // Thực hiện truy vấn và lấy kết quả
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM nhanvien");
            
            
            
            while (rs.next()) {
                
                String manv = rs.getString("MaNV");
                String tennv = rs.getString("TenNV");
                String loainv = rs.getString("LoaiNV");
                String diachi = Integer.toString(rs.getInt("DiaChi"));
                String chucvu = rs.getString("ChucVu");
                
                NhanVien pt = new NhanVien(manv, tennv, loainv, diachi, chucvu); // tao ra dữ liệu con 
                danhSachNhanVien.add(pt); // add dữ liệu con vào arraylist
            }
            
        } catch (SQLException ex) {
            //Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachNhanVien;    
    }

    public ArrayList<Tour> layDL_Tour() throws SQLException {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con = DriverManager.getConnection(url, user, password);

        // Thực hiện truy vấn và lấy kết quả
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM tour");

        ArrayList<Tour> danhSachTour = new ArrayList<>();

        while (rs.next()) {
            Tour tour = new Tour();
            tour.setMaTour(rs.getString("matour"));
            tour.setTongsocho(rs.getInt("tongsocho"));
            tour.setSochodu(rs.getInt("sochocontrong"));
            tour.setTenTour(rs.getString("tentour"));
            tour.setDiaDiemTour(rs.getString("diadiemtour"));
            tour.setDiaDiemdi(rs.getString("diadiemdi"));
            tour.setDiaDiemden(rs.getString("diadiemden"));
            tour.setLoaiTour(rs.getString("loaitour"));
            tour.setSongaydi(rs.getInt("songay"));
            tour.setNgaydi(rs.getDate("ngaykhoihanh"));
            tour.setGiaTour(rs.getInt("giatour"));
            tour.setNgayve(rs.getDate("ngayketthuc"));

            danhSachTour.add(tour);
        }
        return danhSachTour;
    }

    public ArrayList<PhuongTien> layDL_PhuongTien() {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        
         ArrayList<PhuongTien> danhSachTour = new ArrayList<>();
        try(Connection con = DriverManager.getConnection(url, user, password)){

        // Thực hiện truy vấn và lấy kết quả
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM phuongtien");

       

        while (rs.next()) {
            
            String Mapt = rs.getString("MaPT");
            String Loaipt = rs.getString("LoaiPT");
            String Tenpt = rs.getString("TenPT");
            long Tongsocho = rs.getLong("SoChoTrong");
            long Sochodu = rs.getLong("SoChoConDu");

            PhuongTien pt = new PhuongTien(Mapt,Loaipt,Tenpt,Tongsocho,Sochodu);
            danhSachTour.add(pt);
        }
        }catch(SQLException e){
            
        }
        return danhSachTour;
    }

    public ArrayList<KhachHang> layDL_KhachHang(){
         ArrayList<KhachHang> danhSachTour = new ArrayList<>();
        try (Connection con= DriverManager.getConnection(url, user, password)){
            
            // Thực hiện truy vấn và lấy kết quả
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM khachhang");
            
            
            
            while (rs.next()) {
                
                String makh = rs.getString("MaKh");
                String ten = rs.getString("TenKh");
                String diachi = rs.getString("DiaChi");
                String sdt = Integer.toString(rs.getInt("SDT"));
                String email = rs.getString("email");
                
                KhachHang pt = new KhachHang(ten, makh, diachi, sdt, email); // tao ra dữ liệu con 
                danhSachTour.add(pt); // add dữ liệu con vào arraylist
            }
            
        } catch (SQLException ex) {
            //Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
        return danhSachTour;           
    }
    
   
    
    public ArrayList<FeedBack> LayDL_Feedback() {
        ArrayList<FeedBack> danhSachFB = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM feedback");
            while (rs.next()) {

                String hten = rs.getString("hoten");
                String makhachhang = rs.getString("makh");
                String sodt = rs.getString("sdt");
                String email = rs.getString("email");
                String dchi = rs.getString("diachi");
                String ndung = rs.getString("noidung");

                FeedBack fb = new FeedBack (hten, makhachhang, email, sodt, dchi, ndung);
                danhSachFB.add(fb);
            }
        } catch (SQLException ex) {

        }
        return danhSachFB;
    }

    public ArrayList<KhachSan> LayDL_KhachSan() {
        ArrayList<KhachSan> danhSachKH = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM khachsan");
            while (rs.next()) {
                KhachSan fb = new KhachSan();
                fb.setMaKhachSan(rs.getString("MaKS"));
                fb.setTenKhachSan(rs.getString("TenKS"));
                fb.setTenKhachSan(rs.getString("TienKS"));
                fb.setSdt(rs.getString("SDT"));
                fb.setTienPhong(rs.getLong("TienPhong"));

                danhSachKH.add(fb);
            }
        } catch (SQLException ex) {

        }
        return danhSachKH;
    }


    public ArrayList<DiaDiemVuiChoi> LayDL_DiaDiemVuiChoi() {
        ArrayList<DiaDiemVuiChoi> DiaDiemVuiChoi = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM diadiemvuichoi");
            while (rs.next()) {
                
                String maddvc = rs.getString("MaDDVC");
                String tenddvc = rs.getString("TenDDVC");
                String diadiemTour = rs.getString("ThuocDiaDiemTour");
                DiaDiemVuiChoi fb = new DiaDiemVuiChoi(diadiemTour,tenddvc,maddvc);
                DiaDiemVuiChoi.add(fb);
            }
        } catch (SQLException ex) {

        }
        return DiaDiemVuiChoi;
    }

    public ArrayList<DiaDiem> LayDL_DiaDiem() {
        ArrayList<DiaDiem> dd = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM diadiem");
            while (rs.next()) {
                String maDD = rs.getString("MaDD");
                String tenDD = rs.getString("TenDD");
                String thuocTinh = rs.getString("ThuocTinh");
                String khuVuc = rs.getString("KhuVuc");
                
                DiaDiem fb = new DiaDiem(maDD,tenDD,thuocTinh,khuVuc);
                dd.add(fb);
            }
        } catch (SQLException ex) {

        }
        return dd;
    }

    public ArrayList<ChiTietHoaDonVe> LayDL_CTHD() {
        ArrayList<ChiTietHoaDonVe> dd = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM cthd");
            while (rs.next()) {
                
                String mahd = rs.getString("MaHD");
                String mave = rs.getString("MaVe");
                int sl = rs.getInt("SoLuongVe");
                long tienve = rs.getInt("TienVe");
                String macthd = rs.getString("maCTHD");
                ChiTietHoaDonVe fb = new ChiTietHoaDonVe();
                dd.add(fb);
            }
        } catch (SQLException ex) {

        }
        return dd;
    }
    
     public ArrayList<ChiTietTourDuLich> LayDL_CTTour() {
        ArrayList<ChiTietTourDuLich> dsTour = new ArrayList<>();
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM chitiettour");
            while (rs.next()) {
                
                String ddTour = rs.getString("DiaDiemTour");
                String MaTour = rs.getString("MaTour");
                String khoiHanh = rs.getString("DiaDiemKhoiHanh");
                String noiDen = rs.getString("DiaDiemDen");
                int thuTuNgay = rs.getInt("ThuTuNgay");
                String maKS = rs.getString("MaKS");
                long tienAn = rs.getLong("TienAn");
                long tienPhong = rs.getLong("TienPhong");
                long phiDV = rs.getLong("PhiDichVu");
                
                ChiTietTourDuLich ctt = new ChiTietTourDuLich(ddTour,MaTour,khoiHanh,noiDen,thuTuNgay,maKS,tienAn,tienPhong,phiDV);
                
                dsTour.add(ctt);
            }
        } catch (SQLException ex) {

        }
        return dsTour;
     }

}
