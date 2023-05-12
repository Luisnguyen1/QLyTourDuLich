 public class TaiKhoan {
    private String matk;
    private String matkhau;
    private int manv;
    private String quyentruycap;
 
    
    public TaiKhoan() {
    }

    public TaiKhoan(String matk, String matkhau, int manv, String quyentruycap) {
  
        this.matk = matk;
        this.matkhau = matkhau;
        this.manv = manv;
        this.quyentruycap = quyentruycap;
     
    }

    TaiKhoan(String matk, String matkhau) {
        this.matk = matk;
        this.matkhau = matkhau;
       }
  

    public String getMatk() {
        return matk;

      
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public int getManv() {
        return manv;
    }

    public void setManv(int manv) {
        this.manv = manv;
    }

    public String getQuyentruycap() {
        return quyentruycap;
    }

    public void setQuyentruycap(String quyentruycap) {
        this.quyentruycap = quyentruycap;
    }




  
  
    
        
}