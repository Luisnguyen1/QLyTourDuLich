package DTo;

import GiaodienUI.Main;


import GiaodienUI.login;
import KetnoiSQL_DAL.config;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.PopupMenu;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Locale;
import javax.management.MBeanAttributeInfo;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ModuleXuLy {


    config setup = new config();
    public  boolean login(String matk, String matkhau) throws SQLException
    {

        ArrayList<TaiKhoan> danhSachTaiKhoan = setup.layDL_TK();
        TaiKhoan input = new TaiKhoan(matk,matkhau);

        for (int i = 0; i < danhSachTaiKhoan.size(); i++) {
            if (danhSachTaiKhoan.get(i).getMatk().equals(input.getMatk())==true) {
                if(danhSachTaiKhoan.get(i).getMatkhau().equals(input.getMatkhau())==true){
                    return true;
                }
                
        }
    }
        return false;
    }
    public void chuyenFrame(JFrame mot)
    {
        Main main = new Main();
        main.setVisible(true);
        mot.setVisible(false);        
        
    }
    public void dangXuat(JFrame mot)
    {
        login main = new login();
        main.setVisible(true);
        mot.setVisible(false);        
        
    }
    
}

