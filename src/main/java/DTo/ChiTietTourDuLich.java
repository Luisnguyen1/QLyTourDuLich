/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTo;

import KetnoiSQL_DAL.config;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Thanh Tran
 */
public class ChiTietTourDuLich {
    private String ddtour;
    private String matour;
    private String khoihanh;
    private String noiden;
    private String maks;
    private long tienan;
    private long tienphong;
    private long phidichvu;
    private int thutungay;


    public ChiTietTourDuLich(String ddtour, String matour, String khoihanh, String noiden, int thutungay, String maks, long tienan, long tienphong, long phidichvu) {
        this.ddtour = ddtour;
        this.matour = matour;
        this.khoihanh = khoihanh;
        this.noiden = noiden;
        this.maks = maks;
        this.tienan = tienan;
        this.tienphong = tienphong;
        this.phidichvu = phidichvu;
        this.thutungay= thutungay;
    }

    public String getDdtour() {
        return ddtour;
    }

    public void setDdtour(String ddtour) {
        this.ddtour = ddtour;
    }

    public String getMatour() {
        return matour;
    }

    public void setMatour(String matour) {
        this.matour = matour;
    }

    public String getKhoihanh() {
        return khoihanh;
    }

    public void setKhoihanh(String khoihanh) {
        this.khoihanh = khoihanh;
    }

    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public String getMaks() {
        return maks;
    }

    public void setMaks(String maks) {
        this.maks = maks;
    }

    public long getTienan() {
        return tienan;
    }

    public void setTienan(long tienan) {
        this.tienan = tienan;
    }

    public long getTienphong() {
        return tienphong;
    }

    public void setTienphong(long tienphong) {
        this.tienphong = tienphong;
    }

    public long getPhidichvu() {
        return phidichvu;
    }

    public void setPhidichvu(long phidichvu) {
        this.phidichvu = phidichvu;
    }

    public int getThutungay() {
        return thutungay;
    }

    public void setThutungay(int thutungay) {
        this.thutungay = thutungay;
    }
    
    private ArrayList<ChiTietTourDuLich> danhsach = new ArrayList<>();
    config con = new config();
    public ChiTietTourDuLich(){
        this.danhsach = con.LayDL_CTTour();
    }
    
    public ChiTietTourDuLich traCTTour(int i){
        return danhsach.get(i);
    }
    
    public ChiTietTourDuLich traCTTour(String ma1, String ma2){
        for(ChiTietTourDuLich ctt : danhsach){
            if(ma1.equalsIgnoreCase(ctt.getMatour()) && ma2.equalsIgnoreCase(ctt.getMaks())){
                return ctt;
            }
        }
        return null;
    }
    
    public void themCTTour(ChiTietTourDuLich ctt){
        this.danhsach.add(ctt);
    }
    
    public void themCTTour(String ddtour, String matour, String khoihanh, String noiden, int thutungay, String maks, long tienan, long tienphong, long phidichvu){
        ChiTietTourDuLich ctt = new ChiTietTourDuLich( ddtour,  matour,  khoihanh,  noiden,  thutungay,  maks,  tienan,  tienphong,  phidichvu);
        this.danhsach.add(ctt);
        con.UpdateSQL_CTTour(ctt, 1, "null");
    }
    
    public int laySoLuongCTTour(){
        return this.danhsach.size();
    }
    
    public boolean xoaCTTour(ChiTietTourDuLich ctt){
        return this.danhsach.remove(ctt);
    }
    
    public boolean xoaCTTour(String ma){
        int i = 0;
        for(ChiTietTourDuLich ctt : danhsach){
            if(ma.equalsIgnoreCase(ctt.getMatour())){
                con.UpdateSQL_CTTour(ctt, 2, "null");
                return true;
            }
            i++;
        }
        return false;
    }
    
    public boolean suaCTTour(String maOld, String ddtour, String matour, String khoihanh, String noiden, int thutungay, String maks, long tienan, long tienphong, long phidichvu){
        int i = 0;
        for(ChiTietTourDuLich ctt : danhsach){
            if(maOld.equalsIgnoreCase(ctt.getMatour())){
                this.danhsach.get(i).setDdtour(ddtour);
                this.danhsach.get(i).setMatour(matour);
                this.danhsach.get(i).setKhoihanh(khoihanh);
                this.danhsach.get(i).setNoiden(noiden);
                this.danhsach.get(i).setThutungay(thutungay);
                this.danhsach.get(i).setMaks(maks);
                this.danhsach.get(i).setTienan(tienan);
                this.danhsach.get(i).setTienphong(tienphong);
                this.danhsach.get(i).setPhidichvu(phidichvu);
                
                con.UpdateSQL_CTTour(this.danhsach.get(i), 3, maOld);
                return true;
            }
            i++;
        }
        return false;
    }
    
    public ArrayList<ChiTietTourDuLich> timCTTourUnlimit (String ma){
        int i = 0;
        ArrayList<ChiTietTourDuLich> dstour = new ArrayList<>();
        for(ChiTietTourDuLich ctt : danhsach){
            if(ctt.getDdtour().equalsIgnoreCase(ma)){
                dstour.add(ctt);
            }
            if(ctt.getMatour().equalsIgnoreCase(ma)){
                dstour.add(ctt);
            }
            if(ctt.getKhoihanh().equalsIgnoreCase(ma)){
                dstour.add(ctt);
            }
            if(ctt.getNoiden().equalsIgnoreCase(ma)){
                dstour.add(ctt);
            }
            if(ctt.getMaks().equalsIgnoreCase(ma)){
                dstour.add(ctt);
            }
            String tienAn = Long.toString(ctt.getTienan());
            if(tienAn.equalsIgnoreCase(ma)){
                dstour.add(ctt);
            }
            String tienPhong = Long.toString(ctt.getTienphong());
            if(tienPhong.equalsIgnoreCase(ma)){
                dstour.add(ctt);
            }
            String phiDV = Long.toString(ctt.getPhidichvu());
            if(phiDV.equalsIgnoreCase(ma)){
                dstour.add(ctt);
            }
            i++;
        }
        if(dstour != null){
            return dstour;
        }
        return dstour;
    }
}
