package DTo;

import KetnoiSQL_DAL.config;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Tour implements Comparable<Tour>{
    public String tenTour;
    public String maTour;
    public String loaiTour;
    public int Tongsocho;
    public int Sochodu;
    public String DiaDiemTour;
    public String  DiaDiemdi;
    public String DiaDiemden;
    public int songaydi;
    public Date ngaydi;
    public Date ngayve;
    public long giaTour;
    

    public Tour(Tour x) {
        tenTour = x.tenTour;
        maTour = x.maTour;
        loaiTour = x.loaiTour;
        Tongsocho = x.Tongsocho;
        Sochodu = x.Sochodu;
        DiaDiemTour=x.DiaDiemTour;
        DiaDiemdi=x.DiaDiemdi;
        DiaDiemden=x.DiaDiemden;
        songaydi=x.songaydi;
        ngaydi=x.ngaydi;
        ngayve=x.ngayve;
        giaTour=x.giaTour;
    }

    public Tour(String tenTour, String maTour, String loaiTour, int Tongsocho, int Sochodu, String DiaDiemTour, String DiaDiemdi, String DiaDiemden, int songaydi,Date ngaydi, Date ngayve, long giaTour) {
        this.tenTour = tenTour;
        this.maTour = maTour;
        this.loaiTour = loaiTour;
        this.Tongsocho = Tongsocho;
        this.Sochodu = Sochodu;
        this.DiaDiemTour = DiaDiemTour;
        this.DiaDiemdi = DiaDiemdi;
        this.DiaDiemden = DiaDiemden;
        this.songaydi = songaydi;
        this.ngaydi = ngaydi;
        this.ngayve = ngayve;
        this.giaTour = giaTour;
       
    }

    @Override
    public int compareTo(Tour o) {
        return this.maTour.compareTo(o.maTour);
    }

    public String getTenTour() {
        return tenTour;
    }

    public void setTenTour(String tenTour) {
        this.tenTour = tenTour;
    }

    public String getMaTour() {
        return maTour;
    }

    public void setMaTour(String maTour) {
        this.maTour = maTour;
    }

    public String getLoaiTour() {
        return loaiTour;
    }

    public void setLoaiTour(String loaiTour) {
        this.loaiTour = loaiTour;
    }

    public int getTongsocho() {
        return Tongsocho;
    }

    public void setTongsocho(int Tongsocho) {
        this.Tongsocho = Tongsocho;
    }

    public int getSochodu() {
        return Sochodu;
    }

    public void setSochodu(int Sochodu) {
        this.Sochodu = Sochodu;
    }

    public String getDiaDiemTour() {
        return DiaDiemTour;
    }

    public void setDiaDiemTour(String DiaDiemTour) {
        this.DiaDiemTour = DiaDiemTour;
    }

    public String getDiaDiemdi() {
        return DiaDiemdi;
    }

    public void setDiaDiemdi(String DiaDiemdi) {
        this.DiaDiemdi = DiaDiemdi;
    }

    public String getDiaDiemden() {
        return DiaDiemden;
    }

    public void setDiaDiemden(String DiaDiemden) {
        this.DiaDiemden = DiaDiemden;
    }

    public int getSongaydi() {
        return songaydi;
    }

    public void setSongaydi(int songaydi) {
        this.songaydi = songaydi;
    }

    public Date getNgaydi() {
        return ngaydi;
    }

    public void setNgaydi(Date ngaydi) {
        this.ngaydi = ngaydi;
    }

    public Date getNgayve() {
        return ngayve;
    }

    public void setNgayve(Date ngayve) {
        this.ngayve = ngayve;
    }

    public long getGiaTour() {
        return giaTour;
    }

    public void setGiaTour(long giaTour) {
        this.giaTour = giaTour;
    }

   private ArrayList<Tour> ds = new ArrayList<>();
   config con = new config();
   
   public Tour(){
       this.ds = con.layDL_Tour();
   }
   
   public Tour traTour(int i){
       return ds.get(i);
   }
   
   public Tour traTour(String ma){
       for(Tour t : ds){
           if(ma.equalsIgnoreCase(t.getMaTour())){
               return t;
           }
       }
       return null;
   }
   
   public int laySoLuongTour(){
       return this.ds.size();
   }
   
   public void themTour(String tenTour, String maTour, String loaiTour, int Tongsocho, int Sochodu, String DiaDiemTour, String DiaDiemdi, String DiaDiemden, int songaydi,Date ngaydi, Date ngayve, long giaTour){
        Tour tour = new Tour( tenTour,  maTour,  loaiTour,  Tongsocho,  Sochodu,  DiaDiemTour,  DiaDiemdi,  DiaDiemden,  songaydi, ngaydi,  ngayve,  giaTour);
        con.UpdateSQL_Tour(tour, 1, "null");
        ds.add(tour);
   }
   
   public boolean xoaTour(String ma){
       int i = 0;
       for(Tour t : ds){
           if(ma.equalsIgnoreCase(t.getMaTour())){
               ds.remove(i);
               con.UpdateSQL_Tour(t, 2, "null");
               return true;
           }
           i++;
       }
       return false;
   }
   
   public boolean suaTour(String maOld, String tenTour, String maTour, String loaiTour, int Tongsocho, int Sochodu, String DiaDiemTour, String DiaDiemdi, String DiaDiemden, int songaydi,Date ngaydi, Date ngayve, long giaTour){
       int i = 0;
       for(Tour t : ds){
           if(maOld.equalsIgnoreCase(t.getMaTour())){
               this.ds.get(i).setTenTour(tenTour);
               this.ds.get(i).setMaTour(maTour);
               this.ds.get(i).setLoaiTour(loaiTour);
               this.ds.get(i).setTongsocho(Tongsocho);
               this.ds.get(i).setSochodu(Sochodu);
               this.ds.get(i).setDiaDiemTour(DiaDiemTour);
               this.ds.get(i).setDiaDiemdi(DiaDiemdi);
               this.ds.get(i).setDiaDiemden(DiaDiemden);
               this.ds.get(i).setSongaydi(songaydi);
               this.ds.get(i).setNgaydi(ngaydi);
               this.ds.get(i).setNgayve(ngayve);
               this.ds.get(i).setGiaTour(giaTour);
               
               con.UpdateSQL_Tour(t, 3, maOld);
               return true;
           }
           i++;
       }
       return false;
   }
   
   public ArrayList<Tour> timTourUnlimit(String ma){
       int i = 0;
       ArrayList<Tour> ds = new ArrayList<>();
       for(Tour t : ds){
           if(t.getTenTour().equalsIgnoreCase(ma)){
               ds.add(t);
           }
           if(t.getMaTour().equalsIgnoreCase(ma)){
               ds.add(t);
           }
           if(t.getLoaiTour().equalsIgnoreCase(ma)){
               ds.add(t);
           }
           if(t.getDiaDiemTour().equalsIgnoreCase(ma)){
               ds.add(t);
           }
           if(t.getDiaDiemdi().equalsIgnoreCase(ma)){
               ds.add(t);
           }
           if(t.getDiaDiemden().equalsIgnoreCase(ma)){
               ds.add(t);
           }
           String tongCho = Long.toString(t.getTongsocho());
           if(tongCho.equalsIgnoreCase(ma)){
               ds.add(t);
           }
           String choDu = Long.toString(t.getSochodu());
           if(choDu.equalsIgnoreCase(ma)){
               ds.add(t);
           }
           String soNgay = Integer.toString(t.getSongaydi());
           if(soNgay.equalsIgnoreCase(ma)){
               ds.add(t);
           }
           SimpleDateFormat dateFormat = new SimpleDateFormat();
           String ngaydiString = dateFormat.format(ngaydi);
           String ngayveString = dateFormat.format(ngayve);
           if(ngaydiString.equalsIgnoreCase(ma)){
               ds.add(t);
           }
           if(ngayveString.equalsIgnoreCase(ma)){
               ds.add(t);
           }
           String giatour = Long.toString(t.getGiaTour());
           if(giatour.equalsIgnoreCase(ma)){
               ds.add(t);
           }
                  i++;
       }
       if(ds != null){
           return ds;
       }
       return null;
   }
}