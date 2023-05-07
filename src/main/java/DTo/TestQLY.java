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
import GiaodienUI.QlyPhuongTien;
import GiaodienUI.QlyTourDuLich;
import GiaodienUI.QlyThongKeTheoNgay;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Cong anh
 */
public class TestQLY {
    public static void main(String[] args) {
        // Sử dụng bố cục mặc định của FlowLayout
JFrame js = new JFrame();
js.setTitle("khQuản lý khách hàng");
BookVeTour ql = new BookVeTour();
js.add(ql);
js.setLocation(100, 100); // đặt vị trí
js.setSize(750, 700); // đặt kích thước
js.setVisible(true);


    }
}
