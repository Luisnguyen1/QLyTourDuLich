package DTo;

import GiaodienUI.login;
import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.zip.DataFormatException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args) throws ParseException, SQLException {

//        ChiTietHoaDonVe cthdv = new ChiTietHoaDonVe(100,1000);
//        cthdv.xuat();
//        DiaDiem dd = new DiaDiem("DD001","150","Cao Bang");
//        dd.xuat();
//        DiemVuiChoi dvc = new DiemVuiChoi("DDVC001","Dong Thap","Dong Thap");
//        dvc.xuat();
<<<<<<< HEAD
          config a = new config();

          ArrayList<Account> danhSachTaiKhoan = new ArrayList<>();
          danhSachTaiKhoan=a.layDL_TK();
          for (Account khachHang : danhSachTaiKhoan) 
        {
            System.out.println(khachHang);
        }
          
=======
          JFrame frame = new JFrame();
          login login = new login();
          login.setVisible(true);
>>>>>>> fef9298cc37feb9ec4bf71f6abaa6dd3819e0e58
    }
}