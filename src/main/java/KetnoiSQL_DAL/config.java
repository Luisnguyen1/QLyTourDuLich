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
import DTo.DiaDiem;
import DTo.DiaDiemVuiChoi;
import DTo.FeedBack;
import DTo.KhachHang;
import DTo.QlyHoaDon;
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

    private final String url = "jdbc:mysql://localhost:3306/qltour?useUnicode=yes&characterEncoding=UTF-8&useSSL=false&allowPublicKeyRetrieval=true";
    private final String user = "root";
    private final String password = "";

    public void CheckConnect() {
        try ( Connection con = DriverManager.getConnection(url, user, password)) {
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
            taikhoan.setEmail(rs.getString("email"));
            taikhoan.setQuyentruycap(rs.getString("loaitk"));
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
                String delete = "DELETE FROM hoadon WHERE mahoadon = '" + HoaDon.getMahd()+ "'";
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
                String delete = "DELETE FROM nhanvien WHERE manv = '" + nhanvien.getManv() + "'";
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
                String delete = "DELETE FROM nhanvien WHERE manv = '" + MaNV_OLD + "'";
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

    public void UpdateSQL_VeTour(VeTour nhanvien, int i, String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO vetour VALUES(?, ?, ?,?,?,?)";
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
                stmt.setString(5, nhanvien.getMakh());
                stmt.setLong(6, nhanvien.getTiengiam());
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
                String delete = "DELETE FROM vetour WHERE mavetour = '" + nhanvien.getMavetour()+ "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM vetour WHERE mavetour = '" + nhanvien.getMavetour()+ "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO vetour VALUES(?, ?, ?,?,?,?)";
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
                stmt.setString(5, nhanvien.getMakh());
                stmt.setLong(6, nhanvien.getTiengiam());
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
                String delete = "DELETE FROM phuongtien WHERE maphuongtien = '" + PhuongTien.getMapt()+ "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM phuongtien WHERE maphuongtien = '" + PhuongTien.getMapt()+ "'";
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
                String delete = "DELETE FROM tour WHERE matour = '" + Tour.getMaTour()+ "'";
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
                String delete = "DELETE FROM tour WHERE matour = '" + Tour.getMaTour()+ "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM tour WHERE matour = '" + Tour.getMaTour()+ "'";
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

    public ArrayList<HoaDon> layDL_HoaDon() throws SQLException {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con = DriverManager.getConnection(url, user, password);

        // Thực hiện truy vấn và lấy kết quả
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM hoadon");

        ArrayList<HoaDon> danhSachHoaDon = new ArrayList<>();

        while (rs.next()) {
            HoaDon HoaDon = new HoaDon();
            HoaDon.setMahd(rs.getString("mahoadon"));
            HoaDon.setMakhachdatve(rs.getString("makhachdatve"));
            HoaDon.setTongtien(Long.parseLong(rs.getString("tongtien")));
            HoaDon.setNgayxuathoadon(rs.getDate("ngayxuathoadon"));
            HoaDon.setManv(rs.getString("manhanvien"));
            danhSachHoaDon.add(HoaDon);
        }
        return danhSachHoaDon;
    }

    //-----------------------------------------------
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
                stmt.setDate(4,ngayVe);
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
                String delete = "DELETE FROM khuyenmai WHERE makhuyenmai = '" + KhuyenMai.getMakm()+ "'";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM khuyenmai WHERE makhuyenmai = '" + KhuyenMai.getMakm()+ "'";
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
    
     public void UpdateSQL_FeedBack(FeedBack fb, int i, String hoten_old) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO feedback(hoten, sdt, email, diachi, noidung) VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM feedback";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, fb.getHoten());
                stmt.setString(2, fb.getSdt());
                stmt.setString(3, fb.getEmail());
                stmt.setString(4, fb.getDiachi());
                stmt.setString(5, fb.getNoidung());
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
                String delete = "DELETE FROM feedback WHERE hoten = '" + fb.getHoten() +"';";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM feedback WHERE hoten = '" + fb.getHoten() +"';";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO feedback VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM feedback";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, fb.getHoten());
                stmt.setString(2, fb.getSdt());
                stmt.setString(3, fb.getEmail());
                stmt.setString(4, fb.getDiachi());
                stmt.setString(5, fb.getNoidung());
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
     
    public void UpdateSQL_KhachHang(KhachHang kh, int i, String maKH_old) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO khachhang(tenkh, makh, diachi, sdt, email) VALUES(?, ?, ?,?,?)";
            String selectAll = "SELECT * FROM khachhang";
            try {
                // connect to database
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection(url, user, password);

                // crate statement to insert student
                PreparedStatement stmt = con.prepareStatement(sqlInsert);
                stmt.setString(1, kh.getTenkh());
                stmt.setString(2, kh.getMakh());
                stmt.setString(3, kh.getDiachi());
                stmt.setString(4, kh.getSdt());
                stmt.setString(5, kh.getEmail());
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
                String delete = "DELETE FROM khachhang WHERE tenkh = '" + kh.getTenkh() +"';";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM khachhang WHERE tenkh = '" + kh.getTenkh() +"';";
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
                stmt.setString(1, kh.getTenkh());
                stmt.setString(2, kh.getMakh());
                stmt.setString(3, kh.getDiachi());
                stmt.setString(4, kh.getSdt());
                stmt.setString(5, kh.getEmail());
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
                String delete = "DELETE FROM taikhoan WHERE matkhau = '" + tk.getMatkhau()+"';";
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (i == 3) {//sửa
            try {

                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM taikhoan WHERE matkhau = '" + tk.getMatkhau()+"';";
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

    public ArrayList<VeTour> layDL_VeTour() throws SQLException {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con = DriverManager.getConnection(url, user, password);

        // Thực hiện truy vấn và lấy kết quả
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM ve");

        ArrayList<VeTour> danhSachVeTour = new ArrayList<>();

        while (rs.next()) {
            VeTour vt = new VeTour();
            vt.setMavetour(rs.getString("mave"));
            vt.setMakh(rs.getString("MaKH"));
            vt.setHansudung(rs.getDate("hansudung"));
            vt.setNgaydatve(rs.getDate("ngaytaove"));
            vt.setTiengiam((int) rs.getLong("tiengiam"));
            danhSachVeTour.add(vt);
        }
        return danhSachVeTour;
    }

    //--------------------------------------------------------------------
    public ArrayList<NhanVien> layDL_NhanVien() throws SQLException {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con = DriverManager.getConnection(url, user, password);

        // Thực hiện truy vấn và lấy kết quả
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM nhanvien");

        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        while (rs.next()) {
            NhanVien nv = new NhanVien();
            nv.setManv(rs.getString("manv"));
            nv.setLoainv(rs.getString("loainv"));
            nv.setTennv(rs.getString("tennv"));
            nv.setChucvu(rs.getString("chucvu"));
            nv.setDiachi(rs.getString("diachi"));
            danhSachNhanVien.add(nv);
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

    public ArrayList<PhuongTien> layDL_PhuongTien() throws SQLException {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con = DriverManager.getConnection(url, user, password);

        // Thực hiện truy vấn và lấy kết quả
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM tour");

        ArrayList<PhuongTien> danhSachTour = new ArrayList<>();

        while (rs.next()) {
            PhuongTien pt = new PhuongTien();
            pt.setMapt(rs.getString("MaPT"));
            pt.setLoaipt(rs.getString("LoaiPT"));
            pt.setBienso(rs.getString("TenPT"));
            pt.setTongsocho(rs.getLong("SoChoTrong"));
            pt.setSochocondu(rs.getLong("SoChoConDu"));

            danhSachTour.add(pt);
        }
        return danhSachTour;
    }

    
    public ArrayList<FeedBack> LayDL_Feedback() {
        ArrayList<FeedBack> danhSachFB = new ArrayList<>();
        try(Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM feedback");
            while (rs.next()) {
                FeedBack fb = new FeedBack();
                fb.setHoten(rs.getString("hoten"));
                fb.setSdt(rs.getString("sdt"));
                fb.setEmail(rs.getString("email"));
                fb.setDiachi(rs.getString("diachi"));
                fb.setNoidung(rs.getString("noidung"));

                danhSachFB.add(fb);
            }
        } catch (SQLException ex) {
            
        }
        return danhSachFB;
    }
    
     public ArrayList<KhachHang> LayDL_KhachHang() {
        ArrayList<KhachHang> danhSachKH = new ArrayList<>();
        try(Connection con = DriverManager.getConnection(url, user, password)) {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM khachhang");
            while (rs.next()) {
                KhachHang fb = new KhachHang();
                fb.setTenkh(rs.getString("tenkh"));
                fb.setMakh(rs.getString("makh"));
                fb.setDiachi(rs.getString("diachi"));
                fb.setSdt(rs.getString("sdt"));
                fb.setEmail(rs.getString("email"));

                danhSachKH.add(fb);
            }
        } catch (SQLException ex) {
            
        }
        return danhSachKH;
    }
    
}
