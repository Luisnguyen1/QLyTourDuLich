
package DTo;

import java.util.Scanner;


public class thu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachHang dskh = new KhachHang();
        int luaChon = 0;
        do {            
            System.out.println("-----MENU----- ");
            System.out.println("""
                               1. Them khach hang vao danh sach
                               2. In danh sach khach hang ra man hinh
                               3. Kiem tra danh sach co rong hay khong
                               4. Lay ra so luong khach hang trong danh sach
                               5. Lam rong danh sach khach hang 
                               6. Kiem tra khach hang co ton tai trong danh sach hay khong, dua tren ma khach hang
                               7. Xoa mot khach hang ra khoi danh sach dua tren ma khach hang
                               8. Tim kiem tat ca khach hang dua tren ma nhap tu ban phim 
                               0. Thoat khoi chuong trinh
                               Vui long chon chuc nang: """);
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1)
            {
                //1, Them khach hang vao danh sach
                System.out.println("Nhap ma khach hang: "); String makhachhang = sc.nextLine();
                System.out.println("Nhap ten khach hang: "); String tenkhachhang = sc.nextLine();
                System.out.println("Nhap dia chi: "); String diachi = sc.nextLine();
                System.out.println("Nhap so dien thoai: "); long sodienthoai = sc.nextLong();
                System.out.println("Nhap email: "); String email = sc.nextLine();
                sc.nextLine();
                KhachHang kh = new KhachHang(makhachhang,tenkhachhang,diachi,sodienthoai,email);
                dskh.themKhachHang(kh);
                
            }else if(luaChon == 2)
            {
                //2. In danh sach ra man hinh
                dskh.inDanhSachKhachHang();
                
            }else if(luaChon == 3)
            {
                //3. Kiem tra danh sach khach hang co rong hay khong
                System.out.println("Danh sach rong: "+dskh.kiemTraDanhSachRong());
                
            }else if(luaChon == 4)
            {
                //4. Lay ra so luong khach hang trong danh sach
                System.out.println("So luong hien tai: "+dskh.laySoLuongKhachHang());
            }else if(luaChon == 5)
            {
                //5. Lam rong danh sach khach hang
                dskh.lamRongDanhSach();
                
            }else if(luaChon == 6)
            {
                //6. Kiem tra khach hang co ton tai trong danh sach hay khong, dua tren ma khach hang
                System.out.println("Nhap ma khach hang: ");  String makh = sc.nextLine();
                KhachHang kh = new KhachHang(makh);
                System.out.println("Kiem tra khach hang co trong danh sach: "+dskh.kiemTraTonTai(kh));
                
            }else if(luaChon == 7)
            {
                //7.  Xoa mot khach hang ra khoi danh sach dua tren ma khach hang
                System.out.println("Nhap ma khach hang: ");  String makh = sc.nextLine();
                KhachHang kh = new KhachHang(makh);
                System.out.println("Xoa khach hang trong danh sach: "+dskh.xoaKhachHang(kh));
            }else if(luaChon == 8)
            {
                //8. Tim kiem tat ca khach hang dua tren Ma khach hang duoc nhap tu ban phim
                System.out.println("Nhap ma khach hang: "); String makhachhang = sc.nextLine();
                System.out.println("Ket qua tim kiem: ");
                dskh.timKhachHang(makhachhang);
            } 
            
        } while (luaChon != 0);
    }
}
