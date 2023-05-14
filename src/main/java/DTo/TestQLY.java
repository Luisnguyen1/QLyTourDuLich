/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

import GiaodienUI.BookVeTour;
import GiaodienUI.QlyDiaDiemTour;
import GiaodienUI.QlyDiaDiemVuiChoi;
import GiaodienUI.QlyHoaDon;
import GiaodienUI.QlyKhachHang;
import GiaodienUI.QlyKhachSan;
import GiaodienUI.QlyKhuyenMai;
import GiaodienUI.QlyNhanVien;
import GiaodienUI.QlyPhanHoiKhachHang;
import GiaodienUI.QlyPhuongTien;
import GiaodienUI.QlyTaiKhoan;
import GiaodienUI.QlyTourDuLich;
import GiaodienUI.QlyThongKeTheoNgay;
import GiaodienUI.QlyVeTour;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import java.sql.Connection;
import org.apache.bcel.generic.AALOAD;

/**
 *
 * @author Cong anh
 */
public class TestQLY {
    public static void main(String[] args) {
        // Sử dụng bố cục mặc định của FlowLayout
JFrame js = new JFrame();
js.setTitle("Quản lý");

QlyPhanHoiKhachHang ql = new QlyPhanHoiKhachHang();
js.add(ql);
js.setLocation(100, 100); // đặt vị trí
js.setSize(930, 580); // đặt kích thước
js.setVisible(true);


    }    
}
