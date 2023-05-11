
package DTo;

import java.util.Scanner;

public class testKhachsan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachSan1 dsks = new KhachSan1();
        int luaChon = 0;
        do {            
            System.out.println("-----MENU----- ");
            System.out.println("""
                               1. Them khach san vao danh sach
                               2. In danh sach khach san ra man hinh
                               3. Kiem tra danh sach co rong hay khong
                               4. Lay ra so luong khach san trong danh sach
                               5. Lam rong danh sach khach san
                               6. Kiem tra khach san co ton tai trong danh sach hay khong, dua tren ma khach san
                               7. Xoa mot khach san ra khoi danh sach dua tren ma khach san
                               8. Tim kiem tat ca khach san dua tren ma nhap tu ban phim 
                               0. Thoat khoi chuong trinh
                               Vui long chon chuc nang: """);
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1)
            {
                //1, Them khach san vao danh sach
                System.out.println("Nhap ma khach san: "); String makhachsan = sc.nextLine();
                System.out.println("Nhap ten khach san: "); String tenkhachsan = sc.nextLine();
                System.out.println("Nhap gia tien: "); int tienkhachsan = sc.nextInt();
                System.out.println("Nhap so dien thoai: "); String sodienthoai = sc.nextLine();
                sc.nextLine();
                KhachSan1 ks = new KhachSan1(makhachsan, tenkhachsan, tienkhachsan, sodienthoai);
                dsks.themKhachSan(ks);
                
            }else if(luaChon == 2)
            {
                //2. In danh sach ra man hinh
                dsks.inDanhSachKhachSan();
                
            }else if(luaChon == 3)
            {
                //3. Kiem tra danh sach khach san do rong hay khong
                System.out.println("Danh sach rong: "+dsks.kiemTraDanhSachRong());
                
            }else if(luaChon == 4)
            {
                //4. Lay ra so luong khach san trong danh sach
                System.out.println("So luong hien tai: "+dsks.laySoLuongKhachSan());
            }else if(luaChon == 5)
            {
                //5. Lam rong danh sach khach san
                dsks.lamRongDanhSach();
                
            }else if(luaChon == 6)
            {
                //6. Kiem tra khach san co ton tai trong danh sach hay khong, dua tren ma khach san
                System.out.println("Nhap ma khach san: ");  String makhachsan = sc.nextLine();
                KhachSan1 ks = new KhachSan1(makhachsan);
                System.out.println("Kiem tra khach san co trong danh sach: "+dsks.kiemTraTonTai(ks));
                
            }else if(luaChon == 7)
            {
                //7.  Xoa mot khach san ra khoi danh sach dua tren ma khach san
                System.out.println("Nhap ma khach san: ");  String makhachsan = sc.nextLine();
                KhachSan1 ks = new KhachSan1(makhachsan);
                System.out.println("Xoa khach san trong danh sach: "+dsks.xoaKhachSan(ks));
            }else if(luaChon == 8)
            {
                //8. Tim kiem tat ca khach san dua tren Ma khach san duoc nhap tu ban phim
                System.out.println("Nhap ma khach san: "); String makhachsan= sc.nextLine();
                System.out.println("Ket qua tim kiem: ");
                dsks.timKhachSan(makhachsan);
            } 
            
        } while (luaChon != 0);
    }
}
