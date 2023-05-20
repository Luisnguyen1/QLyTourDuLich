package BUS;

import KetnoiSQL_DAL.config;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class PhuongTien implements Comparable<PhuongTien>{
    private String mapt;
    private String loaipt;
    private String bienso;
    private long tongsocho;
    private long sochocondu;
    
    public PhuongTien(PhuongTien x){
        mapt = x.mapt;
        loaipt = x.loaipt;
        bienso = x.bienso;
        tongsocho = x.tongsocho;
        sochocondu = x.sochocondu;
    }

    public PhuongTien(String mapt, String loaipt, String bienso, long tongsocho, long sochocondu) {
        this.mapt = mapt;
        this.loaipt = loaipt;
        this.bienso = bienso;
        this.tongsocho = tongsocho;
        this.sochocondu = sochocondu;
    }

    public PhuongTien(String mapt) {
        this.mapt = mapt;
    }
    
    public String getMapt() {
        return mapt;
    }

    public void setMapt(String mapt) {
        this.mapt = mapt;
    }

    public String getLoaipt() {
        return loaipt;
    }

    public void setLoaipt(String loaipt) {
        this.loaipt = loaipt;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public long getTongsocho() {
        return tongsocho;
    }

    public void setTongsocho(long tongsocho) {
        this.tongsocho = tongsocho;
    }

    public long getSochocondu() {
        return sochocondu;
    }

    public void setSochocondu(long sochocondu) {
        this.sochocondu = sochocondu;
    }

    @Override
    public String toString() {
        return "PhuongTien{" + "mapt=" + mapt + ", loaipt=" + loaipt + ", bienso=" + bienso + ", tongsocho=" + tongsocho + ", sochocondu=" + sochocondu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.mapt);
        hash = 29 * hash + Objects.hashCode(this.loaipt);
        hash = 29 * hash + Objects.hashCode(this.bienso);
        hash = 29 * hash + (int) (this.tongsocho ^ (this.tongsocho >>> 32));
        hash = 29 * hash + (int) (this.sochocondu ^ (this.sochocondu >>> 32));
        return hash;
    }
    
    @Override
    public int compareTo(PhuongTien o) {
        return this.mapt.compareTo(o.mapt);
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
        final PhuongTien other = (PhuongTien) obj;
        if (this.tongsocho != other.tongsocho) {
            return false;
        }
        if (this.sochocondu != other.sochocondu) {
            return false;
        }
        if (!Objects.equals(this.bienso, other.bienso)) {
            return false;
        }
        if (!Objects.equals(this.loaipt, other.loaipt)) {
            return false;
        }
        return Objects.equals(this.mapt, other.mapt);
    }
    
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phuong tien: ");
        mapt = sc.nextLine();
        System.out.println("Nhap ten phuong tien: ");
        loaipt= sc.nextLine();
        System.out.println("Nhap bien so: ");
        bienso = sc.nextLine();
        System.out.println("Nhap tong so cho: ");
        tongsocho = sc.nextLong();
        System.out.println("Nhap so cho con du: ");
        sochocondu = sc.nextLong();       
    }
    
    public void xuat()
    {
        System.out.println("Ma phuong tien la: "+this.mapt);
        System.out.println("Ten phuong tien la: "+this.loaipt);
        System.out.println("Bien so la: "+this.bienso);
        System.out.println("Tong so cho la: "+this.tongsocho);
        System.out.println("So cho con du la: "+this.sochocondu);
    }
    
    
    
    
    private ArrayList<PhuongTien>danhSachPT = new ArrayList<PhuongTien>();
    config con = new config();
    public PhuongTien() 
    {
        this.danhSachPT = con.layDL_PhuongTien(); //cach khai bao 1 arrayList
    }
    
    public PhuongTien traPT(int i){
        return danhSachPT.get(i);
    }
    
    public PhuongTien traPT(String maPT){
        for (PhuongTien phuongTien : danhSachPT) {
            if (maPT.equalsIgnoreCase(phuongTien.getMapt())) {
                return phuongTien;
            }
        }
        return null;
    }
    
    /*public KhachHang(ArrayList<KhachHang> danhSach) {
    this.danhSach = danhSach;
    }*/
    
    public void themPhuongTien(PhuongTien pt)
    {
        this.danhSachPT.add(pt);    
    }
    
    
    
    public void themPhuongTien(String mapt, String loaipt, String bienso, long tongsocho, long sochocondu)
    {
        PhuongTien pt = new PhuongTien(mapt, loaipt, bienso, tongsocho, sochocondu);
        this.danhSachPT.add(pt);    
        con.UpdateSQL_PhuongTien(pt, 1, "null");
    }
    
    
    
    
    //4. Lay ra so luong khach hang trong danh sach
    public int laySoLuongPhuongTien()
    {
        return this.danhSachPT.size();
    }
    
    
    
    //7. Xoa mot khach hang ra khoi danh sach khach hang dua tren ma khach hang
    public boolean  xoaPhuongTien(PhuongTien pt)
    {
        return this.danhSachPT.remove(pt);
    }
    public boolean xoaPhuongTien(String ma)
    {        
        int i = 0;
        for (PhuongTien phuongTien : danhSachPT) {
            if (ma.equalsIgnoreCase(phuongTien.getMapt())) {
                this.danhSachPT.remove(i); 
                con.UpdateSQL_PhuongTien(phuongTien, 2, "null");
                return true;
            }
            i++;
        }
        
        return false;
        
    }
    
    public boolean suaPhuongTien(String maOld, String mapt, String loaipt, String bienso, long tongsocho, long sochocondu)
    {        
        int i = 0;
        for (PhuongTien phuongTien : danhSachPT) {
            if (maOld.equalsIgnoreCase(phuongTien.getMapt())) {
                this.danhSachPT.get(i).setLoaipt(loaipt); 
                this.danhSachPT.get(i).setMapt(mapt);
                this.danhSachPT.get(i).setBienso(bienso); 
                this.danhSachPT.get(i).setTongsocho(tongsocho);
                this.danhSachPT.get(i).setSochocondu(sochocondu);
                
                con.UpdateSQL_PhuongTien(this.danhSachPT.get(i), 3, maOld);
                
                return true;
            }
            i++;
        }
        
        return false;
        
    }
    //8. Tim kiem tat ca khach hang dua tren Ma khach hang duoc nhap tu ban phim
    public void timPhuongTien(String ma)
    {
        for (PhuongTien phuongTien : danhSachPT) 
        {
            if(phuongTien.getMapt().contains(ma));
            System.out.println(phuongTien);
        }
    }
    public ArrayList<PhuongTien> timPhuongTienUnlimit(String ma)
    {   
        int i =0;
        ArrayList<PhuongTien> dspt = new ArrayList<>();
        for (PhuongTien phuongTien : danhSachPT) 
        {
            if(phuongTien.getMapt().equalsIgnoreCase(ma))
            {   
                dspt.add(phuongTien);
            }
            if(phuongTien.getLoaipt().equalsIgnoreCase(ma))
            {   
                dspt.add(phuongTien);
            }
            if(phuongTien.getBienso().equalsIgnoreCase(ma))
            {   
                dspt.add(phuongTien);
            }
            
            String tongCho = Long.toString(phuongTien.getTongsocho());
            if(tongCho.equalsIgnoreCase(ma)){
                dspt.add(phuongTien);
            }
            
            String sochodu = Long.toString(phuongTien.getSochocondu());
            if(sochodu.equalsIgnoreCase(ma)){
                dspt.add(phuongTien);
            }
            i++;
        }
        if (dspt != null) {
            return dspt;
        }
        return null;
    }
}    
    

