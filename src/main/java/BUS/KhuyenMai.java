package BUS;
import KetnoiSQL_DAL.config;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;
public class KhuyenMai {
    private String makm;
    private String tenkm;
    private Date ngaykm;
    private Date hansudung;
    private long tiengiam;
    

    public KhuyenMai( String tenkm,String makm, Date ngaykm, Date hansudung, long tiengiam) {
        this.makm = makm;
        this.tenkm = tenkm;
        this.ngaykm = ngaykm;
        this.hansudung = hansudung;
        this.tiengiam = tiengiam;
    }
    
    public KhuyenMai(KhuyenMai x)
    {   
        makm = x.makm;
        tenkm = x.tenkm;
        ngaykm = x.ngaykm;
        hansudung = x.hansudung;
        tiengiam = x.tiengiam;
    }
    
    
    public String getMakm() {
        return makm;
    }

    public void setMakm(String makm) {
        this.makm = makm;
    }

    public String getTenkm() {
        return tenkm;
    }

    public void setTenkm(String tenkm) {
        this.tenkm = tenkm;
    }

    public Date getNgaykm() {
        return ngaykm;
    }

    public void setNgaykm(Date ngaykm) {
        this.ngaykm = ngaykm;
    }

    public Date getHansudung() {
        return hansudung;
    }

    public void setHansudung(Date hansudung) {
        this.hansudung = hansudung;
    }

    public long getTiengiam() {
        return tiengiam;
    }

    public void setTiengiam(long tiengiam) {
        this.tiengiam = tiengiam;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" + "makm=" + makm + ", tenkm=" + tenkm + ", ngaykm=" + ngaykm + ", hansudung=" + hansudung + ", tiengiam=" + tiengiam + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.makm);
        hash = 59 * hash + Objects.hashCode(this.tenkm);
        hash = 59 * hash + Objects.hashCode(this.ngaykm);
        hash = 59 * hash + Objects.hashCode(this.hansudung);
        hash = 59 * hash + (int) (this.tiengiam ^ (this.tiengiam >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KhuyenMai other = (KhuyenMai) obj;
        if (this.tiengiam != other.tiengiam) {
            return false;
        }
        if (!Objects.equals(this.makm, other.makm)) {
            return false;
        }
        if (!Objects.equals(this.tenkm, other.tenkm)) {
            return false;
        }
        if (!Objects.equals(this.ngaykm, other.ngaykm)) {
            return false;
        }
        return Objects.equals(this.hansudung, other.hansudung);
    }
    
    private ArrayList<KhuyenMai>danhSach = new ArrayList<KhuyenMai>();
    config con = new config();
    public KhuyenMai() 
    {
        this.danhSach = con.layDL_KhuyenMai(); //cach khai bao 1 arrayList
    }
    public KhuyenMai traKH(int i){
        return danhSach.get(i);
    }
    public KhuyenMai traKH(String maKH){
        for (KhuyenMai khachHang : danhSach) {
            if (maKH.equalsIgnoreCase(khachHang.getMakm())) {
                return khachHang;
            }
        }
        return null;
    }
    
  
    
    public void themKhuyenMai(String tenkm,String makm, Date ngaykm, Date hansudung, long tiengiam)
    {
        KhuyenMai kh = new KhuyenMai( tenkm, makm,  ngaykm,  hansudung,  tiengiam);
        this.danhSach.add(kh);    
        con.UpdateSQL_KhuyenMai(kh, 1, "null");
    }
    
    
    
    
    //4. Lay ra so luong khach hang trong danh sach
    public int laySoLuongKhuyenMai()
    {
        return this.danhSach.size();
    }

    public boolean xoaKhuyenMai(String ma)
    {        
        int i = 0;
        for (KhuyenMai khachHang : danhSach) {
            if (ma.equalsIgnoreCase(khachHang.getMakm())) {
                this.danhSach.remove(i); 
                con.UpdateSQL_KhuyenMai(khachHang, 2, "null");
                return true;
            }
            i++;
        }
        
        return false;
        
    }
        
    public boolean suaKhuyenMai(String maOld, String tenkm,String makm, Date ngaykm, Date hansudung, long tiengiam)
    {        
        int i = 0;
        for (KhuyenMai khachHang : danhSach) {
            if (maOld.equalsIgnoreCase(khachHang.getMakm())) {
                this.danhSach.get(i).setTenkm(tenkm); 
                this.danhSach.get(i).setMakm(makm);
                this.danhSach.get(i).setNgaykm(ngaykm); 
                this.danhSach.get(i).setHansudung(hansudung);
                this.danhSach.get(i).setTiengiam(tiengiam);
                
                con.UpdateSQL_KhuyenMai(this.danhSach.get(i), 3, maOld);
                
                return true;
            }
            i++;
        }
        
        return false;
        
    }
    
    
    public ArrayList<KhuyenMai> timKhuyenMaiUnlimit(String ma)
    {   
        int i =0;
        ArrayList<KhuyenMai> dskh = new ArrayList<>();
        for (KhuyenMai khachHang : danhSach) 
        {
            if(khachHang.getTenkm().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            if(khachHang.getMakm().equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat();
            String ngayKMString = dateFormat.format(ngaykm);
            String hanSDString = dateFormat.format(hansudung);
            String tienGiam = Long.toString(khachHang.getTiengiam());
            if(ngayKMString.equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            if(hanSDString.equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            if(tienGiam.equalsIgnoreCase(ma))
            {   
                dskh.add(khachHang);
            }
            i++;
        }
        if (dskh != null) {
            return dskh;
        }
        return null;
    }
}
    
    
   

