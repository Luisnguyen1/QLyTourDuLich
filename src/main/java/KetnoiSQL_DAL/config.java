/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KetnoiSQL_DAL;

import DTo.HoaDon;
import DTo.NhanVien;
import DTo.PhuongTien;
import DTo.TaiKhoan;
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
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            System.out.println("Thành công");
            System.out.println(con.getCatalog());
        } catch (SQLException ex) {
            Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    public void UpdateSQL_HoaDon(ArrayList<HoaDon> objArrayList) {
        // Khởi tạo kết nối đến cơ sở dữ liệu

        Connection con;
        try {
            con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            stmt.executeQuery("DELETE FROM hoadons WHERE ;");

            for (HoaDon hd : objArrayList) {
                stmt.executeQuery("INSERT INTO `hoadon` (`MaHD`, `MaKh`, `MaNV`, `TongTien`,`NgayXuatHoaDon`) VALUES(" + hd.getMahd() + ", " + hd.getMakhachdatve() + "," + hd.getManv() + " ," + hd.getTongtien() + "," + hd.getNgayxuathoadon() + ");");
            }
        } catch (SQLException ex) {
            Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void UpdateSQL_NhanVien(NhanVien nhanvien, int i,String MaNV_OLD) {
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
                String delete = "DELETE FROM nhanvien WHERE MaNV = "+nhanvien.getManv();
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
                String delete = "DELETE FROM nhanvien WHERE MaNV = "+MaNV_OLD;
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
    public void UpdateSQL_VeTour(VeTour nhanvien, int i,String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO ve VALUES(?, ?, ?,?,?,?)";
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
                stmt.setDate(3,ngaySD );
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
                String delete = "DELETE FROM ve WHERE MaVe = "+nhanvien.getMavetour();
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

               
                
                
        }
        if (i == 3) {//sửa
           try {
                
                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM ve WHERE MaVe = "+nhanvien.getMavetour();
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO ve VALUES(?, ?, ?,?,?,?)";
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
                stmt.setDate(3,ngaySD );
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
    
     public void UpdateSQL_PhuongTien(PhuongTien PhuongTien, int i,String MaNV_OLD) {
        // Khởi tạo kết nối đến cơ sở dữ liệu
        Connection con;
        //1 là thêm
        if (i == 1) {
            String sqlInsert = "INSERT INTO ve VALUES(?, ?, ?,?,?)";
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
                String delete = "DELETE FROM phuongtien WHERE MaPT = "+PhuongTien.getMapt();
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }

               
                
                
        }
        if (i == 3) {//sửa
            try {
                
                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM phuongtien WHERE MaPT = "+PhuongTien.getMapt();
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }
            String sqlInsert = "INSERT INTO ve VALUES(?, ?, ?,?,?)";
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
    
    public void UpdateSQL_Tour(Tour Tour, int i,String MaNV_OLD) {
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
                stmt.setDate(10, ngayDi );
                stmt.setLong(11, Tour.getGiaTour()); 
                java.sql.Date ngayVe = new java.sql.Date(Tour.getNgayve().getTime());
                stmt.setDate(12, ngayVe );
                stmt.setString(13, "null" );
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
                String delete = "DELETE FROM tour WHERE MaTour = "+Tour.getMaTour();
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
                String delete = "DELETE FROM tour WHERE MaTour = "+Tour.getMaTour();
                stmt.executeUpdate(delete);
            } catch (SQLException ex) {
                Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                
                con = DriverManager.getConnection(url, user, password);
                Statement stmt = con.createStatement();
                String delete = "DELETE FROM tour WHERE MaTour = "+Tour.getMaTour();
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
                stmt.setDate(10, ngayDi );
                stmt.setLong(11, Tour.getGiaTour()); 
                java.sql.Date ngayVe = new java.sql.Date(Tour.getNgayve().getTime());
                stmt.setDate(12, ngayVe );
                stmt.setString(13, "null" );
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
            taikhoan.setManv(rs.getInt("manv"));
            taikhoan.setQuyentruycap(rs.getString("loaitk"));
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
            VeTour VeTour = new VeTour();
            VeTour.setMavetour(rs.getString("MaVe"));
            VeTour.setMakh(rs.getString("MaKH"));
            VeTour.setHansudung(rs.getDate("HanSuDung"));
            VeTour.setNgaydatve(rs.getDate("NgayTaoVe"));
            VeTour.setTiengiam((int)rs.getLong("tiengiam"));
            danhSachVeTour.add(VeTour);
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
            NhanVien NhanVien = new NhanVien();
            NhanVien.setManv(rs.getString("MaNV"));
            NhanVien.setLoainv(rs.getString("LoaiNV"));
            NhanVien.setTennv(rs.getString("TenNV"));
            NhanVien.setChucvu(rs.getString("ChucVu"));
            NhanVien.setDiachi(rs.getString("DiaChi"));
            danhSachNhanVien.add(NhanVien);
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
            Tour Tour = new Tour();
            Tour.setMaTour(rs.getString("MaTour"));
            Tour.setTongsocho(rs.getInt("TongSoCho"));
            Tour.setSochodu(rs.getInt("SoChoConTrong"));
            Tour.setTenTour(rs.getString("TenTour"));
            Tour.setDiaDiemTour(rs.getString("Diadiemtour"));
            Tour.setDiaDiemdi(rs.getString("DiaDiemDi"));
            Tour.setDiaDiemden(rs.getString("DiaDiemDen"));
            Tour.setLoaiTour(rs.getString("LoaiTour"));
            Tour.setSongaydi(rs.getInt("SoNgay"));
            Tour.setNgaydi(rs.getDate("NgayKhoiHanh"));
            Tour.setGiaTour(rs.getInt("GiaTour"));
            Tour.setNgayve(rs.getDate("NgayKetThuc"));
            
            danhSachTour.add(Tour);
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
            PhuongTien PhuongTien = new PhuongTien();
            PhuongTien.setMapt(rs.getString("MaPT"));
            PhuongTien.setLoaipt(rs.getString("LoaiPT"));
            PhuongTien.setBienso(rs.getString("TenPT"));
            PhuongTien.setTongsocho(rs.getLong("SoChoTrong"));
            PhuongTien.setSochocondu(rs.getLong("SoChoConDu"));
            
            
            danhSachTour.add(PhuongTien);
        }
        return danhSachTour;
    }


}
