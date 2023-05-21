/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import KetnoiSQL_DAL.config;
import java.util.ArrayList;

/**
 *
 * @author Thanh Tran
 */
public class FeedBack {
    private String hoten;
    private String email;
    private String sdt;
    private String diachi;
    private String noidung;

    public FeedBack(String hoten, String email, String sdt, String diachi, String noidung) {
        this.hoten = hoten;
        this.email = email;
        this.sdt = sdt;
        this.diachi = diachi;
        this.noidung = noidung;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }

    private ArrayList<FeedBack>danhSach = new ArrayList<FeedBack>();
    config con = new config();
    public FeedBack() 
    {
        this.danhSach = con.LayDL_Feedback(); //cach khai bao 1 arrayList
    }
    
    public FeedBack traFB(int i){
        return danhSach.get(i);
    }
    public FeedBack traFB(String ten){
        for (FeedBack fb : danhSach) {
            if (ten.equalsIgnoreCase(fb.getHoten())) {
                return fb;
            }
        }
        return null;
    }
    
    /*public KhachHang(ArrayList<KhachHang> danhSach) {
    this.danhSach = danhSach;
    }*/
    
    public void themFeedBack(FeedBack kh)
    {
        this.danhSach.add(kh);    
    }
    
    
    
    public void themFeedBack(String hoten, String email, String sdt, String diachi, String noidung)
    {
        FeedBack kh = new FeedBack( hoten,  email,  sdt,  diachi,  noidung);
        this.danhSach.add(kh);   
        con.UpdateSQL_FeedBack(kh, 1, "null");
    }
    
    
    //2. Them In danh sach khach hang ra man hinh
    public void inDanhSachFeedBack()
    {
        for (FeedBack fb : danhSach) 
        {
            System.out.println(fb);
        }
    }
    
   
    
    public int laySoLuongFeedBack()
    {
        return this.danhSach.size();
    }
  
    //7. Xoa mot khach hang ra khoi danh sach khach hang dua tren ma khach hang
    public boolean  xoaFeedBack(FeedBack kh)
    {
        return this.danhSach.remove(kh);
    }
    
    public boolean xoaFeedBack(String ma)
    {        
        int i = 0;
        for (FeedBack fb : danhSach) {
            if (ma.equalsIgnoreCase(fb.getHoten())) {
                this.danhSach.remove(i); 
                con.UpdateSQL_FeedBack(fb, 2, "null");
                return true;
            }
            i++;
        }
        
        return false;
        
    }
    
    public boolean suaFeedBack(String maOld, String hoten, String email, String sdt, String diachi, String noidung)
    {        
        int i = 0;
        for (FeedBack fb : danhSach) {
            if (maOld.equalsIgnoreCase(fb.getHoten())) {
                this.danhSach.get(i).setHoten(hoten); 
                this.danhSach.get(i).setEmail(email);
                this.danhSach.get(i).setSdt(sdt); 
                this.danhSach.get(i).setDiachi(diachi);
                this.danhSach.get(i).getNoidung();
                
                con.UpdateSQL_FeedBack(this.danhSach.get(i), 3, maOld);
                
                return true;
            }
            i++;
        }
        
        return false;
        
    }
    //8. Tim kiem tat ca khach hang dua tren Ma khach hang duoc nhap tu ban phim
    
    public ArrayList<FeedBack> timFeedBackUnlimit(String ma)
    {   
        int i =0;
        ArrayList<FeedBack> dskh = new ArrayList<>();
        for (FeedBack fb : danhSach) 
        {
            if(fb.getHoten().equalsIgnoreCase(ma))
            {   
                dskh.add(fb);
            }
            if(fb.getEmail().equalsIgnoreCase(ma))
            {   
                dskh.add(fb);
            }
            if(fb.getSdt().equalsIgnoreCase(ma))
            {   
                dskh.add(fb);
            }
            if(fb.getDiachi().equalsIgnoreCase(ma))
            {   
                dskh.add(fb);
            }
            if(fb.getNoidung().equalsIgnoreCase(ma))
            {   
                dskh.add(fb);
            }
            i++;
        }
        if (dskh != null) {
            return dskh;
        }
        return null;
    }
}
